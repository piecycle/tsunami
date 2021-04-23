package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputButton;

@Module(subcomponents = AutomationModule_InputButtonInjector.InputButtonSubcomponent.class)
public abstract class AutomationModule_InputButtonInjector {
  private AutomationModule_InputButtonInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputButton.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputButtonSubcomponent.Factory builder);

  @Subcomponent
  public interface InputButtonSubcomponent extends AndroidInjector<InputButton> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputButton> {}
  }
}
