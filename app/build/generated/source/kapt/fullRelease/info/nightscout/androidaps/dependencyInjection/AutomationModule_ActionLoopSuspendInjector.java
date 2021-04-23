package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopSuspend;

@Module(
  subcomponents = AutomationModule_ActionLoopSuspendInjector.ActionLoopSuspendSubcomponent.class
)
public abstract class AutomationModule_ActionLoopSuspendInjector {
  private AutomationModule_ActionLoopSuspendInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionLoopSuspend.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionLoopSuspendSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionLoopSuspendSubcomponent extends AndroidInjector<ActionLoopSuspend> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionLoopSuspend> {}
  }
}
