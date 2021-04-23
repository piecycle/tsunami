package info.nightscout.androidaps.plugins.general.automation.actions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionDummy;", "Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "doAction", "", "callback", "Linfo/nightscout/androidaps/queue/Callback;", "friendlyName", "", "icon", "shortDescription", "", "app_fullRelease"})
public final class ActionDummy extends info.nightscout.androidaps.plugins.general.automation.actions.Action {
    
    @java.lang.Override()
    public int friendlyName() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String shortDescription() {
        return null;
    }
    
    @java.lang.Override()
    public void doAction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.queue.Callback callback) {
    }
    
    @java.lang.Override()
    public int icon() {
        return 0;
    }
    
    public ActionDummy(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
}