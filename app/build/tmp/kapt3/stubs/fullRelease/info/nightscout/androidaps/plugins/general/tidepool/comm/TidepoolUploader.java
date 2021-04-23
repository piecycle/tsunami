package info.nightscout.androidaps.plugins.general.tidepool.comm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u0001:\u000223BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010 \u001a\u00020\u001cH\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020&J\u0006\u0010%\u001a\u00020\"J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010+\u001a\u00020\"H\u0002J\u0006\u0010,\u001a\u00020\"J\u001a\u0010-\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020&H\u0002J\u000e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020\"H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0018\u00010\u001eR\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "uploadChunk", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/UploadChunk;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/MainApp;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/general/tidepool/comm/UploadChunk;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/utils/DateUtil;)V", "connectionStatus", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader$ConnectionStatus;", "getConnectionStatus", "()Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader$ConnectionStatus;", "setConnectionStatus", "(Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader$ConnectionStatus;)V", "retrofit", "Lretrofit2/Retrofit;", "session", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/Session;", "wl", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "createSession", "deleteAllData", "", "deleteDataSet", "doLogin", "doUpload", "", "extendWakeLock", "ms", "", "getRetrofitInstance", "releaseWakeLock", "resetInstance", "startSession", "testLogin", "rootContext", "Landroid/content/Context;", "uploadNext", "Companion", "ConnectionStatus", "app_fullRelease"})
@javax.inject.Singleton()
public final class TidepoolUploader {
    private android.os.PowerManager.WakeLock wl;
    private retrofit2.Retrofit retrofit;
    private info.nightscout.androidaps.plugins.general.tidepool.comm.Session session;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader.ConnectionStatus connectionStatus = info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader.ConnectionStatus.DISCONNECTED;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.MainApp mainApp = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.general.tidepool.comm.UploadChunk uploadChunk = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    private static final java.lang.String INTEGRATION_BASE_URL = "https://int-api.tidepool.org";
    private static final java.lang.String PRODUCTION_BASE_URL = "https://api.tidepool.org";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERSION = "0.0.1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUMP_TYPE = "Tandem";
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader.ConnectionStatus getConnectionStatus() {
        return null;
    }
    
    public final void setConnectionStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader.ConnectionStatus p0) {
    }
    
    private final retrofit2.Retrofit getRetrofitInstance() {
        return null;
    }
    
    private final info.nightscout.androidaps.plugins.general.tidepool.comm.Session createSession() {
        return null;
    }
    
    public final void resetInstance() {
    }
    
    public final synchronized void doLogin(boolean doUpload) {
    }
    
    public final void testLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context rootContext) {
    }
    
    private final void startSession(info.nightscout.androidaps.plugins.general.tidepool.comm.Session session, boolean doUpload) {
    }
    
    public final synchronized void doUpload() {
    }
    
    private final void uploadNext() {
    }
    
    public final void deleteDataSet() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    public final void deleteAllData() {
    }
    
    private final synchronized void extendWakeLock(long ms) {
    }
    
    private final synchronized void releaseWakeLock() {
    }
    
    @javax.inject.Inject()
    public TidepoolUploader(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp mainApp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.comm.UploadChunk uploadChunk, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader$ConnectionStatus;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "FAILED", "app_fullRelease"})
    public static enum ConnectionStatus {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ CONNECTING /* = new CONNECTING() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */,
        /*public static final*/ FAILED /* = new FAILED() */;
        
        ConnectionStatus() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader$Companion;", "", "()V", "INTEGRATION_BASE_URL", "", "PRODUCTION_BASE_URL", "PUMP_TYPE", "VERSION", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}