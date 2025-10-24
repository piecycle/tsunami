package app.aaps.plugins.smoothing

import app.aaps.core.data.iob.InMemoryGlucoseValue
import app.aaps.core.data.model.TrendArrow
import app.aaps.core.data.plugin.PluginType
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.plugin.PluginBase
import app.aaps.core.interfaces.plugin.PluginDescription
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.smoothing.Smoothing
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.exp
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

@Singleton
class UnscentedKalmanFilterPlugin @Inject constructor(
    aapsLogger: AAPSLogger,
    rh: ResourceHelper
) : PluginBase(
    PluginDescription()
        .mainType(PluginType.SMOOTHING)
        .pluginIcon(app.aaps.core.ui.R.drawable.ic_timeline_24)
        .pluginName(R.string.UKF_name)
        .shortName(R.string.smoothing_shortname)
        .description(R.string.description_UKF),
    aapsLogger, rh
), Smoothing {

    // UKF Parameters - tuned for glucose dynamics
    private val alpha = 0.001  // Spread of sigma points (small for glucose)
    private val beta = 2.0     // Optimal for Gaussian distributions
    private val kappa = 0.0    // Secondary scaling parameter

    // State vector: [glucose, glucose_rate, noise_bias]
    private val stateDim = 3

    // Adaptive noise parameters
    private var processNoise = 0.5      // Initial process noise variance
    private var measurementNoise = 5.0  // Initial measurement noise variance
    private val minProcessNoise = 0.1
    private val maxProcessNoise = 2.0
    private val minMeasurementNoise = 2.0
    private val maxMeasurementNoise = 15.0

    // Innovation-based adaptation parameters
    private val innovationWindowSize = 5
    private val innovationHistory = ArrayDeque<Double>(innovationWindowSize)

    override fun smooth(data: MutableList<InMemoryGlucoseValue>): MutableList<InMemoryGlucoseValue> {
        if (data.size < 4) {
            // Insufficient data, copy raw values
            data.forEach {
                it.smoothed = max(it.value, 39.0)
                it.trendArrow = TrendArrow.NONE
            }
            return data
        }

        // Validate and prepare data
        val validWindowSize = getValidWindowSize(data)
        if (validWindowSize < 4) {
            data.forEach {
                it.smoothed = max(it.value, 39.0)
                it.trendArrow = TrendArrow.NONE
            }
            return data
        }

        // Initialize UKF state
        val initialGlucose = data[validWindowSize - 1].value
        val initialRate = if (validWindowSize > 1) {
            val dt = (data[validWindowSize - 2].timestamp - data[validWindowSize - 1].timestamp) / (1000.0 * 60.0)
            (data[validWindowSize - 2].value - data[validWindowSize - 1].value) / dt
        } else {
            0.0
        }

        var state = doubleArrayOf(initialGlucose, initialRate, 0.0)
        var covariance = createInitialCovariance()

        // Reset innovation history for new smoothing window
        innovationHistory.clear()

        // Process data from oldest to newest
        for (i in (validWindowSize - 1) downTo 0) {
            val dt = if (i > 0) {
                (data[i - 1].timestamp - data[i].timestamp) / (1000.0 * 60.0)
            } else {
                5.0 // Default 5 minute interval
            }

            // Predict step
            val (predictedState, predictedCovariance) = predict(state, covariance, dt)

            // Update step with measurement
            val measurement = data[i].value
            val (updatedState, updatedCovariance, innovation) = update(
                predictedState,
                predictedCovariance,
                measurement
            )

            state = updatedState
            covariance = updatedCovariance

            // Adapt noise parameters based on innovation
            adaptNoiseParameters(innovation)

            // Store smoothed value (ensure minimum of 39 to avoid xDrip error state)
            data[i].smoothed = max(state[0], 39.0)
            data[i].trendArrow = TrendArrow.NONE
        }

        return data
    }

    private fun getValidWindowSize(data: List<InMemoryGlucoseValue>): Int {
        var windowSize = data.size

        // Adjust for database size
        if (windowSize > data.size - 1) {
            windowSize = (data.size - 1).coerceAtLeast(0)
        }

        // Check for gaps and invalid readings
        for (i in 0 until windowSize - 1) {
            val timeDiff = (data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60.0)

            if (timeDiff >= 12.0) {
                windowSize = i + 1
                break
            }

            if (data[i].value == 38.0) {
                windowSize = i
                break
            }
        }

        return windowSize
    }

    private fun createInitialCovariance(): Array<DoubleArray> {
        return arrayOf(
            doubleArrayOf(100.0, 0.0, 0.0),    // Glucose variance
            doubleArrayOf(0.0, 25.0, 0.0),     // Rate variance
            doubleArrayOf(0.0, 0.0, 1.0)       // Bias variance
        )
    }

    private fun predict(
        state: DoubleArray,
        covariance: Array<DoubleArray>,
        dt: Double
    ): Pair<DoubleArray, Array<DoubleArray>> {

        val lambda = alpha * alpha * (stateDim + kappa) - stateDim
        val n = stateDim.toDouble()

        // Generate sigma points
        val sigmaPoints = generateSigmaPoints(state, covariance, lambda)

        // Propagate sigma points through process model
        val propagatedSigmaPoints = Array(2 * stateDim + 1) { i ->
            processModel(sigmaPoints[i], dt)
        }

        // Calculate weights
        val wm = calculateMeanWeights(lambda, n)
        val wc = calculateCovarianceWeights(lambda, n, alpha, beta)

        // Predict mean
        val predictedState = DoubleArray(stateDim) { 0.0 }
        for (i in propagatedSigmaPoints.indices) {
            for (j in 0 until stateDim) {
                predictedState[j] += wm[i] * propagatedSigmaPoints[i][j]
            }
        }

        // Predict covariance
        val predictedCovariance = Array(stateDim) { DoubleArray(stateDim) { 0.0 } }
        for (i in propagatedSigmaPoints.indices) {
            val diff = DoubleArray(stateDim) { j ->
                propagatedSigmaPoints[i][j] - predictedState[j]
            }

            for (j in 0 until stateDim) {
                for (k in 0 until stateDim) {
                    predictedCovariance[j][k] += wc[i] * diff[j] * diff[k]
                }
            }
        }

        // Add process noise
        predictedCovariance[0][0] += processNoise
        predictedCovariance[1][1] += processNoise * 0.5
        predictedCovariance[2][2] += processNoise * 0.1

        return Pair(predictedState, predictedCovariance)
    }

    private fun update(
        predictedState: DoubleArray,
        predictedCovariance: Array<DoubleArray>,
        measurement: Double
    ): Triple<DoubleArray, Array<DoubleArray>, Double> {

        val lambda = alpha * alpha * (stateDim + kappa) - stateDim
        val n = stateDim.toDouble()

        // Generate sigma points for update
        val sigmaPoints = generateSigmaPoints(predictedState, predictedCovariance, lambda)

        // Transform sigma points to measurement space
        val measurementSigmaPoints = DoubleArray(2 * stateDim + 1) { i ->
            measurementModel(sigmaPoints[i])
        }

        // Calculate weights
        val wm = calculateMeanWeights(lambda, n)
        val wc = calculateCovarianceWeights(lambda, n, alpha, beta)

        // Predicted measurement
        var predictedMeasurement = 0.0
        for (i in measurementSigmaPoints.indices) {
            predictedMeasurement += wm[i] * measurementSigmaPoints[i]
        }

        // Innovation covariance
        var innovationCovariance = 0.0
        for (i in measurementSigmaPoints.indices) {
            val diff = measurementSigmaPoints[i] - predictedMeasurement
            innovationCovariance += wc[i] * diff * diff
        }
        innovationCovariance += measurementNoise

        // Cross covariance
        val crossCovariance = DoubleArray(stateDim) { 0.0 }
        for (i in measurementSigmaPoints.indices) {
            val measurementDiff = measurementSigmaPoints[i] - predictedMeasurement
            for (j in 0 until stateDim) {
                val stateDiff = sigmaPoints[i][j] - predictedState[j]
                crossCovariance[j] += wc[i] * stateDiff * measurementDiff
            }
        }

        // Kalman gain
        val kalmanGain = DoubleArray(stateDim) { j ->
            crossCovariance[j] / innovationCovariance
        }

        // Update state
        val innovation = measurement - predictedMeasurement
        val updatedState = DoubleArray(stateDim) { j ->
            predictedState[j] + kalmanGain[j] * innovation
        }

        // Update covariance
        val updatedCovariance = Array(stateDim) { DoubleArray(stateDim) }
        for (i in 0 until stateDim) {
            for (j in 0 until stateDim) {
                updatedCovariance[i][j] = predictedCovariance[i][j] -
                    kalmanGain[i] * innovationCovariance * kalmanGain[j]
            }
        }

        return Triple(updatedState, updatedCovariance, innovation)
    }

    private fun generateSigmaPoints(
        state: DoubleArray,
        covariance: Array<DoubleArray>,
        lambda: Double
    ): Array<DoubleArray> {

        val n = stateDim.toDouble()
        val sigmaPoints = Array(2 * stateDim + 1) { DoubleArray(stateDim) }

        // Center point
        sigmaPoints[0] = state.copyOf()

        // Calculate matrix square root using Cholesky decomposition
        val sqrtMatrix = choleskyDecomposition(covariance, n + lambda)

        // Generate remaining sigma points
        for (i in 0 until stateDim) {
            for (j in 0 until stateDim) {
                sigmaPoints[i + 1][j] = state[j] + sqrtMatrix[j][i]
                sigmaPoints[i + 1 + stateDim][j] = state[j] - sqrtMatrix[j][i]
            }
        }

        return sigmaPoints
    }

    private fun choleskyDecomposition(
        matrix: Array<DoubleArray>,
        scale: Double
    ): Array<DoubleArray> {
        val n = matrix.size
        val result = Array(n) { DoubleArray(n) }

        for (i in 0 until n) {
            for (j in 0..i) {
                var sum = 0.0
                for (k in 0 until j) {
                    sum += result[i][k] * result[j][k]
                }

                if (i == j) {
                    val value = matrix[i][i] * scale - sum
                    result[i][j] = if (value > 0) sqrt(value) else 0.0
                } else {
                    result[i][j] = if (result[j][j] > 0) {
                        (matrix[i][j] * scale - sum) / result[j][j]
                    } else {
                        0.0
                    }
                }
            }
        }

        return result
    }

    private fun processModel(state: DoubleArray, dt: Double): DoubleArray {
        // Glucose physiological model
        // State: [glucose, rate, bias]
        // Simple model: glucose(k+1) = glucose(k) + rate*dt + bias
        // rate(k+1) = rate(k) * decay + process_noise

        val rateDecay = exp(-dt / 60.0)  // 60-minute time constant

        return doubleArrayOf(
            state[0] + state[1] * dt + state[2],  // Glucose
            state[1] * rateDecay,                  // Rate with decay
            state[2] * 0.95                        // Bias with slow decay
        )
    }

    private fun measurementModel(state: DoubleArray): Double {
        // Measurement model: we observe glucose + bias
        return state[0] + state[2]
    }

    private fun calculateMeanWeights(lambda: Double, n: Double): DoubleArray {
        val weights = DoubleArray(2 * stateDim + 1)
        weights[0] = lambda / (n + lambda)
        for (i in 1 until weights.size) {
            weights[i] = 0.5 / (n + lambda)
        }
        return weights
    }

    private fun calculateCovarianceWeights(
        lambda: Double,
        n: Double,
        alpha: Double,
        beta: Double
    ): DoubleArray {
        val weights = DoubleArray(2 * stateDim + 1)
        weights[0] = lambda / (n + lambda) + (1.0 - alpha * alpha + beta)
        for (i in 1 until weights.size) {
            weights[i] = 0.5 / (n + lambda)
        }
        return weights
    }

    private fun adaptNoiseParameters(innovation: Double) {
        // Add innovation to history
        if (innovationHistory.size >= innovationWindowSize) {
            innovationHistory.removeFirst()
        }
        innovationHistory.addLast(innovation)

        if (innovationHistory.size < innovationWindowSize) {
            return
        }

        // Calculate innovation statistics
        val mean = innovationHistory.average()
        val variance = innovationHistory.map { (it - mean).pow(2) }.average()
        val stdDev = sqrt(variance)

        // Adapt measurement noise based on innovation magnitude
        if (stdDev > 10.0) {
            // High innovation - increase measurement noise
            measurementNoise = (measurementNoise * 1.1).coerceIn(
                minMeasurementNoise,
                maxMeasurementNoise
            )
        } else if (stdDev < 3.0) {
            // Low innovation - decrease measurement noise
            measurementNoise = (measurementNoise * 0.95).coerceIn(
                minMeasurementNoise,
                maxMeasurementNoise
            )
        }

        // Adapt process noise based on innovation consistency
        val innovationRange = innovationHistory.maxOrNull()!! - innovationHistory.minOrNull()!!
        if (innovationRange > 15.0) {
            // High variability - increase process noise
            processNoise = (processNoise * 1.05).coerceIn(minProcessNoise, maxProcessNoise)
        } else if (innovationRange < 5.0) {
            // Low variability - decrease process noise
            processNoise = (processNoise * 0.98).coerceIn(minProcessNoise, maxProcessNoise)
        }
    }
}