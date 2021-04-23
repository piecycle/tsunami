package info.nightscout.androidaps.plugins.constraints.signatureVerifier;

import java.lang.System;

/**
 * AndroidAPS is meant to be build by the user.
 * In case someone decides to leak a ready-to-use APK nonetheless, we can still disable it.
 * Self-compiled APKs with privately held certificates cannot and will not be disabled.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020$0&H\u0016J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0014J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u0011H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cJ\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020!H\u0002J\u0010\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u001dH\u0002J\u000e\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/signatureVerifier/SignatureVerifierPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ConstraintsInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "context", "Landroid/content/Context;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Landroid/content/Context;)V", "REVOKED_CERTS_URL", "", "UPDATE_INTERVAL", "", "lock", "", "map", "getMap", "()Ljava/lang/String;", "setMap", "(Ljava/lang/String;)V", "revokedCerts", "", "", "revokedCertsFile", "Ljava/io/File;", "downloadAndSaveRevokedCerts", "", "downloadRevokedCerts", "hasIllegalSignature", "", "isLoopInvocationAllowed", "Linfo/nightscout/androidaps/interfaces/Constraint;", "value", "loadLocalRevokedCerts", "onStart", "parseRevokedCertsFile", "file", "readCachedDownloadedRevokedCerts", "readInputStream", "inputStream", "Ljava/io/InputStream;", "readRevokedCertsInAssets", "saveRevokedCerts", "shortHashes", "shouldDownloadCerts", "showNotification", "singleCharMap", "array", "singleCharUnMap", "shortHash", "app_fullRelease"})
@javax.inject.Singleton()
public final class SignatureVerifierPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ConstraintsInterface {
    private final java.lang.String REVOKED_CERTS_URL = "https://raw.githubusercontent.com/nightscout/AndroidAPS/master/app/src/main/assets/revoked_certs.txt";
    private final long UPDATE_INTERVAL = 0L;
    private final java.lang.Object lock = null;
    private java.io.File revokedCertsFile;
    private java.util.List<byte[]> revokedCerts;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String map = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a7$%&/()=?,.-;:_<>|\u00b0^`\u00b4\\@\u20ac*\'#+~{}[]\u00bf\u00a1\u00e1\u00e9\u00ed\u00f3\u00fa\u00e0\u00e8\u00ec\u00f2\u00f9\u00f6\u00e4\u00fc`\u00c1\u00c9\u00cd\u00d3\u00da\u00c0\u00c8\u00cc\u00d2\u00d9\u00d6\u00c4\u00dc\u00df\u00c6\u00c7\u00ca\u00cb\u00ce\u00cf\u00d4\u0152\u00db\u0178\u00e6\u00e7\u00ea\u00eb\u00ee\u00ef\u00f4\u0153\u00fb\u00ff\u0106\u010c\u0110\u0160\u017d\u0107\u0111\u0161\u017e\u00f1\u0391\u0392\u0393\u0394\u0395\u0396\u0397\u0398\u0399\u039a\u039b\u039c\u039d\u039e\u039f\u03a0\u03a1\u03a2\u03a3\u03a4\u03a5\u03a6\u03a7\u03a8\u03a9\u03b1\u03b2\u03b3\u03b4\u03b5\u03b6\u03b7\u03b8\u03b9\u03ba\u03bb\u03bc\u03bd\u03be\u03bf\u03c0\u03c1\u03c2\u03c3\u03c4\u03c5\u03c6\u03c7\u03c8\u03c9\u03e8\u03e9\u03ea\u03eb\u03ec\u03ed\u03ee\u03ef\u03f0\u03f1\u03f2\u03f3\u03f4\u03f5\u03f6\u03f7\u03f8\u03f9\u03fa\u03fb\u03fc\u03fd\u03fe\u03ff\u0400\u0401\u0402\u0403\u0404\u0405\u0406\u0407\u0408\u0409\u040a\u040b\u040c\u040d\u040e\u040f\u0410\u0411\u0412\u0413\u0414\u0415\u0416\u0417";
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final android.content.Context context = null;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isLoopInvocationAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    private final void showNotification() {
    }
    
    private final boolean hasIllegalSignature() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> shortHashes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMap() {
        return null;
    }
    
    public final void setMap(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.lang.String singleCharMap(byte[] array) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String singleCharUnMap(@org.jetbrains.annotations.NotNull()
    java.lang.String shortHash) {
        return null;
    }
    
    private final boolean shouldDownloadCerts() {
        return false;
    }
    
    private final void downloadAndSaveRevokedCerts() throws java.io.IOException {
    }
    
    private final void loadLocalRevokedCerts() {
    }
    
    private final void saveRevokedCerts(java.lang.String revokedCerts) throws java.io.IOException {
    }
    
    private final java.lang.String downloadRevokedCerts() throws java.io.IOException {
        return null;
    }
    
    private final java.lang.String readInputStream(java.io.InputStream inputStream) throws java.io.IOException {
        return null;
    }
    
    private final java.lang.String readRevokedCertsInAssets() throws java.io.IOException {
        return null;
    }
    
    private final java.lang.String readCachedDownloadedRevokedCerts() throws java.io.IOException {
        return null;
    }
    
    private final java.util.List<byte[]> parseRevokedCertsFile(java.lang.String file) {
        return null;
    }
    
    @javax.inject.Inject()
    public SignatureVerifierPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, null);
    }
}