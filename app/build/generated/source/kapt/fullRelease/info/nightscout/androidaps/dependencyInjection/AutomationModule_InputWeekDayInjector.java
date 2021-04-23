package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay;

@Module(subcomponents = AutomationModule_InputWeekDayInjector.InputWeekDaySubcomponent.class)
public abstract class AutomationModule_InputWeekDayInjector {
  private AutomationModule_InputWeekDayInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputWeekDay.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputWeekDaySubcomponent.Factory builder);

  @Subcomponent
  public interface InputWeekDaySubcomponent extends AndroidInjector<InputWeekDay> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputWeekDay> {}
  }
}
