// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.source;

import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpPlugin;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RandomBgPlugin_Factory implements Factory<RandomBgPlugin> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<VirtualPumpPlugin> virtualPumpPluginProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  private final Provider<SP> spProvider;

  private final Provider<NSUpload> nsUploadProvider;

  public RandomBgPlugin_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<VirtualPumpPlugin> virtualPumpPluginProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<SP> spProvider,
      Provider<NSUpload> nsUploadProvider) {
    this.injectorProvider = injectorProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.virtualPumpPluginProvider = virtualPumpPluginProvider;
    this.buildHelperProvider = buildHelperProvider;
    this.spProvider = spProvider;
    this.nsUploadProvider = nsUploadProvider;
  }

  @Override
  public RandomBgPlugin get() {
    return newInstance(injectorProvider.get(), resourceHelperProvider.get(), aapsLoggerProvider.get(), virtualPumpPluginProvider.get(), buildHelperProvider.get(), spProvider.get(), nsUploadProvider.get());
  }

  public static RandomBgPlugin_Factory create(Provider<HasAndroidInjector> injectorProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<VirtualPumpPlugin> virtualPumpPluginProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<SP> spProvider,
      Provider<NSUpload> nsUploadProvider) {
    return new RandomBgPlugin_Factory(injectorProvider, resourceHelperProvider, aapsLoggerProvider, virtualPumpPluginProvider, buildHelperProvider, spProvider, nsUploadProvider);
  }

  public static RandomBgPlugin newInstance(HasAndroidInjector injector,
      ResourceHelper resourceHelper, AAPSLogger aapsLogger, VirtualPumpPlugin virtualPumpPlugin,
      BuildHelper buildHelper, SP sp, NSUpload nsUpload) {
    return new RandomBgPlugin(injector, resourceHelper, aapsLogger, virtualPumpPlugin, buildHelper, sp, nsUpload);
  }
}