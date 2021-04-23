package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopEnable;

@Module(
  subcomponents = AutomationModule_ActionLoopEnableInjector.ActionLoopEnableSubcomponent.class
)
public abstract class AutomationModule_ActionLoopEnableInjector {
  private AutomationModule_ActionLoopEnableInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionLoopEnable.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionLoopEnableSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionLoopEnableSubcomponent extends AndroidInjector<ActionLoopEnable> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionLoopEnable> {}
  }
}
