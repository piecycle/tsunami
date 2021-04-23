package info.nightscout.androidaps.plugins.constraints.dstHelper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/dstHelper/DstHelperPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ConstraintsInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;)V", "isLoopInvocationAllowed", "Linfo/nightscout/androidaps/interfaces/Constraint;", "", "value", "wasDST", "now", "Ljava/util/Calendar;", "willBeDST", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class DstHelperPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ConstraintsInterface {
    private info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    private info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    private info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    private info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin;
    private static final int DISABLE_TIME_FRAME_HOURS = -3;
    private static final int WARN_PRIOR_TIME_FRAME_HOURS = 12;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.constraints.dstHelper.DstHelperPlugin.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isLoopInvocationAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    public final boolean wasDST(@org.jetbrains.annotations.NotNull()
    java.util.Calendar now) {
        return false;
    }
    
    public final boolean willBeDST(@org.jetbrains.annotations.NotNull()
    java.util.Calendar now) {
        return false;
    }
    
    @javax.inject.Inject()
    public DstHelperPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/dstHelper/DstHelperPlugin$Companion;", "", "()V", "DISABLE_TIME_FRAME_HOURS", "", "WARN_PRIOR_TIME_FRAME_HOURS", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}