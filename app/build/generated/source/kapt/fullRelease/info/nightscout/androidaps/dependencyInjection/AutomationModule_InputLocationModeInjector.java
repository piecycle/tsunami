package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode;

@Module(
  subcomponents = AutomationModule_InputLocationModeInjector.InputLocationModeSubcomponent.class
)
public abstract class AutomationModule_InputLocationModeInjector {
  private AutomationModule_InputLocationModeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputLocationMode.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputLocationModeSubcomponent.Factory builder);

  @Subcomponent
  public interface InputLocationModeSubcomponent extends AndroidInjector<InputLocationMode> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputLocationMode> {}
  }
}
