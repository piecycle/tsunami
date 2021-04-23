package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerPumpLastConnection;

@Module(
  subcomponents =
      AutomationModule_TriggerPumpLastConnectionInjector.TriggerPumpLastConnectionSubcomponent.class
)
public abstract class AutomationModule_TriggerPumpLastConnectionInjector {
  private AutomationModule_TriggerPumpLastConnectionInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerPumpLastConnection.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerPumpLastConnectionSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerPumpLastConnectionSubcomponent
      extends AndroidInjector<TriggerPumpLastConnection> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerPumpLastConnection> {}
  }
}
