package info.nightscout.androidaps.utils.stats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010!\u001a\u00020\tJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020\tR\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a\u00a8\u0006)"}, d2 = {"Linfo/nightscout/androidaps/utils/stats/TIR;", "", "date", "", "lowThreshold", "", "highThreshold", "(JDD)V", "above", "", "getAbove$app_fullRelease", "()I", "setAbove$app_fullRelease", "(I)V", "below", "getBelow$app_fullRelease", "setBelow$app_fullRelease", "count", "getCount$app_fullRelease", "setCount$app_fullRelease", "getDate", "()J", "error", "getError$app_fullRelease", "setError$app_fullRelease", "getHighThreshold", "()D", "inRange", "getInRange$app_fullRelease", "setInRange$app_fullRelease", "getLowThreshold", "abovePct", "belowPct", "inRangePct", "toText", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "days", "app_fullRelease"})
public final class TIR {
    private int below = 0;
    private int inRange = 0;
    private int above = 0;
    private int error = 0;
    private int count = 0;
    private final long date = 0L;
    private final double lowThreshold = 0.0;
    private final double highThreshold = 0.0;
    
    public final int getBelow$app_fullRelease() {
        return 0;
    }
    
    public final void setBelow$app_fullRelease(int p0) {
    }
    
    public final int getInRange$app_fullRelease() {
        return 0;
    }
    
    public final void setInRange$app_fullRelease(int p0) {
    }
    
    public final int getAbove$app_fullRelease() {
        return 0;
    }
    
    public final void setAbove$app_fullRelease(int p0) {
    }
    
    public final int getError$app_fullRelease() {
        return 0;
    }
    
    public final void setError$app_fullRelease(int p0) {
    }
    
    public final int getCount$app_fullRelease() {
        return 0;
    }
    
    public final void setCount$app_fullRelease(int p0) {
    }
    
    public final int error() {
        return 0;
    }
    
    public final int below() {
        return 0;
    }
    
    public final int inRange() {
        return 0;
    }
    
    public final int above() {
        return 0;
    }
    
    public final int belowPct() {
        return 0;
    }
    
    public final int inRangePct() {
        return 0;
    }
    
    public final int abovePct() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toText(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toText(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, int days) {
        return null;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final double getLowThreshold() {
        return 0.0;
    }
    
    public final double getHighThreshold() {
        return 0.0;
    }
    
    public TIR(long date, double lowThreshold, double highThreshold) {
        super();
    }
}