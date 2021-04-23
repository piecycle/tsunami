package info.nightscout.androidaps.plugins.general.persistentNotification;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020&H\u0014J\b\u0010(\u001a\u00020&H\u0014J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/persistentNotification/PersistentNotificationPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "activePlugins", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "context", "Landroid/content/Context;", "notificationHolder", "Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;", "dummyServiceHelper", "Linfo/nightscout/androidaps/plugins/general/persistentNotification/DummyServiceHelper;", "iconsProvider", "Linfo/nightscout/androidaps/utils/resources/IconsProvider;", "databaseHelper", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;Linfo/nightscout/androidaps/plugins/general/persistentNotification/DummyServiceHelper;Linfo/nightscout/androidaps/utils/resources/IconsProvider;Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;)V", "CONVERSATION_ID", "", "EXTRA_VOICE_REPLY", "PACKAGE", "READ_ACTION", "REPLY_ACTION", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "createNotificationChannel", "", "onStart", "onStop", "triggerNotificationUpdate", "updateNotification", "app_fullRelease"})
@javax.inject.Singleton()
public final class PersistentNotificationPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private final java.lang.String PACKAGE = "info.nightscout";
    private final java.lang.String READ_ACTION = "info.nightscout.androidaps.ACTION_MESSAGE_READ";
    private final java.lang.String REPLY_ACTION = "info.nightscout.androidaps.ACTION_MESSAGE_REPLY";
    private final java.lang.String CONVERSATION_ID = "conversation_id";
    private final java.lang.String EXTRA_VOICE_REPLY = "extra_voice_reply";
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugins = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.androidNotification.NotificationHolder notificationHolder = null;
    private final info.nightscout.androidaps.plugins.general.persistentNotification.DummyServiceHelper dummyServiceHelper = null;
    private final info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider = null;
    private final info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper = null;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void createNotificationChannel() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void triggerNotificationUpdate() {
    }
    
    private final void updateNotification() {
    }
    
    @javax.inject.Inject()
    public PersistentNotificationPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugins, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.androidNotification.NotificationHolder notificationHolder, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.persistentNotification.DummyServiceHelper dummyServiceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper) {
        super(null, null, null, null);
    }
}