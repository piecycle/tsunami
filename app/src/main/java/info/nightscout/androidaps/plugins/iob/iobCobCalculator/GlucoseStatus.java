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
//MP Tsunami Activity Engine start
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.utils.SafeParse;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
//MP Tsunami Activity Engine end
/**
 * Created by mike on 04.01.2017.
 */

public class GlucoseStatus {
    @Inject public AAPSLogger aapsLogger;
    @Inject public IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @Inject SP sp;
    //MP Tsunami Activity Engine start
    @Inject ProfileFunction profileFunction;
    //MP Tsunami Activity Engine end

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
    //MP Tsunami Activity Engine start
    public double deltascore = 0d;
    public double deltathreshold = 7d; //MP average delta above which deltascore will be 1.
    public double weight = 0.15d; //MP Weighting used for weighted averages
    public double scoredivisor = 0d;
    public double futureactivity_PK = 0d;
    public double futureactivity_PD = 0d;
    public double sensorlagactivity = 0d;
    public double historicactivity = 0d;
    public double currentactivity = 0d;
    //public long activity_pred_time = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP Time in minutes from now to calculate insulin activity for
    public long activity_pred_time_PK = 45L; //MP Time in minutes from now to calculate insulin activity for
    public long activity_pred_time_PD = 65L; //MP Time in minutes from now to calculate insulin activity for
    public long sensorlag = -10L; //MP Time in minutes from now which is estimated to be the time point at which the displayed sensor delta actually occurred (i.e. sensor lag time, must be at least -5 min, max -20 min)
    public long activity_historic = -20L; //MP Activity at the time in minutes from now. Used to calculate activity in the past to use as target activity.
    //MP Tsunami Activity Engine end
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
        this.deltascore = Round.roundTo(this.deltascore, 0.01);
        this.futureactivity_PK = Round.roundTo(this.futureactivity_PK, 0.0001);
        this.futureactivity_PD = Round.roundTo(this.futureactivity_PD, 0.0001);
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

// MP Tsunami Activity Engine meal detection system

            if (!insufficientsmoothingdata) {
                deltascore = 0d;
                scoredivisor = 0d;
                for (int i = 0; i < Math.min(windowsize - 1, 6); i++) { //MP Dynamically adjust deltas to include
                    deltascore += ssmooth_delta.get(i) * (1 - weight * i);
                    scoredivisor += 1 - weight * i; //MP weighted mealscore
                }
                deltascore = (deltascore / scoredivisor) / deltathreshold; //MP: Check how deltascore compares to the threshold
            } else {
                deltascore = 0.5d; //MP If there's not enough data, set deltascore to 50%
            }

//MP report smoothing variables in glucose status
            status.bg_5minago = before.value; //MP If the database contains more than one reading, return the value from 5 min ago
            status.insufficientsmoothingdata = insufficientsmoothingdata;
            status.o1_weight = o1_weight;
            status.o1_a = o1_a;
            status.o2_a = o2_a;
            status.o2_b = o2_b;
            status.deltascore = deltascore;
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
                status.delta_supersmooth_now = delta;
                status.delta_supersmooth_5m = data.get(1).value - data.get(2).value;
                status.delta_supersmooth_10m = data.get(2).value - data.get(3).value;
            }
            // TODO: communicate to other code snippets / files that use smoothed data if no smoothing occurred due to insufficient dat
//############################### MP
//### DATA SMOOTHING CORE END ### MP
//############################### MP

            //MP Tsunami Activity Engine start

            activity_pred_time_PK = SafeParse.stringToLong(sp.getString(R.string.key_insulin_oref_peak,"45")); //MP free oref peak time
            activity_pred_time_PD = 65L; //MP Fixed minute target in the future.
            for (long i = sensorlag - 4; i <= sensorlag; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.sensorlagactivity += iob.activity;
            }
            for (long i = activity_pred_time_PK - 4; i <= activity_pred_time_PK; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.futureactivity_PK += iob.activity;
            }

            for (long i = activity_pred_time_PD - 4; i <= activity_pred_time_PD; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.futureactivity_PD += iob.activity;
            }

            for (long i = activity_historic - 2; i <= activity_historic + 2; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.historicactivity += iob.activity;
            }
            for (long i = -4; i <= 0; i++) {
                IobTotal iob = iobCobCalculatorPlugin.calculateInsulinActivityAtTimeSynchronized(i);
                status.currentactivity += iob.activity;
            }

            status.activity_pred_time_PK = activity_pred_time_PK;
            status.activity_pred_time_PD = activity_pred_time_PD;
            //MP Tsunami Activity Engine end
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
