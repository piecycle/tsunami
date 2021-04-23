package info.nightscout.androidaps.plugins.general.smsCommunicator.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\u0006\u0010 \u001a\u00020\u001cR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/activities/SmsCommunicatorOtpActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "otp", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "getOtp", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "setOtp", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "smsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "getSmsCommunicatorPlugin", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "setSmsCommunicatorPlugin", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "updateGui", "app_fullRelease"})
public final class SmsCommunicatorOtpActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword otp;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin getSmsCommunicatorPlugin() {
        return null;
    }
    
    public final void setSmsCommunicatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword getOtp() {
        return null;
    }
    
    public final void setOtp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected synchronized void onResume() {
    }
    
    public final void updateGui() {
    }
    
    public SmsCommunicatorOtpActivity() {
        super();
    }
}