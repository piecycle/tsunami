package info.nightscout.androidaps.plugins.iob.iobCobCalculator

import dagger.Reusable
import info.nightscout.androidaps.interfaces.IobCobCalculator
import info.nightscout.androidaps.logging.AAPSLogger
import info.nightscout.androidaps.logging.LTag
import info.nightscout.androidaps.utils.DateUtil
import java.util.*
import javax.inject.Inject
import kotlin.math.roundToLong
import org.apache.commons.math3.fitting.PolynomialCurveFitter
import org.apache.commons.math3.fitting.WeightedObservedPoints

@Reusable
class GlucoseStatusProvider @Inject constructor(
    private val aapsLogger: AAPSLogger,
    private val iobCobCalculator: IobCobCalculator,
    private val dateUtil: DateUtil
) {

    val glucoseStatusData: GlucoseStatus?
        get() = getGlucoseStatusData()

    fun getGlucoseStatusData(allowOldData: Boolean = false): GlucoseStatus? {
        val data = iobCobCalculator.ads.getBgReadingsDataTableCopy()
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
            return GlucoseStatus(
                glucose = now.value,
                noise = 0.0,
                delta = 0.0,
                shortAvgDelta = 0.0,
                longAvgDelta = 0.0,
                date = nowDate,
                // MP curve analysis start
                autoISF_duration = 0.0,
                autoISF_average = now.value,
                bg_5minago = 0.0,
                insufficientsmoothingdata = true,
                bg_supersmooth_now = now.value,
                delta_supersmooth_now = 0.0,
                broadfit_a = 0.0, //MP 2nd degree polynomial coefficient a for broadfit
                broadfit_b = 0.0, //MP 2nd degree polynomial coefficient b for broadfit
                broadfit_c = 0.0, //MP 2nd degree polynomial coefficient c for broadfit
                broad_extremum = 0.0
                //MP curve analysis end
            ).asRounded()
        }
        val nowValueList = ArrayList<Double>()
        val lastDeltas = ArrayList<Double>()
        val shortDeltas = ArrayList<Double>()
        val longDeltas = ArrayList<Double>()

        // MP curve analysis start
        val o1_smoothbg: ArrayList<Double> = ArrayList() //MP array for 1st order Smoothed Blood Glucose
        val o2_smoothbg: ArrayList<Double> = ArrayList() //MP array for 2nd order Smoothed Blood Glucose
        val o2_smoothdelta: ArrayList<Double> = ArrayList() //MP array for 2nd order Smoothed delta
        val ssmooth_bg: ArrayList<Double> = ArrayList() //MP array for weighted averaged, super smoothed Blood Glucose
        val ssmooth_delta: ArrayList<Double> = ArrayList() //MP array for deltas of supersmoothed Blood Glucose
        var windowsize = 25 //MP number of bg readings to include in smoothing window
        val o1_weight = 0.4
        val o1_a = 0.5
        val o2_a = 0.4
        val o2_b = 1.0
        var insufficientsmoothingdata = false
        var insufficientfittingdata = false
        var fitarraylength = 5 //MP number of fits to create
        val narrow_fittingwindow = 5 //MP number of bg readings to include in local curve fit (for analysis of curve development)
        val broad_fittingwindow = 12 //MP number of bg readings to include in global curve fit (for detection of maxima)
        var nR2 = 0.0 //MP R squared value for narrowfit
        var nsR2 = 0.0 //MP R squared value for smoothed narrowfit
        var mealscore_smooth = 0.0
        var mealscore_raw = 0.0
        val meal_threshold = 1.8
        var deltascore = 0.0
        val deltathreshold = 7.0 //MP average delta above which deltascore will be 1.
        val weight = 0.15 //MP Weighting used for weighted averages
        //MP test variables
        //MP test variables
        var scoredivisor = 0.0
        //public long activity_pred_time = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP Time in minutes from now to calculate insulin activity for
        //public long activity_pred_time = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP Time in minutes from now to calculate insulin activity for
        var activity_pred_time = 40L //MP Time in minutes from now to calculate insulin activity for

        //MP Tsunami Activity Engine end
        //MP curve analysis end
        // Use the latest sgv value in the now calculations
        val before = data[1]

        nowValueList.add(now.value)
        for (i in 1 until sizeRecords) {
            if (data[i].value > 38) {
                val then = data[i]
                val thenDate = then.timestamp

                val minutesAgo = ((nowDate - thenDate) / (1000.0 * 60)).roundToLong()
                // multiply by 5 to get the same units as delta, i.e. mg/dL/5m
                change = now.value - then.value
                val avgDel = change / minutesAgo * 5
                aapsLogger.debug(LTag.GLUCOSE, "$then minutesAgo=$minutesAgo avgDelta=$avgDel")

                // use the average of all data points in the last 2.5m for all further "now" calculations
                if (0 < minutesAgo && minutesAgo < 2.5) {
                    // Keep and average all values within the last 2.5 minutes
                    nowValueList.add(then.value)
                    now.value = average(nowValueList)
                    // short_deltas are calculated from everything ~5-15 minutes ago
                } else if (2.5 < minutesAgo && minutesAgo < 17.5) {
                    //console.error(minutesAgo, avgDelta);
                    shortDeltas.add(avgDel)
                    // last_deltas are calculated from everything ~5 minutes ago
                    if (2.5 < minutesAgo && minutesAgo < 7.5) {
                        lastDeltas.add(avgDel)
                    }
                    // long_deltas are calculated from everything ~20-40 minutes ago
                } else if (17.5 < minutesAgo && minutesAgo < 42.5) {
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

        val status = GlucoseStatus(
            glucose = now.value,
            date = nowDate,
            noise = 0.0, //for now set to nothing as not all CGMs report noise
            shortAvgDelta = shortAverageDelta,
            delta = delta,
            longAvgDelta = average(longDeltas),
        )
        // autoISF === START
        // mod 7: calculate 2 variables for 5% range
        //  initially just test the handling of arguments
        // status.dura05 = 11d;
        // status.avg05 = 47.11d;
        //  mod 7a: now do the real maths
        // autoISF === START
        // mod 7: calculate 2 variables for 5% range
        //  initially just test the handling of arguments
        // status.dura05 = 11d;
        // status.avg05 = 47.11d;
        //  mod 7a: now do the real maths
        val bw = 0.05 // used for Eversense; may be lower for Dexcom

        var sumBG = now.value
        var oldavg = now.value
        var minutesdur = Math.round(0L / (1000.0 * 60))
        for (i in 1 until sizeRecords) {
            val then = data[i]
            val thenDate: Long = then.timestamp
            //  GZ mod 7c: stop the series if there was a CGM gap greater than 13 minutes, i.e. 2 regular readings
            if (Math.round((nowDate - thenDate) / (1000.0 * 60)) - minutesdur > 13) {
                break
            }
            if (then.value > oldavg * (1 - bw) && then.value < oldavg * (1 + bw)) {
                sumBG += then.value
                oldavg = sumBG / (i + 1)
                minutesdur = Math.round((nowDate - thenDate) / (1000.0 * 60))
            } else {
                break
            }
        }
        status.autoISF_average = oldavg
        status.autoISF_duration = minutesdur.toDouble()
        // autoISF === END

//################################# MP
//### DATA SMOOTHING CORE START ### MP
//################################# MP


//################################# MP
//### DATA SMOOTHING CORE START ### MP
//################################# MP


//TODO: Decide what happens if there's insufficient data

// ADJUST SMOOTHING WINDOW TO ONLY INCLUDE VALID READINGS
        // Valid readings include:
        // - Values that actually exist (windowsize may not be larger than sizeRecords)
        // - Values that come in approx. every 5 min. If the time gap between two readings is larger, this is likely due to a sensor error or warmup of a new sensor.d
        // - Values that are not 38 mg/dl; 38 mg/dl reflects an xDrip error state (according to a comment in determine-basal.js)

        //MP: Adjust smoothing window if database size is smaller than the default value + 1 (+1 because the reading before the oldest reading to be smoothed will be used in the calculations
        if (sizeRecords < windowsize) { //MP standard smoothing window
            windowsize = sizeRecords //MP Adjust smoothing window to the size of database if it is smaller than the original window size
        }

        //MP: Adjust smoothing window further if a gap in the BG database is detected, e.g. due to sensor errors of sensor swaps, or if 38 mg/dl are reported (xDrip error state)

        //MP: Adjust smoothing window further if a gap in the BG database is detected, e.g. due to sensor errors of sensor swaps, or if 38 mg/dl are reported (xDrip error state)
        for (i in 0 until windowsize) {
            if (Math.round((data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60)) >= 12) { //MP: 12 min because a missed reading (i.e. readings coming in after 10 min) can occur for various reasons, like walking away from the phone or reinstalling AAPS
                //if (Math.round((data.get(i).date - data.get(i + 1).date) / 60000L) <= 7) { //MP crashes the app, useful for testing
                windowsize = i + 1 //MP: If time difference between two readings exceeds 7 min, adjust windowsize to *include* the more recent reading (i = reading; +1 because windowsize reflects number of valid readings);
                break
            } else if (data[i].value == 38.0) {
                windowsize = i //MP: 38 mg/dl reflects an xDrip error state; Chain of valid readings ends here, *exclude* this value (windowsize = i; i + 1 would include the current value)
                break
            }
        }

// CALCULATE SMOOTHING WINDOW - 1st order exponential smoothing

// CALCULATE SMOOTHING WINDOW - 1st order exponential smoothing
        o1_smoothbg.clear() // MP reset smoothed bg array

        if (windowsize >= 4) { //MP: Require a valid windowsize of at least 4 readings
            o1_smoothbg.add(data[windowsize - 1].value) //MP: Initialise smoothing with the oldest valid data point
            for (i in 0 until windowsize) { //MP calculate smoothed bg window of valid readings
                o1_smoothbg.add(
                    0,
                    o1_smoothbg[0] + o1_a * (data[windowsize - 1 - i].value - o1_smoothbg[0])
                ) //MP build array of 1st order smoothed bgs
            }
        } else {
            insufficientsmoothingdata = true
        }

// CALCULATE SMOOTHING WINDOW - 2nd order exponential smoothing
        o2_smoothbg.clear() // MP reset smoothed bg array
        o2_smoothdelta.clear() // MP reset smoothed delta array

        if (windowsize >= 4) { //MP: Require a valid windowsize of at least 4 readings
            o2_smoothbg.add(data[windowsize - 1].value) //MP Start 2nd order exponential data smoothing with the oldest valid bg
            o2_smoothdelta.add(data[windowsize - 2].value - data[windowsize - 1].value) //MP Start 2nd order exponential data smoothing with the oldest valid delta
            for (i in 0 until windowsize - 1) { //MP calculated smoothed bg window of last 1 h
                o2_smoothbg.add(
                    0,
                    o2_a * data[windowsize - 2 - i].value + (1 - o2_a) * (o2_smoothbg[0] + o2_smoothdelta[0])
                ) //MP build array of 2nd order smoothed bgs; windowsize-1 is the oldest valid bg value, so windowsize-2 is from when on the smoothing begins;
                o2_smoothdelta.add(
                    0,
                    o2_b * (o2_smoothbg[0] - o2_smoothbg[1]) + (1 - o2_b) * o2_smoothdelta[0]
                ) //MP build array of 1st order smoothed bgs
            }
        } else {
            insufficientsmoothingdata = true
        }

// CALCULATE SUPERSMOOTHED GLUCOSE & DELTAS
        ssmooth_bg.clear() // MP reset supersmoothed bg array
        ssmooth_delta.clear() // MP reset supersmoothed delta array

        if (!insufficientsmoothingdata) { //MP Build supersmoothed array only if there is enough valid readings
            for (i in o2_smoothbg.indices) { //MP calculated supersmoothed bg of all o1/o2 smoothed data available; o2 & o1 smoothbg array sizes are equal in size, so only one is used as a condition here
                ssmooth_bg.add(o1_weight * o1_smoothbg[i] + (1 - o1_weight) * o2_smoothbg[i]) //MP build array of supersmoothed bgs
            }
            for (i in 0 until ssmooth_bg.size - 1) {
                ssmooth_delta.add(ssmooth_bg[i] - ssmooth_bg[i + 1]) //MP build array of supersmoothed bg deltas
            }
        }

// MP Tsunami Activity Engine meal detection system
        if (!insufficientsmoothingdata) {
            deltascore = 0.0
            scoredivisor = 0.0
            for (i in 0 until Math.min(
                windowsize - 1,
                6
            )) { //MP Dynamically adjust deltas to include
                deltascore += ssmooth_delta[i] * (1 - weight * i)
                scoredivisor += 1 - weight * i //MP weighted mealscore
            }
            deltascore = deltascore / scoredivisor / deltathreshold //MP: Check how deltascore compares to the threshold
        } else {
            deltascore = 0.5 //MP If there's not enough data, set deltascore to 50%
        }

//MP report smoothing variables in glucose status
        status.bg_5minago =
            before.value //MP If the database contains more than one reading, return the value from 5 min ago

        status.insufficientsmoothingdata = insufficientsmoothingdata
        status.deltascore = deltascore
        if (!insufficientsmoothingdata) {
            status.bg_supersmooth_now = ssmooth_bg[0]
            status.delta_supersmooth_now = ssmooth_delta[0]
        } else { //todo: below is a quick solution, should probably be improved
            status.bg_supersmooth_now = data[0].value
            status.delta_supersmooth_now = data[0].value - data[1].value
        }
        // TODO: communicate to other code snippets / files that use smoothed data if no smoothing occurred due to insufficient dat
//############################### MP
//### DATA SMOOTHING CORE END ### MP
//############################### MP

//#################################### MP
//### GLUCOSE CURVE ANALYSIS START ### MP
//#################################### MP

// MP: fit last sensor readings (narrow (n) and broad (b) windows) to a 2nd degree polynomial
        //todo: add fitting variables to above definitions (if glucose list empty etc.)
        // MP narrow window - raw data

//INITIALISE SIZE OF VALID READING DATABASE
//todo: if not all the bg readings are valid, the window of useful data is narrowed down. Go through all the different situations to see if the code works in every situation
        // TODO: communicate to other code snippets / files that use smoothed data if no smoothing occurred due to insufficient dat
//############################### MP
//### DATA SMOOTHING CORE END ### MP
//############################### MP

//#################################### MP
//### GLUCOSE CURVE ANALYSIS START ### MP
//#################################### MP

// MP: fit last sensor readings (narrow (n) and broad (b) windows) to a 2nd degree polynomial
        //todo: add fitting variables to above definitions (if glucose list empty etc.)
        // MP narrow window - raw data

//INITIALISE SIZE OF VALID READING DATABASE
//todo: if not all the bg readings are valid, the window of useful data is narrowed down. Go through all the different situations to see if the code works in every situation
        if (narrow_fittingwindow + fitarraylength - 1 > sizeRecords) { //MP standard smoothing window; (narrow_fittingwindow + fitarraylength -1) = number of data points required to fill up an array of specified length using 'narrow_fittingwindow' amount of data points. -1 because the first array already contains as many datapoints as defined by narrow_fittingwindow, so for an arraylength of 5 and a windowsize of 5, at least 5+5-1 = 9 data points are necessary (points 0-4 / 1-5 / 2-6 / 3-7 / 4-8.... 0-8 = 9 data points)
            insufficientfittingdata = true
        }

        var validdata: Int = narrow_fittingwindow + fitarraylength - 1
        if (!insufficientfittingdata) {
            for (i in 0 until narrow_fittingwindow + fitarraylength - 1) {
                if (Math.round((data[i].timestamp - data[i + 1].timestamp) / (1000.0 * 60)) >= 12) {
                    validdata =
                        i + 1 //MP: If time difference between two readings exceeds 12 min, adjust fitarraylength to *include* the more recent reading (i = reading; +1 because windowsize reflects number of valid readings);
                    break
                } else if (data[i].value == 38.0) {
                    validdata =
                        i //MP: 38 mg/dl reflects an xDrip error state; Chain of valid readings ends here, *exclude* this value (windowsize = i; i + 1 would include the current value)
                    break
                }
            }
        }
        if (validdata < narrow_fittingwindow + fitarraylength - 1) {
            if (validdata >= narrow_fittingwindow) {
                fitarraylength =
                    validdata - narrow_fittingwindow + 1 //MP: Adjust size of fitarraylength to the maximum possible value; Example: Valid datapoints: 7; narrow_fittingwindow: 5; Max array lenght possible: 0-4 / 1-5 / 2-6 --> 3 fits possible; 0-6 = 7 data points;
            } else {
                insufficientfittingdata = true
            }
        }

//CREATE ARRAY OF POLYNOMIALS FITTED USING RAW SENSOR DATA

        var nbgavg = 0.0 //MP narrow blood glucose average

        val rawcoeff_array = Array(fitarraylength) { DoubleArray(6 ) } //MP array that holds polynomial coefficients

        val narrow_fitter: PolynomialCurveFitter = PolynomialCurveFitter.create(2) //MP curve fitter

        if (!insufficientfittingdata) {
            for (n in 0 until fitarraylength) { //MP: Only build array using valid data. Length = fitarraylength.
                var nSST = 0.0
                var nSSR = 0.0
                val obs_narrow = WeightedObservedPoints()
                for (i in 0 until narrow_fittingwindow) { // MP: Build data for fitting; x = time (min from now); y = BG;
                    obs_narrow.add(i * -5, data[i + n].value)
                    nbgavg += data[i + n].value
                }
                val fitresult_raw: DoubleArray = narrow_fitter.fit(obs_narrow.toList())
                nbgavg = nbgavg / narrow_fittingwindow //MP: Calculates average BG of those included in fit
                for (i in 0 until narrow_fittingwindow) {
                    nSST += Math.pow(data[i].value - nbgavg, 2.0) //MP: Build SS_total value for R2
                    nSSR += Math.pow( data[i].value - (fitresult_raw[0] + fitresult_raw[1] * i * -5 + fitresult_raw[2] * Math.pow((i * -5).toDouble(), 2.0)), 2.0)
                    //MP: Calculates difference between measured BG and modelled BG from polynomial c + bx + ax^2; -5 refers to the minutes (x value) between each reading
                }
                nR2 = 1 - nSSR / nSST //MP R-squared for narrow window fit
                rawcoeff_array[n][0] = fitresult_raw[2] //MP quadratic term
                rawcoeff_array[n][1] = fitresult_raw[1] //MP linear term
                rawcoeff_array[n][2] = fitresult_raw[0] //MP constant term
                rawcoeff_array[n][3] = nR2 //MP R2
                rawcoeff_array[n][4] = -1 * (fitresult_raw[1] / (2 * fitresult_raw[2])) - 5 * n //MP extrema x (min), where 0 min = now.
                rawcoeff_array[n][5] = fitresult_raw[2] * Math.pow(-1 * (fitresult_raw[1] / (2 * fitresult_raw[2])), 2.0) + fitresult_raw[1] * -1 * (fitresult_raw[1] / (2 * fitresult_raw[2])) + fitresult_raw[0] //MP: Extremum y (glucose)
            }
        }


//CALCULATE MEAL SCORE AS AN ESTIMATE OF HOW LIKELY A RISE IS DUE TO A MEAL
        if (!insufficientfittingdata) {
            mealscore_raw = 0.0
            scoredivisor = 0.0
            for (i in 0 until fitarraylength) { //MP: Narrow_fittingwindow is the length of the array
                if (rawcoeff_array[i][0] >= -0.03) {
                    mealscore_raw += rawcoeff_array[i][1] * (1 - 0.1 * i) //MP: weighted sum of slopes
                }
                scoredivisor += 1 - 0.1 * i //MP weighted mealscore
            }
            mealscore_raw = mealscore_raw / scoredivisor / meal_threshold //MP: Average the coefficient sum. As the weight of each component decreases, the divisor is the sum of the weights (1+0.9+0.8+0.7+0.6 = 4)
        }

//CREATE ARRAY OF POLYNOMIALS FITTED USING SMOOTHED SENSOR DATA
//todo: Check if data smoothing occurred, i.e. if there was enough valid data

//CREATE ARRAY OF POLYNOMIALS FITTED USING SMOOTHED SENSOR DATA
//todo: Check if data smoothing occurred, i.e. if there was enough valid data
        var nbgsavg = 0.0 //MP narrow blood glucose average

        val narrow_fitter_smooth: PolynomialCurveFitter = PolynomialCurveFitter.create(2)

        val smoothcoeff_array = Array(fitarraylength) { DoubleArray(6) }

        if (!insufficientfittingdata && !insufficientsmoothingdata) {
            for (n in 0 until fitarraylength) {
                var nsSST = 0.0
                var nsSSR = 0.0
                val obs_narrow_smooth = WeightedObservedPoints()
                for (i in 0 until narrow_fittingwindow) { // MP: Collect readings for fitting; x = time (min from now); y = BG;
                    obs_narrow_smooth.add( i * -5, ssmooth_bg[i + n]) //todo: Check against smoothing code to spot potential erros if there's not enough smooth data
                    nbgsavg += ssmooth_bg[i + n]
                }
                val fitresult_smooth: DoubleArray = narrow_fitter_smooth.fit(obs_narrow_smooth.toList())
                nbgsavg = nbgsavg / narrow_fittingwindow //MP: Calculates average BG of those included in fit
                for (i in 0 until narrow_fittingwindow) {
                    nsSST += Math.pow(ssmooth_bg[i] - nbgsavg, 2.0) //MP: Build SS_total value for R2
                    nsSSR += Math.pow(ssmooth_bg[i] - (fitresult_smooth[0] + fitresult_smooth[1] * i * -5 + fitresult_smooth[2] * Math.pow((i * -5).toDouble(), 2.0)), 2.0) //MP: Calculates difference between measured BG and modelled BG from polynomial c + bx + ax^2; -5 refers to the minutes (x value) between each reading
                }
                nsR2 = 1 - nsSSR / nsSST //MP R-squared for narrow window fit
                smoothcoeff_array[n][0] = fitresult_smooth[2] //MP quadratic term
                smoothcoeff_array[n][1] = fitresult_smooth[1] //MP linear term
                smoothcoeff_array[n][2] = fitresult_smooth[0] //MP constant term
                smoothcoeff_array[n][3] = nsR2 //MP R2
                smoothcoeff_array[n][4] = -1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])) - 5 * n //MP extrema x (min), where 0 min = now.
                smoothcoeff_array[n][5] = fitresult_smooth[2] * Math.pow(-1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])), 2.0) + fitresult_smooth[1] * -1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])) + fitresult_smooth[0] //MP: Extremum y (glucose)
            }
        }

