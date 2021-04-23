package info.nightscout.androidaps.plugins.sensitivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J6\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 JF\u0010\u0017\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Linfo/nightscout/androidaps/plugins/sensitivity/AbstractSensitivityPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/SensitivityInterface;", "pluginDescription", "Linfo/nightscout/androidaps/interfaces/PluginDescription;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "(Linfo/nightscout/androidaps/interfaces/PluginDescription;Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "detectSensitivity", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/AutosensResult;", "plugin", "Linfo/nightscout/androidaps/interfaces/IobCobCalculatorInterface;", "fromTime", "", "toTime", "fillResult", "ratio", "", "carbsAbsorbed", "pastSensitivity", "", "ratioLimit", "sensResult", "deviationsArraySize", "", "ratioParam", "ratioLimitParam", "ratioMin", "ratioMax", "app_fullRelease"})
public abstract class AbstractSensitivityPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.SensitivityInterface {
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract info.nightscout.androidaps.plugins.iob.iobCobCalculator.AutosensResult detectSensitivity(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.IobCobCalculatorInterface plugin, long fromTime, long toTime);
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.AutosensResult fillResult(double ratio, double carbsAbsorbed, @org.jetbrains.annotations.NotNull()
    java.lang.String pastSensitivity, @org.jetbrains.annotations.NotNull()
    java.lang.String ratioLimit, @org.jetbrains.annotations.NotNull()
    java.lang.String sensResult, int deviationsArraySize) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.AutosensResult fillResult(double ratioParam, double carbsAbsorbed, @org.jetbrains.annotations.NotNull()
    java.lang.String pastSensitivity, @org.jetbrains.annotations.NotNull()
    java.lang.String ratioLimitParam, @org.jetbrains.annotations.NotNull()
    java.lang.String sensResult, int deviationsArraySize, double ratioMin, double ratioMax) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public AbstractSensitivityPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginDescription pluginDescription, @org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp) {
        super(null, null, null, null);
    }
}