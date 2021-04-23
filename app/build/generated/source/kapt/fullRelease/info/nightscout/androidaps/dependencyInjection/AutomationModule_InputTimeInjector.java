package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputTime;

@Module(subcomponents = AutomationModule_InputTimeInjector.InputTimeSubcomponent.class)
public abstract class AutomationModule_InputTimeInjector {
  private AutomationModule_InputTimeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputTime.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputTimeSubcomponent.Factory builder);

  @Subcomponent
  public interface InputTimeSubcomponent extends AndroidInjector<InputTime> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputTime> {}
  }
}
