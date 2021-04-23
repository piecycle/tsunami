package info.nightscout.androidaps.setupwizard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u00a2\u0006\u0002\u0010&J\u0012\u0010H\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010.H\u0002J\f\u0010J\u001a\b\u0012\u0004\u0012\u00020.0KJ\b\u0010L\u001a\u00020MH\u0002J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020OH\u0002J\b\u0010Q\u001a\u00020OH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020.0GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/SWDefinition;", "", "injector", "Ldagger/android/HasAndroidInjector;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "context", "Landroid/content/Context;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "localProfilePlugin", "Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "objectivesPlugin", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;", "configBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "nsClientPlugin", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "nsProfilePlugin", "Linfo/nightscout/androidaps/plugins/profile/ns/NSProfilePlugin;", "importExportPrefs", "Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;", "androidPermission", "Linfo/nightscout/androidaps/utils/AndroidPermission;", "cryptoUtil", "Linfo/nightscout/androidaps/utils/CryptoUtil;", "config", "Linfo/nightscout/androidaps/Config;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;Linfo/nightscout/androidaps/plugins/profile/ns/NSProfilePlugin;Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;Linfo/nightscout/androidaps/utils/AndroidPermission;Linfo/nightscout/androidaps/utils/CryptoUtil;Linfo/nightscout/androidaps/Config;)V", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "setActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "displaySettings", "Linfo/nightscout/androidaps/setupwizard/SWScreen;", "getScreenObjectives", "screenAge", "screenAps", "screenApsMode", "screenBgSource", "screenEula", "screenImport", "screenInsulin", "screenLocalProfile", "screenLoop", "screenMasterPassword", "screenNsClient", "screenNsProfile", "screenPatientName", "screenPermissionBattery", "screenPermissionBt", "screenPermissionStore", "screenProfile", "screenProfileSwitch", "screenPump", "screenSensitivity", "screenSetupWizard", "screenUnits", "screens", "", "add", "newScreen", "getScreens", "", "isPumpInitialized", "", "swDefinitionFull", "", "swDefinitionNSClient", "swDefinitionPumpControl", "app_fullRelease"})
@javax.inject.Singleton()
public final class SWDefinition {
    public androidx.appcompat.app.AppCompatActivity activity;
    private final java.util.List<info.nightscout.androidaps.setupwizard.SWScreen> screens = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenSetupWizard = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenEula = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenUnits = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen displaySettings = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenPermissionBattery = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenPermissionBt = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenPermissionStore = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenImport = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenNsClient = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenPatientName = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenMasterPassword = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenAge = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenInsulin = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenBgSource = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenProfile = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenNsProfile = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenLocalProfile = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenProfileSwitch = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenPump = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenAps = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenApsMode = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenLoop = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen screenSensitivity = null;
    private final info.nightscout.androidaps.setupwizard.SWScreen getScreenObjectives = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin localProfilePlugin = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue = null;
    private final info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin objectivesPlugin = null;
    private final info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin nsClientPlugin = null;
    private final info.nightscout.androidaps.plugins.profile.ns.NSProfilePlugin nsProfilePlugin = null;
    private final info.nightscout.androidaps.interfaces.ImportExportPrefsInterface importExportPrefs = null;
    private final info.nightscout.androidaps.utils.AndroidPermission androidPermission = null;
    private final info.nightscout.androidaps.utils.CryptoUtil cryptoUtil = null;
    private final info.nightscout.androidaps.Config config = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.setupwizard.SWScreen> getScreens() {
        return null;
    }
    
    private final info.nightscout.androidaps.setupwizard.SWDefinition add(info.nightscout.androidaps.setupwizard.SWScreen newScreen) {
        return null;
    }
    
    private final boolean isPumpInitialized() {
        return false;
    }
    
    private final void swDefinitionFull() {
    }
    
    private final void swDefinitionPumpControl() {
    }
    
    private final void swDefinitionNSClient() {
    }
    
    @javax.inject.Inject()
    public SWDefinition(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin localProfilePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin objectivesPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin nsClientPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.ns.NSProfilePlugin nsProfilePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ImportExportPrefsInterface importExportPrefs, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.AndroidPermission androidPermission, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.CryptoUtil cryptoUtil, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}