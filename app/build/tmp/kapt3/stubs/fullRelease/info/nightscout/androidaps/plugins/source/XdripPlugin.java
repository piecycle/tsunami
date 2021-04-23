package info.nightscout.androidaps.plugins.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/XdripPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/BgSourceInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "advancedFiltering", "", "sensorBatteryLevel", "", "advancedFilteringSupported", "getSensorBatteryLevel", "handleNewData", "", "intent", "Landroid/content/Intent;", "setSource", "source", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class XdripPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.BgSourceInterface {
    private boolean advancedFiltering = false;
    private int sensorBatteryLevel = -1;
    
    @java.lang.Override()
    public boolean advancedFilteringSupported() {
        return false;
    }
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void setSource(java.lang.String source) {
    }
    
    @java.lang.Override()
    public int getSensorBatteryLevel() {
        return 0;
    }
    
    @javax.inject.Inject()
    public XdripPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super(null, null, null, null);
    }
}