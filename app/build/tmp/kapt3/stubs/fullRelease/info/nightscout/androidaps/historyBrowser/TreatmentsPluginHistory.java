package info.nightscout.androidaps.historyBrowser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0014\u00a8\u0006\u001d"}, d2 = {"Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "uploadQueue", "Linfo/nightscout/androidaps/plugins/general/nsclient/UploadQueue;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/utils/DateUtil;Linfo/nightscout/androidaps/plugins/general/nsclient/UploadQueue;)V", "onStart", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class TreatmentsPluginHistory extends info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin {
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @javax.inject.Inject()
    public TreatmentsPluginHistory(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.UploadQueue uploadQueue) {
        super(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}