package info.nightscout.androidaps.plugins.iob.iobCobCalculator;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.HasAndroidInjector;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.data.IobTotal;
import info.nightscout.androidaps.db.BgReading;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.logging.LTag;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.DecimalFormatter;
import info.nightscout.androidaps.utils.Round;
// MP: Below: Imports commons.math3 library classes for glucose curve analysis
import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;
// MP: Above: Imports commons.math3 library classes for glucose curve analysis
//MP activity calculation start
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.utils.SafeParse;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
//MP activity calculation end
/**
 * Created by mike on 04.01.2017.
 */

public class GlucoseStatus {
    @Inject public AAPSLogger aapsLogger;
    @Inject public IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @Inject SP sp;
    //MP Activity calculation start
    @Inject ProfileFunction profileFunction;
    //MP Activity calculation end

    private final HasAndroidInjector injector;

    public double glucose = 0d;
    public double noise = 0d;
    public double delta = 0d;
    public double avgdelta = 0d;
    public double short_avgdelta = 0d;
    public double long_avgdelta = 0d;
    public long date = 0L;
    // autoISF === START
    // mod 7: append 2 variables for 5% range
    public double autoISF_duration = 0d;
    public double autoISF_average = 0d;
    // autoISF === END
    // MP data smoothing START
    public double bg_5minago = 0d;
    public int windowsize = 25; //MP number of bg readings to include in smoothing window
    public double o1_weight = 0.4d;
    public double o1_a = 0.5d;
    public double o2_a = 0.4d;
    public double o2_b = 1.0d;
    public double o1_smoothedbg_5m = 0d;
    public double o1_smoothedbg_now = 0d;
    public double o2_smoothedbg_5m = 0d;
    public double o2_smoothedbg_now = 0d;
    public double o2_smoothedtrend_5m = 0d;
    public double o2_smoothedtrend_now = 0d;
    public double bg_supersmooth_now = 0d;
    public double bg_supersmooth_5m = 0d;
    public double bg_supersmooth_10m = 0d;
    public double bg_supersmooth_15m = 0d;
    public double delta_supersmooth_now = 0d;
    public double delta_supersmooth_5m = 0d;
    public double delta_supersmooth_10m = 0d;
    /*
    public double bg_supersmooth_20m = 0d;
    public double bg_supersmooth_25m = 0d;
    public double delta_supersmooth_15m = 0d;
    public double delta_supersmooth_20m = 0d;
     */
    public boolean insufficientsmoothingdata = false;
    // MP data smoothing END
    // MP glucose curve analysis START
    public boolean insufficientfittingdata = false;
    public int fitarraylength = 5; //MP number of fits to create
    public int narrow_fittingwindow = 5; //MP number of bg readings to include in local curve fit (for analysis of curve development)
    public int broad_fittingwindow = 12; //MP number of bg readings to include in global curve fit (for detection of maxima)
    public double narrowfit_a = 0d;
    public double narrowfit_b = 0d;
    public double narrowfit_c = 0d;
    public double nR2 = 0d; //MP R squared value for narrowfit
    public double narrowsmoothedfit_a = 0d;
    public double narrowsmoothedfit_b = 0d;
    public double narrowsmoothedfit_c = 0d;
    //public double arrayfit_r0 = 0d;
    //public double arrayfit_r4 = 0d;
    public double nsR2 = 0d; //MP R squared value for smoothed narrowfit
    public double broadfit_a = 0d;
    public double broadfit_b = 0d;
    public double broadfit_c = 0d;
    public double bR2 = 0d; //MP R squared value for broadfit
    public double broad_extremum;
    public double mealscore_smooth = 0d;
    public double mealscore_raw = 0d;
    public double meal_threshold = 1.8d;
//MP test variables
    public double scoredivisor = 0d;
    public int smoothsize = 0;
    public int validdata = 0;
    public int sizerecords = 0;
    // MP glucose curve analysis END
    //MP Activity calculation start
    public double futureactivity = 0d;
    public double sensorlagactivity = 0d;
    public double historicactivity = 0d;
    public double currentactivity = 0d;
    //public long activity_pred_time = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP Time in minutes from now to calculate insulin activity for
    public long activity_pred_time = 40L; //MP Time in minutes from now to calculate insulin activity for
    public long sensorlag = -10L; //MP Time in minutes from now which is estimated to be the time point at which the displayed sensor delta actually occurred (i.e. sensor lag time, must be at least -5 min, max -20 min)
    public long activity_historic = -20L; //MP Activity at the time in minutes from now. Used to calculate activity in the past to use as target activity.
    //MP Activity calculation end
    public String log() {
        return "Glucose: " + DecimalFormatter.to0Decimal(glucose) + " mg/dl " +
                "Noise: " + DecimalFormatter.to0Decimal(noise) + " " +
                "Delta: " + DecimalFormatter.to0Decimal(delta) + " mg/dl" +
                "Short avg. delta: " + " " + DecimalFormatter.to2Decimal(short_avgdelta) + " mg/dl " +
                "Long avg. delta: " + DecimalFormatter.to2Decimal(long_avgdelta) + " mg/dl";
    }

    public GlucoseStatus(HasAndroidInjector injector) {
        injector.androidInjector().inject(this);
        this.injector = injector;
    }

