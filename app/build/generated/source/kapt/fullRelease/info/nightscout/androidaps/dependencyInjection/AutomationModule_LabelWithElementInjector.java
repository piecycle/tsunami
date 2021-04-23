package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.LabelWithElement;

@Module(
  subcomponents = AutomationModule_LabelWithElementInjector.LabelWithElementSubcomponent.class
)
public abstract class AutomationModule_LabelWithElementInjector {
  private AutomationModule_LabelWithElementInjector() {}

  @Binds
  @IntoMap
  @ClassKey(LabelWithElement.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LabelWithElementSubcomponent.Factory builder);

  @Subcomponent
  public interface LabelWithElementSubcomponent extends AndroidInjector<LabelWithElement> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LabelWithElement> {}
  }
}