//CALCULATE MEAL SCORE AS AN ESTIMATE OF HOW LIKELY A RISE IS DUE TO A MEAL
        if (!insufficientfittingdata && !insufficientsmoothingdata) {
            mealscore_smooth = 0.0
            scoredivisor = 0.0
            for (i in 0 until fitarraylength) { //MP: Narrow_fittingwindow is the length of the array
                if (smoothcoeff_array[i][0] >= -0.03) {
                    mealscore_smooth += smoothcoeff_array[i][1] * (1 - 0.1 * i) //MP: weighted sum of slopes
                }
                scoredivisor += 1 - 0.1 * i
            }
            mealscore_smooth = mealscore_smooth / scoredivisor / meal_threshold //MP: Average the coefficient sum. As the weight of each component decreases, the divisor is the sum of the weights (1+0.9+0.8+0.7+0.6 = 4)
        }
        */

//CREATE POLYNOMIAL FITTED USING RAW SENSOR DATA, BROAD RANGE
        var bbgavg = 0.0
        val obs_broad = WeightedObservedPoints()
        for (i in 0 until broad_fittingwindow) { // MP: Build data for fitting; x = time (min from now); y = BG;
            obs_broad.add(i * -5, data[i].value)
            bbgavg += data[i].value
        }
        bbgavg = bbgavg / broad_fittingwindow //MP: Calculates average BG of those included in fit

        // MP: Instantiate a 2nd degree polynomial fitter.
        val broad_fitter: PolynomialCurveFitter = PolynomialCurveFitter.create(2)

        // MP: Perform the fit / retrieve fitted parameters (coefficients of the polynomial function).
        val coeff_broad: DoubleArray = broad_fitter.fit(obs_broad.toList())

        //check for maxima/minima by manual polynom differentiation and create a new list containing relevant information
        // Finding extrema: f(x) = ax^2 + bx +c; f'(x) = 2ax + b; x(extremum) = -b/2a;
        // Determine if max/min: f''(x) = 2a; if 2a > 0 --> minimum; if 2a < 0 --> maximum; if 2a == 0 --> saddle point; In our case (2nd degree polynomial), just checking whether coefficient a is >/< 0 is enough;

        //check for maxima/minima by manual polynom differentiation and create a new list containing relevant information
        // Finding extrema: f(x) = ax^2 + bx +c; f'(x) = 2ax + b; x(extremum) = -b/2a;
        // Determine if max/min: f''(x) = 2a; if 2a > 0 --> minimum; if 2a < 0 --> maximum; if 2a == 0 --> saddle point; In our case (2nd degree polynomial), just checking whether coefficient a is >/< 0 is enough;
        val broad_minmax = -(coeff_broad[1] / (2 * coeff_broad[2]))

