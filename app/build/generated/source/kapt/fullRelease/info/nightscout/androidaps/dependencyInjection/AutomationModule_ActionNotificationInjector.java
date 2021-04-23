package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionNotification;

@Module(
  subcomponents = AutomationModule_ActionNotificationInjector.ActionNotificationSubcomponent.class
)
public abstract class AutomationModule_ActionNotificationInjector {
  private AutomationModule_ActionNotificationInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionNotification.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionNotificationSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionNotificationSubcomponent extends AndroidInjector<ActionNotification> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionNotification> {}
  }
}
