package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerProfilePercent;

@Module(
  subcomponents =
      AutomationModule_TriggerProfilePercentInjector.TriggerProfilePercentSubcomponent.class
)
public abstract class AutomationModule_TriggerProfilePercentInjector {
  private AutomationModule_TriggerProfilePercentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerProfilePercent.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerProfilePercentSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerProfilePercentSubcomponent
      extends AndroidInjector<TriggerProfilePercent> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerProfilePercent> {}
  }
}
