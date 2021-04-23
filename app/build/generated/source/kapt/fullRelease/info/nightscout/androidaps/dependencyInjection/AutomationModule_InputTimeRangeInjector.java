package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputTimeRange;

@Module(subcomponents = AutomationModule_InputTimeRangeInjector.InputTimeRangeSubcomponent.class)
public abstract class AutomationModule_InputTimeRangeInjector {
  private AutomationModule_InputTimeRangeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputTimeRange.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputTimeRangeSubcomponent.Factory builder);

  @Subcomponent
  public interface InputTimeRangeSubcomponent extends AndroidInjector<InputTimeRange> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputTimeRange> {}
  }
}
