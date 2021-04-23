package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputDropdownMenu;

@Module(
  subcomponents = AutomationModule_InputDropdownMenuInjector.InputDropdownMenuSubcomponent.class
)
public abstract class AutomationModule_InputDropdownMenuInjector {
  private AutomationModule_InputDropdownMenuInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputDropdownMenu.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputDropdownMenuSubcomponent.Factory builder);

  @Subcomponent
  public interface InputDropdownMenuSubcomponent extends AndroidInjector<InputDropdownMenu> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputDropdownMenu> {}
  }
}
