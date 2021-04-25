// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.aps.openAPSSMB;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OpenAPSSMBFragment_MembersInjector implements MembersInjector<OpenAPSSMBFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<OpenAPSSMBPlugin> openAPSSMBPluginProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public OpenAPSSMBFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<OpenAPSSMBPlugin> openAPSSMBPluginProvider, Provider<DateUtil> dateUtilProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.openAPSSMBPluginProvider = openAPSSMBPluginProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  public static MembersInjector<OpenAPSSMBFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<OpenAPSSMBPlugin> openAPSSMBPluginProvider, Provider<DateUtil> dateUtilProvider) {
    return new OpenAPSSMBFragment_MembersInjector(androidInjectorProvider, aapsLoggerProvider, rxBusProvider, resourceHelperProvider, fabricPrivacyProvider, openAPSSMBPluginProvider, dateUtilProvider);
  }

  @Override
  public void injectMembers(OpenAPSSMBFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectOpenAPSSMBPlugin(instance, openAPSSMBPluginProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.aapsLogger")
  public static void injectAapsLogger(OpenAPSSMBFragment instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.rxBus")
  public static void injectRxBus(OpenAPSSMBFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.resourceHelper")
  public static void injectResourceHelper(OpenAPSSMBFragment instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.fabricPrivacy")
  public static void injectFabricPrivacy(OpenAPSSMBFragment instance, FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.openAPSSMBPlugin")
  public static void injectOpenAPSSMBPlugin(OpenAPSSMBFragment instance,
      OpenAPSSMBPlugin openAPSSMBPlugin) {
    instance.openAPSSMBPlugin = openAPSSMBPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment.dateUtil")
  public static void injectDateUtil(OpenAPSSMBFragment instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }
}