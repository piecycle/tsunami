package info.nightscout.androidaps.utils.stats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&H\u0002J\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020$0&2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020+J\u001e\u0010,\u001a\u00020-2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&2\u0006\u0010.\u001a\u00020/H\u0002R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00060"}, d2 = {"Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "uploadQueue", "Linfo/nightscout/androidaps/plugins/general/nsclient/UploadQueue;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/MainApp;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;Linfo/nightscout/androidaps/utils/DateUtil;Linfo/nightscout/androidaps/plugins/general/nsclient/UploadQueue;)V", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "averageTDD", "Linfo/nightscout/androidaps/db/TDD;", "tdds", "Landroid/util/LongSparseArray;", "calculate", "days", "", "stats", "Landroid/text/Spanned;", "toText", "", "includeCarbs", "", "app_fullRelease"})
public final class TddCalculator extends info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin {
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.MainApp mainApp = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.LongSparseArray<info.nightscout.androidaps.db.TDD> calculate(long days) {
        return null;
    }
    
    private final info.nightscout.androidaps.db.TDD averageTDD(android.util.LongSparseArray<info.nightscout.androidaps.db.TDD> tdds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned stats() {
        return null;
    }
    
    private final java.lang.String toText(android.util.LongSparseArray<info.nightscout.androidaps.db.TDD> tdds, boolean includeCarbs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.MainApp getMainApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    @javax.inject.Inject()
    public TddCalculator(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp mainApp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.UploadQueue uploadQueue) {
        super(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}