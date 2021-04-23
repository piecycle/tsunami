package info.nightscout.androidaps.plugins.general.automation.actions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001aH\'J\u0010\u0010$\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u001dH&J\b\u0010(\u001a\u00020\u001dH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "getInjector", "()Ldagger/android/HasAndroidInjector;", "precondition", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "getPrecondition", "()Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "setPrecondition", "(Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;)V", "apply", "", "a", "doAction", "callback", "Linfo/nightscout/androidaps/queue/Callback;", "friendlyName", "", "fromJSON", "data", "", "generateDialog", "root", "Landroid/widget/LinearLayout;", "hasDialog", "", "icon", "instantiate", "obj", "Lorg/json/JSONObject;", "shortDescription", "toJSON", "app_fullRelease"})
public abstract class Action {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.automation.triggers.Trigger precondition;
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.Trigger getPrecondition() {
        return null;
    }
    
    public final void setPrecondition(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.automation.triggers.Trigger p0) {
    }
    
    public abstract int friendlyName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String shortDescription();
    
    public abstract void doAction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.queue.Callback callback);
    
    @androidx.annotation.DrawableRes()
    public abstract int icon();
    
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public boolean hasDialog() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toJSON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public info.nightscout.androidaps.plugins.general.automation.actions.Action fromJSON(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    public final void apply(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.actions.Action a) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.automation.actions.Action instantiate(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject obj) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public Action(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}