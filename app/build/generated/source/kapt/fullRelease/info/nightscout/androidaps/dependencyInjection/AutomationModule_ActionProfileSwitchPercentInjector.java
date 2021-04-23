package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionProfileSwitchPercent;

@Module(
  subcomponents =
      AutomationModule_ActionProfileSwitchPercentInjector.ActionProfileSwitchPercentSubcomponent
          .class
)
public abstract class AutomationModule_ActionProfileSwitchPercentInjector {
  private AutomationModule_ActionProfileSwitchPercentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionProfileSwitchPercent.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionProfileSwitchPercentSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionProfileSwitchPercentSubcomponent
      extends AndroidInjector<ActionProfileSwitchPercent> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionProfileSwitchPercent> {}
  }
}
