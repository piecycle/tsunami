package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin;

@Module(subcomponents = AutomationModule_InputInsulinInjector.InputInsulinSubcomponent.class)
public abstract class AutomationModule_InputInsulinInjector {
  private AutomationModule_InputInsulinInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputInsulin.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputInsulinSubcomponent.Factory builder);

  @Subcomponent
  public interface InputInsulinSubcomponent extends AndroidInjector<InputInsulin> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputInsulin> {}
  }
}
