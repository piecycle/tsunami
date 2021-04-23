package info.nightscout.androidaps.plugins.constraints.versionChecker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002#$B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020 H\u0002R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ConstraintsInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "versionCheckerUtils", "Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerUtils;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerUtils;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "gracePeriod", "Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin$GracePeriod;", "getGracePeriod", "()Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin$GracePeriod;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "applyMaxIOBConstraints", "Linfo/nightscout/androidaps/interfaces/Constraint;", "", "maxIob", "checkWarning", "", "isClosedLoopAllowed", "", "value", "isOldVersion", "", "shouldWarnAgain", "now", "Companion", "GracePeriod", "app_fullRelease"})
@javax.inject.Singleton()
public final class VersionCheckerPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ConstraintsInterface {
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.constraints.versionChecker.VersionCheckerUtils versionCheckerUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.constraints.versionChecker.VersionCheckerPlugin.Companion Companion = null;
    
    private final info.nightscout.androidaps.plugins.constraints.versionChecker.VersionCheckerPlugin.GracePeriod getGracePeriod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isClosedLoopAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    private final void checkWarning() {
    }
    
    private final boolean shouldWarnAgain(long now) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Double> applyMaxIOBConstraints(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Double> maxIob) {
        return null;
    }
    
    private final boolean isOldVersion(long gracePeriod) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    @javax.inject.Inject()
    public VersionCheckerPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.versionChecker.VersionCheckerUtils versionCheckerUtils, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin$GracePeriod;", "", "warning", "", "old", "veryOld", "(Ljava/lang/String;IJJJ)V", "getOld", "()J", "getVeryOld", "getWarning", "RELEASE", "RC", "app_fullRelease"})
    public static enum GracePeriod {
        /*public static final*/ RELEASE /* = new RELEASE(0L, 0L, 0L) */,
        /*public static final*/ RC /* = new RC(0L, 0L, 0L) */;
        private final long warning = 0L;
        private final long old = 0L;
        private final long veryOld = 0L;
        
        public final long getWarning() {
            return 0L;
        }
        
        public final long getOld() {
            return 0L;
        }
        
        public final long getVeryOld() {
            return 0L;
        }
        
        GracePeriod(long warning, long old, long veryOld) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin$Companion;", "", "()V", "WARN_EVERY", "", "getWARN_EVERY", "()J", "app_fullRelease"})
    public static final class Companion {
        
        private final long getWARN_EVERY() {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}