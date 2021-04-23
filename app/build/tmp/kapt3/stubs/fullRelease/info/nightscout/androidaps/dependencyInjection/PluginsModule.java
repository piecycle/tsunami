package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c6\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001:\u0004klmnB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H\'J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H\'J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H\'J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H\'J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020,H\'J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H\'J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000200H\'J\u0010\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H\'J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000204H\'J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H\'J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H\'J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020:H\'J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020<H\'J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020>H\'J\u0010\u0010?\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020@H\'J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020BH\'J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020DH\'J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020FH\'J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020HH\'J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020JH\'J\u0010\u0010K\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020LH\'J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020NH\'J\u0010\u0010O\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020PH\'J\u0010\u0010Q\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020RH\'J\u0010\u0010S\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020TH\'J\u0010\u0010U\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020VH\'J\u0010\u0010W\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020XH\'J\u0010\u0010Y\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020ZH\'J\u0010\u0010[\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\\H\'J\u0010\u0010]\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020^H\'J\u0010\u0010_\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020`H\'J\u0010\u0010a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020bH\'J\u0010\u0010c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020dH\'J\u0010\u0010e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020fH\'J\u0010\u0010g\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020hH\'J\u0010\u0010i\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020jH\'\u00a8\u0006o"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PluginsModule;", "", "()V", "bindActionsPlugin", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "plugin", "Linfo/nightscout/androidaps/plugins/general/actions/ActionsPlugin;", "bindAutomationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "bindComboPlugin", "Linfo/nightscout/androidaps/plugins/pump/combo/ComboPlugin;", "bindConfigBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "bindDanaRKoreanPlugin", "Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;", "bindDanaRPlugin", "Linfo/nightscout/androidaps/danar/DanaRPlugin;", "bindDanaRSPlugin", "Linfo/nightscout/androidaps/danars/DanaRSPlugin;", "bindDanaRv2Plugin", "Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;", "bindDataBroadcastPlugin", "Linfo/nightscout/androidaps/plugins/general/dataBroadcaster/DataBroadcastPlugin;", "bindDexcomPlugin", "Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "bindDstHelperPlugin", "Linfo/nightscout/androidaps/plugins/constraints/dstHelper/DstHelperPlugin;", "bindFoodPlugin", "Linfo/nightscout/androidaps/plugins/general/food/FoodPlugin;", "bindGlimpPlugin", "Linfo/nightscout/androidaps/plugins/source/GlimpPlugin;", "bindInsulinLyumjevPlugin", "Linfo/nightscout/androidaps/plugins/insulin/InsulinLyumjevPlugin;", "bindInsulinOrefFreePeakPlugin", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefFreePeakPlugin;", "bindInsulinOrefRapidActingPlugin", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefRapidActingPlugin;", "bindInsulinOrefUltraRapidActingPlugin", "Linfo/nightscout/androidaps/plugins/insulin/InsulinOrefUltraRapidActingPlugin;", "bindIobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "bindLocalInsightPlugin", "Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;", "bindLocalProfilePlugin", "Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;", "bindLoopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "bindMDIPlugin", "Linfo/nightscout/androidaps/plugins/pump/mdi/MDIPlugin;", "bindMM640gPlugin", "Linfo/nightscout/androidaps/plugins/source/MM640gPlugin;", "bindMaintenancePlugin", "Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "bindMedtronicPumpPlugin", "Linfo/nightscout/androidaps/plugins/pump/medtronic/MedtronicPumpPlugin;", "bindNSClientPlugin", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "bindNSClientSourcePlugin", "Linfo/nightscout/androidaps/plugins/source/NSClientSourcePlugin;", "bindNSProfilePlugin", "Linfo/nightscout/androidaps/plugins/profile/ns/NSProfilePlugin;", "bindObjectivesPlugin", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;", "bindOmnipodPumpPlugin", "Linfo/nightscout/androidaps/plugins/pump/omnipod/OmnipodPumpPlugin;", "bindOpenAPSAMAPlugin", "Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/OpenAPSAMAPlugin;", "bindOpenAPSSMBPlugin", "Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/OpenAPSSMBPlugin;", "bindOpenHumansPlugin", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "bindOverviewPlugin", "Linfo/nightscout/androidaps/plugins/general/overview/OverviewPlugin;", "bindPersistentNotificationPlugin", "Linfo/nightscout/androidaps/plugins/general/persistentNotification/PersistentNotificationPlugin;", "bindPoctechPlugin", "Linfo/nightscout/androidaps/plugins/source/PoctechPlugin;", "bindRandomBgPlugin", "Linfo/nightscout/androidaps/plugins/source/RandomBgPlugin;", "bindSafetyPlugin", "Linfo/nightscout/androidaps/plugins/constraints/safety/SafetyPlugin;", "bindSensitivityAAPSPlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityAAPSPlugin;", "bindSensitivityOref1Plugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityOref1Plugin;", "bindSensitivityWeightedAveragePlugin", "Linfo/nightscout/androidaps/plugins/sensitivity/SensitivityWeightedAveragePlugin;", "bindSignatureVerifierPlugin", "Linfo/nightscout/androidaps/plugins/constraints/signatureVerifier/SignatureVerifierPlugin;", "bindSmsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "bindStatusLinePlugin", "Linfo/nightscout/androidaps/plugins/general/xdripStatusline/StatusLinePlugin;", "bindStorageConstraintPlugin", "Linfo/nightscout/androidaps/plugins/constraints/storage/StorageConstraintPlugin;", "bindTomatoPlugin", "Linfo/nightscout/androidaps/plugins/source/TomatoPlugin;", "bindTreatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "bindVersionCheckerPlugin", "Linfo/nightscout/androidaps/plugins/constraints/versionChecker/VersionCheckerPlugin;", "bindVirtualPumpPlugin", "Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpPlugin;", "bindWearPlugin", "Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;", "bindXdripPlugin", "Linfo/nightscout/androidaps/plugins/source/XdripPlugin;", "APS", "AllConfigs", "NotNSClient", "PumpDriver", "app_fullRelease"})
@dagger.Module()
public abstract class PluginsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 0)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindOverviewPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.OverviewPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 10)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindIobCobCalculatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 20)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindActionsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.actions.ActionsPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 30)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindInsulinOrefRapidActingPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.insulin.InsulinOrefRapidActingPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 40)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindInsulinOrefUltraRapidActingPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.insulin.InsulinOrefUltraRapidActingPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 42)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindInsulinLyumjevPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.insulin.InsulinLyumjevPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 50)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindInsulinOrefFreePeakPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.insulin.InsulinOrefFreePeakPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 60)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSensitivityAAPSPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 70)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSensitivityWeightedAveragePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 80)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSensitivityOref1Plugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.sensitivity.SensitivityOref1Plugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 90)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDanaRPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danar.DanaRPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 100)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDanaRKoreanPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 110)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDanaRv2Plugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRv2.DanaRv2Plugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 120)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDanaRSPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danars.DanaRSPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 130)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindLocalInsightPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 140)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindComboPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.combo.ComboPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 150)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindMedtronicPumpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.medtronic.MedtronicPumpPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 155)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindOmnipodPumpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.omnipod.OmnipodPumpPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 160)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindMDIPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.mdi.MDIPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 170)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindVirtualPumpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 190)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindLoopPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 210)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindOpenAPSAMAPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 220)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindOpenAPSSMBPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 230)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindNSProfilePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.ns.NSProfilePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 240)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindLocalProfilePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 250)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 260)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindTreatmentsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 265)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSafetyPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.safety.SafetyPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 270)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindVersionCheckerPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.versionChecker.VersionCheckerPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 280)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSmsCommunicatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 290)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindStorageConstraintPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.storage.StorageConstraintPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 300)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindSignatureVerifierPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.signatureVerifier.SignatureVerifierPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 310)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindObjectivesPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 320)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindFoodPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.food.FoodPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 330)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindWearPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.wear.WearPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 340)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindStatusLinePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.xdripStatusline.StatusLinePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 350)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindPersistentNotificationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.persistentNotification.PersistentNotificationPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 360)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindNSClientPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 370)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindMaintenancePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 380)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDstHelperPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.dstHelper.DstHelperPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 390)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDataBroadcastPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.dataBroadcaster.DataBroadcastPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 400)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindXdripPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.XdripPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 410)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindNSClientSourcePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.NSClientSourcePlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 420)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindMM640gPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.MM640gPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 430)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindGlimpPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.GlimpPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 440)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindDexcomPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.DexcomPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 450)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindPoctechPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.PoctechPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 460)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindTomatoPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.TomatoPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 470)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindRandomBgPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.RandomBgPlugin plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 480)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindOpenHumansPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader plugin);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 490)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    @dagger.Binds()
    public abstract info.nightscout.androidaps.interfaces.PluginBase bindConfigBuilderPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin plugin);
    
    public PluginsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PluginsModule$AllConfigs;", "", "app_fullRelease"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface AllConfigs {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PluginsModule$PumpDriver;", "", "app_fullRelease"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface PumpDriver {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PluginsModule$NotNSClient;", "", "app_fullRelease"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface NotNSClient {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PluginsModule$APS;", "", "app_fullRelease"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface APS {
    }
}