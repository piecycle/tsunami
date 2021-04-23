package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTempTarget;

@Module(
  subcomponents = AutomationModule_TriggerTempTargetInjector.TriggerTempTargetSubcomponent.class
)
public abstract class AutomationModule_TriggerTempTargetInjector {
  private AutomationModule_TriggerTempTargetInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerTempTarget.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerTempTargetSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerTempTargetSubcomponent extends AndroidInjector<TriggerTempTarget> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerTempTarget> {}
  }
}
