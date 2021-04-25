// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.automation.actions;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.CommandQueueProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.aps.loop.LoopPlugin;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActionLoopDisable_MembersInjector implements MembersInjector<ActionLoopDisable> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<LoopPlugin> loopPluginProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ConfigBuilderPlugin> configBuilderPluginProvider;

  private final Provider<CommandQueueProvider> commandQueueProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  public ActionLoopDisable_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<LoopPlugin> loopPluginProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ConfigBuilderPlugin> configBuilderPluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<RxBusWrapper> rxBusProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.loopPluginProvider = loopPluginProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.configBuilderPluginProvider = configBuilderPluginProvider;
    this.commandQueueProvider = commandQueueProvider;
    this.rxBusProvider = rxBusProvider;
  }

  public static MembersInjector<ActionLoopDisable> create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<LoopPlugin> loopPluginProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ConfigBuilderPlugin> configBuilderPluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<RxBusWrapper> rxBusProvider) {
    return new ActionLoopDisable_MembersInjector(aapsLoggerProvider, loopPluginProvider, resourceHelperProvider, configBuilderPluginProvider, commandQueueProvider, rxBusProvider);
  }

  @Override
  public void injectMembers(ActionLoopDisable instance) {
    Action_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    injectLoopPlugin(instance, loopPluginProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectConfigBuilderPlugin(instance, configBuilderPluginProvider.get());
    injectCommandQueue(instance, commandQueueProvider.get());
    injectRxBus(instance, rxBusProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable.loopPlugin")
  public static void injectLoopPlugin(ActionLoopDisable instance, LoopPlugin loopPlugin) {
    instance.loopPlugin = loopPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable.resourceHelper")
  public static void injectResourceHelper(ActionLoopDisable instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable.configBuilderPlugin")
  public static void injectConfigBuilderPlugin(ActionLoopDisable instance,
      ConfigBuilderPlugin configBuilderPlugin) {
    instance.configBuilderPlugin = configBuilderPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable.commandQueue")
  public static void injectCommandQueue(ActionLoopDisable instance,
      CommandQueueProvider commandQueue) {
    instance.commandQueue = commandQueue;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable.rxBus")
  public static void injectRxBus(ActionLoopDisable instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }
}