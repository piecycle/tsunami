package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerDummy;

@Module(subcomponents = AutomationModule_TriggerDummyInjector.TriggerDummySubcomponent.class)
public abstract class AutomationModule_TriggerDummyInjector {
  private AutomationModule_TriggerDummyInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerDummy.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerDummySubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerDummySubcomponent extends AndroidInjector<TriggerDummy> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerDummy> {}
  }
}
