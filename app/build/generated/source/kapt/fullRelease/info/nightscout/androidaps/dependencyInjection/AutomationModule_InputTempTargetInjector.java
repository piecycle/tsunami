package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputTempTarget;

@Module(subcomponents = AutomationModule_InputTempTargetInjector.InputTempTargetSubcomponent.class)
public abstract class AutomationModule_InputTempTargetInjector {
  private AutomationModule_InputTempTargetInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputTempTarget.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputTempTargetSubcomponent.Factory builder);

  @Subcomponent
  public interface InputTempTargetSubcomponent extends AndroidInjector<InputTempTarget> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputTempTarget> {}
  }
}
