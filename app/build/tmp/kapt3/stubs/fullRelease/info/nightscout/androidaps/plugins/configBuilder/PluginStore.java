package info.nightscout.androidaps.plugins.configBuilder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J+\u00106\u001a\u0004\u0018\u0001H7\"\u0004\b\u0000\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H7092\u0006\u0010:\u001a\u00020;H\u0002\u00a2\u0006\u0002\u0010<J5\u00106\u001a\u0004\u0018\u0001H7\"\u0004\b\u0000\u001072\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\u0006\u0010:\u001a\u00020;H\u0002\u00a2\u0006\u0002\u0010@J\u000e\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020;J\u0018\u0010C\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?H\u0016J\u001e\u0010D\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\u0006\u0010B\u001a\u00020;J$\u0010E\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\n\u0010F\u001a\u0006\u0012\u0002\b\u000309H\u0016J \u0010G\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\u0006\u0010B\u001a\u00020;H\u0016J,\u0010H\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\n\u0010F\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010B\u001a\u00020;H\u0016J*\u0010I\u001a\u0004\u0018\u0001002\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\u0006\u0010B\u001a\u00020;H\u0002J\u0006\u0010J\u001a\u00020KJ0\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020N2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u0002000>j\b\u0012\u0004\u0012\u000200`?2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010O\u001a\u00020KH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010.\u001a\r\u0012\t\u0012\u000700\u00a2\u0006\u0002\b10/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006P"}, d2 = {"Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/Config;)V", "activeAPS", "Linfo/nightscout/androidaps/interfaces/APSInterface;", "getActiveAPS", "()Linfo/nightscout/androidaps/interfaces/APSInterface;", "activeAPSStore", "activeBgSource", "Linfo/nightscout/androidaps/interfaces/BgSourceInterface;", "getActiveBgSource", "()Linfo/nightscout/androidaps/interfaces/BgSourceInterface;", "activeBgSourceStore", "activeInsulin", "Linfo/nightscout/androidaps/interfaces/InsulinInterface;", "getActiveInsulin", "()Linfo/nightscout/androidaps/interfaces/InsulinInterface;", "activeInsulinStore", "activeOverview", "Linfo/nightscout/androidaps/interfaces/OverviewInterface;", "getActiveOverview", "()Linfo/nightscout/androidaps/interfaces/OverviewInterface;", "activeProfile", "Linfo/nightscout/androidaps/interfaces/ProfileInterface;", "activeProfileInterface", "getActiveProfileInterface", "()Linfo/nightscout/androidaps/interfaces/ProfileInterface;", "activePump", "Linfo/nightscout/androidaps/interfaces/PumpInterface;", "getActivePump", "()Linfo/nightscout/androidaps/interfaces/PumpInterface;", "activePumpStore", "activeSensitivity", "Linfo/nightscout/androidaps/interfaces/SensitivityInterface;", "getActiveSensitivity", "()Linfo/nightscout/androidaps/interfaces/SensitivityInterface;", "activeSensitivityStore", "activeTreatments", "Linfo/nightscout/androidaps/interfaces/TreatmentsInterface;", "getActiveTreatments", "()Linfo/nightscout/androidaps/interfaces/TreatmentsInterface;", "activeTreatmentsStore", "plugins", "", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Lkotlin/jvm/JvmSuppressWildcards;", "getPlugins", "()Ljava/util/List;", "setPlugins", "(Ljava/util/List;)V", "determineActivePlugin", "T", "pluginInterface", "Ljava/lang/Class;", "pluginType", "Linfo/nightscout/androidaps/interfaces/PluginType;", "(Ljava/lang/Class;Linfo/nightscout/androidaps/interfaces/PluginType;)Ljava/lang/Object;", "pluginsInCategory", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Linfo/nightscout/androidaps/interfaces/PluginType;)Ljava/lang/Object;", "getDefaultPlugin", "type", "getPluginsList", "getSpecificPluginsList", "getSpecificPluginsListByInterface", "interfaceClass", "getSpecificPluginsVisibleInList", "getSpecificPluginsVisibleInListByInterface", "getTheOneEnabledInArray", "loadDefaults", "", "setFragmentVisiblities", "activePluginName", "", "verifySelectionInCategories", "app_fullRelease"})
@javax.inject.Singleton()
public final class PluginStore implements info.nightscout.androidaps.interfaces.ActivePluginProvider {
    public java.util.List<info.nightscout.androidaps.interfaces.PluginBase> plugins;
    private info.nightscout.androidaps.interfaces.BgSourceInterface activeBgSourceStore;
    private info.nightscout.androidaps.interfaces.PumpInterface activePumpStore;
    private info.nightscout.androidaps.interfaces.ProfileInterface activeProfile;
    private info.nightscout.androidaps.interfaces.APSInterface activeAPSStore;
    private info.nightscout.androidaps.interfaces.InsulinInterface activeInsulinStore;
    private info.nightscout.androidaps.interfaces.SensitivityInterface activeSensitivityStore;
    private info.nightscout.androidaps.interfaces.TreatmentsInterface activeTreatmentsStore;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.Config config = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.interfaces.PluginBase> getPlugins() {
        return null;
    }
    
    public final void setPlugins(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.interfaces.PluginBase> p0) {
    }
    
    public final void loadDefaults() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.PluginBase getDefaultPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> getSpecificPluginsList(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> getSpecificPluginsVisibleInList(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> getSpecificPluginsListByInterface(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> interfaceClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> getSpecificPluginsVisibleInListByInterface(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> interfaceClass, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginType type) {
        return null;
    }
    
    @java.lang.Override()
    public void verifySelectionInCategories() {
    }
    
    /**
     * disables the visibility for all fragments of Plugins with the given PluginType
     * which are not equally named to the Plugin implementing the given Plugin Interface.
     *
     * @param pluginInterface
     * @param pluginType
     * @param <T>
     * @return
     *   </T>
     */
    private final <T extends java.lang.Object>T determineActivePlugin(java.lang.Class<T> pluginInterface, info.nightscout.androidaps.interfaces.PluginType pluginType) {
        return null;
    }
    
    /**
     * disables the visibility for all fragments of Plugins in the given pluginsInCategory
     * with the given PluginType which are not equally named to the Plugin implementing the
     * given Plugin Interface.
     *
     *
     * TODO we are casting an interface to PluginBase, which seems to be rather odd, since
     * TODO the interface is not implementing PluginBase (this is just avoiding errors through
     * TODO conventions.
     *
     * @param pluginsInCategory
     * @param pluginType
     * @param <T>
     * @return
     *   </T>
     */
    private final <T extends java.lang.Object>T determineActivePlugin(java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> pluginsInCategory, info.nightscout.androidaps.interfaces.PluginType pluginType) {
        return null;
    }
    
    private final void setFragmentVisiblities(java.lang.String activePluginName, java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> pluginsInCategory, info.nightscout.androidaps.interfaces.PluginType pluginType) {
    }
    
    private final info.nightscout.androidaps.interfaces.PluginBase getTheOneEnabledInArray(java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> pluginsInCategory, info.nightscout.androidaps.interfaces.PluginType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.BgSourceInterface getActiveBgSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.ProfileInterface getActiveProfileInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.InsulinInterface getActiveInsulin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.APSInterface getActiveAPS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.PumpInterface getActivePump() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.SensitivityInterface getActiveSensitivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.TreatmentsInterface getActiveTreatments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.OverviewInterface getActiveOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> getPluginsList() {
        return null;
    }
    
    @javax.inject.Inject()
    public PluginStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}