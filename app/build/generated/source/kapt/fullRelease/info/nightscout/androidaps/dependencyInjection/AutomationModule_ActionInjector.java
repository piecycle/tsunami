package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.Action;

@Module(subcomponents = AutomationModule_ActionInjector.ActionSubcomponent.class)
public abstract class AutomationModule_ActionInjector {
  private AutomationModule_ActionInjector() {}

  @Binds
  @IntoMap
  @ClassKey(Action.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionSubcomponent extends AndroidInjector<Action> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Action> {}
  }
}
