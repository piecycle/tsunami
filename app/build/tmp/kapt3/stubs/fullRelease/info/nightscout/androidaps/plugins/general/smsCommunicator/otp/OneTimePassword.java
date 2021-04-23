package info.nightscout.androidaps.plugins.general.smsCommunicator.otp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\nJ\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\b\u0010\u001b\u001a\u0004\u0018\u00010\nR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "key", "Ljavax/crypto/SecretKey;", "pin", "", "totp", "Lcom/eatthepath/otp/HmacOneTimePasswordGenerator;", "checkOTP", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePasswordValidationResult;", "otp", "configure", "", "ensureKey", "forceNewKey", "", "generateOneTimePassword", "counter", "", "isEnabled", "name", "provisioningSecret", "provisioningURI", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class OneTimePassword {
    private javax.crypto.SecretKey key;
    private java.lang.String pin = "";
    private final com.eatthepath.otp.HmacOneTimePasswordGenerator totp = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private static info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword instance;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword.Companion Companion = null;
    
    /**
     * If OTP Authenticator support is enabled by user
     */
    public final boolean isEnabled() {
        return false;
    }
    
    /**
     * Name of master device (target of OTP)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String name() {
        return null;
    }
    
    /**
     * Make sure if private key for TOTP is generated, creating it when necessary or requested
     */
    public final void ensureKey(boolean forceNewKey) {
    }
    
    private final void configure() {
    }
    
    private final java.lang.String generateOneTimePassword(long counter) {
        return null;
    }
    
    /**
     * Check if given OTP+PIN is valid
     */
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePasswordValidationResult checkOTP(@org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
        return null;
    }
    
    /**
     * Return URI used to provision Authenticator apps
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String provisioningURI() {
        return null;
    }
    
    /**
     * Return secret used to provision Authenticator apps, in Base32 format
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String provisioningSecret() {
        return null;
    }
    
    @javax.inject.Inject()
    public OneTimePassword(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword getInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword$Companion;", "", "()V", "instance", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "getInstance", "app_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}