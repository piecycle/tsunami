package info.nightscout.androidaps.plugins.general.openhumans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00a0\u00012\u00020\u0001:\u0004\u00a0\u0001\u00a1\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020GH\u0002JL\u0010I\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010K2\b\u0010P\u001a\u0004\u0018\u00010K2\b\u0010Q\u001a\u0004\u0018\u00010K2\b\u0010R\u001a\u0004\u0018\u00010KJ\u0017\u0010S\u001a\u0004\u0018\u00010G2\b\u0010T\u001a\u0004\u0018\u00010U\u00a2\u0006\u0002\u0010VJ\u001a\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020Y2\b\b\u0002\u0010Z\u001a\u00020!H\u0007J\u001a\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020]2\b\b\u0002\u0010Z\u001a\u00020!H\u0007J\u001a\u0010^\u001a\u00020G2\u0006\u0010_\u001a\u00020`2\b\b\u0002\u0010Z\u001a\u00020!H\u0007J\\\u0010a\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010K2\b\u0010P\u001a\u0004\u0018\u00010K2\b\u0010Q\u001a\u0004\u0018\u00010K2\u0006\u0010b\u001a\u00020!2\u0006\u0010c\u001a\u00020!2\b\u0010R\u001a\u0004\u0018\u00010KJ#\u0010d\u001a\u0004\u0018\u00010G2\b\u0010e\u001a\u0004\u0018\u00010f2\b\b\u0002\u0010Z\u001a\u00020!H\u0007\u00a2\u0006\u0002\u0010gJ#\u0010h\u001a\u0004\u0018\u00010G2\b\u0010i\u001a\u0004\u0018\u00010j2\b\b\u0002\u0010Z\u001a\u00020!H\u0007\u00a2\u0006\u0002\u0010kJ\u000e\u0010l\u001a\u00020G2\u0006\u0010m\u001a\u00020nJ#\u0010o\u001a\u0004\u0018\u00010G2\b\u0010p\u001a\u0004\u0018\u00010q2\b\b\u0002\u0010Z\u001a\u00020!H\u0007\u00a2\u0006\u0002\u0010rJ%\u0010s\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u00010u0u0t2\b\u0010v\u001a\u0004\u0018\u00010wH\u0002\u00a2\u0006\u0002\u0010xJ\b\u0010y\u001a\u00020GH\u0002J3\u0010z\u001a\u00020G2\u0006\u0010{\u001a\u0002002\b\b\u0002\u0010|\u001a\u00020<2\u0017\u0010}\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020G0~\u00a2\u0006\u0002\b\u007fH\u0002J\u0011\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u000200J\u0007\u0010\u0083\u0001\u001a\u00020GJ\u0013\u0010\u0084\u0001\u001a\u00020G2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\t\u0010\u0087\u0001\u001a\u00020GH\u0014J\t\u0010\u0088\u0001\u001a\u00020GH\u0014J\u0017\u0010\u0089\u0001\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u000100000tH\u0002J\u0013\u0010\u008a\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008b\u0001\u001a\u00020wH\u0002J\u0012\u0010\u008c\u0001\u001a\u00020G2\u0007\u0010\u008d\u0001\u001a\u00020!H\u0002J\t\u0010\u008e\u0001\u001a\u00020GH\u0002J)\u0010\u008f\u0001\u001a\u00020G2\u000b\b\u0002\u0010\u0090\u0001\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010wH\u0002\u00a2\u0006\u0003\u0010\u0092\u0001J\t\u0010\u0093\u0001\u001a\u00020GH\u0002J\t\u0010\u0094\u0001\u001a\u00020GH\u0002J\u001a\u0010\u0095\u0001\u001a\u00030\u0081\u00012\b\u0010v\u001a\u0004\u0018\u00010wH\u0002\u00a2\u0006\u0003\u0010\u0096\u0001J\b\u0010\u0097\u0001\u001a\u00030\u0081\u0001J\u001c\u0010\u0098\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0099\u0001\u001a\u0002002\u0007\u0010\u0095\u0001\u001a\u00020uH\u0002J\u000e\u0010\u009a\u0001\u001a\u000200*\u00030\u009b\u0001H\u0002J!\u0010\u009c\u0001\u001a\u00020G*\u00030\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u0002002\b\u0010\u009f\u0001\u001a\u00030\u009b\u0001H\u0002R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010\'\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010&8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00101\u001a\u0004\u0018\u0001002\b\u0010 \u001a\u0004\u0018\u0001008F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R$\u0010=\u001a\u00020<2\u0006\u0010 \u001a\u00020<8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u0012 E*\b\u0018\u00010CR\u00020D0CR\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00a2\u0001"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "context", "Landroid/content/Context;", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Landroid/content/Context;Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;)V", "FILE_NAME_DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "getFILE_NAME_DATE_FORMAT$annotations", "()V", "HEX_DIGITS", "", "getHEX_DIGITS$annotations", "appId", "Ljava/util/UUID;", "getAppId", "()Ljava/util/UUID;", "getContext", "()Landroid/content/Context;", "copyDisposable", "Lio/reactivex/disposables/Disposable;", "value", "", "isSetup", "()Z", "setSetup", "(Z)V", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OAuthTokens;", "oAuthTokens", "getOAuthTokens", "()Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OAuthTokens;", "setOAuthTokens", "(Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OAuthTokens;)V", "openHumansAPI", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI;", "preferenceChangeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "", "projectMemberId", "getProjectMemberId", "()Ljava/lang/String;", "setProjectMemberId", "(Ljava/lang/String;)V", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getTreatmentsPlugin", "()Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "", "uploadCounter", "getUploadCounter", "()I", "setUploadCounter", "(I)V", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "kotlin.jvm.PlatformType", "cancelWorker", "", "copyExistingDataToQueue", "enqueueAMAData", "profile", "Lorg/json/JSONObject;", "glucoseStatus", "iobData", "Lorg/json/JSONArray;", "mealData", "currentTemp", "autosensData", "result", "enqueueBGReading", "bgReading", "Linfo/nightscout/androidaps/db/BgReading;", "(Linfo/nightscout/androidaps/db/BgReading;)Lkotlin/Unit;", "enqueueCareportalEvent", "careportalEvent", "Linfo/nightscout/androidaps/db/CareportalEvent;", "deleted", "enqueueExtendedBolus", "extendedBolus", "Linfo/nightscout/androidaps/db/ExtendedBolus;", "enqueueProfileSwitch", "profileSwitch", "Linfo/nightscout/androidaps/db/ProfileSwitch;", "enqueueSMBData", "smbAllowed", "smbAlwaysAllowed", "enqueueTempTarget", "tempTarget", "Linfo/nightscout/androidaps/db/TempTarget;", "(Linfo/nightscout/androidaps/db/TempTarget;Z)Lkotlin/Unit;", "enqueueTemporaryBasal", "temporaryBasal", "Linfo/nightscout/androidaps/db/TemporaryBasal;", "(Linfo/nightscout/androidaps/db/TemporaryBasal;Z)Lkotlin/Unit;", "enqueueTotalDailyDose", "tdd", "Linfo/nightscout/androidaps/db/TDD;", "enqueueTreatment", "treatment", "Linfo/nightscout/androidaps/db/Treatment;", "(Linfo/nightscout/androidaps/db/Treatment;Z)Lkotlin/Unit;", "gatherData", "Lio/reactivex/Single;", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader$UploadData;", "maxEntries", "", "(Ljava/lang/Long;)Lio/reactivex/Single;", "handleSignOut", "insertQueueItem", "file", "structureVersion", "generator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "login", "Lio/reactivex/Completable;", "authCode", "logout", "onSharedPreferenceChanged", "event", "Linfo/nightscout/androidaps/events/EventPreferenceChange;", "onStart", "onStop", "refreshAccessTokensIfNeeded", "removeUploadedEntriesFromQueue", "highestId", "scheduleWorker", "replace", "setupNotificationChannel", "showOngoingNotification", "maxProgress", "currentProgress", "(Ljava/lang/Long;Ljava/lang/Long;)V", "showSetupFailedNotification", "showSetupFinishedNotification", "uploadData", "(Ljava/lang/Long;)Lio/reactivex/Completable;", "uploadDataSegmentally", "uploadFile", "accessToken", "toHexString", "", "writeFile", "Ljava/util/zip/ZipOutputStream;", "name", "bytes", "Companion", "UploadData", "app_fullRelease"})
@javax.inject.Singleton()
public final class OpenHumansUploader extends info.nightscout.androidaps.interfaces.PluginBase {
    private final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI openHumansAPI = null;
    private final java.text.SimpleDateFormat FILE_NAME_DATE_FORMAT = null;
    private io.reactivex.disposables.Disposable copyDisposable;
    private final android.os.PowerManager.WakeLock wakeLock = null;
    private final io.reactivex.disposables.CompositeDisposable preferenceChangeDisposable = null;
    private final char[] HEX_DIGITS = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin = null;
    private static final java.lang.String OPEN_HUMANS_URL = "https://www.openhumans.org";
    private static final java.lang.String CLIENT_ID = "oie6DvnaEOagTxSoD6BukkLPwDhVr6cMlN74Ihz1";
    private static final java.lang.String CLIENT_SECRET = "jR0N8pkH1jOwtozHc7CsB1UPcJzFN95ldHcK4VGYIApecr8zGJox0v06xLwPLMASScngT12aIaIHXAVCJeKquEXAWG1XekZdbubSpccgNiQBmuVmIF8nc1xSKSNJltCf";
    private static final java.lang.String REDIRECT_URL = "androidaps://setup-openhumans";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_URL = "https://www.openhumans.org/direct-sharing/projects/oauth2/authorize/?client_id=oie6DvnaEOagTxSoD6BukkLPwDhVr6cMlN74Ihz1&response_type=code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME = "Open Humans";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL = "OpenHumans";
    private static final int COPY_NOTIFICATION_ID = 3122;
    private static final int FAILURE_NOTIFICATION_ID = 3123;
    private static final int SUCCESS_NOTIFICATION_ID = 3124;
    private static final int SIGNED_OUT_NOTIFICATION_ID = 3125;
    public static final int UPLOAD_NOTIFICATION_ID = 3126;
    private static final long UPLOAD_SEGMENT_SIZE = 10000L;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader.Companion Companion = null;
    
    @kotlin.Suppress(names = {"PrivatePropertyName"})
    @java.lang.Deprecated()
    private static void getFILE_NAME_DATE_FORMAT$annotations() {
    }
    
    private final boolean isSetup() {
        return false;
    }
    
    private final void setSetup(boolean value) {
    }
    
    private final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens getOAuthTokens() {
        return null;
    }
    
    private final void setOAuthTokens(info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProjectMemberId() {
        return null;
    }
    
    private final void setProjectMemberId(java.lang.String value) {
    }
    
    private final int getUploadCounter() {
        return 0;
    }
    
    private final void setUploadCounter(int value) {
    }
    
    private final java.util.UUID getAppId() {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueBGReading(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.BgReading bgReading) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTreatment(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.Treatment treatment, boolean deleted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTreatment(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.Treatment treatment) {
        return null;
    }
    
    public final void enqueueCareportalEvent(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.CareportalEvent careportalEvent, boolean deleted) {
    }
    
    public final void enqueueCareportalEvent(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.CareportalEvent careportalEvent) {
    }
    
    public final void enqueueExtendedBolus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ExtendedBolus extendedBolus, boolean deleted) {
    }
    
    public final void enqueueExtendedBolus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ExtendedBolus extendedBolus) {
    }
    
    public final void enqueueProfileSwitch(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ProfileSwitch profileSwitch, boolean deleted) {
    }
    
    public final void enqueueProfileSwitch(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ProfileSwitch profileSwitch) {
    }
    
    public final void enqueueTotalDailyDose(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.TDD tdd) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTemporaryBasal(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TemporaryBasal temporaryBasal, boolean deleted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTemporaryBasal(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TemporaryBasal temporaryBasal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTempTarget(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget, boolean deleted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit enqueueTempTarget(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget) {
        return null;
    }
    
    public final void enqueueSMBData(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject profile, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject glucoseStatus, @org.jetbrains.annotations.Nullable()
    org.json.JSONArray iobData, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject mealData, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject currentTemp, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject autosensData, boolean smbAllowed, boolean smbAlwaysAllowed, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject result) {
    }
    
    public final void enqueueAMAData(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject profile, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject glucoseStatus, @org.jetbrains.annotations.Nullable()
    org.json.JSONArray iobData, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject mealData, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject currentTemp, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject autosensData, @org.jetbrains.annotations.Nullable()
    org.json.JSONObject result) {
    }
    
    private final void insertQueueItem(java.lang.String file, int structureVersion, kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> generator) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable login(@org.jetbrains.annotations.NotNull()
    java.lang.String authCode) {
        return null;
    }
    
    public final void logout() {
    }
    
    private final void copyExistingDataToQueue() {
    }
    
    private final void showOngoingNotification(java.lang.Long maxProgress, java.lang.Long currentProgress) {
    }
    
    private final void showSetupFinishedNotification() {
    }
    
    private final void showSetupFailedNotification() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadDataSegmentally() {
        return null;
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final io.reactivex.Completable uploadData(java.lang.Long maxEntries) {
        return null;
    }
    
    private final io.reactivex.Completable uploadFile(java.lang.String accessToken, info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader.UploadData uploadData) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.String> refreshAccessTokensIfNeeded() {
        return null;
    }
    
    private final io.reactivex.Single<info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader.UploadData> gatherData(java.lang.Long maxEntries) {
        return null;
    }
    
    private final void writeFile(java.util.zip.ZipOutputStream $this$writeFile, java.lang.String name, byte[] bytes) {
    }
    
    private final io.reactivex.Completable removeUploadedEntriesFromQueue(long highestId) {
        return null;
    }
    
    private final void handleSignOut() {
    }
    
    private final void cancelWorker() {
    }
    
    private final void scheduleWorker(boolean replace) {
    }
    
    private final void setupNotificationChannel() {
    }
    
    @kotlin.Suppress(names = {"PrivatePropertyName"})
    @java.lang.Deprecated()
    private static void getHEX_DIGITS$annotations() {
    }
    
    private final java.lang.String toHexString(byte[] $this$toHexString) {
        return null;
    }
    
    private final void onSharedPreferenceChanged(info.nightscout.androidaps.events.EventPreferenceChange event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin getTreatmentsPlugin() {
        return null;
    }
    
    @javax.inject.Inject()
    public OpenHumansUploader(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader$UploadData;", "", "fileName", "", "metadata", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;", "content", "", "highestQueueId", "", "(Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;[BLjava/lang/Long;)V", "getContent", "()[B", "getFileName", "()Ljava/lang/String;", "getHighestQueueId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMetadata", "()Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;", "app_fullRelease"})
    static final class UploadData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fileName = null;
        @org.jetbrains.annotations.NotNull()
        private final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.FileMetadata metadata = null;
        @org.jetbrains.annotations.NotNull()
        private final byte[] content = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long highestQueueId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.FileMetadata getMetadata() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getHighestQueueId() {
            return null;
        }
        
        public UploadData(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.FileMetadata metadata, @org.jetbrains.annotations.NotNull()
        byte[] content, @org.jetbrains.annotations.Nullable()
        java.lang.Long highestQueueId) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader$Companion;", "", "()V", "AUTH_URL", "", "CLIENT_ID", "CLIENT_SECRET", "COPY_NOTIFICATION_ID", "", "FAILURE_NOTIFICATION_ID", "NOTIFICATION_CHANNEL", "OPEN_HUMANS_URL", "REDIRECT_URL", "SIGNED_OUT_NOTIFICATION_ID", "SUCCESS_NOTIFICATION_ID", "UPLOAD_NOTIFICATION_ID", "UPLOAD_SEGMENT_SIZE", "", "WORK_NAME", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}