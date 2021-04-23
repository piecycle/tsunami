package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionSendSMS;

@Module(subcomponents = AutomationModule_ActionSendSMSInjector.ActionSendSMSSubcomponent.class)
public abstract class AutomationModule_ActionSendSMSInjector {
  private AutomationModule_ActionSendSMSInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionSendSMS.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionSendSMSSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionSendSMSSubcomponent extends AndroidInjector<ActionSendSMS> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionSendSMS> {}
  }
}
