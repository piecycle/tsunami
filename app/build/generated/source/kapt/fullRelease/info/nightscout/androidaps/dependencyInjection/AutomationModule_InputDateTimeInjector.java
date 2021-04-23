package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputDateTime;

@Module(subcomponents = AutomationModule_InputDateTimeInjector.InputDateTimeSubcomponent.class)
public abstract class AutomationModule_InputDateTimeInjector {
  private AutomationModule_InputDateTimeInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputDateTime.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputDateTimeSubcomponent.Factory builder);

  @Subcomponent
  public interface InputDateTimeSubcomponent extends AndroidInjector<InputDateTime> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputDateTime> {}
  }
}
