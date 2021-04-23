package info.nightscout.androidaps.plugins.configBuilder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J \u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J \u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J \u0010\"\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0016J(\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ConfigBuilderInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "confirmPumpPluginActivation", "", "changedPlugin", "newState", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "type", "Linfo/nightscout/androidaps/interfaces/PluginType;", "initialize", "loadPref", "p", "loadVisible", "loadSettings", "logPluginStatus", "performPluginSwitch", "enabled", "processOnEnabledCategoryChanged", "savePref", "storeVisible", "setAlwaysEnabledPluginsEnabled", "storeSettings", "from", "", "switchAllowed", "app_fullRelease"})
@javax.inject.Singleton()
public final class ConfigBuilderPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ConfigBuilderInterface {
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    
    public final void initialize() {
    }
    
    private final void setAlwaysEnabledPluginsEnabled() {
    }
    
    @java.lang.Override()
    public void storeSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
    
    private final void savePref(info.nightscout.androidaps.interfaces.PluginBase p, info.nightscout.androidaps.interfaces.PluginType type, boolean storeVisible) {
    }
    
    private final void loadSettings() {
    }
    
    private final void loadPref(info.nightscout.androidaps.interfaces.PluginBase p, info.nightscout.androidaps.interfaces.PluginType type, boolean loadVisible) {
    }
    
    public final void logPluginStatus() {
    }
    
    public final void switchAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginBase changedPlugin, boolean newState, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
    }
    
    private final void confirmPumpPluginActivation(info.nightscout.androidaps.interfaces.PluginBase changedPlugin, boolean newState, androidx.fragment.app.FragmentActivity activity, info.nightscout.androidaps.interfaces.PluginType type) {
    }
    
    @java.lang.Override()
    public void performPluginSwitch(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginBase changedPlugin, boolean enabled, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
    }
    
    public final void processOnEnabledCategoryChanged(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginBase changedPlugin, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.interfaces.PluginType type) {
    }
    
    @javax.inject.Inject()
    public ConfigBuilderPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin) {
        super(null, null, null, null);
    }
}