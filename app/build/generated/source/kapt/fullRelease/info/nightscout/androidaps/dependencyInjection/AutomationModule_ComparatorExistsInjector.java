package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.ComparatorExists;

@Module(
  subcomponents = AutomationModule_ComparatorExistsInjector.ComparatorExistsSubcomponent.class
)
public abstract class AutomationModule_ComparatorExistsInjector {
  private AutomationModule_ComparatorExistsInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ComparatorExists.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ComparatorExistsSubcomponent.Factory builder);

  @Subcomponent
  public interface ComparatorExistsSubcomponent extends AndroidInjector<ComparatorExists> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ComparatorExists> {}
  }
}
