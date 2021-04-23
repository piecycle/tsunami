package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.Comparator;

@Module(subcomponents = AutomationModule_ComparatorInjector.ComparatorSubcomponent.class)
public abstract class AutomationModule_ComparatorInjector {
  private AutomationModule_ComparatorInjector() {}

  @Binds
  @IntoMap
  @ClassKey(Comparator.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ComparatorSubcomponent.Factory builder);

  @Subcomponent
  public interface ComparatorSubcomponent extends AndroidInjector<Comparator> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Comparator> {}
  }
}
