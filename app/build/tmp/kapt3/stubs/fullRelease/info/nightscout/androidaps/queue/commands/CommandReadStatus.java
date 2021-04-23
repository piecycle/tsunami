package info.nightscout.androidaps.queue.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/queue/commands/CommandReadStatus;", "Linfo/nightscout/androidaps/queue/commands/Command;", "injector", "Ldagger/android/HasAndroidInjector;", "reason", "", "callback", "Linfo/nightscout/androidaps/queue/Callback;", "(Ldagger/android/HasAndroidInjector;Ljava/lang/String;Linfo/nightscout/androidaps/queue/Callback;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "localAlertUtils", "Linfo/nightscout/androidaps/utils/LocalAlertUtils;", "getLocalAlertUtils", "()Linfo/nightscout/androidaps/utils/LocalAlertUtils;", "setLocalAlertUtils", "(Linfo/nightscout/androidaps/utils/LocalAlertUtils;)V", "getReason", "()Ljava/lang/String;", "execute", "", "status", "app_fullRelease"})
public final class CommandReadStatus extends info.nightscout.androidaps.queue.commands.Command {
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.LocalAlertUtils localAlertUtils;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.LocalAlertUtils getLocalAlertUtils() {
        return null;
    }
    
    public final void setLocalAlertUtils(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.LocalAlertUtils p0) {
    }
    
    @java.lang.Override()
    public void execute() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    public CommandReadStatus(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        super(null, null, null);
    }
}