package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputBg;

@Module(subcomponents = AutomationModule_InputBgInjector.InputBgSubcomponent.class)
public abstract class AutomationModule_InputBgInjector {
  private AutomationModule_InputBgInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputBg.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputBgSubcomponent.Factory builder);

  @Subcomponent
  public interface InputBgSubcomponent extends AndroidInjector<InputBg> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputBg> {}
  }
}