    public GlucoseStatus round() {
        this.glucose = Round.roundTo(this.glucose, 0.1);
        this.noise = Round.roundTo(this.noise, 0.01);
        this.delta = Round.roundTo(this.delta, 0.01);
        this.avgdelta = Round.roundTo(this.avgdelta, 0.01);
        this.short_avgdelta = Round.roundTo(this.short_avgdelta, 0.01);
        this.long_avgdelta = Round.roundTo(this.long_avgdelta, 0.01);
        // autoISF === START
        // mod 7: append 2 variables for 5% range
        this.autoISF_duration = Round.roundTo(this.autoISF_duration, 0.1);
        this.autoISF_average = Round.roundTo(this.autoISF_average, 0.1);
        // autoISF === END
        // MP data smoothing start
        this.bg_5minago = Round.roundTo(this.bg_5minago, 0.1);
        if (!insufficientsmoothingdata) {
            this.o1_smoothedbg_5m = Round.roundTo(this.o1_smoothedbg_5m, 0.1);
            this.o1_smoothedbg_now = Round.roundTo(this.o1_smoothedbg_now, 0.1);
            this.o2_smoothedbg_5m = Round.roundTo(this.o2_smoothedbg_5m, 0.1);
            this.o2_smoothedbg_now = Round.roundTo(this.o2_smoothedbg_now, 0.1);
            this.o2_smoothedtrend_5m = Round.roundTo(this.o2_smoothedtrend_5m, 0.1);
            this.o2_smoothedtrend_now = Round.roundTo(this.o2_smoothedtrend_now, 0.1);
            this.bg_supersmooth_now = Round.roundTo(this.bg_supersmooth_now, 0.1);
            this.bg_supersmooth_5m = Round.roundTo(this.bg_supersmooth_5m, 0.1);
            this.bg_supersmooth_10m = Round.roundTo(this.bg_supersmooth_10m, 0.1);
            this.bg_supersmooth_15m = Round.roundTo(this.bg_supersmooth_15m, 0.1);
            /*
            this.bg_supersmooth_20m = Round.roundTo(this.bg_supersmooth_20m, 0.1);
            this.bg_supersmooth_25m = Round.roundTo(this.bg_supersmooth_25m, 0.1);*/
            this.delta_supersmooth_now = Round.roundTo(this.delta_supersmooth_now, 0.1);
            this.delta_supersmooth_5m = Round.roundTo(this.delta_supersmooth_5m, 0.1);
            this.delta_supersmooth_10m = Round.roundTo(this.delta_supersmooth_10m, 0.1);
            /*this.delta_supersmooth_15m = Round.roundTo(this.delta_supersmooth_15m, 0.1);
            this.delta_supersmooth_20m = Round.roundTo(this.delta_supersmooth_20m, 0.1);*/
        }
        // MP data smoothing end
        // MP curve analysis start
        this.narrowfit_a = Round.roundTo(this.narrowfit_a, 0.0001); //MP 2nd degree polynomial coefficient a for narrowfit
        this.narrowfit_b = Round.roundTo(this.narrowfit_b, 0.001); //MP 2nd degree polynomial coefficient b for narrowfit
        this.narrowfit_c = Round.roundTo(this.narrowfit_c, 0.001); //MP 2nd degree polynomial coefficient c for narrowfit
        this.narrowsmoothedfit_a = Round.roundTo(this.narrowsmoothedfit_a, 0.0001); //MP 2nd degree polynomial coefficient a for narrowfit
        this.narrowsmoothedfit_b = Round.roundTo(this.narrowsmoothedfit_b, 0.001); //MP 2nd degree polynomial coefficient b for narrowfit
        this.narrowsmoothedfit_c = Round.roundTo(this.narrowsmoothedfit_c, 0.001); //MP 2nd degree polynomial coefficient c for narrowfit
        //this.arrayfit_r0 = Round.roundTo(this.arrayfit_r0, 0.001); //MP 2nd degree polynomial coefficient b for narrowfit
        //this.arrayfit_r4 = Round.roundTo(this.arrayfit_r4, 0.001); //MP 2nd degree polynomial coefficient c for narrowfit
        this.broadfit_a = Round.roundTo(this.broadfit_a, 0.0001); //MP 2nd degree polynomial coefficient a for broadfit
        this.broadfit_b = Round.roundTo(this.broadfit_b, 0.001); //MP 2nd degree polynomial coefficient b for broadfit
        this.broadfit_c = Round.roundTo(this.broadfit_c, 0.001); //MP 2nd degree polynomial coefficient c for broadfit
        this.nR2 = Round.roundTo(this.nR2, 0.001);
        this.nsR2 = Round.roundTo(this.nsR2, 0.001);
        this.bR2 = Round.roundTo(this.bR2, 0.001);
        this.broad_extremum = Round.roundTo(this.broad_extremum, 0.1);
        this.mealscore_raw = Round.roundTo(this.mealscore_raw, 0.0001);
        this.mealscore_smooth = Round.roundTo(this.mealscore_smooth, 0.0001);
        // MP curve analysis end
        this.futureactivity = Round.roundTo(this.futureactivity, 0.0001);
        this.sensorlagactivity = Round.roundTo(this.sensorlagactivity, 0.0001);
        this.historicactivity = Round.roundTo(this.historicactivity, 0.0001);
        this.currentactivity = Round.roundTo(this.currentactivity, 0.0001);
        return this;
    }


    @Nullable
    public GlucoseStatus getGlucoseStatusData() {
        return getGlucoseStatusData(false);
    }

