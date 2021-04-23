package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.InputDouble;

@Module(subcomponents = AutomationModule_InputDoubleInjector.InputDoubleSubcomponent.class)
public abstract class AutomationModule_InputDoubleInjector {
  private AutomationModule_InputDoubleInjector() {}

  @Binds
  @IntoMap
  @ClassKey(InputDouble.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InputDoubleSubcomponent.Factory builder);

  @Subcomponent
  public interface InputDoubleSubcomponent extends AndroidInjector<InputDouble> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InputDouble> {}
  }
}
