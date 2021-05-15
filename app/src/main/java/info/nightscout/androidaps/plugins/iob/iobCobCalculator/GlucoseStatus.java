package info.nightscout.androidaps.plugins.iob.iobCobCalculator;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.HasAndroidInjector;
import info.nightscout.androidaps.db.BgReading;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.logging.LTag;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.DecimalFormatter;
import info.nightscout.androidaps.utils.Round;

/**
 * Created by mike on 04.01.2017.
 */

public class GlucoseStatus {
    @Inject public AAPSLogger aapsLogger;
    @Inject public IobCobCalculatorPlugin iobCobCalculatorPlugin;

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
    public int windowsize = 12; //MP number of bg readings to include in smoothing window
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
    public double delta_supersmooth = 0d;
    // MP data smoothing END

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
        this.o1_smoothedbg_5m = Round.roundTo(this.o1_smoothedbg_5m, 0.1);
        this.o1_smoothedbg_now = Round.roundTo(this.o1_smoothedbg_now, 0.1);
        this.o2_smoothedbg_5m = Round.roundTo(this.o2_smoothedbg_5m, 0.1);
        this.o2_smoothedbg_now = Round.roundTo(this.o2_smoothedbg_now, 0.1);
        this.o2_smoothedtrend_5m = Round.roundTo(this.o2_smoothedtrend_5m, 0.1);
        this.o2_smoothedtrend_now = Round.roundTo(this.o2_smoothedtrend_now, 0.1);
        this.bg_supersmooth_now = Round.roundTo(this.bg_supersmooth_now, 0.1);
        this.bg_supersmooth_5m = Round.roundTo(this.bg_supersmooth_5m, 0.1);
        this.delta_supersmooth = Round.roundTo(this.delta_supersmooth, 0.1);
        // MP data smoothing end
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
                status.bg_supersmooth_now = now.value; //MP Smoothing parameters remain unchanged
                status.bg_supersmooth_5m = now.value; //MP Smoothing parameters remain unchanged
                status.delta_supersmooth = 0d; //MP Smoothing parameters remain unchanged
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
                if (then.value > oldavg*(1-bw) && then.value < oldavg*(1+bw)) {
                    sumBG += then.value;
                    oldavg = sumBG / (i+1);
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
            
            // INITIALISE SMOOTHING WINDOW - 1st order exponential smoothing
            o1_smoothbg.clear(); // MP reset smoothed bg array

            if (sizeRecords >= windowsize + 1) { //MP standard smoothing window of 1 h
                o1_smoothbg.add(data.get(windowsize - 1).value); //MP Start 1st order exponential data smoothing with bg from 1 h ago
            } else if (sizeRecords > 1){ //MP Data smoothing if more than one bg entry but less than 12 (1 h) available
                o1_smoothbg.add(data.get(sizeRecords - 1).value); //MP Start 1st order exponential data smoothing with oldest bg available
            } else { //MP failsafe, if bg database is empty...
                o1_smoothbg.add(data.get(0).value); //MP Start 2nd order exponential data smoothing with current bg
            }

            // CALCULATE SMOOTHING WINDOW - 1st order exponential smoothing
            for (int i = 0; i < windowsize; i++) { //MP calculated smoothed bg window of last 1 h
                if (sizeRecords < windowsize) {
                    i = windowsize - sizeRecords; //MP Smoothing window is narrowed down until the databank contains at least 12 bg entries
                }
                if (data.get(windowsize-1-i).value > 38) {
                    o1_smoothbg.add(0, o1_smoothbg.get(0) + o1_a*(data.get(windowsize-1-i).value - o1_smoothbg.get(0))); //MP build array of 1st order smoothed bgs
                }
            }


            // INITIALISE SMOOTHING WINDOW - 2nd order exponential smoothing
            o2_smoothbg.clear(); // MP reset smoothed bg array
            o2_smoothdelta.clear(); // MP reset smoothed delta array

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
            //MP report smoothing variables in glucose status
            status.bg_5minago = before.value; //MP If the database contains more than one reading, return the value from 5 min ago
            status.o1_weight = o1_weight;
            status.o1_a = o1_a;
            status.o2_a = o2_a;
            status.o2_b = o2_b;
            status.o1_smoothedbg_5m = o1_smoothbg.get(1);
            status.o1_smoothedbg_now = o1_smoothbg.get(0);
            status.o2_smoothedbg_5m = o2_smoothbg.get(1);
            status.o2_smoothedbg_now = o2_smoothbg.get(0);
            status.o2_smoothedtrend_5m = o2_smoothdelta.get(1);
            status.o2_smoothedtrend_now = o2_smoothdelta.get(0);
            status.bg_supersmooth_now = o1_weight*o1_smoothbg.get(0) + (1-o1_weight)*o2_smoothbg.get(0);
            status.bg_supersmooth_5m = o1_weight*o1_smoothbg.get(1) + (1-o1_weight)*o2_smoothbg.get(1);
            status.delta_supersmooth = status.bg_supersmooth_now - status.bg_supersmooth_5m;
//############################### MP
//### DATA SMOOTHING CORE END ### MP
//############################### MP

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
