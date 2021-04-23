package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.AutomationEvent;

@Module(subcomponents = AutomationModule_AutomationEventInjector.AutomationEventSubcomponent.class)
public abstract class AutomationModule_AutomationEventInjector {
  private AutomationModule_AutomationEventInjector() {}

  @Binds
  @IntoMap
  @ClassKey(AutomationEvent.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AutomationEventSubcomponent.Factory builder);

  @Subcomponent
  public interface AutomationEventSubcomponent extends AndroidInjector<AutomationEvent> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AutomationEvent> {}
  }
}