//UPDATE STATUS OBJECT
        status.insufficientfittingdata = insufficientfittingdata
        status.broadfit_a = coeff_broad[2] //MP 2nd degree polynomial coefficient a for broadfit
        status.broadfit_b = coeff_broad[1] //MP 2nd degree polynomial coefficient b for broadfit
        status.broadfit_c = coeff_broad[0] //MP 2nd degree polynomial coefficient c for broadfit
        if (!insufficientfittingdata) {
            status.mealscore_raw = mealscore_raw //MP 2nd degree polynomial coefficient c for smoothed narrowfit
        } else {
            status.mealscore_raw = 0.0 //MP 2nd degree polynomial coefficient c for smoothed narrowfit
        }
        if (!insufficientfittingdata && !insufficientsmoothingdata) {
            status.mealscore_smooth =
                mealscore_smooth //MP 2nd degree polynomial coefficient c for smoothed narrowfit
        } else {
            status.mealscore_smooth =
                0.0 //MP 2nd degree polynomial coefficient c for smoothed narrowfit
        }
        status.broad_extremum = broad_minmax //MP extremum in broadfit


//################################## MP
//### GLUCOSE CURVE ANALYSIS END ### MP
//################################## MP

//################################## MP
//### GLUCOSE CURVE ANALYSIS END ### MP
//################################## MP

        return status.also { aapsLogger.debug(LTag.GLUCOSE, it.log()) }.asRounded()
    }

    companion object {

        fun average(array: ArrayList<Double>): Double {
            var sum = 0.0
            if (array.size == 0) return 0.0
            for (value in array) {
                sum += value
            }
            return sum / array.size
        }
    }
}