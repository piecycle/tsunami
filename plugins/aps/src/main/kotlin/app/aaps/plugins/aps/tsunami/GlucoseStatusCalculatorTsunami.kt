package app.aaps.plugins.aps.tsunami

import app.aaps.core.interfaces.aps.GlucoseStatus
import app.aaps.core.interfaces.aps.GlucoseStatusTsunami
import app.aaps.core.interfaces.iob.GlucoseStatusProvider
import app.aaps.core.interfaces.iob.IobCobCalculator
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.utils.DateUtil
import app.aaps.core.interfaces.utils.DecimalFormatter
import app.aaps.plugins.aps.tsunami.extensions.asRounded
import app.aaps.plugins.aps.tsunami.extensions.log
import dagger.Reusable
import javax.inject.Inject

@Reusable
class GlucoseStatusCalculatorTsunami @Inject constructor(
    private val aapsLogger: AAPSLogger,
    private val iobCobCalculator: IobCobCalculator,
    private val dateUtil: DateUtil,
    private val decimalFormatter: DecimalFormatter
) : GlucoseStatusProvider {

    override val glucoseStatusData: GlucoseStatus?
        get() = getGlucoseStatusData(false)

    override fun getGlucoseStatusData(allowOldData: Boolean): GlucoseStatusTsunami? {
        val data = iobCobCalculator.ads.getBucketedDataTableCopy() ?: return null

        val sizeRecords = data.size
        if (sizeRecords == 0) {
            aapsLogger.debug(LTag.GLUCOSE, "sizeRecords==0")
            return null
        }
        if (data[0].timestamp < dateUtil.now() - 7 * 60 * 1000L && !allowOldData) {
            aapsLogger.debug(LTag.GLUCOSE, "oldData")
            return null
        }
        val now = data[0]
        val nowDate = now.timestamp
        var change: Double
        if (sizeRecords == 1) {
            aapsLogger.debug(LTag.GLUCOSE, "sizeRecords==1")
            return GlucoseStatusTsunami(
                glucose = now.recalculated,
                noise = 0.0,
                delta = 0.0,
                shortAvgDelta = 0.0,
                longAvgDelta = 0.0,
                date = nowDate,
            ).asRounded()
        }
        val lastDeltas = ArrayList<Double>()
        val shortDeltas = ArrayList<Double>()
        val longDeltas = ArrayList<Double>()

        // Use the latest sgv value in the now calculations
        for (i in 1 until sizeRecords) {
            if (data[i].recalculated > 39) {
                val then = data[i]
                val thenDate = then.timestamp

                val minutesAgo = ((nowDate - thenDate) / (1000.0 * 60))
                // multiply by 5 to get the same units as delta, i.e. mg/dL/5m
                change = now.recalculated - then.recalculated
                val avgDel = change / minutesAgo * 5
                aapsLogger.debug(LTag.GLUCOSE, "$then minutesAgo=$minutesAgo avgDelta=$avgDel")

                // use the average of all data points in the last 2.5m for all further "now" calculations
                // if (0 < minutesAgo && minutesAgo < 2.5) {
                //     // Keep and average all values within the last 2.5 minutes
                //     nowValueList.add(then.recalculated)
                //     now.value = average(nowValueList)
                //     // short_deltas are calculated from everything ~5-15 minutes ago
                // } else
                if (minutesAgo in 2.5 .. 17.5) {
                    shortDeltas.add(avgDel)
                    // last_deltas are calculated from everything ~5 minutes ago
                    if (minutesAgo in 2.5 .. 7.5) {
                        lastDeltas.add(avgDel)
                    }
                    // long_deltas are calculated from everything ~20-40 minutes ago
                } else if (minutesAgo in 17.5 .. 42.5) {
                    longDeltas.add(avgDel)
                } else {
                    // Do not process any more records after >= 42.5 minutes
                    break
                }
            }
        }
        val shortAverageDelta = average(shortDeltas)
        val delta = if (lastDeltas.isEmpty()) {
            shortAverageDelta
        } else {
            average(lastDeltas)
        }

        return GlucoseStatusTsunami(
            glucose = now.recalculated,
            date = nowDate,
            noise = 0.0, //for now set to nothing as not all CGMs report noise
            shortAvgDelta = shortAverageDelta,
            delta = delta,
            longAvgDelta = average(longDeltas),
        ).also { aapsLogger.debug(LTag.GLUCOSE, it.log(decimalFormatter)) }.asRounded()
    }

    /**
     * Fetches the last 60 minutes of glucose history, ensuring every point in the returned
     * list has a correctly calculated delta based on real subsequent data.
     *
     * This is achieved by fetching a slightly larger data window and using the extra data
     * solely for calculation, ensuring no artificial 'zero delta' points are created.
     * In case data points are missing, delta values are interpolated.
     *
     * @return A List<GlucoseStatus> containing up to 60 minutes of fully processed historical data,
     *         or an empty list if the source is unavailable or insufficient.
     */
    fun recentGlucoseHistory(raw: Boolean): List<GlucoseStatus> {
        val data = iobCobCalculator.ads.getBucketedDataTableCopy().orEmpty()
            .filter { if (raw) it.value > 39 else it.recalculated > 39 }
        // We need at least two data points to calculate any delta.
        if (data.size < 2) {
            aapsLogger.debug(LTag.GLUCOSE, "recentGlucoseHistory: Not enough data to calculate history with deltas (< 2 points).")
            return emptyList()
        }

        val sixtyMinutesAgoTimestamp = dateUtil.now() - 60 * 60 * 1000L

        // Step 1: Find the boundary. We need all points within the 60-minute window,
        // PLUS exactly one more point just outside of it to calculate the last delta.
        val firstOlderIndex = data.indexOfFirst { it.timestamp < sixtyMinutesAgoTimestamp }

        val dataToProcess = if (firstOlderIndex == -1) {
            // All available data is within the last 60 minutes.
            data
        } else {
            // Get the sublist that includes our 60-minute window AND the next point.
            data.subList(0, firstOlderIndex + 1)
        }

        // If after filtering we still don't have enough data, return empty.
        if (dataToProcess.size < 2) {
            aapsLogger.debug(LTag.GLUCOSE, "recentGlucoseHistory: Not enough data in the relevant window to calculate deltas.")
            return emptyList()
        }

        // Step 2: Use `windowed` to create sliding pairs of [current, next].
        // This is the core of the improved logic. It elegantly creates pairs of consecutive points.
        // For a list [P1, P2, P3], it produces [[P1, P2], [P2, P3]].
        // The last point is only ever used as the 'next' point, and never becomes a 'current' point,
        // so it is not included in the final mapped list. This is exactly what you wanted.
        val history = dataToProcess.windowed(size = 2, step = 1, partialWindows = false)
            .map { window ->
                val currentPoint = window[0]
                val nextPoint = window[1] // The next older point

                // Calculate the change in glucose between this point and the next older one.
                // Differentiate between raw data and recalculated data.
                val change: Double
                val bg: Double
                if (raw) {
                    change = currentPoint.value - nextPoint.value
                    bg = currentPoint.value
                } else {
                    change = currentPoint.recalculated - nextPoint.recalculated
                    bg = currentPoint.recalculated
                }
                // Calculate the time difference in minutes.
                val minutes = (currentPoint.timestamp - nextPoint.timestamp) / (1000.0 * 60.0)

                // Calculate delta in mg/dL per 5 minutes. Avoid division by zero.
                val delta = if (minutes > 0.1) (change / minutes * 5.0) else 0.0

                // Create a GlucoseStatusTsunami object. This fulfills the GlucoseStatus interface requirement.
                GlucoseStatusTsunami(
                    glucose = bg,
                    date = currentPoint.timestamp,
                    delta = delta,
                    // The other complex averages aren't needed for historical points.
                    shortAvgDelta = 0.0,
                    longAvgDelta = 0.0,
                    noise = 0.0
                )
            }

        aapsLogger.debug(LTag.GLUCOSE, "recentGlucoseHistory: Processed ${history.size} records for the last 60 minutes with accurate deltas.")

        return history
    }

    companion object {

        fun average(array: ArrayList<Double>): Double {
            var sum = 0.0
            if (array.isEmpty()) return 0.0
            for (value in array) {
                sum += value
            }
            return sum / array.size
        }
    }
}