    @Nullable
    public GlucoseStatus getGlucoseStatusData(boolean allowOldData) {
        // load 45min
        //long fromtime = DateUtil.now() - 60 * 1000L * 45;
        //List<BgReading> data = MainApp.getDbHelper().getBgreadingsDataFromTime(fromtime, false);

        synchronized (iobCobCalculatorPlugin.getDataLock()) {

            List<BgReading> data = iobCobCalculatorPlugin.getBgReadings();
            //MP data smoothing start
            ArrayList<Double> o1_smoothbg = new ArrayList<>(); //MP array for 1st order Smoothed Blood Glucose
            ArrayList<Double> o2_smoothbg = new ArrayList<>(); //MP array for 2nd order Smoothed Blood Glucose
            ArrayList<Double> o2_smoothdelta = new ArrayList<>(); //MP array for 2nd order Smoothed delta
            ArrayList<Double> ssmooth_bg = new ArrayList<>(); //MP array for weighted averaged, super smoothed Blood Glucose
            ArrayList<Double> ssmooth_delta = new ArrayList<>(); //MP array for deltas of supersmoothed Blood Glucose
            //MP data smoothing end
            if (data == null) {
                aapsLogger.debug(LTag.GLUCOSE, "data=null");
                return null;
            }

            int sizeRecords = data.size();
            if (sizeRecords == 0) {
                aapsLogger.debug(LTag.GLUCOSE, "sizeRecords==0");
                return null;
            }

            if (data.get(0).date < DateUtil.now() - 7 * 60 * 1000L && !allowOldData) {
                aapsLogger.debug(LTag.GLUCOSE, "olddata");
                return null;
            }

            BgReading now = data.get(0);
            // MP data smoothing start
            BgReading before = data.get(1);
            // MP data smoothing end
            long now_date = now.date;
            double change;

            if (sizeRecords == 1) {
                GlucoseStatus status = new GlucoseStatus(injector);
                status.glucose = now.value;
                status.noise = 0d;
                status.short_avgdelta = 0d;
                status.delta = 0d;
                status.long_avgdelta = 0d;
                status.avgdelta = 0d; // for OpenAPS MA
                status.date = now_date;
                // autoISF === START
                // mod 7: append 2 variables for 5% range
                status.autoISF_duration = 0d;
                status.autoISF_average = now.value;
                // autoISF === END
                //MP data smoothing start
                status.bg_5minago = 0d; //MP If the database contains only one reading, then the bg 5 min ago is zero
                status.insufficientsmoothingdata = true;
                status.o1_weight = o1_weight; //MP Smoothing parameters remain unchanged
                status.o1_a = o1_a; //MP Smoothing parameters remain unchanged
                status.o2_a = o2_a; //MP Smoothing parameters remain unchanged
                status.o2_b = o2_b; //MP Smoothing parameters remain unchanged
                status.o1_smoothedbg_5m = now.value;
                status.o1_smoothedbg_now = now.value;
                status.o2_smoothedbg_5m = now.value;
                status.o2_smoothedbg_now = now.value;
                status.o2_smoothedtrend_5m = 0d;
                status.o2_smoothedtrend_now = 0d;
                status.bg_supersmooth_now = now.value;
                status.bg_supersmooth_5m = now.value;
                status.bg_supersmooth_10m = 0d;
                status.bg_supersmooth_15m = 0d;
                /*
                status.bg_supersmooth_20m = 0d;
                status.bg_supersmooth_25m = 0d;*/
                status.delta_supersmooth_now = 0d;
                status.delta_supersmooth_5m = 0d;
                status.delta_supersmooth_10m = 0d;
                /*
                status.delta_supersmooth_15m = 0d;
                status.delta_supersmooth_20m = 0d;*/
                o1_smoothbg.add(0, now.value); //MP if database contains only one reading, add current reading to array for use as starting point
                o2_smoothbg.add(0, now.value); //MP if database contains only one reading, add current reading to array for use as starting point
                o2_smoothdelta.add(0, 0d); //MP initialise array with trend of 0
                //MP data smoothing end
                //MP curve analysis start
                status.narrowfit_a = 0d; //MP 2nd degree polynomial coefficient a for narrowfit
                status.narrowfit_b = 0d; //MP 2nd degree polynomial coefficient b for narrowfit
                status.narrowfit_c = 0d; //MP 2nd degree polynomial coefficient c for narrowfit
                status.broadfit_a = 0d; //MP 2nd degree polynomial coefficient a for broadfit
                status.broadfit_b = 0d; //MP 2nd degree polynomial coefficient b for broadfit
                status.broadfit_c = 0d; //MP 2nd degree polynomial coefficient c for broadfit
                status.nR2 = 0d;
                status.nsR2 = 0d;
                status.bR2 = 0d;
                status.broad_extremum = 0d;
                //MP curve analysis end
                aapsLogger.debug(LTag.GLUCOSE, "sizeRecords==1");
                return status.round();
            }

            ArrayList<Double> now_value_list = new ArrayList<>();
            ArrayList<Double> last_deltas = new ArrayList<>();
            ArrayList<Double> short_deltas = new ArrayList<>();
            ArrayList<Double> long_deltas = new ArrayList<>();

            // Use the latest sgv value in the now calculations
            now_value_list.add(now.value);

            for (int i = 1; i < sizeRecords; i++) {
                if (data.get(i).value > 38) {
                    BgReading then = data.get(i);
                    long then_date = then.date;
                    double avgdelta;
                    long minutesago;

                    minutesago = Math.round((now_date - then_date) / (1000d * 60));
                    // multiply by 5 to get the same units as delta, i.e. mg/dL/5m
                    change = now.value - then.value;
                    avgdelta = change / minutesago * 5;

                    aapsLogger.debug(LTag.GLUCOSE, then.toString() + " minutesago=" + minutesago + " avgdelta=" + avgdelta);

                    // use the average of all data points in the last 2.5m for all further "now" calculations
                    if (0 < minutesago && minutesago < 2.5) {
                        // Keep and average all values within the last 2.5 minutes
                        now_value_list.add(then.value);
                        now.value = average(now_value_list);
                        // short_deltas are calculated from everything ~5-15 minutes ago
                    } else if (2.5 < minutesago && minutesago < 17.5) {
                        //console.error(minutesago, avgdelta);
                        short_deltas.add(avgdelta);
                        // last_deltas are calculated from everything ~5 minutes ago
                        if (2.5 < minutesago && minutesago < 7.5) {
                            last_deltas.add(avgdelta);
                        }
                        // long_deltas are calculated from everything ~20-40 minutes ago
                    } else if (17.5 < minutesago && minutesago < 42.5) {
                        long_deltas.add(avgdelta);
                    } else {
                        // Do not process any more records after >= 42.5 minutes
                        break;
                    }
                }
            }

            GlucoseStatus status = new GlucoseStatus(injector);
            status.glucose = now.value;
            status.date = now_date;
            status.noise = 0d; //for now set to nothing as not all CGMs report noise

            status.short_avgdelta = average(short_deltas);

            if (last_deltas.isEmpty()) {
                status.delta = status.short_avgdelta;
            } else {
                status.delta = average(last_deltas);
            }

            status.long_avgdelta = average(long_deltas);
            status.avgdelta = status.short_avgdelta; // for OpenAPS MA

            // autoISF === START
            // mod 7: calculate 2 variables for 5% range
            //  initially just test the handling of arguments
            // status.dura05 = 11d;
            // status.avg05 = 47.11d;
            //  mod 7a: now do the real maths
            double bw = 0.05d;             // used for Eversense; may be lower for Dexcom
            double sumBG = now.value;
            double oldavg = now.value;
            long minutesdur = Math.round((0L) / (1000d * 60));
            for (int i = 1; i < sizeRecords; i++) {
                BgReading then = data.get(i);
                long then_date = then.date;
                //  GZ mod 7c: stop the series if there was a CGM gap greater than 13 minutes, i.e. 2 regular readings
                if (Math.round((now_date - then_date) / (1000d * 60)) - minutesdur > 13) {
                    break;
                }
                if (then.value > oldavg * (1 - bw) && then.value < oldavg * (1 + bw)) {
                    sumBG += then.value;
                    oldavg = sumBG / (i + 1);
                    minutesdur = Math.round((now_date - then_date) / (1000d * 60));
                } else {
                    break;
                }
            }
            status.autoISF_average = oldavg;
            status.autoISF_duration = minutesdur;
            // autoISF === END

//################################# MP
//### DATA SMOOTHING CORE START ### MP
//################################# MP
/* OLD CODE

            if (sizeRecords >= windowsize + 1) { //MP standard smoothing window of 1 h
                break; //MP Leave windowsize unchanged if enough data are available
            } else if (sizeRecords > 1){ //MP Data smoothing if more than one bg entry but less than 12 (1 h) available
                windowsize = sizeRecords; //Adjust windowsize to size of records list
            } else { //MP failsafe, if bg database is empty...
                windowsize = 0; //MP Don't smooth an empty database
                datacontinuity = 0;
            } 
OLD CODE */
/* OLD CODE
            if (sizeRecords >= windowsize + 1) { //MP standard smoothing window of 1 h
                o1_smoothbg.add(data.get(windowsize - 1).value); //MP Start 1st order exponential data smoothing with bg from 1 h ago
            } else if (sizeRecords > 1){ //MP Data smoothing if more than one bg entry but less than 12 (1 h) available
                o1_smoothbg.add(data.get(sizeRecords - 1).value); //MP Start 1st order exponential data smoothing with oldest bg available
            } else { //MP failsafe, if bg database is empty...
                o1_smoothbg.add(data.get(0).value); //MP Start 2nd order exponential data smoothing with current bg
            }
OLD CODE */
/*OLD CODE
            if (sizeRecords >= windowsize + 1) { //MP standard smoothing window of 1 h
                o2_smoothbg.add(data.get(windowsize-1).value); //MP Start 2nd order exponential data smoothing with bg from 1 h ago
                o2_smoothdelta.add(data.get(windowsize).value - data.get(windowsize-1).value); //MP Start 2nd order exponential data smoothing with delta from 1 h ago
            } else if (sizeRecords > 1){ //MP Data smoothing if more than one bg entry but less than 12 (1 h) available
                o2_smoothbg.add(data.get(sizeRecords - 1).value); //MP Start 2nd order exponential data smoothing with oldest bg available
                o2_smoothdelta.add(data.get(sizeRecords - 2).value - data.get(sizeRecords - 1).value); //MP Start 2nd order exponential data smoothing with oldest delta available
            } else { //MP failsafe, if bg database is empty...
                o2_smoothbg.add(data.get(0).value); //MP Start 2nd order exponential data smoothing with current bg
                o2_smoothdelta.add(0d); //MP Start 2nd order exponential data smoothing with delta of 0
            }

            // CALCULATE SMOOTHING WINDOW - 2nd order exponential smoothing
            for (int i = 0; i < windowsize; i++) { //MP calculated smoothed bg window of last 1 h
                if (sizeRecords < windowsize) {
                    i = windowsize - sizeRecords; //MP Smoothing window is narrowed down until the databank contains at least 12 bg entries
                }
                if (data.get(windowsize-1-i).value > 38) { //MP construct smoothed bgs from oldest to newest
                    o2_smoothbg.add(0, o2_a * data.get(windowsize-1-i).value + (1 - o2_a) * (o2_smoothbg.get(0) + o2_smoothdelta.get(0))); //MP build array of 2nd order smoothed bgs
                    o2_smoothdelta.add(0, o2_b * (o2_smoothbg.get(0) - o2_smoothbg.get(1)) + (1 - o2_b) * o2_smoothdelta.get(0)); //MP build array of 1st order smoothed bgs
                }
            }
OLD CODE*/
            // OLD CODE SNIPPETS START
            //            status.bg_supersmooth_now = o1_weight*o1_smoothbg.get(0) + (1-o1_weight)*o2_smoothbg.get(0);
            //            status.bg_supersmooth_5m = o1_weight*o1_smoothbg.get(1) + (1-o1_weight)*o2_smoothbg.get(1);
            // OLD CODE SNIPPETS END

//TODO: Decide what happens if there's insufficient data

// ADJUST SMOOTHING WINDOW TO ONLY INCLUDE VALID READINGS
            // Valid readings include:
            // - Values that actually exist (windowsize may not be larger than sizeRecords)
            // - Values that come in approx. every 5 min. If the time gap between two readings is larger, this is likely due to a sensor error or warmup of a new sensor.d
            // - Values that are not 38 mg/dl; 38 mg/dl reflects an xDrip error state (according to a comment in determine-basal.js)

            //MP: Adjust smoothing window if database size is smaller than the default value + 1 (+1 because the reading before the oldest reading to be smoothed will be used in the calculations
            if (sizeRecords < windowsize) { //MP standard smoothing window
                windowsize = sizeRecords; //MP Adjust smoothing window to the size of database if it is smaller than the original window size
            }

            //MP: Adjust smoothing window further if a gap in the BG database is detected, e.g. due to sensor errors of sensor swaps, or if 38 mg/dl are reported (xDrip error state)
            for (int i = 0; i < windowsize; i++) {
                if (Math.round((data.get(i).date - data.get(i + 1).date) / (1000d * 60)) >= 12) { //MP: 12 min because a missed reading (i.e. readings coming in after 10 min) can occur for various reasons, like walking away from the phone or reinstalling AAPS
                //if (Math.round((data.get(i).date - data.get(i + 1).date) / 60000L) <= 7) { //MP crashes the app, useful for testing
                    windowsize = i + 1; //MP: If time difference between two readings exceeds 7 min, adjust windowsize to *include* the more recent reading (i = reading; +1 because windowsize reflects number of valid readings);
                    break;
                } else if (data.get(i).value == 38) {
                    windowsize = i; //MP: 38 mg/dl reflects an xDrip error state; Chain of valid readings ends here, *exclude* this value (windowsize = i; i + 1 would include the current value)
                    break;
                }
            }

// CALCULATE SMOOTHING WINDOW - 1st order exponential smoothing
            o1_smoothbg.clear(); // MP reset smoothed bg array

            if (windowsize >= 4) { //MP: Require a valid windowsize of at least 4 readings
                o1_smoothbg.add(data.get(windowsize - 1).value); //MP: Initialise smoothing with the oldest valid data point
                for (int i = 0; i < windowsize; i++) { //MP calculate smoothed bg window of valid readings
                    o1_smoothbg.add(0, o1_smoothbg.get(0) + o1_a * (data.get(windowsize - 1 - i).value - o1_smoothbg.get(0))); //MP build array of 1st order smoothed bgs
                }
            } else {
                insufficientsmoothingdata = true;
            }

// CALCULATE SMOOTHING WINDOW - 2nd order exponential smoothing
            o2_smoothbg.clear(); // MP reset smoothed bg array
            o2_smoothdelta.clear(); // MP reset smoothed delta array

            if (windowsize >= 4) { //MP: Require a valid windowsize of at least 4 readings
                o2_smoothbg.add(data.get(windowsize - 1).value); //MP Start 2nd order exponential data smoothing with the oldest valid bg
                o2_smoothdelta.add(data.get(windowsize - 2).value - data.get(windowsize - 1).value); //MP Start 2nd order exponential data smoothing with the oldest valid delta
                for (int i = 0; i < windowsize - 1; i++) { //MP calculated smoothed bg window of last 1 h
                    o2_smoothbg.add(0, o2_a * data.get(windowsize - 2 - i).value + (1 - o2_a) * (o2_smoothbg.get(0) + o2_smoothdelta.get(0))); //MP build array of 2nd order smoothed bgs; windowsize-1 is the oldest valid bg value, so windowsize-2 is from when on the smoothing begins;
                    o2_smoothdelta.add(0, o2_b * (o2_smoothbg.get(0) - o2_smoothbg.get(1)) + (1 - o2_b) * o2_smoothdelta.get(0)); //MP build array of 1st order smoothed bgs
                }
            } else {
                insufficientsmoothingdata = true;
            }

// CALCULATE SUPERSMOOTHED GLUCOSE & DELTAS
            ssmooth_bg.clear(); // MP reset supersmoothed bg array
            ssmooth_delta.clear(); // MP reset supersmoothed delta array

            if (!insufficientsmoothingdata) { //MP Build supersmoothed array only if there is enough valid readings
                for (int i = 0; i < o2_smoothbg.size(); i++) { //MP calculated supersmoothed bg of all o1/o2 smoothed data available; o2 & o1 smoothbg array sizes are equal in size, so only one is used as a condition here
                    ssmooth_bg.add(o1_weight * o1_smoothbg.get(i) + (1 - o1_weight) * o2_smoothbg.get(i)); //MP build array of supersmoothed bgs
                }
                for (int i = 0; i < ssmooth_bg.size() - 1; i++) {
                    ssmooth_delta.add(ssmooth_bg.get(i) - ssmooth_bg.get(i + 1)); //MP build array of supersmoothed bg deltas
                }
            }

//MP report smoothing variables in glucose status
            status.bg_5minago = before.value; //MP If the database contains more than one reading, return the value from 5 min ago
            status.insufficientsmoothingdata = insufficientsmoothingdata;
            status.o1_weight = o1_weight;
            status.o1_a = o1_a;
            status.o2_a = o2_a;
            status.o2_b = o2_b;
            if (!insufficientsmoothingdata) {
                status.o1_smoothedbg_5m = o1_smoothbg.get(1);
                status.o1_smoothedbg_now = o1_smoothbg.get(0);
                status.o2_smoothedbg_5m = o2_smoothbg.get(1);
                status.o2_smoothedbg_now = o2_smoothbg.get(0);
                status.o2_smoothedtrend_5m = o2_smoothdelta.get(1);
                status.o2_smoothedtrend_now = o2_smoothdelta.get(0);
                status.bg_supersmooth_now = ssmooth_bg.get(0);
                status.bg_supersmooth_5m = ssmooth_bg.get(1);
                status.bg_supersmooth_10m = ssmooth_bg.get(2);
                status.bg_supersmooth_15m = ssmooth_bg.get(3);
                status.delta_supersmooth_now = ssmooth_delta.get(0);
                status.delta_supersmooth_5m = ssmooth_delta.get(1); //MP supersmooth delta from 5m ago
                status.delta_supersmooth_10m = ssmooth_delta.get(2); //MP supersmooth delta from 10m ago
            /*
            status.bg_supersmooth_20m = ssmooth_bg.get(4);
            status.bg_supersmooth_25m = ssmooth_bg.get(5);
            status.delta_supersmooth_15m = ssmooth_delta.get(3);; //MP supersmooth delta from 15m ago
            status.delta_supersmooth_20m = ssmooth_delta.get(4);; //MP supersmooth delta from 20m ago
            */
            } else { //todo: below is a quick solution, should probably be improved
                status.o1_smoothedbg_5m = 0d;
                status.o1_smoothedbg_now = 0d;
                status.o2_smoothedbg_5m = 0d;
                status.o2_smoothedbg_now = 0d;
                status.o2_smoothedtrend_5m = 0d;
                status.o2_smoothedtrend_now = 0d;
                status.bg_supersmooth_now = data.get(0).value;
                status.bg_supersmooth_5m = data.get(1).value;
                status.bg_supersmooth_10m = data.get(2).value;
                status.bg_supersmooth_15m = data.get(3).value;
                status.delta_supersmooth_now = data.get(0).value - data.get(1).value;
                status.delta_supersmooth_5m = data.get(1).value - data.get(2).value;
                status.delta_supersmooth_10m = data.get(2).value - data.get(3).value;
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
            if (narrow_fittingwindow + fitarraylength - 1 > sizeRecords) { //MP standard smoothing window; (narrow_fittingwindow + fitarraylength -1) = number of data points required to fill up an array of specified length using 'narrow_fittingwindow' amount of data points. -1 because the first array already contains as many datapoints as defined by narrow_fittingwindow, so for an arraylength of 5 and a windowsize of 5, at least 5+5-1 = 9 data points are necessary (points 0-4 / 1-5 / 2-6 / 3-7 / 4-8.... 0-8 = 9 data points)
                insufficientfittingdata = true;
            }

            int validdata = narrow_fittingwindow + fitarraylength - 1;
            if (!insufficientfittingdata) {
                for (int i = 0; i < narrow_fittingwindow + fitarraylength - 1; i++) {
                    if (Math.round((data.get(i).date - data.get(i + 1).date) / (1000d * 60)) >= 12) {
                        validdata = i + 1; //MP: If time difference between two readings exceeds 12 min, adjust fitarraylength to *include* the more recent reading (i = reading; +1 because windowsize reflects number of valid readings);
                        break;
                    } else if (data.get(i).value == 38) {
                        validdata = i; //MP: 38 mg/dl reflects an xDrip error state; Chain of valid readings ends here, *exclude* this value (windowsize = i; i + 1 would include the current value)
                        break;
                    }
                }
            }
            if (validdata < (narrow_fittingwindow + fitarraylength - 1)) {
                if (validdata >= narrow_fittingwindow) {
                    fitarraylength = validdata - narrow_fittingwindow + 1; //MP: Adjust size of fitarraylength to the maximum possible value; Example: Valid datapoints: 7; narrow_fittingwindow: 5; Max array lenght possible: 0-4 / 1-5 / 2-6 --> 3 fits possible; 0-6 = 7 data points;
                } else {
                    insufficientfittingdata = true;
                }
            }

//CREATE ARRAY OF POLYNOMIALS FITTED USING RAW SENSOR DATA
            double nbgavg = 0d; //MP narrow blood glucose average
            final double[][] rawcoeff_array = new double[fitarraylength][6]; //MP array that holds polynomial coefficients
            final PolynomialCurveFitter narrow_fitter = PolynomialCurveFitter.create(2); //MP curve fitter

            if (!insufficientfittingdata) {
                for (int n = 0; n < fitarraylength; n++) { //MP: Only build array using valid data. Length = fitarraylength.
                    double nSST = 0d;
                    double nSSR = 0d;
                    final WeightedObservedPoints obs_narrow = new WeightedObservedPoints();
                    for (int i = 0; i < narrow_fittingwindow; i++) { // MP: Build data for fitting; x = time (min from now); y = BG;
                        obs_narrow.add(i * -5, data.get(i + n).value);
                        nbgavg += data.get(i + n).value;
                    }
                    double[] fitresult_raw = narrow_fitter.fit(obs_narrow.toList());
                    nbgavg = nbgavg / narrow_fittingwindow; //MP: Calculates average BG of those included in fit
                    for (int i = 0; i < narrow_fittingwindow; i++) {
                        nSST += Math.pow(data.get(i).value - nbgavg, 2); //MP: Build SS_total value for R2
                        nSSR += Math.pow(data.get(i).value - (fitresult_raw[0] + fitresult_raw[1] * i * -5 + fitresult_raw[2] * Math.pow(i * -5, 2)), 2); //MP: Calculates difference between measured BG and modelled BG from polynomial c + bx + ax^2; -5 refers to the minutes (x value) between each reading
                    }
                    nR2 = 1 - (nSSR / nSST); //MP R-squared for narrow window fit
                    rawcoeff_array[n][0] = fitresult_raw[2]; //MP quadratic term
                    rawcoeff_array[n][1] = fitresult_raw[1]; //MP linear term
                    rawcoeff_array[n][2] = fitresult_raw[0]; //MP constant term
                    rawcoeff_array[n][3] = nR2; //MP R2
                    rawcoeff_array[n][4] = -1 * (fitresult_raw[1] / (2 * fitresult_raw[2])) - (5 * n); //MP extrema x (min), where 0 min = now.
                    rawcoeff_array[n][5] = fitresult_raw[2] * Math.pow(-1 * (fitresult_raw[1] / (2 * fitresult_raw[2])), 2) + fitresult_raw[1] * -1 * (fitresult_raw[1] / (2 * fitresult_raw[2])) + fitresult_raw[0]; //MP: Extremum y (glucose)
                }
            }

//CALCULATE MEAL SCORE AS AN ESTIMATE OF HOW LIKELY A RISE IS DUE TO A MEAL
            if (!insufficientfittingdata) {
                mealscore_raw = 0d;
                scoredivisor = 0d;
                for (int i = 0; i < fitarraylength; i++) { //MP: Narrow_fittingwindow is the length of the array
                    if (rawcoeff_array[i][0] >= -0.03) {
                        mealscore_raw += (rawcoeff_array[i][1] * (1 - 0.1 * i)); //MP: weighted sum of slopes
                    }
                    scoredivisor += 1 - 0.1 * i; //MP weighted mealscore
                }
                mealscore_raw = (mealscore_raw / scoredivisor) / meal_threshold; //MP: Average the coefficient sum. As the weight of each component decreases, the divisor is the sum of the weights (1+0.9+0.8+0.7+0.6 = 4)
            }

//CREATE ARRAY OF POLYNOMIALS FITTED USING SMOOTHED SENSOR DATA
//todo: Check if data smoothing occurred, i.e. if there was enough valid data
            double nbgsavg = 0d; //MP narrow blood glucose average
            final PolynomialCurveFitter narrow_fitter_smooth = PolynomialCurveFitter.create(2);
/*
            fitarraylength = Math.min(fitarraylength, ssmooth_bg.size() - narrow_fittingwindow + 1); //MP: critical if windowsize (smoothing variable) and narrow_fittingwindow (fitting variable) differ in value
            if (fitarraylength < 1) {
                insufficientfittingdata = true;
            }
*/
            final double[][] smoothcoeff_array = new double[fitarraylength][6];


            if (!insufficientfittingdata && !insufficientsmoothingdata) {
                for (int n = 0; n < fitarraylength; n++) {
                    double nsSST = 0d;
                    double nsSSR = 0d;
                    final WeightedObservedPoints obs_narrow_smooth = new WeightedObservedPoints();
                    for (int i = 0; i < narrow_fittingwindow; i++) { // MP: Collect readings for fitting; x = time (min from now); y = BG;
                        obs_narrow_smooth.add(i * -5, ssmooth_bg.get(i + n)); //todo: Check against smoothing code to spot potential erros if there's not enough smooth data
                        nbgsavg += ssmooth_bg.get(i + n);
                    }
                    double[] fitresult_smooth = narrow_fitter_smooth.fit(obs_narrow_smooth.toList());
                    nbgsavg = nbgsavg / narrow_fittingwindow; //MP: Calculates average BG of those included in fit
                    for (int i = 0; i < narrow_fittingwindow; i++) {
                        nsSST += Math.pow(ssmooth_bg.get(i) - nbgsavg, 2); //MP: Build SS_total value for R2
                        nsSSR += Math.pow(ssmooth_bg.get(i) - (fitresult_smooth[0] + fitresult_smooth[1] * i * -5 + fitresult_smooth[2] * Math.pow(i * -5, 2)), 2); //MP: Calculates difference between measured BG and modelled BG from polynomial c + bx + ax^2; -5 refers to the minutes (x value) between each reading
                    }
                    nsR2 = 1 - (nsSSR / nsSST); //MP R-squared for narrow window fit
                    smoothcoeff_array[n][0] = fitresult_smooth[2]; //MP quadratic term
                    smoothcoeff_array[n][1] = fitresult_smooth[1]; //MP linear term
                    smoothcoeff_array[n][2] = fitresult_smooth[0]; //MP constant term
                    smoothcoeff_array[n][3] = nsR2; //MP R2
                    smoothcoeff_array[n][4] = -1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])) - (5 * n); //MP extrema x (min), where 0 min = now.
                    smoothcoeff_array[n][5] = fitresult_smooth[2] * Math.pow(-1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])), 2) + fitresult_smooth[1] * -1 * (fitresult_smooth[1] / (2 * fitresult_smooth[2])) + fitresult_smooth[0]; //MP: Extremum y (glucose)
                }
            }

            /* Testcode for more precise hypo detection below
            double hypovalley = 0d;
            int hypocount = 0;
            for (int i = 0; i < smoothcoeff_array[0].length; i++) {
                if (smoothcoeff_array[i][5] <= 75 && smoothcoeff_array[i][4] >= -15 && smoothcoeff_array[i][4] <= 0) {
                    hypovalley += smoothcoeff_array[i][4];
                    hypocount += 1;
                }
            }
            hypovalley = hypovalley / hypocount; //MP: Average valley time
            */

