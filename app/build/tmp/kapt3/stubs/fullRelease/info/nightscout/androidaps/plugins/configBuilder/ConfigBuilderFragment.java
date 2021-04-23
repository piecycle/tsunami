package info.nightscout.androidaps.plugins.configBuilder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001IB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u00102\u001a\u0002032\b\b\u0001\u00104\u001a\u0002052\b\b\u0001\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u000203H\u0016J\b\u0010E\u001a\u000203H\u0016J\u001a\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010H\u001a\u000203H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u001fR\u00020\u00000\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006J"}, d2 = {"Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "config", "Linfo/nightscout/androidaps/Config;", "getConfig", "()Linfo/nightscout/androidaps/Config;", "setConfig", "(Linfo/nightscout/androidaps/Config;)V", "configBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "getConfigBuilderPlugin", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "setConfigBuilderPlugin", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "pluginViewHolders", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment$PluginViewHolder;", "protectionCheck", "Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "getProtectionCheck", "()Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "setProtectionCheck", "(Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "createViewsForPlugins", "", "title", "", "description", "pluginType", "Linfo/nightscout/androidaps/interfaces/PluginType;", "plugins", "", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "updateGUI", "PluginViewHolder", "app_fullRelease"})
public final class ConfigBuilderFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.protection.ProtectionCheck protectionCheck;
    @javax.inject.Inject()
    public info.nightscout.androidaps.Config config;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private final java.util.ArrayList<info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderFragment.PluginViewHolder> pluginViewHolders = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin getConfigBuilderPlugin() {
        return null;
    }
    
    public final void setConfigBuilderPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.protection.ProtectionCheck getProtectionCheck() {
        return null;
    }
    
    public final void setProtectionCheck(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.ProtectionCheck p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    @java.lang.Override()
    public synchronized void onPause() {
    }
    
    private final synchronized void updateGUI() {
    }
    
    private final void createViewsForPlugins(@androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int description, info.nightscout.androidaps.interfaces.PluginType pluginType, java.util.List<? extends info.nightscout.androidaps.interfaces.PluginBase> plugins) {
    }
    
    public ConfigBuilderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0006\u0010\u001e\u001a\u00020\u001fR\u0017\u0010\t\u001a\u00020\n\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment$PluginViewHolder;", "", "fragment", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment;", "pluginType", "Linfo/nightscout/androidaps/interfaces/PluginType;", "plugin", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment;Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment;Linfo/nightscout/androidaps/interfaces/PluginType;Linfo/nightscout/androidaps/interfaces/PluginBase;)V", "baseView", "Landroid/widget/LinearLayout;", "getBaseView$annotations", "()V", "getBaseView", "()Landroid/widget/LinearLayout;", "enabledExclusive", "Landroid/widget/RadioButton;", "enabledInclusive", "Landroid/widget/CheckBox;", "pluginDescription", "Landroid/widget/TextView;", "pluginIcon", "Landroid/widget/ImageView;", "pluginName", "pluginPreferences", "Landroid/widget/ImageButton;", "pluginVisibility", "areMultipleSelectionsAllowed", "", "type", "update", "", "app_fullRelease"})
    public final class PluginViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout baseView = null;
        private final android.widget.RadioButton enabledExclusive = null;
        private final android.widget.CheckBox enabledInclusive = null;
        private final android.widget.ImageView pluginIcon = null;
        private final android.widget.TextView pluginName = null;
        private final android.widget.TextView pluginDescription = null;
        private final android.widget.ImageButton pluginPreferences = null;
        private final android.widget.CheckBox pluginVisibility = null;
        private final info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderFragment fragment = null;
        private final info.nightscout.androidaps.interfaces.PluginType pluginType = null;
        private final info.nightscout.androidaps.interfaces.PluginBase plugin = null;
        
        @kotlin.Suppress(names = {"InflateParams"})
        @java.lang.Deprecated()
        public static void getBaseView$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getBaseView() {
            return null;
        }
        
        public final void update() {
        }
        
        private final boolean areMultipleSelectionsAllowed(info.nightscout.androidaps.interfaces.PluginType type) {
            return false;
        }
        
        public PluginViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderFragment fragment, @org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.interfaces.PluginType pluginType, @org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.interfaces.PluginBase plugin) {
            super();
        }
    }
}