package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWEditNumberWithUnits;

@Module(
  subcomponents = WizardModule_SwEditNumberWithUnitsInjector.SWEditNumberWithUnitsSubcomponent.class
)
public abstract class WizardModule_SwEditNumberWithUnitsInjector {
  private WizardModule_SwEditNumberWithUnitsInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWEditNumberWithUnits.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWEditNumberWithUnitsSubcomponent.Factory builder);

  @Subcomponent
  public interface SWEditNumberWithUnitsSubcomponent
      extends AndroidInjector<SWEditNumberWithUnits> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWEditNumberWithUnits> {}
  }
}