//CALCULATE MEAL SCORE AS AN ESTIMATE OF HOW LIKELY A RISE IS DUE TO A MEAL
            if (!insufficientfittingdata && !insufficientsmoothingdata) {
                mealscore_smooth = 0d;
                scoredivisor = 0d;
                for (int i = 0; i < fitarraylength; i++) { //MP: Narrow_fittingwindow is the length of the array
                    if (smoothcoeff_array[i][0] >= -0.03) {
                        mealscore_smooth += smoothcoeff_array[i][1] * (1 - 0.1 * i); //MP: weighted sum of slopes
                    }
                    scoredivisor += 1 - 0.1 * i;
                }
                mealscore_smooth = (mealscore_smooth / scoredivisor) / meal_threshold; //MP: Average the coefficient sum. As the weight of each component decreases, the divisor is the sum of the weights (1+0.9+0.8+0.7+0.6 = 4)
            }

//CREATE POLYNOMIAL FITTED USING RAW SENSOR DATA, BROAD RANGE
            double bbgavg = 0d;
            final WeightedObservedPoints obs_broad = new WeightedObservedPoints();
            for (int i = 0; i < broad_fittingwindow; i++) { // MP: Build data for fitting; x = time (min from now); y = BG;
                obs_broad.add(i * -5, data.get(i).value);
                bbgavg += data.get(i).value;
            }
            bbgavg = bbgavg / broad_fittingwindow; //MP: Calculates average BG of those included in fit

            // MP: Instantiate a 2nd degree polynomial fitter.
            final PolynomialCurveFitter broad_fitter = PolynomialCurveFitter.create(2);

            // MP: Perform the fit / retrieve fitted parameters (coefficients of the polynomial function).
            final double[] coeff_broad = broad_fitter.fit(obs_broad.toList());

            //MP: calculate R2 value (coefficient of determination)
            double bSST = 0d;
            double bSSR = 0d;
            for (int i = 0; i < broad_fittingwindow; i++) {
                bSST += Math.pow(data.get(i).value - bbgavg, 2); //MP: Build SS_total value for R2
                bSSR += Math.pow(data.get(i).value - (coeff_broad[0] + coeff_broad[1] * i * -5 + coeff_broad[2] * Math.pow(i * -5, 2)), 2); //MP: Calculates difference between measured BG and modelled BG from polynomial c + bx + ax^2; -5 refers to the minutes (x value) between each reading
            }
            bR2 = 1 - (bSSR / bSST); //MP R-squared for broad window fit

            //check for maxima/minima by manual polynom differentiation and create a new list containing relevant information
            // Finding extrema: f(x) = ax^2 + bx +c; f'(x) = 2ax + b; x(extremum) = -b/2a;
            // Determine if max/min: f''(x) = 2a; if 2a > 0 --> minimum; if 2a < 0 --> maximum; if 2a == 0 --> saddle point; In our case (2nd degree polynomial), just checking whether coefficient a is >/< 0 is enough;

            double broad_minmax = -(coeff_broad[1] / (2 * coeff_broad[2]));

