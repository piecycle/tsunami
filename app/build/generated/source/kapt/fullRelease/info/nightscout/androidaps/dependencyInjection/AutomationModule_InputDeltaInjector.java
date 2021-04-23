package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputDelta;

@Module(subcomponents = AutomationModule_InputDeltaInjector.InputDeltaSubcomponent.class)
public abstract class AutomationModule_InputDeltaInjector {
  private AutomationModule_InputDeltaInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputDelta.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputDeltaSubcomponent.Factory builder);

  @Subcomponent
  public interface InputDeltaSubcomponent extends AndroidInjector<InputDelta> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputDelta> {}
  }
}
