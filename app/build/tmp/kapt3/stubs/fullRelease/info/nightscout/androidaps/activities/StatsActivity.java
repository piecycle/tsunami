package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Linfo/nightscout/androidaps/activities/StatsActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "activityMonitor", "Linfo/nightscout/androidaps/utils/ActivityMonitor;", "getActivityMonitor", "()Linfo/nightscout/androidaps/utils/ActivityMonitor;", "setActivityMonitor", "(Linfo/nightscout/androidaps/utils/ActivityMonitor;)V", "binding", "Linfo/nightscout/androidaps/databinding/ActivityStatsBinding;", "tddCalculator", "Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "getTddCalculator", "()Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "setTddCalculator", "(Linfo/nightscout/androidaps/utils/stats/TddCalculator;)V", "tirCalculator", "Linfo/nightscout/androidaps/utils/stats/TirCalculator;", "getTirCalculator", "()Linfo/nightscout/androidaps/utils/stats/TirCalculator;", "setTirCalculator", "(Linfo/nightscout/androidaps/utils/stats/TirCalculator;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_fullRelease"})
public final class StatsActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.stats.TddCalculator tddCalculator;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.stats.TirCalculator tirCalculator;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.ActivityMonitor activityMonitor;
    private info.nightscout.androidaps.databinding.ActivityStatsBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TddCalculator getTddCalculator() {
        return null;
    }
    
    public final void setTddCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.stats.TddCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TirCalculator getTirCalculator() {
        return null;
    }
    
    public final void setTirCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.stats.TirCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.ActivityMonitor getActivityMonitor() {
        return null;
    }
    
    public final void setActivityMonitor(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.ActivityMonitor p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public StatsActivity() {
        super();
    }
}