//UPDATE STATUS OBJECT
            status.insufficientfittingdata = insufficientfittingdata;
            if (!insufficientfittingdata) {
                status.narrowfit_a = rawcoeff_array[0][0]; //MP 2nd degree polynomial coefficient a for narrowfit
                status.narrowfit_b = rawcoeff_array[0][1]; //MP 2nd degree polynomial coefficient b for narrowfit
                status.narrowfit_c = rawcoeff_array[0][2]; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            } else {
                status.narrowfit_a = 0d; //MP 2nd degree polynomial coefficient a for narrowfit
                status.narrowfit_b = 0d; //MP 2nd degree polynomial coefficient b for narrowfit
                status.narrowfit_c = 0d; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            }
            if (!insufficientfittingdata && !insufficientsmoothingdata) {
                status.narrowsmoothedfit_a = smoothcoeff_array[0][0]; //MP 2nd degree polynomial coefficient a for smoothed narrowfit
                status.narrowsmoothedfit_b = smoothcoeff_array[0][1]; //MP 2nd degree polynomial coefficient b for smoothed narrowfit
                status.narrowsmoothedfit_c = smoothcoeff_array[0][2]; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            } else if (!insufficientfittingdata && insufficientsmoothingdata) { //MP use raw data fit if data smoothing didn't work out
                status.narrowsmoothedfit_a = rawcoeff_array[0][0];
                status.narrowsmoothedfit_b = rawcoeff_array[0][1];
                status.narrowsmoothedfit_c = rawcoeff_array[0][2];
            } else {
                status.narrowsmoothedfit_a = 0d;
                status.narrowsmoothedfit_b = 0d;
                status.narrowsmoothedfit_c = 0d;
            }
            //status.arrayfit_r0 = smoothcoeff_array[0][3]; //MP 2nd degree polynomial coefficient a for smoothed narrowfit
            //status.arrayfit_r4 = smoothcoeff_array[4][3]; //MP 2nd degree polynomial coefficient a for smoothed narrowfit
            status.broadfit_a = coeff_broad[2]; //MP 2nd degree polynomial coefficient a for broadfit
            status.broadfit_b = coeff_broad[1]; //MP 2nd degree polynomial coefficient b for broadfit
            status.broadfit_c = coeff_broad[0]; //MP 2nd degree polynomial coefficient c for broadfit
            status.nR2 = rawcoeff_array[0][3];
            status.nsR2 = smoothcoeff_array[0][3];
            if (!insufficientfittingdata) {
                status.mealscore_raw = mealscore_raw; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            } else {
                status.mealscore_raw = 0d; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            }
            if (!insufficientfittingdata && !insufficientsmoothingdata) {
                status.mealscore_smooth = mealscore_smooth; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            } else {
                status.mealscore_smooth = 0d; //MP 2nd degree polynomial coefficient c for smoothed narrowfit
            }
            status.bR2 = bR2;
            status.broad_extremum = broad_minmax; //MP extremum in broadfit
            //MP test variables below
            status.scoredivisor = scoredivisor;
            status.smoothsize = ssmooth_bg.size();
            status.fitarraylength = fitarraylength;
            status.windowsize = windowsize;
            status.validdata = validdata;
            status.sizerecords = sizeRecords;
