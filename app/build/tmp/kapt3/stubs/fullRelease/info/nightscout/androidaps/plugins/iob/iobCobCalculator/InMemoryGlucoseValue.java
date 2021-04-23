package info.nightscout.androidaps.plugins.iob.iobCobCalculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B%\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/InMemoryGlucoseValue;", "", "gv", "Linfo/nightscout/androidaps/db/BgReading;", "(Linfo/nightscout/androidaps/db/BgReading;)V", "timestamp", "", "value", "", "interpolated", "", "(JDZ)V", "getInterpolated", "()Z", "setInterpolated", "(Z)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getValue", "()D", "setValue", "(D)V", "app_fullRelease"})
public final class InMemoryGlucoseValue {
    private long timestamp;
    private double value;
    private boolean interpolated;
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    public final boolean getInterpolated() {
        return false;
    }
    
    public final void setInterpolated(boolean p0) {
    }
    
    public InMemoryGlucoseValue(long timestamp, double value, boolean interpolated) {
        super();
    }
    
    public InMemoryGlucoseValue(long timestamp, double value) {
        super();
    }
    
    public InMemoryGlucoseValue(long timestamp) {
        super();
    }
    
    public InMemoryGlucoseValue() {
        super();
    }
    
    public InMemoryGlucoseValue(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.BgReading gv) {
        super();
    }
}