package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerLocation;

@Module(subcomponents = AutomationModule_TriggerLocationInjector.TriggerLocationSubcomponent.class)
public abstract class AutomationModule_TriggerLocationInjector {
  private AutomationModule_TriggerLocationInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerLocation.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerLocationSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerLocationSubcomponent extends AndroidInjector<TriggerLocation> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerLocation> {}
  }
}
