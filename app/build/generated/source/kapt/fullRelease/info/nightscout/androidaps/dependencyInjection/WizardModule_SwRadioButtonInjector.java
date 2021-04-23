package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWRadioButton;

@Module(subcomponents = WizardModule_SwRadioButtonInjector.SWRadioButtonSubcomponent.class)
public abstract class WizardModule_SwRadioButtonInjector {
  private WizardModule_SwRadioButtonInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWRadioButton.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWRadioButtonSubcomponent.Factory builder);

  @Subcomponent
  public interface SWRadioButtonSubcomponent extends AndroidInjector<SWRadioButton> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWRadioButton> {}
  }
}
