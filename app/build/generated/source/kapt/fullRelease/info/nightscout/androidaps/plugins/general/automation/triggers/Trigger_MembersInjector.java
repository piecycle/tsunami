// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.automation.triggers;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.services.LastLocationDataContainer;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Trigger_MembersInjector implements MembersInjector<Trigger> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<SP> spProvider;

  private final Provider<LastLocationDataContainer> locationDataContainerProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider;

  public Trigger_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<SP> spProvider,
      Provider<LastLocationDataContainer> locationDataContainerProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.spProvider = spProvider;
    this.locationDataContainerProvider = locationDataContainerProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.activePluginProvider = activePluginProvider;
    this.iobCobCalculatorPluginProvider = iobCobCalculatorPluginProvider;
  }

  public static MembersInjector<Trigger> create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<SP> spProvider,
      Provider<LastLocationDataContainer> locationDataContainerProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider) {
    return new Trigger_MembersInjector(aapsLoggerProvider, rxBusProvider, resourceHelperProvider, profileFunctionProvider, spProvider, locationDataContainerProvider, treatmentsPluginProvider, activePluginProvider, iobCobCalculatorPluginProvider);
  }

  @Override
  public void injectMembers(Trigger instance) {
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectSp(instance, spProvider.get());
    injectLocationDataContainer(instance, locationDataContainerProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectIobCobCalculatorPlugin(instance, iobCobCalculatorPluginProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.aapsLogger")
  public static void injectAapsLogger(Trigger instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.rxBus")
  public static void injectRxBus(Trigger instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.resourceHelper")
  public static void injectResourceHelper(Trigger instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.profileFunction")
  public static void injectProfileFunction(Trigger instance, ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.sp")
  public static void injectSp(Trigger instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.locationDataContainer")
  public static void injectLocationDataContainer(Trigger instance,
      LastLocationDataContainer locationDataContainer) {
    instance.locationDataContainer = locationDataContainer;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.treatmentsPlugin")
  public static void injectTreatmentsPlugin(Trigger instance, TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.activePlugin")
  public static void injectActivePlugin(Trigger instance, ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.iobCobCalculatorPlugin")
  public static void injectIobCobCalculatorPlugin(Trigger instance,
      IobCobCalculatorPlugin iobCobCalculatorPlugin) {
    instance.iobCobCalculatorPlugin = iobCobCalculatorPlugin;
  }
}