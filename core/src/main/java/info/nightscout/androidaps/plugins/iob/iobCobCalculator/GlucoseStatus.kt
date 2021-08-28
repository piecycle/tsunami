package info.nightscout.androidaps.plugins.iob.iobCobCalculator

import info.nightscout.androidaps.utils.DecimalFormatter
import info.nightscout.androidaps.utils.Round

data class GlucoseStatus(
    val glucose: Double,
    val noise: Double = 0.0,
    val delta: Double = 0.0,
    val shortAvgDelta: Double = 0.0,
    val longAvgDelta: Double = 0.0,
    val date: Long = 0L,
    //*** Tsunami specific values ******************************************************************************************************************
    var futureactivity: Double = 0.0,
    var sensorlagactivity: Double = 0.0,
    var historicactivity: Double = 0.0,
    var currentactivity: Double = 0.0,
    var activity_pred_time: Long = 0L,
    var bg_5minago: Double = 0.0,
    var autoISF_duration: Long = 0L,
    var autoISF_average: Double = 0.0,
    var insufficientsmoothingdata: Boolean = false,
    var insufficientfittingdata: Boolean = false,
    var bg_supersmooth_now: Double = 0.0,
    var delta_supersmooth_now: Double = 0.0,
    var broadfit_a: Double = 0.0,
    var broadfit_b: Double = 0.0,
    var broadfit_c: Double = 0.0,
    var broad_extremum: Double = 0.0,
    var mealscore_raw: Double = 0.0,
    var mealscore_smooth: Double = 0.0,
    var deltascore: Double = 0.0
    //**********************************************************************************************************************************************
) {

    fun log(): String = "Glucose: " + DecimalFormatter.to0Decimal(glucose) + " mg/dl " +
        "Noise: " + DecimalFormatter.to0Decimal(noise) + " " +
        "Delta: " + DecimalFormatter.to0Decimal(delta) + " mg/dl" +
        "Short avg. delta: " + " " + DecimalFormatter.to2Decimal(shortAvgDelta) + " mg/dl " +
        "Long avg. delta: " + DecimalFormatter.to2Decimal(longAvgDelta) + " mg/dl" +
    //*** Tsunami specific values ******************************************************************************************************************
        "futureactivity: " + DecimalFormatter.to2Decimal(futureactivity) + " U/min" +       //Todo Check Unit (/min or /5min ?)
        "sensorlagactivity: " + DecimalFormatter.to2Decimal(sensorlagactivity) + " U/min" + //Todo Check Unit (/min or /5min ?)
        "historicactivity: " + DecimalFormatter.to2Decimal(historicactivity) + " U/min" +   //Todo Check Unit (/min or /5min ?)
        "currentactivity: " + DecimalFormatter.to2Decimal(currentactivity) + " U/min" +     //Todo Check Unit (/min or /5min ?)
        "autoISF_duration: " + activity_pred_time + " min" +                                //Todo Check Unit (min or msec)
        "bg_5minago: " + DecimalFormatter.to0Decimal(bg_5minago) + " mg/dl " +
        "autoISF_duration: " + autoISF_duration + " min" +                                  //Todo Check Unit (min or msec)
        "autoISF_average: " + DecimalFormatter.to1Decimal(autoISF_average) + " mg/dl/U" +
        "insufficientsmoothingdata: " + insufficientsmoothingdata +
        "insufficientfittingdata: " + insufficientfittingdata +
        "bg_supersmooth_now: " + DecimalFormatter.to0Decimal(bg_supersmooth_now) + " mg/dl " +
        "delta_supersmooth_now: " + DecimalFormatter.to0Decimal(delta_supersmooth_now) + " mg/dl " +
        "broadfit_a: " + DecimalFormatter.to2Decimal(broadfit_a) + " ??????" +              //Todo define unit
        "broadfit_b: " + DecimalFormatter.to2Decimal(broadfit_b) + " ??????" +              //Todo define unit
        "broadfit_c: " + DecimalFormatter.to2Decimal(broadfit_c) + " ??????" +              //Todo define unit
        "broad_extremum: " + DecimalFormatter.to2Decimal(broad_extremum) + " ??????" +      //Todo define unit
        "mealscore_raw: " + DecimalFormatter.to0Decimal(mealscore_raw) + " ??????" +        //Todo define unit
        "mealscore_smooth: " + DecimalFormatter.to0Decimal(mealscore_smooth) + " ??????" +  //Todo define unit
        "deltascore: " + DecimalFormatter.to2Decimal(deltascore) + " ??????"                //Todo define unit
}

fun GlucoseStatus.asRounded() = copy(
    glucose = Round.roundTo(glucose, 0.1),
    noise = Round.roundTo(noise, 0.01),
    delta = Round.roundTo(delta, 0.01),
    shortAvgDelta = Round.roundTo(shortAvgDelta, 0.01),
    longAvgDelta = Round.roundTo(longAvgDelta, 0.01)
)