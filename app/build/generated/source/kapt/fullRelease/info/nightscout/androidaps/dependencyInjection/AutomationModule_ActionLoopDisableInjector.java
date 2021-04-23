package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable;

@Module(
  subcomponents = AutomationModule_ActionLoopDisableInjector.ActionLoopDisableSubcomponent.class
)
public abstract class AutomationModule_ActionLoopDisableInjector {
  private AutomationModule_ActionLoopDisableInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionLoopDisable.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionLoopDisableSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionLoopDisableSubcomponent extends AndroidInjector<ActionLoopDisable> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionLoopDisable> {}
  }
}
