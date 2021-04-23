package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg;

@Module(subcomponents = AutomationModule_TriggerBgInjector.TriggerBgSubcomponent.class)
public abstract class AutomationModule_TriggerBgInjector {
  private AutomationModule_TriggerBgInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TriggerBg.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TriggerBgSubcomponent.Factory builder);

  @Subcomponent
  public interface TriggerBgSubcomponent extends AndroidInjector<TriggerBg> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TriggerBg> {}
  }
}
