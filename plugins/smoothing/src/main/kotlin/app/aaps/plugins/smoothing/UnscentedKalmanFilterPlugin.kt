package app.aaps.plugins.smoothing

import app.aaps.core.data.iob.InMemoryGlucoseValue
import app.aaps.core.data.model.TE
import app.aaps.core.data.model.TrendArrow
import app.aaps.core.data.plugin.PluginType
import app.aaps.core.interfaces.db.PersistenceLayer
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.plugin.PluginBase
import app.aaps.core.interfaces.plugin.PluginDescription
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.rx.AapsSchedulers
import app.aaps.core.interfaces.rx.bus.RxBus
import app.aaps.core.interfaces.rx.events.EventTherapyEventChange
import app.aaps.core.interfaces.sharedPreferences.SP
import app.aaps.core.interfaces.smoothing.Smoothing
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.plusAssign
import java.util.concurrent.atomic.AtomicBoolean
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.abs
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/**
 * Adaptive Unscented Kalman Filter with RTS Smoothing and Event-Based Learning Reset
 *
 * KEY FEATURES:
 * - FIXED Q (process noise) - tuned for realistic meal/insulin responses
 * - ADAPTIVE R (measurement noise) - adapts to changing sensor quality
 * - Learned R parameter persists across function calls and app restarts
 * - Chi-squared based outlier detection (99.99% confidence)
 * - Consecutive outlier handling with forced re-engagement
 * - Automatically resets learning on actual sensor changes (via EventTherapyEventChange)
 * - Adaptive outlier threshold adjusts to sensor quality
 * - Event-based reset (not time-based guessing)
 *
 * State Vector: x = [G, Ġ]^T
 *   - G: glucose concentration (mg/dL)
 *   - Ġ: rate of glucose change (mg/dL/min)
 *
 * Process Model: x_{t+1} = f(x_t) + w_t
 *   - f(x_t) = [G + Ġ*Δt, Ġ*damping]^T
 *   - w_t ~ N(0, Q) - FIXED based on realistic physiology
 *
 * Measurement Model: z_t = h(x_t) + v_t
 *   - h(x_t) = G
 *   - v_t ~ N(0, R) - ADAPTIVE based on sensor quality
 */
