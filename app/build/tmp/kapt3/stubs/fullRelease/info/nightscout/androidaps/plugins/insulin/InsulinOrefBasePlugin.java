package info.nightscout.androidaps.plugins.insulin;

import java.lang.System;

/**
 * Created by adrian on 13.08.2017.
 *
 * parameters are injected from child class
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010$\u001a\u00020\u000fH&J \u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0012\u0010\u001a\u001a\u00020\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0015\u00a8\u0006-"}, d2 = {"Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefBasePlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/InsulinInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "comment", "", "getComment", "()Ljava/lang/String;", "dia", "", "getDia", "()D", "lastWarned", "", "notificationPattern", "getNotificationPattern", "peak", "", "getPeak", "()I", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "userDefinedDia", "getUserDefinedDia", "commentStandardText", "iobCalcForTreatment", "Linfo/nightscout/androidaps/data/Iob;", "treatment", "Linfo/nightscout/androidaps/db/Treatment;", "time", "sendShortDiaNotification", "", "Companion", "app_fullRelease"})
public abstract class InsulinOrefBasePlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.InsulinInterface {
    private long lastWarned = 0L;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    public static final double MIN_DIA = 5.0;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.insulin.InsulinOrefBasePlugin.Companion Companion = null;
    
    @java.lang.Override()
    public double getDia() {
        return 0.0;
    }
    
    public void sendShortDiaNotification(double dia) {
    }
    
    private final java.lang.String getNotificationPattern() {
        return null;
    }
    
    public double getUserDefinedDia() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.Iob iobCalcForTreatment(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.Treatment treatment, long time, double dia) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getComment() {
        return null;
    }
    
    public abstract int getPeak();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String commentStandardText();
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public InsulinOrefBasePlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefBasePlugin$Companion;", "", "()V", "MIN_DIA", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}