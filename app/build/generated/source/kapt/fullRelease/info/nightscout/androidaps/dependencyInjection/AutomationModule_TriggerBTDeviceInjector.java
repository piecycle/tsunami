package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBTDevice;

@Module(subcomponents = AutomationModule_TriggerBTDeviceInjector.TriggerBTDeviceSubcomponent.class)
public abstract class AutomationModule_TriggerBTDeviceInjector {
  private AutomationModule_TriggerBTDeviceInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerBTDevice.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerBTDeviceSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerBTDeviceSubcomponent extends AndroidInjector<TriggerBTDevice> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerBTDevice> {}
  }
}
