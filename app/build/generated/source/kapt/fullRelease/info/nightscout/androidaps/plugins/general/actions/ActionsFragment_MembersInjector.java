// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.actions;

import android.content.Context;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.CommandQueueProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.overview.StatusLightHandler;
import info.nightscout.androidaps.skins.SkinProvider;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.protection.ProtectionCheck;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActionsFragment_MembersInjector implements MembersInjector<ActionsFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<SP> spProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<Context> ctxProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<StatusLightHandler> statusLightHandlerProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<CommandQueueProvider> commandQueueProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  private final Provider<ProtectionCheck> protectionCheckProvider;

  private final Provider<SkinProvider> skinProvider;

  private final Provider<Config> configProvider;

  public ActionsFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<Context> ctxProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<StatusLightHandler> statusLightHandlerProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<ProtectionCheck> protectionCheckProvider,
      Provider<SkinProvider> skinProvider, Provider<Config> configProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.spProvider = spProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.ctxProvider = ctxProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.statusLightHandlerProvider = statusLightHandlerProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.activePluginProvider = activePluginProvider;
    this.commandQueueProvider = commandQueueProvider;
    this.buildHelperProvider = buildHelperProvider;
    this.protectionCheckProvider = protectionCheckProvider;
    this.skinProvider = skinProvider;
    this.configProvider = configProvider;
  }

  public static MembersInjector<ActionsFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<Context> ctxProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<StatusLightHandler> statusLightHandlerProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<ProtectionCheck> protectionCheckProvider,
      Provider<SkinProvider> skinProvider, Provider<Config> configProvider) {
    return new ActionsFragment_MembersInjector(androidInjectorProvider, aapsLoggerProvider, rxBusProvider, spProvider, profileFunctionProvider, ctxProvider, resourceHelperProvider, statusLightHandlerProvider, fabricPrivacyProvider, activePluginProvider, commandQueueProvider, buildHelperProvider, protectionCheckProvider, skinProvider, configProvider);
  }

  @Override
  public void injectMembers(ActionsFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectSp(instance, spProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectCtx(instance, ctxProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectStatusLightHandler(instance, statusLightHandlerProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectCommandQueue(instance, commandQueueProvider.get());
    injectBuildHelper(instance, buildHelperProvider.get());
    injectProtectionCheck(instance, protectionCheckProvider.get());
    injectSkinProvider(instance, skinProvider.get());
    injectConfig(instance, configProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.aapsLogger")
  public static void injectAapsLogger(ActionsFragment instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.rxBus")
  public static void injectRxBus(ActionsFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.sp")
  public static void injectSp(ActionsFragment instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.profileFunction")
  public static void injectProfileFunction(ActionsFragment instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.ctx")
  public static void injectCtx(ActionsFragment instance, Context ctx) {
    instance.ctx = ctx;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.resourceHelper")
  public static void injectResourceHelper(ActionsFragment instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.statusLightHandler")
  public static void injectStatusLightHandler(ActionsFragment instance,
      StatusLightHandler statusLightHandler) {
    instance.statusLightHandler = statusLightHandler;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.fabricPrivacy")
  public static void injectFabricPrivacy(ActionsFragment instance, FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.activePlugin")
  public static void injectActivePlugin(ActionsFragment instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.commandQueue")
  public static void injectCommandQueue(ActionsFragment instance,
      CommandQueueProvider commandQueue) {
    instance.commandQueue = commandQueue;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.buildHelper")
  public static void injectBuildHelper(ActionsFragment instance, BuildHelper buildHelper) {
    instance.buildHelper = buildHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.protectionCheck")
  public static void injectProtectionCheck(ActionsFragment instance,
      ProtectionCheck protectionCheck) {
    instance.protectionCheck = protectionCheck;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.skinProvider")
  public static void injectSkinProvider(ActionsFragment instance, SkinProvider skinProvider) {
    instance.skinProvider = skinProvider;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.actions.ActionsFragment.config")
  public static void injectConfig(ActionsFragment instance, Config config) {
    instance.config = config;
  }
}