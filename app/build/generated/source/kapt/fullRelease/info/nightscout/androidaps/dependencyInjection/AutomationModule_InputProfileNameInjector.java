package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputProfileName;

@Module(
  subcomponents = AutomationModule_InputProfileNameInjector.InputProfileNameSubcomponent.class
)
public abstract class AutomationModule_InputProfileNameInjector {
  private AutomationModule_InputProfileNameInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputProfileName.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputProfileNameSubcomponent.Factory builder);

  @Subcomponent
  public interface InputProfileNameSubcomponent extends AndroidInjector<InputProfileName> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputProfileName> {}
  }
}
