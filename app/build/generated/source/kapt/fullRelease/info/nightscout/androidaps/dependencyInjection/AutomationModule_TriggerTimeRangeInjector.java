package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTimeRange;

@Module(
  subcomponents = AutomationModule_TriggerTimeRangeInjector.TriggerTimeRangeSubcomponent.class
)
public abstract class AutomationModule_TriggerTimeRangeInjector {
  private AutomationModule_TriggerTimeRangeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerTimeRange.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerTimeRangeSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerTimeRangeSubcomponent extends AndroidInjector<TriggerTimeRange> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerTimeRange> {}
  }
}
