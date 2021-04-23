package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerIob;

@Module(subcomponents = AutomationModule_TriggerIobInjector.TriggerIobSubcomponent.class)
public abstract class AutomationModule_TriggerIobInjector {
  private AutomationModule_TriggerIobInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerIob.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerIobSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerIobSubcomponent extends AndroidInjector<TriggerIob> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerIob> {}
  }
}
