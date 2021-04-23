package info.nightscout.androidaps.setupwizard.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/elements/SWPlugin;", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "injector", "Ldagger/android/HasAndroidInjector;", "definition", "Linfo/nightscout/androidaps/setupwizard/SWDefinition;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/setupwizard/SWDefinition;)V", "configBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "getConfigBuilderPlugin", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "setConfigBuilderPlugin", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;)V", "getDefinition", "()Linfo/nightscout/androidaps/setupwizard/SWDefinition;", "fragment", "Linfo/nightscout/androidaps/activities/MyPreferenceFragment;", "makeVisible", "", "pType", "Linfo/nightscout/androidaps/interfaces/PluginType;", "pluginDescription", "", "pluginStore", "Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "getPluginStore", "()Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "setPluginStore", "(Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;)V", "radioGroup", "Landroid/widget/RadioGroup;", "addConfiguration", "", "layout", "Landroid/widget/LinearLayout;", "plugin", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "generateDialog", "option", "app_fullRelease"})
public final class SWPlugin extends info.nightscout.androidaps.setupwizard.elements.SWItem {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.PluginStore pluginStore;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin;
    private info.nightscout.androidaps.interfaces.PluginType pType;
    private android.widget.RadioGroup radioGroup;
    private int pluginDescription = 0;
    private boolean makeVisible = true;
    private info.nightscout.androidaps.activities.MyPreferenceFragment fragment;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.setupwizard.SWDefinition definition = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.PluginStore getPluginStore() {
        return null;
    }
    
    public final void setPluginStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.PluginStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin getConfigBuilderPlugin() {
        return null;
    }
    
    public final void setConfigBuilderPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWPlugin option(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType pType, int pluginDescription) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWPlugin makeVisible(boolean makeVisible) {
        return null;
    }
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout) {
    }
    
    public final void addConfiguration(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginBase plugin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWDefinition getDefinition() {
        return null;
    }
    
    public SWPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWDefinition definition) {
        super(null, null);
    }
}