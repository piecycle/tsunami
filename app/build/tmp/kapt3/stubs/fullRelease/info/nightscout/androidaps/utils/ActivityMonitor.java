package info.nightscout.androidaps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Linfo/nightscout/androidaps/utils/ActivityMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "reset", "stats", "Landroid/text/Spanned;", "toText", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class ActivityMonitor implements android.app.Application.ActivityLifecycleCallbacks {
    private info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String toText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned stats() {
        return null;
    }
    
    public final void reset() {
    }
    
    @javax.inject.Inject()
    public ActivityMonitor(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp) {
        super();
    }
}