package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionStopTempTarget;

@Module(
  subcomponents =
      AutomationModule_ActionStopTempTargetInjector.ActionStopTempTargetSubcomponent.class
)
public abstract class AutomationModule_ActionStopTempTargetInjector {
  private AutomationModule_ActionStopTempTargetInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionStopTempTarget.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionStopTempTargetSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionStopTempTargetSubcomponent extends AndroidInjector<ActionStopTempTarget> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionStopTempTarget> {}
  }
}
