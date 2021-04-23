package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWButton;

@Module(subcomponents = WizardModule_SwButtonInjector.SWButtonSubcomponent.class)
public abstract class WizardModule_SwButtonInjector {
  private WizardModule_SwButtonInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWButton.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWButtonSubcomponent.Factory builder);

  @Subcomponent
  public interface SWButtonSubcomponent extends AndroidInjector<SWButton> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWButton> {}
  }
}
