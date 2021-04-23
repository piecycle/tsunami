package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\"\u001a\u00020\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\f\u00a8\u0006%"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BasalElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "tbr", "Linfo/nightscout/androidaps/db/TemporaryBasal;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "(Linfo/nightscout/androidaps/db/TemporaryBasal;Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "clockDriftOffset", "", "getClockDriftOffset$app_fullRelease", "()J", "setClockDriftOffset$app_fullRelease", "(J)V", "conversionOffset", "getConversionOffset$app_fullRelease", "setConversionOffset$app_fullRelease", "deliveryType", "", "getDeliveryType$app_fullRelease", "()Ljava/lang/String;", "setDeliveryType$app_fullRelease", "(Ljava/lang/String;)V", "duration", "getDuration$app_fullRelease", "setDuration$app_fullRelease", "rate", "", "getRate$app_fullRelease", "()D", "setRate$app_fullRelease", "(D)V", "scheduleName", "getScheduleName$app_fullRelease", "setScheduleName$app_fullRelease", "timestamp", "getTimestamp$app_fullRelease", "setTimestamp$app_fullRelease", "app_fullRelease"})
public final class BasalElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    private long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String deliveryType = "automated";
    @com.google.gson.annotations.Expose()
    private long duration = 0L;
    @com.google.gson.annotations.Expose()
    private double rate = -1.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String scheduleName = "AAPS";
    @com.google.gson.annotations.Expose()
    private long clockDriftOffset = 0L;
    @com.google.gson.annotations.Expose()
    private long conversionOffset = 0L;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    
    public final long getTimestamp$app_fullRelease() {
        return 0L;
    }
    
    public final void setTimestamp$app_fullRelease(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeliveryType$app_fullRelease() {
        return null;
    }
    
    public final void setDeliveryType$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDuration$app_fullRelease() {
        return 0L;
    }
    
    public final void setDuration$app_fullRelease(long p0) {
    }
    
    public final double getRate$app_fullRelease() {
        return 0.0;
    }
    
    public final void setRate$app_fullRelease(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScheduleName$app_fullRelease() {
        return null;
    }
    
    public final void setScheduleName$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getClockDriftOffset$app_fullRelease() {
        return 0L;
    }
    
    public final void setClockDriftOffset$app_fullRelease(long p0) {
    }
    
    public final long getConversionOffset$app_fullRelease() {
        return 0L;
    }
    
    public final void setConversionOffset$app_fullRelease(long p0) {
    }
    
    public BasalElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.TemporaryBasal tbr, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction) {
        super(0L, null);
    }
}