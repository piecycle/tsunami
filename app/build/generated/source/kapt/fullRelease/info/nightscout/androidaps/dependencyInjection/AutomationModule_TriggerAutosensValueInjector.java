package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerAutosensValue;

@Module(
  subcomponents =
      AutomationModule_TriggerAutosensValueInjector.TriggerAutosensValueSubcomponent.class
)
public abstract class AutomationModule_TriggerAutosensValueInjector {
  private AutomationModule_TriggerAutosensValueInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerAutosensValue.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerAutosensValueSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerAutosensValueSubcomponent extends AndroidInjector<TriggerAutosensValue> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerAutosensValue> {}
  }
}
