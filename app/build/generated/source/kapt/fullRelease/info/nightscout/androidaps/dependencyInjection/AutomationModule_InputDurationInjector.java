package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputDuration;

@Module(subcomponents = AutomationModule_InputDurationInjector.InputDurationSubcomponent.class)
public abstract class AutomationModule_InputDurationInjector {
  private AutomationModule_InputDurationInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputDuration.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputDurationSubcomponent.Factory builder);

  @Subcomponent
  public interface InputDurationSubcomponent extends AndroidInjector<InputDuration> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputDuration> {}
  }
}
