package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionStartTempTarget;

@Module(
  subcomponents =
      AutomationModule_ActionStartTempTargetInjector.ActionStartTempTargetSubcomponent.class
)
public abstract class AutomationModule_ActionStartTempTargetInjector {
  private AutomationModule_ActionStartTempTargetInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionStartTempTarget.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionStartTempTargetSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionStartTempTargetSubcomponent
      extends AndroidInjector<ActionStartTempTarget> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionStartTempTarget> {}
  }
}
