package info.nightscout.androidaps.plugins.insulin;

import java.lang.System;

/**
 * Created by adrian on 14/08/17.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin;", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefBasePlugin;", "injector", "Ldagger/android/HasAndroidInjector;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "friendlyName", "", "getFriendlyName", "()Ljava/lang/String;", "id", "Linfo/nightscout/androidaps/interfaces/InsulinInterface$InsulinType;", "getId", "()Linfo/nightscout/androidaps/interfaces/InsulinInterface$InsulinType;", "peak", "", "getPeak", "()I", "applyConfiguration", "", "configuration", "Lorg/json/JSONObject;", "commentStandardText", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class InsulinOrefFreePeakPlugin extends info.nightscout.androidaps.plugins.insulin.InsulinOrefBasePlugin {
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private static final int DEFAULT_PEAK = 75;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.insulin.InsulinOrefFreePeakPlugin.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.InsulinInterface.InsulinType getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFriendlyName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.json.JSONObject configuration() {
        return null;
    }
    
    @java.lang.Override()
    public void applyConfiguration(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject configuration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String commentStandardText() {
        return null;
    }
    
    @java.lang.Override()
    public int getPeak() {
        return 0;
    }
    
    @javax.inject.Inject()
    public InsulinOrefFreePeakPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super(null, null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin$Companion;", "", "()V", "DEFAULT_PEAK", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}