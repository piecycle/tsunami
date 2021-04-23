package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputPercent;

@Module(subcomponents = AutomationModule_InputPercentInjector.InputPercentSubcomponent.class)
public abstract class AutomationModule_InputPercentInjector {
  private AutomationModule_InputPercentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputPercent.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputPercentSubcomponent.Factory builder);

  @Subcomponent
  public interface InputPercentSubcomponent extends AndroidInjector<InputPercent> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputPercent> {}
  }
}
