package info.nightscout.androidaps.plugins.general.wear;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0006\u0010\u0019\u001a\u00020\u0017J\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u001e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010 \u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010!\u001a\u00020\u0017J \u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "loopPlugin", "Ldagger/Lazy;", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/MainApp;Linfo/nightscout/androidaps/utils/FabricPrivacy;Ldagger/Lazy;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "onStart", "", "onStop", "openSettings", "requestActionConfirmation", "title", "", "message", "actionString", "requestChangeConfirmation", "requestNotificationCancel", "resendDataToWatch", "sendDataToWatch", "status", "", "basals", "bgValue", "app_fullRelease"})
@javax.inject.Singleton()
public final class WearPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.MainApp mainApp = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final dagger.Lazy<info.nightscout.androidaps.plugins.aps.loop.LoopPlugin> loopPlugin = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void sendDataToWatch(boolean status, boolean basals, boolean bgValue) {
    }
    
    public final void resendDataToWatch() {
    }
    
    public final void openSettings() {
    }
    
    public final void requestNotificationCancel(@org.jetbrains.annotations.Nullable()
    java.lang.String actionString) {
    }
    
    public final void requestActionConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String actionString) {
    }
    
    public final void requestChangeConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String actionString) {
    }
    
    @javax.inject.Inject()
    public WearPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp mainApp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<info.nightscout.androidaps.plugins.aps.loop.LoopPlugin> loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus) {
        super(null, null, null, null);
    }
}