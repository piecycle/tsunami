package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BolusElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "treatment", "Linfo/nightscout/androidaps/db/Treatment;", "(Linfo/nightscout/androidaps/db/Treatment;)V", "expectedNormal", "", "getExpectedNormal", "()D", "setExpectedNormal", "(D)V", "normal", "getNormal", "setNormal", "subType", "", "getSubType", "()Ljava/lang/String;", "setSubType", "(Ljava/lang/String;)V", "app_fullRelease"})
public final class BolusElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String subType = "normal";
    @com.google.gson.annotations.Expose()
    private double normal = 0.0;
    @com.google.gson.annotations.Expose()
    private double expectedNormal = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubType() {
        return null;
    }
    
    public final void setSubType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getNormal() {
        return 0.0;
    }
    
    public final void setNormal(double p0) {
    }
    
    public final double getExpectedNormal() {
        return 0.0;
    }
    
    public final void setExpectedNormal(double p0) {
    }
    
    public BolusElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.Treatment treatment) {
        super(0L, null);
    }
}