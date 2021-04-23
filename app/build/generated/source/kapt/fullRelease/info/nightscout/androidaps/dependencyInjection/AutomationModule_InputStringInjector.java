package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputString;

@Module(subcomponents = AutomationModule_InputStringInjector.InputStringSubcomponent.class)
public abstract class AutomationModule_InputStringInjector {
  private AutomationModule_InputStringInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputString.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputStringSubcomponent.Factory builder);

  @Subcomponent
  public interface InputStringSubcomponent extends AndroidInjector<InputString> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputString> {}
  }
}
