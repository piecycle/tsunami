package info.nightscout.androidaps.plugins.aps.loop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/aps/loop/CarbSuggestionReceiver;", "Ldagger/android/DaggerBroadcastReceiver;", "()V", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "getLoopPlugin", "()Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "setLoopPlugin", "(Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_fullRelease"})
public final class CarbSuggestionReceiver extends dagger.android.DaggerBroadcastReceiver {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin getLoopPlugin() {
        return null;
    }
    
    public final void setLoopPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public CarbSuggestionReceiver() {
        super();
    }
}