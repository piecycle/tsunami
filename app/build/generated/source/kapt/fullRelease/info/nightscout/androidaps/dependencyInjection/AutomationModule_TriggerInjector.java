package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.Trigger;

@Module(subcomponents = AutomationModule_TriggerInjector.TriggerSubcomponent.class)
public abstract class AutomationModule_TriggerInjector {
  private AutomationModule_TriggerInjector() {}

  @Binds
  @IntoMap
  @ClassKey(Trigger.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerSubcomponent extends AndroidInjector<Trigger> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Trigger> {}
  }
}
