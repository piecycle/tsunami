package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopResume;

@Module(
  subcomponents = AutomationModule_ActionLoopResumeInjector.ActionLoopResumeSubcomponent.class
)
public abstract class AutomationModule_ActionLoopResumeInjector {
  private AutomationModule_ActionLoopResumeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionLoopResume.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionLoopResumeSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionLoopResumeSubcomponent extends AndroidInjector<ActionLoopResume> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionLoopResume> {}
  }
}