//################################## MP
//### GLUCOSE CURVE ANALYSIS END ### MP
//################################## MP

            //MP Activity calculation start
            //long activity_pred_time = /*DateUtil.now() + */5*60*1000;
            /*Profile profile = profileFunction.getProfile(DateUtil.now() + activity_pred_time);
            IobTotal iob = iobCobCalculatorPlugin.calculateFromTreatmentsAndTempsFutureSynchronized(activity_pred_time, profile);
            status.activity = iob.activity;*/

           /*List<InMemoryGlucoseValue> bucketed_data = iobCobCalculatorPlugin.getBucketedData();
            for (int i = bucketed_data.size() - 4; i >= 0; i--) {
                long bgTime = bucketed_data.get(i).getTimestamp();
                bgTime = IobCobCalculatorPlugin.roundUpTime(bgTime);
                Profile profile = profileFunction.getProfile(bgTime);
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTime(activity_pred_time, profile);
                //if (bgTime > DateUtil.now() - 6*60*60*1000) {
                status.futureactivity = iob.activity;
            //}
            }*/
            activity_pred_time = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP free oref peak time
            for (long i = sensorlag - 4; i <= sensorlag; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.sensorlagactivity += iob.activity;
            }
            for (long i = activity_pred_time - 4; i <= activity_pred_time; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.futureactivity += iob.activity;
            }
            for (long i = activity_historic - 2; i <= activity_historic + 2; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.historicactivity += iob.activity;
            }
            for (long i = -4; i <= 0; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.currentactivity += iob.activity;
            }
            //IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(activity_pred_time);
            //IobTotal iob_sensorlag = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(sensorlag);
            //status.futureactivity = iob.activity;
            //status.sensorlagactivity = iob_sensorlag.activity;
            status.activity_pred_time = activity_pred_time;
            //MP Activity calculation end
            aapsLogger.debug(LTag.GLUCOSE, status.log());
            return status.round();

        }
    }

    public static double average(ArrayList<Double> array) {
        double sum = 0d;

        if (array.size() == 0)
            return 0d;

        for (Double value : array) {
            sum += value;
        }
        return sum / array.size();
    }
}
