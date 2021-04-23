package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect;

@Module(
  subcomponents = AutomationModule_ComparatorConnectInjector.ComparatorConnectSubcomponent.class
)
public abstract class AutomationModule_ComparatorConnectInjector {
  private AutomationModule_ComparatorConnectInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ComparatorConnect.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ComparatorConnectSubcomponent.Factory builder);

  @Subcomponent
  public interface ComparatorConnectSubcomponent extends AndroidInjector<ComparatorConnect> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ComparatorConnect> {}
  }
}
