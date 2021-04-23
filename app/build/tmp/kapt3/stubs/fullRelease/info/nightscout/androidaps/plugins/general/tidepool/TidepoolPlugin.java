package info.nightscout.androidaps.plugins.general.tidepool;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001dH\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0014J\b\u0010)\u001a\u00020%H\u0014J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0016J\u0006\u0010-\u001a\u00020%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/TidepoolPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "context", "Landroid/content/Context;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "tidepoolUploader", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader;", "uploadChunk", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/UploadChunk;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rateLimit", "Linfo/nightscout/androidaps/plugins/general/tidepool/utils/RateLimit;", "receiverStatusStore", "Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolUploader;Linfo/nightscout/androidaps/plugins/general/tidepool/comm/UploadChunk;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/general/tidepool/utils/RateLimit;Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "listLog", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/tidepool/events/EventTidepoolStatus;", "textLog", "Landroid/text/Spanned;", "getTextLog", "()Landroid/text/Spanned;", "setTextLog", "(Landroid/text/Spanned;)V", "addToLog", "", "ev", "doUpload", "onStart", "onStop", "preprocessPreferences", "preferenceFragment", "Landroidx/preference/PreferenceFragmentCompat;", "updateLog", "app_fullRelease"})
@javax.inject.Singleton()
public final class TidepoolPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private io.reactivex.disposables.CompositeDisposable disposable;
    private final java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.events.EventTidepoolStatus> listLog = null;
    @org.jetbrains.annotations.NotNull()
    private android.text.Spanned textLog;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader tidepoolUploader = null;
    private final info.nightscout.androidaps.plugins.general.tidepool.comm.UploadChunk uploadChunk = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.general.tidepool.utils.RateLimit rateLimit = null;
    private final info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned getTextLog() {
        return null;
    }
    
    public final void setTextLog(@org.jetbrains.annotations.NotNull()
    android.text.Spanned p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void preprocessPreferences(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat preferenceFragment) {
    }
    
    private final void doUpload() {
    }
    
    private final synchronized void addToLog(info.nightscout.androidaps.plugins.general.tidepool.events.EventTidepoolStatus ev) {
    }
    
    public final synchronized void updateLog() {
    }
    
    @javax.inject.Inject()
    public TidepoolPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolUploader tidepoolUploader, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.comm.UploadChunk uploadChunk, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.utils.RateLimit rateLimit, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore) {
        super(null, null, null, null);
    }
}