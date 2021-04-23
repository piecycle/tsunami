package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerRecurringTime;

@Module(
  subcomponents =
      AutomationModule_TriggerRecurringTimeInjector.TriggerRecurringTimeSubcomponent.class
)
public abstract class AutomationModule_TriggerRecurringTimeInjector {
  private AutomationModule_TriggerRecurringTimeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerRecurringTime.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerRecurringTimeSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerRecurringTimeSubcomponent extends AndroidInjector<TriggerRecurringTime> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerRecurringTime> {}
  }
}
