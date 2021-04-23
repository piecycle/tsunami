package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerDelta;

@Module(subcomponents = AutomationModule_TriggerDeltaInjector.TriggerDeltaSubcomponent.class)
public abstract class AutomationModule_TriggerDeltaInjector {
  private AutomationModule_TriggerDeltaInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerDelta.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerDeltaSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerDeltaSubcomponent extends AndroidInjector<TriggerDelta> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerDelta> {}
  }
}
