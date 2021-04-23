package info.nightscout.androidaps.queue.commands;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/queue/commands/CommandTempBasalPercent;", "Linfo/nightscout/androidaps/queue/commands/Command;", "injector", "Ldagger/android/HasAndroidInjector;", "percent", "", "durationInMinutes", "enforceNew", "", "profile", "Linfo/nightscout/androidaps/data/Profile;", "callback", "Linfo/nightscout/androidaps/queue/Callback;", "(Ldagger/android/HasAndroidInjector;IIZLinfo/nightscout/androidaps/data/Profile;Linfo/nightscout/androidaps/queue/Callback;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "execute", "", "status", "", "app_fullRelease"})
public final class CommandTempBasalPercent extends info.nightscout.androidaps.queue.commands.Command {
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    private final int percent = 0;
    private final int durationInMinutes = 0;
    private final boolean enforceNew = false;
    private final info.nightscout.androidaps.data.Profile profile = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @java.lang.Override()
    public void execute() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String status() {
        return null;
    }
    
    public CommandTempBasalPercent(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, int percent, int durationInMinutes, boolean enforceNew, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        super(null, null, null);
    }
}