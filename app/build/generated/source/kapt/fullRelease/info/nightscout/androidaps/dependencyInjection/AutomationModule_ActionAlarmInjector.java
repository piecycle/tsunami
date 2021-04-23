package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionAlarm;

@Module(subcomponents = AutomationModule_ActionAlarmInjector.ActionAlarmSubcomponent.class)
public abstract class AutomationModule_ActionAlarmInjector {
  private AutomationModule_ActionAlarmInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionAlarm.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionAlarmSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionAlarmSubcomponent extends AndroidInjector<ActionAlarm> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionAlarm> {}
  }
}
