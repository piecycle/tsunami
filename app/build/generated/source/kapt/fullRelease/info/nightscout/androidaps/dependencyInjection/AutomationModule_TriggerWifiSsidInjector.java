package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerWifiSsid;

@Module(subcomponents = AutomationModule_TriggerWifiSsidInjector.TriggerWifiSsidSubcomponent.class)
public abstract class AutomationModule_TriggerWifiSsidInjector {
  private AutomationModule_TriggerWifiSsidInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerWifiSsid.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerWifiSsidSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerWifiSsidSubcomponent extends AndroidInjector<TriggerWifiSsid> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerWifiSsid> {}
  }
}
