package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/WizardElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "treatment", "Linfo/nightscout/androidaps/db/Treatment;", "(Linfo/nightscout/androidaps/db/Treatment;)V", "bolus", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BolusElement;", "getBolus", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BolusElement;", "setBolus", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BolusElement;)V", "carbInput", "", "getCarbInput", "()D", "setCarbInput", "(D)V", "insulinCarbRatio", "getInsulinCarbRatio", "setInsulinCarbRatio", "units", "", "getUnits", "()Ljava/lang/String;", "setUnits", "(Ljava/lang/String;)V", "app_fullRelease"})
public final class WizardElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String units = "mg/dL";
    @com.google.gson.annotations.Expose()
    private double carbInput = 0.0;
    @com.google.gson.annotations.Expose()
    private double insulinCarbRatio = 0.0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.BolusElement bolus;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnits() {
        return null;
    }
    
    public final void setUnits(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCarbInput() {
        return 0.0;
    }
    
    public final void setCarbInput(double p0) {
    }
    
    public final double getInsulinCarbRatio() {
        return 0.0;
    }
    
    public final void setInsulinCarbRatio(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.BolusElement getBolus() {
        return null;
    }
    
    public final void setBolus(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.elements.BolusElement p0) {
    }
    
    public WizardElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.Treatment treatment) {
        super(0L, null);
    }
}