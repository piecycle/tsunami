package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBolusAgo;

@Module(subcomponents = AutomationModule_TriggerBolusAgoInjector.TriggerBolusAgoSubcomponent.class)
public abstract class AutomationModule_TriggerBolusAgoInjector {
  private AutomationModule_TriggerBolusAgoInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerBolusAgo.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerBolusAgoSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerBolusAgoSubcomponent extends AndroidInjector<TriggerBolusAgo> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerBolusAgo> {}
  }
}
