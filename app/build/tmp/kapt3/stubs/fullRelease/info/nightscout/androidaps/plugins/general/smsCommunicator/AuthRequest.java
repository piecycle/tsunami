package info.nightscout.androidaps.plugins.general.smsCommunicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\t\u001a\u0002022\u0006\u00103\u001a\u00020\u0007J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u0007H\u0002R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u00066"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/AuthRequest;", "", "injector", "Ldagger/android/HasAndroidInjector;", "requester", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;", "requestText", "", "confirmCode", "action", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsAction;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;Ljava/lang/String;Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsAction;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "getAction", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsAction;", "getConfirmCode", "()Ljava/lang/String;", "setConfirmCode", "(Ljava/lang/String;)V", "date", "", "otp", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "getOtp", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "setOtp", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;)V", "processed", "", "getRequester", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;", "setRequester", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "smsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "getSmsCommunicatorPlugin", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "setSmsCommunicatorPlugin", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;)V", "", "codeReceived", "codeIsValid", "toValidate", "app_fullRelease"})
public final class AuthRequest {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword otp;
    private final long date = 0L;
    private boolean processed = false;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.smsCommunicator.Sms requester;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String confirmCode;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsAction action = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin getSmsCommunicatorPlugin() {
        return null;
    }
    
    public final void setSmsCommunicatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword getOtp() {
        return null;
    }
    
    public final void setOtp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword p0) {
    }
    
    private final boolean codeIsValid(java.lang.String toValidate) {
        return false;
    }
    
    public final void action(@org.jetbrains.annotations.NotNull()
    java.lang.String codeReceived) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.Sms getRequester() {
        return null;
    }
    
    public final void setRequester(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.Sms p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConfirmCode() {
        return null;
    }
    
    public final void setConfirmCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsAction getAction() {
        return null;
    }
    
    public AuthRequest(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.Sms requester, @org.jetbrains.annotations.NotNull()
    java.lang.String requestText, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmCode, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsAction action) {
        super();
    }
}