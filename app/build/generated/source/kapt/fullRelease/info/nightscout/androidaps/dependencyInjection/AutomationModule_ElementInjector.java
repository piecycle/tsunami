package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.Element;

@Module(subcomponents = AutomationModule_ElementInjector.ElementSubcomponent.class)
public abstract class AutomationModule_ElementInjector {
  private AutomationModule_ElementInjector() {}

  @Binds
  @IntoMap
  @ClassKey(Element.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ElementSubcomponent.Factory builder);

  @Subcomponent
  public interface ElementSubcomponent extends AndroidInjector<Element> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Element> {}
  }
}
