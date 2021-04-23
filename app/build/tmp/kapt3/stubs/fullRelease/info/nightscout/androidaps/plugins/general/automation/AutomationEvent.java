package info.nightscout.androidaps.plugins.general.automation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\rJ\u0010\u00102\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010%J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020\u0011J\u0006\u00107\u001a\u00020%R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010!\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u00068"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationEvent;", "", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "actions", "", "Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "getActions", "()Ljava/util/List;", "autoRemove", "", "getAutoRemove", "()Z", "setAutoRemove", "(Z)V", "isEnabled", "setEnabled", "lastRun", "", "getLastRun", "()J", "setLastRun", "(J)V", "readOnly", "getReadOnly", "setReadOnly", "systemAction", "getSystemAction", "setSystemAction", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "trigger", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "getTrigger", "()Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "setTrigger", "(Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;)V", "addAction", "action", "fromJSON", "data", "getPreconditions", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector;", "shouldRun", "toJSON", "app_fullRelease"})
public final class AutomationEvent {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    private boolean isEnabled = true;
    private boolean systemAction = false;
    private boolean readOnly = false;
    private boolean autoRemove = false;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.triggers.Trigger trigger;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<info.nightscout.androidaps.plugins.general.automation.actions.Action> actions = null;
    private long lastRun = 0L;
    private final dagger.android.HasAndroidInjector injector = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    public final boolean getSystemAction() {
        return false;
    }
    
    public final void setSystemAction(boolean p0) {
    }
    
    public final boolean getReadOnly() {
        return false;
    }
    
    public final void setReadOnly(boolean p0) {
    }
    
    public final boolean getAutoRemove() {
        return false;
    }
    
    public final void setAutoRemove(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.Trigger getTrigger() {
        return null;
    }
    
    public final void setTrigger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.Trigger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.general.automation.actions.Action> getActions() {
        return null;
    }
    
    public final long getLastRun() {
        return 0L;
    }
    
    public final void setLastRun(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector getPreconditions() {
        return null;
    }
    
    public final boolean addAction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.actions.Action action) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toJSON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationEvent fromJSON(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    public final boolean shouldRun() {
        return false;
    }
    
    public AutomationEvent(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}