@Singleton
class UnscentedKalmanFilterPlugin @Inject constructor(
    aapsLogger: AAPSLogger,
    rh: ResourceHelper,
    private val rxBus: RxBus,
    private val aapsSchedulers: AapsSchedulers,
    private val persistenceLayer: PersistenceLayer,
    private val sp: SP
) : PluginBase(
    PluginDescription()
        .mainType(PluginType.SMOOTHING)
        .pluginIcon(app.aaps.core.ui.R.drawable.ic_timeline_24)
        .pluginName(R.string.UKF_name)
        .shortName(R.string.smoothing_shortname)
        .description(R.string.description_UKF),
    aapsLogger, rh
), Smoothing {

    // ============================================================
    // UKF CONFIGURATION
    // ============================================================

    // State dimension
    //TODO: Abrupt noise code is very much off... logs are spammy

    private val n = 2

    // UKF parameters (Merwe's scaled formulation)
    private val alpha = 1.00
    private val beta = 0.0
    private val kappa = 3.0

    // Derived parameters
    private val lambda = alpha * alpha * (n + kappa) - n
    private val gamma = sqrt(n + lambda)

    // Sigma point weights
    private val Wm = DoubleArray(2 * n + 1)
    private val Wc = DoubleArray(2 * n + 1)

    // FIXED process noise covariances - TUNED FOR REALISTIC GLUCOSE DYNAMICS
    // These values must accommodate meal responses (rapid rises) and insulin action (rapid falls)
    // Increased significantly from original to handle real-world glucose variability
    private val Q_FIXED = doubleArrayOf(
        1.0, 0.0,     // Glucose process noise: ~2.4 mg/dL std dev per 5 min
        0.0, 0.40     // Rate process noise: ~0.24 mg/dL/min std dev
    )
    //Good sets (R should be around 36 for this data)
    // 3.5, 0.0, 0.0, 0.1 - R 17.17, but reacts faster
    // 6.0, 0.0, 0.0, 0.06 - closer to real data, R 33.4 173 -2
    // 4.0, 0.0, 0.0, 0.07 - R 30.8 172 -2
    // 6.0, 0.0, 0.0, 0.075 - R 22.5, 171 -3
    // 2.0, 0.0, 0.0, 0.06 - R 33.47, 167 -3
    // 6.0, 0.0, 0.0, 0.06 - R 33,47, 166 -3
    // 1.0, 0.0, 0.0, 0.40 - latest set
    // Initial measurement noise (conservative starting point)
    private val R_INIT = 25.0  // ~5 mg/dL std dev - assumes moderate sensor quality

    // Adaptive R bounds
    private val R_MIN = 16.0    // ~2 mg/dL std dev - excellent sensor
    //private val R_MAX = 144.0   // Max ~12 mg/dl std dev permissible - poor sensor; cap prevents filter from losing trust in sensor entirely
    private val R_MAX = 196.0
    private val R_EFF_MAX = 400.0
    // R adaptation parameters - DUAL RATE SYSTEM
    private val innovationWindow = 48  // 150 minutes for stable statistics
    private val FAST_INCREASE_RATE = 1.10   // 10% increase (abrupt degradation)
    private val FAST_DECREASE_RATE = 0.90   // 10% decrease (abrupt improvement)
    private val SLOW_INCREASE_RATE = 1.03   // 2% increase (gradual drift)
    private val SLOW_DECREASE_RATE = 0.97   // 2% decrease (gradual improvement)
    private val RATE_DAMPING = 0.98         // 6% rate decay per step

    // Chi-squared based outlier detection (99.99% confidence, 1 DOF)
    private val CHI_SQUARED_THRESHOLD = 15.13  // Statistically rigorous
    private val OUTLIER_ABSOLUTE = 65.0        // Absolute safety limit (mg/dL)

    // Consecutive outlier handling
    private val MAX_CONSECUTIVE_OUTLIERS = 1   // Force acceptance after 15 minutes
    private val MIN_R_MULTIPLIER = 2.0         // Minimum R inflation on forced update
    private val MAX_R_MULTIPLIER = 4.0         // Maximum R inflation on forced update

    // Covariance limits (tighter for faster recovery)
    private val MAX_GLUCOSE_VARIANCE = 400.0  // Max 20 mg/dL std dev
    private val MAX_RATE_VARIANCE = 4.00      // Max 1.5 mg/dL/min std dev

    // Innovation-based validation - DETECT PARAMETER CORRUPTION
    private val INNOVATION_RESET_THRESHOLD = 12.0  // Reset if avg innovation > 12
    private val INNOVATION_VALIDATION_SAMPLES = 15  // Need 15 samples before validating

    // Gap handling
    private val MINOR_GAP_THRESHOLD = 7.0      // Minutes - bridge with prediction
    private val MAJOR_GAP_THRESHOLD = 60.0     // Minutes - segment data
    private val RATE_DECAY_TIME_CONSTANT = 30.0  // Minutes - physiological decay

    // Processing limits
    private val MAX_FILTER_WINDOW = 8640  // 30 days at 5-min intervals

    // ============================================================
    // DATA STRUCTURES
    // ============================================================

    /**
     * Represents a continuous segment of glucose data without major gaps
     */
    private data class DataSegment(
        val startIdx: Int,  // Inclusive (newest)
        val endIdx: Int     // Inclusive (oldest)
    )

    // ============================================================
    // PERSISTENT STATE
    // ============================================================

    // Learned measurement noise
    private var learnedR = R_INIT

    // Innovation tracking
    private val innovations = ArrayDeque<Double>(innovationWindow + 1)
    private val rawInnovationVariance = ArrayDeque<Double>(innovationWindow + 1)

    // Session tracking
    private var lastProcessedTimestamp: Long = 0
    private var lastSensorChangeTimestamp: Long = 0
    private var sensorSessionId: Int = 0
    private var sessionMeasurementCount: Long = 0
    private var sessionOutlierCount: Long = 0

    // Consecutive outlier counter
    private var consecutiveOutliers = 0

    // Event system
    private val resetRequested = AtomicBoolean(false)
    private val disposable = CompositeDisposable()
    private val sensorChangeDisposables = CompositeDisposable()

    // ============================================================
    // INITIALIZATION
    // ============================================================

    init {
        // Initialize sigma point weights
        Wm[0] = lambda / (n + lambda)
        Wc[0] = lambda / (n + lambda) + (1 - alpha * alpha + beta)
        val w = 1.0 / (2.0 * (n + lambda))
        for (i in 1 until 2 * n + 1) {
            Wm[i] = w
            Wc[i] = w
        }

        // Load persisted parameters
        loadPersistedParameters()

        // Subscribe to sensor change events
        subscribeToSensorChanges()
        loadLastSensorChange()
    }

    // ============================================================
    // PARAMETER PERSISTENCE
    // ============================================================

    /**
     * Load learned R parameter from SharedPreferences
     * Only restores if parameter is from the same sensor session
     * Q is never loaded - it's always the fixed physiological value
     */
    private fun loadPersistedParameters() {
        try {
            val lastSaved = sp.getLong("ukf_last_saved_timestamp", 0L)
            val savedSensorChange = sp.getLong("ukf_sensor_change_timestamp", 0L)

            if (lastSaved > 0) {
                lastSensorChangeTimestamp = savedSensorChange
                lastProcessedTimestamp = sp.getLong("ukf_last_processed_timestamp", 0L)
                learnedR = sp.getDouble("ukf_learned_r", R_INIT)
                sensorSessionId = sp.getInt("ukf_session_id", 0)

                // Validate loaded R
                if (learnedR < R_MIN || learnedR > R_MAX) {
                    aapsLogger.info(LTag.GLUCOSE, "UKF: Loaded R ($learnedR) out of bounds, resetting to R_INIT")
                    learnedR = R_INIT
                }

                aapsLogger.info(LTag.GLUCOSE, "UKF: Loaded session $sensorSessionId " +
                    "(R=${String.format("%.1f", learnedR)}, " +
                    "Q_glucose=${String.format("%.2f", Q_FIXED[0])} [FIXED], " +
                    "Q_rate=${String.format("%.4f", Q_FIXED[3])} [FIXED])")
            }
        } catch (e: Exception) {
            aapsLogger.error(LTag.GLUCOSE, "UKF: Failed to load persisted parameters", e)
            // Reset to defaults on error
            learnedR = R_INIT
        }
    }

    /**
     * Save learned R parameter to SharedPreferences
     * Called periodically during operation (every 50 measurements)
     * Q is never saved - it's always the fixed physiological value
     */
private fun savePersistedParameters() {
    try {
        sp.putLong("ukf_last_saved_timestamp", System.currentTimeMillis())
        sp.putLong("ukf_sensor_change_timestamp", lastSensorChangeTimestamp)
        sp.putLong("ukf_last_processed_timestamp", lastProcessedTimestamp)
        sp.putDouble("ukf_learned_r", learnedR)
        sp.putInt("ukf_session_id", sensorSessionId)

            aapsLogger.debug(LTag.GLUCOSE, "UKF: Saved learned R for session $sensorSessionId")
        } catch (e: Exception) {
            aapsLogger.error(LTag.GLUCOSE, "UKF: Failed to save persisted parameters", e)
        }
    }

    // ============================================================
    // SENSOR CHANGE DETECTION
    // ============================================================

    /**
     * Subscribe to sensor change events via RxBus
     * Listens for EventTherapyEventChange and checks if it's a sensor change
     */
    private fun subscribeToSensorChanges() {
        disposable += rxBus
            .toObservable(EventTherapyEventChange::class.java)
            .observeOn(aapsSchedulers.io)
            .subscribe({
                checkForSensorChange()
            }, { throwable ->
                aapsLogger.error(LTag.GLUCOSE, "UKF: Error subscribing to therapy events", throwable)
            })
    }

    /**
     * Load the most recent sensor change timestamp from database
     * Called on plugin initialization and after therapy event changes
     * Queries last 30 days of therapy events
     */
    private fun loadLastSensorChange() {
        // Clear any pending queries first
        sensorChangeDisposables.clear()

        sensorChangeDisposables += persistenceLayer
            .getTherapyEventDataFromTime(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000, false)
            .observeOn(aapsSchedulers.io)
            .subscribe({ therapyEvents ->
                val latestSensorChange = therapyEvents
                    .filter { it.type == TE.Type.SENSOR_CHANGE }
                    .maxByOrNull { it.timestamp }

                latestSensorChange?.let { sensorChange ->
                    if (sensorChange.timestamp > lastSensorChangeTimestamp) {
                        aapsLogger.info(LTag.GLUCOSE, "UKF: Detected sensor change at ${sensorChange.timestamp}")
                        lastSensorChangeTimestamp = sensorChange.timestamp

                        if (lastProcessedTimestamp > 0 && sensorChange.timestamp > lastProcessedTimestamp) {
                            aapsLogger.info(LTag.GLUCOSE, "UKF: Sensor changed after last processing, scheduling learning reset")
                            resetRequested.set(true)
                        }
                    }
                }
            }, { throwable ->
                aapsLogger.error(LTag.GLUCOSE, "UKF: Error loading sensor change history", throwable)
            })
    }

    /**
     * Check if a sensor change event occurred since last check
     * Called when EventTherapyEventChange is received
     */
    private fun checkForSensorChange() {
        // Clear any pending queries first
        sensorChangeDisposables.clear()

        sensorChangeDisposables += persistenceLayer
            .getTherapyEventDataFromTime(lastSensorChangeTimestamp, false)
            .observeOn(aapsSchedulers.io)
            .subscribe({ therapyEvents ->
                val newSensorChanges = therapyEvents
                    .filter { it.type == TE.Type.SENSOR_CHANGE && it.timestamp > lastSensorChangeTimestamp }

                if (newSensorChanges.isNotEmpty()) {
                    val latestChange = newSensorChanges.maxByOrNull { it.timestamp }!!
                    aapsLogger.info(LTag.GLUCOSE, "UKF: New sensor change at ${latestChange.timestamp}")
                    lastSensorChangeTimestamp = latestChange.timestamp
                    resetRequested.set(true)
                }
            }, { throwable ->
                aapsLogger.error(LTag.GLUCOSE, "UKF: Error checking for sensor changes", throwable)
            })
    }

    /**
     * Cleanup RxBus subscriptions when plugin stops
     * Called automatically by plugin framework
     */
    override fun onStop() {
        super.onStop()
        aapsLogger.info(LTag.GLUCOSE, "UKF: Cleaning up RxBus subscriptions")
        disposable.clear()
        sensorChangeDisposables.clear()
    }

    // ============================================================
    // RESET LOGIC
    // ============================================================

    /**
     * Determine if learning should be reset
     *
     * Uses ACTUAL sensor change events + innovation-based validation
     *
     * Reset conditions:
     * 1. Reset explicitly requested by sensor change event listener
     * 2. First ever call (lastProcessedTimestamp == 0)
     * 3. Timestamp corruption (time went backwards)
     * 4. Very large gaps (> 24h) as safety fallback for missed events
     * 5. Severely corrupted R (detected via innovation statistics)
     *
     * @param currentTimestamp The timestamp of the most recent glucose reading
     * @return true if learning parameters should be reset to initial values
     */
    private fun shouldResetLearning(currentTimestamp: Long): Boolean {
        if (resetRequested.getAndSet(false)) {
            aapsLogger.info(LTag.GLUCOSE, "UKF: Learning reset requested by sensor change event")
            return true
        }

        if (lastProcessedTimestamp == 0L) {
            aapsLogger.info(LTag.GLUCOSE, "UKF: First call, initializing learning")
            return true
        }

        val timeDiffMinutes = (currentTimestamp - lastProcessedTimestamp) / (1000.0 * 60.0)

        if (timeDiffMinutes < 0) {
            aapsLogger.info(LTag.GLUCOSE, "UKF: Timestamp went backwards, resetting learning")
            return true
        }

        if (timeDiffMinutes > 1440.0) {
            aapsLogger.info(LTag.GLUCOSE, "UKF: Very large gap (${timeDiffMinutes.toInt()} min), resetting")
            return true
        }

        // Check for severely mis-tuned R based on innovation statistics
        if (innovations.size >= INNOVATION_VALIDATION_SAMPLES) {
            val avgInnovation = innovations.average()
            if (avgInnovation > INNOVATION_RESET_THRESHOLD) {
                aapsLogger.info(LTag.GLUCOSE,
                    "UKF: Severely mis-tuned parameters (avg innovation: ${String.format("%.1f", avgInnovation)}), " +
                    "resetting (R was ${String.format("%.1f", learnedR)})")
                return true
            }
        }

        return false
    }

    /**
     * Reset learned R parameter to initial value
     * Called when sensor changes or significant data anomalies are detected
     * Clears innovation history and increments session ID
     * Q remains fixed - never reset
     */
    private fun resetLearning() {
        learnedR = R_INIT
        innovations.clear()
        sensorSessionId++
        sessionMeasurementCount = 0
        sessionOutlierCount = 0
        consecutiveOutliers = 0

        aapsLogger.info(LTag.GLUCOSE,
            "UKF: Learning reset complete (session $sensorSessionId, " +
            "R=${String.format("%.1f", learnedR)}, " +
            "Q_glucose=${String.format("%.2f", Q_FIXED[0])} [FIXED], " +
            "Q_rate=${String.format("%.4f", Q_FIXED[3])} [FIXED])")

        // Save the reset state
        savePersistedParameters()
    }

    // ============================================================
    // MAIN FILTERING
    // ============================================================

    override fun smooth(data: MutableList<InMemoryGlucoseValue>): MutableList<InMemoryGlucoseValue> {
        if (data.isEmpty()) return data

        try {
            return smoothInternal(data)
        } catch (e: Exception) {
            aapsLogger.error(LTag.GLUCOSE, "UKF: Error during smoothing, falling back to raw values", e)
            copyRawToSmoothed(data)
            return data
        }
    }

    /**
     * Split data into segments at major gaps (>60 min)
     * Each segment will be filtered and smoothed independently
     */
    private fun findDataSegments(data: List<InMemoryGlucoseValue>): List<DataSegment> {
        if (data.size < 2) return emptyList()

        val segments = mutableListOf<DataSegment>()
        var segmentStart = 0

        for (i in 0 until data.size - 1) {
            val timeDiff = (data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60.0)

            // Segment at major gaps (>60 min)
            if (timeDiff > MAJOR_GAP_THRESHOLD || timeDiff < 2.0 || data[i].value == 38.0) {
                // Close current segment if it has enough points
                if (i - segmentStart >= 2) {
                    segments.add(DataSegment(segmentStart, i))
                }
                // Next segment starts after the gap
                segmentStart = i + 1
            }
        }

        // Add final segment
        if (data.size - segmentStart >= 2) {
            segments.add(DataSegment(segmentStart, data.size - 1))
        }

        return segments
    }

    private fun smoothInternal(data: MutableList<InMemoryGlucoseValue>): MutableList<InMemoryGlucoseValue> {
        if (shouldResetLearning(data[0].timestamp)) {
            resetLearning()
        }

        val segments = findDataSegments(data)

        if (segments.isEmpty()) {
            copyRawToSmoothed(data)
            return data
        }

        aapsLogger.debug(LTag.GLUCOSE, "UKF: Processing ${segments.size} data segments")

        // Track new measurements across all segments
        val previousTimestamp = lastProcessedTimestamp
        lastProcessedTimestamp = data[0].timestamp

        // Process each segment independently
        for ((idx, segment) in segments.withIndex()) {
            val segmentSize = segment.endIdx - segment.startIdx + 1
            aapsLogger.debug(LTag.GLUCOSE,
                             "UKF: Segment $idx: ${segmentSize} points " +
                                 "(idx ${segment.startIdx} to ${segment.endIdx})")

            processSegment(data, segment.startIdx, segment.endIdx, previousTimestamp)
        }

        // Fill any unprocessed points with raw values
        for (i in data.indices) {
            if (data[i].smoothed == 0.0) {  // Not yet processed
                data[i].smoothed = max(data[i].value, 39.0)
                data[i].trendArrow = TrendArrow.NONE
            }
        }

        // Periodic logging and saving
        if (sessionMeasurementCount % 100 == 0L && sessionMeasurementCount > 0) {
            val sessionOutlierRate = sessionOutlierCount.toDouble() / sessionMeasurementCount
            val avgInnovation = if (innovations.isNotEmpty()) innovations.average() else 0.0
            aapsLogger.info(LTag.GLUCOSE,
                            "UKF: Session $sensorSessionId, $sessionMeasurementCount measurements, " +
                                "R=${String.format("%.1f", learnedR)} [ADAPTIVE], " +
                                "Q_glucose=${String.format("%.2f", Q_FIXED[0])} [FIXED], " +
                                "Q_rate=${String.format("%.4f", Q_FIXED[3])} [FIXED], " +
                                "AvgInnovation=${String.format("%.2f", avgInnovation)}, " +
                                "OutlierRate=${String.format("%.1f%%", sessionOutlierRate * 100)}")
        }

        // Save if we processed new data
        val newDataProcessed = data.any { it.timestamp > previousTimestamp }

        if (newDataProcessed && sessionMeasurementCount > 0) {
            // Get current filter state from most recent segment
            // Note: P values are segment-specific, so we report overall statistics
            val diagnostics = mapOf(
                "session_id" to sensorSessionId,
                "measurements" to sessionMeasurementCount,
                "outliers" to sessionOutlierCount,
                "outlier_rate" to (sessionOutlierCount.toDouble() / sessionMeasurementCount),
                "R_learned" to learnedR,
                "R_stdev_equiv" to sqrt(learnedR),
                "avg_innovation" to if (innovations.isNotEmpty()) innovations.average() else 0.0,
                "innovation_count" to innovations.size,
                "consecutive_outliers" to consecutiveOutliers,
                "segments_processed" to segments.size
            )

            aapsLogger.debug(LTag.GLUCOSE, "UKF_DIAGNOSTICS: $diagnostics")
        }

        if (newDataProcessed) {
            savePersistedParameters()
        }

        return data
    }

    /**
     * Process a single continuous segment of data
     * Runs forward filter + backward smoother on segment only
     */
    private fun processSegment(
        data: MutableList<InMemoryGlucoseValue>,
        startIdx: Int,  // Newest point in segment
        endIdx: Int,     // Oldest point in segment
        previousTimestamp: Long  // For tracking new measurements
    ) {
        val segmentSize = endIdx - startIdx + 1
        if (segmentSize < 2) {
            data[startIdx].smoothed = max(data[startIdx].value, 39.0)
            data[startIdx].trendArrow = TrendArrow.NONE
            return
        }

        // Initialize state from oldest point in segment
        val initialGlucose = data[endIdx].value
        var initialRate = 0.0

        if (segmentSize >= 2 && endIdx > 0) {
            val dt = (data[endIdx - 1].timestamp - data[endIdx].timestamp) / (1000.0 * 60.0)
            if (dt in 3.0..7.0) {
                initialRate = (data[endIdx - 1].value - data[endIdx].value) / dt
                initialRate = initialRate.coerceIn(-4.0, 4.0)
            }
        }

        val x = doubleArrayOf(initialGlucose, initialRate)
        val P = doubleArrayOf(16.0, 0.0, 0.0, 1.0)
        val Q = Q_FIXED.copyOf()
        var R = learnedR

        val forwardStates = ArrayList<FilterState>(segmentSize)
        val forwardResults = DoubleArray(segmentSize)
        forwardResults[segmentSize - 1] = x[0]

        var segmentNewMeasurements = 0
        var segmentOutliers = 0

        // Tracks persistence to distinguish real dynamics from single-sample artifacts.
        // Incremented only when normalized innovation is large and same sign as previous.
        var consecutiveLargeSameSign = 0
        var lastNormInnovSign = 0

        // === FORWARD PASS (within segment only) ===
        for (i in (endIdx - 1) downTo startIdx) {
            val dt = (data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60.0)

            // Handle minor gaps within segment
            if (dt > MINOR_GAP_THRESHOLD && dt <= MAJOR_GAP_THRESHOLD) {
                val qScale = dt / 5.0
                P[0] = min(P[0] + Q[0] * qScale, MAX_GLUCOSE_VARIANCE)
                P[3] = min(P[3] + Q[3] * qScale, MAX_RATE_VARIANCE)
                x[1] *= exp(-dt / RATE_DECAY_TIME_CONSTANT)

                aapsLogger.debug(LTag.GLUCOSE,
                                 "UKF: Bridging ${String.format("%.1f", dt)} min gap within segment")
            }

            // Covariance sanity checks
            P[0] = P[0].coerceIn(0.1, MAX_GLUCOSE_VARIANCE)
            P[3] = P[3].coerceIn(0.001, MAX_RATE_VARIANCE)

            val dtClamped = dt.coerceIn(3.5, 6.5)
            val (xPred, PPred) = predict(x, P, Q, dtClamped)

            val stateBefore = FilterState(x.copyOf(), P.copyOf(), xPred.copyOf(), PPred.copyOf(), dtClamped)

            val z = data[i].value

            // Skip only error code
            if (z <= 38.0) {
                x[0] = xPred[0]
                x[1] = xPred[1]
                P[0] = PPred[0]
                P[1] = PPred[1]
                P[2] = PPred[2]
                P[3] = PPred[3]
                val resultIdx = i - startIdx
                forwardResults[resultIdx] = x[0]
                forwardStates.add(0, stateBefore)
                continue
            }

            val innovation = z - xPred[0]
            val innovationVariance = PPred[0] + R
            val std = sqrt(innovationVariance)
            val norm = innovation / std
            val mahalSq = (innovation * innovation) / innovationVariance
            val isNewData = data[i].timestamp > previousTimestamp

            // Update persistence counters to gate Q inflation only on sustained, same-sign deviations.
            val sign = when {
                norm > 0.0 -> 1
                norm < 0.0 -> -1
                else -> 0
            }
            if (abs(norm) > 3.0 && sign != 0 && sign == lastNormInnovSign) {
                consecutiveLargeSameSign += 1          // CHANGED: persistence requirement for Q inflation
            } else if (abs(norm) > 3.0 && sign != 0) {
                consecutiveLargeSameSign = 1
            } else {
                consecutiveLargeSameSign = 0
            }
            lastNormInnovSign = sign

            // Soft-gated robust update:
            // 1) Inflate R per innovation to always accept the sample with reduced gain if it looks outlying.
            // 2) Temporarily inflate Q_rate (and modestly Q_glucose) only if large deviations persist (>=2, same sign).
            val rScale = max(1.0, mahalSq / CHI_SQUARED_THRESHOLD)      // CHANGED: per-innovation R scaling
            val R_eff = min(R * rScale, R_EFF_MAX)                      // bounded effective R

            // Decide Q inflation based on persistence to protect against single-sample compression lows.
            val qInflateAllowed = consecutiveLargeSameSign >= 2          // CHANGED: persistence guard
            val zScore = abs(norm).coerceAtLeast(1.0)
            val qScale = if (qInflateAllowed) zScore.coerceIn(1.0, 3.0) else 1.0

            // Build temporary Q only if needed; prioritize slope agility, bound glucose variance growth.
            val tempQ = if (qScale > 1.0) {
                Q_FIXED.copyOf().apply {
                    this[0] *= min(qScale, 2.0)  // modest G inflation, bounded
                    this[3] *= qScale            // prioritize Ġ agility
                }
            } else {
                Q_FIXED
            }

            // Re-predict with tempQ (if inflated) to let the slope pivot, then update with R_eff.
            val (xPredEff, PPredEff) = if (qScale > 1.0) predict(x, P, tempQ, dtClamped) else Pair(xPred, PPred)

            // Always update; never skip. CHANGED: removes multi-sample lock-out.
            update(xPredEff, PPredEff, z, R_eff, x, P)

            // Track innovation stats for adaptive R; skip adapting R on very large deviations to avoid mislearning on artifacts.
            trackInnovation(innovation, innovationVariance)
            val skipRUpdate = abs(norm) > 3.0
            if (!skipRUpdate) {
                R = adaptMeasurementNoise(R, innovations, rawInnovationVariance)
            }
            if (mahalSq > CHI_SQUARED_THRESHOLD || abs(innovation) > OUTLIER_ABSOLUTE) {
                aapsLogger.debug(LTag.GLUCOSE,
                                 "UKF: Outlier detected - χ²=${String.format("%.2f", mahalSq)}, " +
                                     "innovation=${String.format("%.1f", innovation)}, " +
                                     "P[0]=${String.format("%.1f", P[0])}")
            }
            if (isNewData) {
                segmentNewMeasurements++
                sessionMeasurementCount++
                if (mahalSq > CHI_SQUARED_THRESHOLD || abs(innovation) > OUTLIER_ABSOLUTE) {
                    segmentOutliers++ // only for diagnostics/logging
                    sessionOutlierCount++
                }
            }

            // Logging with effective parameters for transparency.
            aapsLogger.warn(
                LTag.GLUCOSE,
                "UKF: live R=${String.format("%.1f", R)}, R_eff=${String.format("%.1f", R_eff)}," +
                " BG=${String.format("%.0f", z)}, predBG=${String.format("%.0f", xPred[0])}," +
                " innov=${String.format("%.1f", innovation)}, |ν|/σ=${String.format("%.1f", abs(norm))}," +
                " qScale=${String.format("%.1f", qScale)}," +
                " P[0]=${String.format("%.1f", P[0])}, P[3]=${String.format("%.4f", P[3])}"
            )

            val resultIdx = i - startIdx
            forwardResults[resultIdx] = x[0]
            forwardStates.add(0, stateBefore)
        }

        // Update learned R
        learnedR = R

        // Log segment processing
        if (segmentNewMeasurements > 0) {
            val segmentOutlierRate = segmentOutliers.toDouble() / segmentNewMeasurements
            aapsLogger.debug(LTag.GLUCOSE,
                             "UKF: Segment processed ${segmentNewMeasurements} new measurements, " +
                                 "${segmentOutliers} outliers (${String.format("%.1f%%", segmentOutlierRate * 100)})")
        }

        // === BACKWARD SMOOTHING (RTS) - within segment only ===
        val smoothedResults = forwardResults.copyOf()

        if (segmentSize >= 3 && forwardStates.isNotEmpty()) {
            val maxSmoothSteps = min(segmentSize - 1, forwardStates.size)
            var xSmooth = doubleArrayOf(forwardResults[0], x[1])

            for (i in 1..maxSmoothSteps) {
                val state = forwardStates[i - 1]
                val C = computeSmootherGain(state.P, state.PPred, state.dt)
                val dx0 = xSmooth[0] - state.xPred[0]
                val dx1 = xSmooth[1] - state.xPred[1]
                xSmooth[0] = forwardResults[i] + C[0] * dx0 + C[1] * dx1
                xSmooth[1] = state.x[1] + C[2] * dx0 + C[3] * dx1
                smoothedResults[i] = xSmooth[0]
            }
        }

        // Apply results to this segment
        for (i in startIdx..endIdx) {
            val resultIdx = i - startIdx
            data[i].smoothed = max(smoothedResults[resultIdx], 39.0)
            data[i].trendArrow = if (i == startIdx) computeTrendArrow(x[1]) else TrendArrow.NONE
        }
    }


    // ============================================================
    // OUTLIER DETECTION
    // ============================================================

    /**
     * Chi-squared based outlier detection (99.99% confidence)
     *
     * Under correctly tuned filter, squared Mahalanobis distance follows χ²(1).
     * Threshold of 15.13 corresponds to 99.99% confidence (only 0.01% false rejections).
     *
     * The innovation variance (P[0] + R) automatically adapts the threshold when
     * filter uncertainty increases, preventing lock-out.
     */
    private fun isOutlier(innovation: Double, innovationVariance: Double, P: DoubleArray): Boolean {
        val mahalanobisSq = (innovation * innovation) / innovationVariance

        if (mahalanobisSq > CHI_SQUARED_THRESHOLD || abs(innovation) > OUTLIER_ABSOLUTE) {
            aapsLogger.debug(LTag.GLUCOSE,
                "UKF: Outlier detected - χ²=${String.format("%.2f", mahalanobisSq)}, " +
                "innovation=${String.format("%.1f", innovation)}, " +
                "P[0]=${String.format("%.1f", P[0])}")
            return true
        }

        return false
    }

    // ============================================================
    // ADAPTIVE R ESTIMATION
    // ============================================================

    private fun trackInnovation(innovation: Double, innovationVariance: Double) {
        val normalizedSq = (innovation * innovation) / innovationVariance
        val rawSq = innovation * innovation
        innovations.addFirst(normalizedSq)
        rawInnovationVariance.addFirst(rawSq)
        if (innovations.size > innovationWindow) {
            innovations.removeLast()
        }
        if (rawInnovationVariance.size > innovationWindow) {
            rawInnovationVariance.removeLast()
        }
    }

    /**
     * Dual-rate adaptive measurement noise estimation
     *
     * Uses innovation-based adaptive estimation (IAE) with two adaptation rates:
     * - FAST rates (10%) when abrupt noise change detected via F-test
     * - SLOW rates (2%) for gradual drift
     *
     * Under ideal conditions: E[normalized_innovation²] ≈ 1.0 (χ² distribution, df=1)
     */
    // CHANGED: Skip adapting R on very large normalized innovations to avoid mislearning from compression lows or real transients.
    private fun adaptMeasurementNoise(
        currentR: Double,
        innovations: ArrayDeque<Double>,
        rawInnovationsSquared: ArrayDeque<Double>
    ): Double {
        if (innovations.size < 8) return currentR

        val avgInnovSq = med(innovations)

        // If recent normalized innovations are extreme, hold R steady this step.
        // This prevents a single compression low from dragging R upward,
        // and prevents dynamic events from collapsing R later.
        val extreme = innovations.any { it > 9.0 }  // |ν|/σ > 3 → squared > 9
        if (extreme) return currentR.coerceIn(R_MIN, R_MAX)

        var newR = currentR
        if (avgInnovSq >= 1.1 || avgInnovSq <= 0.9) {
            // Median-based gentle correction toward raw innovation variance.
            newR = currentR + 0.06 * (med(rawInnovationsSquared) - currentR)
        }

        return newR.coerceIn(R_MIN, R_MAX)  // CHANGED: raised R_MIN floor applied here
    }


    /**
     * Detect abrupt noise change using F-test on variance ratio
     *
     * Compares recent (last 10 samples) vs historic (previous 10 samples) variance.
     * F(0.01, 9, 9) ≈ 5.35 critical value for 99% confidence.
     */
    /*
    private fun detectAbruptNoiseChange(innovations: ArrayDeque<Double>): Boolean {
        if (innovations.size < 20) return false

        // Use 8-sample windows with 4-sample protective gap
        val recent = innovations.take(8)          // Last 40 minutes
        val historic = innovations.drop(12).take(8)  // 60-100 minutes ago

        val recentVar = recent.variance()
        val historicVar = historic.variance()

        if (historicVar < 0.1 || recentVar < 0.1) return false

        val ratio = recentVar / historicVar

        // F(0.995, 7, 7) critical values for 99% confidence
        return ratio > 10.0 || ratio < 0.10
    }

     */

    private fun List<Double>.variance(): Double {
        if (size < 2) return 0.0
        val mean = average()
        return map { (it - mean) * (it - mean) }.average()
    }

    // ============================================================
    // TREND ARROW COMPUTATION
    // ============================================================

    /**
     * Compute trend arrow from glucose rate of change
     *
     * @param rate Glucose rate in mg/dL/min
     * @return Appropriate trend arrow
     */
    private fun computeTrendArrow(rate: Double): TrendArrow {
        return when {
            rate > 2.0 -> TrendArrow.DOUBLE_UP
            rate > 1.0 -> TrendArrow.SINGLE_UP
            rate > 0.5 -> TrendArrow.FORTY_FIVE_UP
            rate < -2.0 -> TrendArrow.DOUBLE_DOWN
            rate < -1.0 -> TrendArrow.SINGLE_DOWN
            rate < -0.5 -> TrendArrow.FORTY_FIVE_DOWN
            else -> TrendArrow.FLAT
        }
    }

    // ============================================================
    // UKF CORE FUNCTIONS
    // ============================================================

    /**
     * Internal data class for storing filter state during forward pass
     * Used by the RTS smoother to perform backward smoothing
     *
     * @property x State estimate before update [glucose, rate]
     * @property P State covariance before update (2x2 in row-major)
     * @property xPred Predicted state [glucose, rate]
     * @property PPred Predicted covariance (2x2 in row-major)
     * @property dt Time step used for this prediction (minutes)
     */
    private data class FilterState(
        val x: DoubleArray,
        val P: DoubleArray,
        val xPred: DoubleArray,
        val PPred: DoubleArray,
        val dt: Double
    )

    /**
     * Compute Rauch-Tung-Striebel (RTS) smoother gain
     *
     * The smoother gain C maps forward-filtered estimates to backward-smoothed estimates:
     * C = P * F^T * PPred^-1
     *
     * Where F is the state transition Jacobian:
     * F = [[1, dt], [0, damping]]
     *
     * @param P Forward-filtered covariance (2x2)
     * @param PPred Predicted covariance (2x2)
     * @param dt Time step (minutes)
     * @return Smoother gain matrix C (2x2 in row-major)
     */
    private fun computeSmootherGain(P: DoubleArray, PPred: DoubleArray, dt: Double): DoubleArray {
        // Compute P * F^T
        val PFt00 = P[0] + P[1] * dt
        val PFt01 = P[1] * RATE_DAMPING
        val PFt10 = P[2] + P[3] * dt
        val PFt11 = P[3] * RATE_DAMPING

        // Invert PPred (2x2 matrix inversion)
        val det = PPred[0] * PPred[3] - PPred[1] * PPred[2]
        if (abs(det) < 1e-10) {
            // Singular matrix - return zero gain
            return doubleArrayOf(0.0, 0.0, 0.0, 0.0)
        }

        val PPredInv00 = PPred[3] / det
        val PPredInv01 = -PPred[1] / det
        val PPredInv10 = -PPred[2] / det
        val PPredInv11 = PPred[0] / det

        // C = P * F^T * PPred^-1
        return doubleArrayOf(
            PFt00 * PPredInv00 + PFt01 * PPredInv10,
            PFt00 * PPredInv01 + PFt01 * PPredInv11,
            PFt10 * PPredInv00 + PFt11 * PPredInv10,
            PFt10 * PPredInv01 + PFt11 * PPredInv11
        )
    }

    /**
     * UKF Prediction Step
     *
     * Propagates state and covariance through the process model using the unscented transform:
     * 1. Generate sigma points from current state
     * 2. Propagate each sigma point through process model: f(x) = [G + Ġ*dt, Ġ*damping]
     * 3. Compute predicted mean and covariance from transformed sigma points
     * 4. Add FIXED process noise Q (scaled linearly with time)
     *
     * @param x Current state [glucose, rate]
     * @param P Current covariance (2x2 in row-major)
     * @param Q FIXED process noise covariance (2x2 in row-major)
     * @param dt Time step in minutes
     * @return Pair of (predicted state, predicted covariance)
     */
    private fun predict(x: DoubleArray, P: DoubleArray, Q: DoubleArray, dt: Double): Pair<DoubleArray, DoubleArray> {
        // Generate sigma points
        val sigmaPoints = generateSigmaPoints(x, P)
        val sigmaPointsPred = Array(2 * n + 1) { DoubleArray(n) }

        // Propagate each sigma point through process model
        for (i in 0 until 2 * n + 1) {
            sigmaPointsPred[i][0] = sigmaPoints[i][0] + sigmaPoints[i][1] * dt  // Glucose: G + Ġ*dt
            sigmaPointsPred[i][1] = sigmaPoints[i][1] * RATE_DAMPING            // Rate: Ġ*damping
        }

        // Compute predicted mean: x̄ = Σ W_i^(m) * χ_i
        val xPred = DoubleArray(n)
        for (i in 0 until 2 * n + 1) {
            xPred[0] += Wm[i] * sigmaPointsPred[i][0]
            xPred[1] += Wm[i] * sigmaPointsPred[i][1]
        }

        // Compute predicted covariance: P = Σ W_i^(c) * (χ_i - x̄)(χ_i - x̄)^T
        val PPred = DoubleArray(4)
        for (i in 0 until 2 * n + 1) {
            val dx0 = sigmaPointsPred[i][0] - xPred[0]
            val dx1 = sigmaPointsPred[i][1] - xPred[1]
            PPred[0] += Wc[i] * dx0 * dx0
            PPred[1] += Wc[i] * dx0 * dx1
            PPred[2] += Wc[i] * dx1 * dx0
            PPred[3] += Wc[i] * dx1 * dx1
        }

        // Add process noise (scaled linearly with time)
        val qScale = dt / 5.0
        PPred[0] += Q[0] * qScale
        PPred[3] += Q[3] * qScale

        // Ensure positive definiteness
        PPred[0] = max(PPred[0], 0.1)
        PPred[3] = max(PPred[3], 0.001)

        return Pair(xPred, PPred)
    }

    /**
     * UKF Update Step
     *
     * Updates state and covariance using a new measurement:
     * 1. Generate sigma points from predicted state
     * 2. Transform sigma points through measurement model: h(x) = G
     * 3. Compute innovation (measurement - prediction)
     * 4. Compute Kalman gain
     * 5. Update state and covariance
     *
     * @param xPred Predicted state [glucose, rate]
     * @param PPred Predicted covariance (2x2 in row-major)
     * @param z Measurement (glucose reading in mg/dL)
     * @param R ADAPTIVE measurement noise variance
     * @param x Output: updated state (modified in place)
     * @param P Output: updated covariance (modified in place)
     */
    private fun update(xPred: DoubleArray, PPred: DoubleArray, z: Double, R: Double, x: DoubleArray, P: DoubleArray) {
        // Generate sigma points from predicted state
        val sigmaPoints = generateSigmaPoints(xPred, PPred)
        val zSigma = DoubleArray(2 * n + 1)

        // Transform sigma points through measurement model (h(x) = glucose)
        for (i in 0 until 2 * n + 1) {
            zSigma[i] = sigmaPoints[i][0]
        }

        // Compute predicted measurement: z̄ = Σ W_i^(m) * Z_i
        var zPred = 0.0
        for (i in 0 until 2 * n + 1) {
            zPred += Wm[i] * zSigma[i]
        }

        // Compute innovation covariance: Pzz = Σ W_i^(c) * (Z_i - z̄)^2 + R
        var Pzz = 0.0
        for (i in 0 until 2 * n + 1) {
            val dz = zSigma[i] - zPred
            Pzz += Wc[i] * dz * dz
        }
        Pzz += R

        // Safety check to prevent division by zero or numerical instability
        if (Pzz < 1e-6) {
            aapsLogger.warn(LTag.GLUCOSE, "UKF: Innovation covariance too small (Pzz=$Pzz), skipping update")
            x[0] = xPred[0]
            x[1] = xPred[1]
            P[0] = PPred[0]
            P[1] = PPred[1]
            P[2] = PPred[2]
            P[3] = PPred[3]
            return
        }

        // Compute cross-covariance: Pxz = Σ W_i^(c) * (χ_i - x̄)(Z_i - z̄)
        val Pxz = DoubleArray(n)
        for (i in 0 until 2 * n + 1) {
            val dx0 = sigmaPoints[i][0] - xPred[0]
            val dx1 = sigmaPoints[i][1] - xPred[1]
            val dz = zSigma[i] - zPred
            Pxz[0] += Wc[i] * dx0 * dz
            Pxz[1] += Wc[i] * dx1 * dz
        }

        // Compute Kalman gain: K = Pxz / Pzz
        val K = DoubleArray(n)
        K[0] = Pxz[0] / Pzz
        K[1] = Pxz[1] / Pzz

        // Update state: x = x̄ + K * (z - z̄)
        val innovation = z - zPred
        x[0] = xPred[0] + K[0] * innovation
        x[1] = xPred[1] + K[1] * innovation

        // Clamp rate to physiological range
        x[1] = x[1].coerceIn(-4.0, 4.0)

        // Update covariance: P = P̄ - K * Pzz * K^T
        P[0] = PPred[0] - K[0] * Pzz * K[0]
        P[1] = PPred[1] - K[0] * Pzz * K[1]
        P[2] = PPred[2] - K[1] * Pzz * K[0]
        P[3] = PPred[3] - K[1] * Pzz * K[1]

        // Ensure positive definiteness
        P[0] = max(P[0], 0.1)
        P[3] = max(P[3], 0.001)
    }

    /**
     * Generate sigma points using Merwe's scaled formulation
     *
     * Creates 2n+1 sigma points around mean x with spread determined by covariance P:
     * - χ_0 = x (center point)
     * - χ_i = x + γ*sqrt(P)_i for i = 1..n
     * - χ_i = x - γ*sqrt(P)_{i-n} for i = n+1..2n
     *
     * Where γ = sqrt(n + λ) and λ is the scaling parameter
     *
     * @param x Mean state [glucose, rate]
     * @param P Covariance (2x2 in row-major)
     * @return Array of 5 sigma points (2n+1 where n=2)
     */
    private fun generateSigmaPoints(x: DoubleArray, P: DoubleArray): Array<DoubleArray> {
        val sigmaPoints = Array(2 * n + 1) { DoubleArray(n) }
        val sqrtP = matrixSqrt2x2(P)

        // Center sigma point
        sigmaPoints[0][0] = x[0]
        sigmaPoints[0][1] = x[1]

        // Positive and negative perturbations
        for (i in 0 until n) {
            sigmaPoints[i + 1][0] = x[0] + gamma * sqrtP[i * 2 + 0]
            sigmaPoints[i + 1][1] = x[1] + gamma * sqrtP[i * 2 + 1]
            sigmaPoints[i + 1 + n][0] = x[0] - gamma * sqrtP[i * 2 + 0]
            sigmaPoints[i + 1 + n][1] = x[1] - gamma * sqrtP[i * 2 + 1]
        }

        return sigmaPoints
    }

    /**
     * Compute matrix square root using Cholesky decomposition
     *
     * For a 2x2 symmetric positive definite matrix P, computes L such that L*L^T = P
     * Uses analytical Cholesky factorization:
     * L = [[l11, 0], [l21, l22]]
     *
     * Where:
     * - l11 = sqrt(a)
     * - l21 = b / l11
     * - l22 = sqrt(d - l21^2)
     *
     * Includes validation for numerical stability and non-positive-definite matrices
     *
     * @param P Covariance matrix [a, b, c, d] in row-major order
     * @return Lower triangular Cholesky factor L in column-major order
     */
    private fun matrixSqrt2x2(P: DoubleArray): DoubleArray {
        val a = P[0]
        val b = (P[1] + P[2]) / 2.0  // Enforce symmetry
        val d = P[3]

        val l11 = sqrt(max(a, 1e-9))
        val l21 = b / l11

        val discriminant = d - l21 * l21
        if (discriminant < -1e-9) {
            aapsLogger.warn(LTag.GLUCOSE, "UKF: Non-positive-definite covariance, using fallback")
            return doubleArrayOf(sqrt(max(a, 0.1)), 0.0, 0.0, sqrt(max(d, 0.01)))
        }

        val l22 = sqrt(max(discriminant, 1e-9))

        // Return in column-major order for easy extraction
        return doubleArrayOf(l11, l21, 0.0, l22)
    }

    // ============================================================
    // UTILITY FUNCTIONS
    // ============================================================
    /**
     * Calculate the median
     */
    fun med(list: List<Double>) = list.sorted().let {
        if (it.size % 2 == 0)
            (it[it.size / 2] + it[(it.size - 1) / 2]) / 2
        else
            it[it.size / 2]
    }

    /**
     * Find the valid data window by checking for gaps and errors
     *
     * Scans backward through data looking for:
     * - Large time gaps (>12 min)
     * - Invalid time differences (<2 min)
     * - Error states (value = 38.0)
     *
     * @param data List of glucose readings, ordered newest to oldest
     * @return Number of valid consecutive readings from the start
     */
    private fun findValidWindow(data: List<InMemoryGlucoseValue>): Int {
        var windowSize = data.size
        for (i in 0 until windowSize - 1) {
            val timeDiff = (data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60.0)
            if (timeDiff >= MAJOR_GAP_THRESHOLD || timeDiff < 2.0 || data[i].value == 38.0) {
                windowSize = i + 1
                break
            }
        }
        return windowSize
    }

    /**
     * Copy raw glucose values to smoothed field (fallback)
     *
     * Used when insufficient data for filtering (< 2 readings)
     * Ensures smoothed field is never null
     *
     * @param data List of glucose readings to populate
     */
    private fun copyRawToSmoothed(data: MutableList<InMemoryGlucoseValue>) {
        for (reading in data) {
            reading.smoothed = max(reading.value, 39.0)
            reading.trendArrow = TrendArrow.NONE
        }
    }
}