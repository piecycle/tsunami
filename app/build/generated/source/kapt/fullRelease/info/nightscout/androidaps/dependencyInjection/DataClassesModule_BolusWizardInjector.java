package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.utils.wizard.BolusWizard;

@Module(subcomponents = DataClassesModule_BolusWizardInjector.BolusWizardSubcomponent.class)
public abstract class DataClassesModule_BolusWizardInjector {
  private DataClassesModule_BolusWizardInjector() {}

  @Binds
  @IntoMap
  @ClassKey(BolusWizard.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BolusWizardSubcomponent.Factory builder);

  @Subcomponent
  public interface BolusWizardSubcomponent extends AndroidInjector<BolusWizard> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BolusWizard> {}
  }
}
