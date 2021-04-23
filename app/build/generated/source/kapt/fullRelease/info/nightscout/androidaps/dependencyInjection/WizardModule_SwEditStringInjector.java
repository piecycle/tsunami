package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWEditString;

@Module(subcomponents = WizardModule_SwEditStringInjector.SWEditStringSubcomponent.class)
public abstract class WizardModule_SwEditStringInjector {
  private WizardModule_SwEditStringInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWEditString.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWEditStringSubcomponent.Factory builder);

  @Subcomponent
  public interface SWEditStringSubcomponent extends AndroidInjector<SWEditString> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWEditString> {}
  }
}
