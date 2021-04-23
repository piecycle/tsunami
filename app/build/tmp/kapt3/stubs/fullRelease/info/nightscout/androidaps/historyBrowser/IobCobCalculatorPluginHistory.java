package info.nightscout.androidaps.historyBrowser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0014\u00a8\u0006\u001f"}, d2 = {"Linfo/nightscout/androidaps/historyBrowser/IobCobCalculatorPluginHistory;", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "treatmentsPluginHistory", "Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;", "sensitivityOref1Plugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;", "sensitivityAAPSPlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;", "sensitivityWeightedAveragePlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/utils/DateUtil;)V", "onStart", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class IobCobCalculatorPluginHistory extends info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin {
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @javax.inject.Inject()
    public IobCobCalculatorPluginHistory(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.historyBrowser.TreatmentsPluginHistory treatmentsPluginHistory, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin sensitivityOref1Plugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin sensitivityAAPSPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin sensitivityWeightedAveragePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}