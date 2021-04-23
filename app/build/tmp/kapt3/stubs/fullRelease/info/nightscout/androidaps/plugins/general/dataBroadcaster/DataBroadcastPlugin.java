package info.nightscout.androidaps.plugins.general.dataBroadcaster;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020$H\u0014J\b\u0010+\u001a\u00020$H\u0014J\u0010\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/dataBroadcaster/DataBroadcastPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "nsDeviceStatus", "Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSDeviceStatus;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "receiverStatusStore", "Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "config", "Linfo/nightscout/androidaps/Config;", "databaseHelper", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/utils/DefaultValueHelper;Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSDeviceStatus;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;Linfo/nightscout/androidaps/Config;Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "basalStatus", "", "bundle", "Landroid/os/Bundle;", "bgStatus", "iobCob", "loopStatus", "onStart", "onStop", "pumpStatus", "sendBroadcast", "intent", "Landroid/content/Intent;", "sendData", "event", "Linfo/nightscout/androidaps/events/Event;", "app_fullRelease"})
@javax.inject.Singleton()
public final class DataBroadcastPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus nsDeviceStatus = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore;
    private final info.nightscout.androidaps.Config config = null;
    private final info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper = null;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void sendData(info.nightscout.androidaps.events.Event event) {
    }
    
    private final void bgStatus(android.os.Bundle bundle) {
    }
    
    private final void iobCob(android.os.Bundle bundle) {
    }
    
    private final void loopStatus(android.os.Bundle bundle) {
    }
    
    private final void basalStatus(android.os.Bundle bundle) {
    }
    
    private final void pumpStatus(android.os.Bundle bundle) {
    }
    
    private final void sendBroadcast(android.content.Intent intent) {
    }
    
    @javax.inject.Inject()
    public DataBroadcastPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus nsDeviceStatus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper) {
        super(null, null, null, null);
    }
}