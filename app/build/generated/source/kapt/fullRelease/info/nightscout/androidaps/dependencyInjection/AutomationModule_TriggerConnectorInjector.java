package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector;

@Module(
  subcomponents = AutomationModule_TriggerConnectorInjector.TriggerConnectorSubcomponent.class
)
public abstract class AutomationModule_TriggerConnectorInjector {
  private AutomationModule_TriggerConnectorInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerConnector.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerConnectorSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerConnectorSubcomponent extends AndroidInjector<TriggerConnector> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerConnector> {}
  }
}
