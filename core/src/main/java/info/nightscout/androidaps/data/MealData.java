package info.nightscout.androidaps.data;

/**
 * Created by mike on 04.01.2017.
 */
public class MealData {
    public double boluses = 0d;
    public double carbs = 0d;
    public double mealCOB = 0.0d;
    public double slopeFromMaxDeviation = 0;
    public double slopeFromMinDeviation = 999;
    public long lastBolusTime;
    //MP Get last bolus for TAE (UAM tsunami) start
    public double lastBolus;
    //MP Get last bolus for TAE (UAM tsunami) end
    public long lastCarbTime = 0L;
    public double usedMinCarbsImpact = 0d;
}
