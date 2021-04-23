package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWFragment;

@Module(subcomponents = WizardModule_SwFragmentInjector.SWFragmentSubcomponent.class)
public abstract class WizardModule_SwFragmentInjector {
  private WizardModule_SwFragmentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SWFragmentSubcomponent extends AndroidInjector<SWFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWFragment> {}
  }
}
