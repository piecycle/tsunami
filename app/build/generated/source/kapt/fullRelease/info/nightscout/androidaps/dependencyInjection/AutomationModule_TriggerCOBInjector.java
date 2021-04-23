package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerCOB;

@Module(subcomponents = AutomationModule_TriggerCOBInjector.TriggerCOBSubcomponent.class)
public abstract class AutomationModule_TriggerCOBInjector {
  private AutomationModule_TriggerCOBInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerCOB.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerCOBSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerCOBSubcomponent extends AndroidInjector<TriggerCOB> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerCOB> {}
  }
}
