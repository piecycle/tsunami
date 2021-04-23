package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionProfileSwitch;

@Module(
  subcomponents = AutomationModule_ActionProfileSwitchInjector.ActionProfileSwitchSubcomponent.class
)
public abstract class AutomationModule_ActionProfileSwitchInjector {
  private AutomationModule_ActionProfileSwitchInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionProfileSwitch.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionProfileSwitchSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionProfileSwitchSubcomponent extends AndroidInjector<ActionProfileSwitch> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionProfileSwitch> {}
  }
}
