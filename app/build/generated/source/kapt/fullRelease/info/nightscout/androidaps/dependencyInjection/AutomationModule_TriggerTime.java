package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTime;

@Module(subcomponents = AutomationModule_TriggerTime.TriggerTimeSubcomponent.class)
public abstract class AutomationModule_TriggerTime {
  private AutomationModule_TriggerTime() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerTime.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerTimeSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerTimeSubcomponent extends AndroidInjector<TriggerTime> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerTime> {}
  }
}
