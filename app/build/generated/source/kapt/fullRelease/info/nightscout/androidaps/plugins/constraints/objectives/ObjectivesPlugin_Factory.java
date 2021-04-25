// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.constraints.objectives;

import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObjectivesPlugin_Factory implements Factory<ObjectivesPlugin> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<SP> spProvider;

  private final Provider<Config> configProvider;

  public ObjectivesPlugin_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<SP> spProvider,
      Provider<Config> configProvider) {
    this.injectorProvider = injectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.activePluginProvider = activePluginProvider;
    this.spProvider = spProvider;
    this.configProvider = configProvider;
  }

  @Override
  public ObjectivesPlugin get() {
    return newInstance(injectorProvider.get(), aapsLoggerProvider.get(), resourceHelperProvider.get(), activePluginProvider.get(), spProvider.get(), configProvider.get());
  }

  public static ObjectivesPlugin_Factory create(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<SP> spProvider,
      Provider<Config> configProvider) {
    return new ObjectivesPlugin_Factory(injectorProvider, aapsLoggerProvider, resourceHelperProvider, activePluginProvider, spProvider, configProvider);
  }

  public static ObjectivesPlugin newInstance(HasAndroidInjector injector, AAPSLogger aapsLogger,
      ResourceHelper resourceHelper, ActivePluginProvider activePlugin, SP sp, Config config) {
    return new ObjectivesPlugin(injector, aapsLogger, resourceHelper, activePlugin, sp, config);
  }
}