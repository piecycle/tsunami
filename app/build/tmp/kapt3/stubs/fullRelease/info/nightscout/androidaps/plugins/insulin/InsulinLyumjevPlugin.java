package info.nightscout.androidaps.plugins.insulin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Linfo/nightscout/androidaps/plugins/insulin/InsulinLyumjevPlugin;", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefBasePlugin;", "injector", "Ldagger/android/HasAndroidInjector;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "friendlyName", "", "getFriendlyName", "()Ljava/lang/String;", "id", "Linfo/nightscout/androidaps/interfaces/InsulinInterface$InsulinType;", "getId", "()Linfo/nightscout/androidaps/interfaces/InsulinInterface$InsulinType;", "peak", "", "getPeak", "()I", "applyConfiguration", "", "configuration", "Lorg/json/JSONObject;", "commentStandardText", "app_fullRelease"})
@javax.inject.Singleton()
public final class InsulinLyumjevPlugin extends info.nightscout.androidaps.plugins.insulin.InsulinOrefBasePlugin {
    private final int peak = 45;
    
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
    public InsulinLyumjevPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super(null, null, null, null, null);
    }
}