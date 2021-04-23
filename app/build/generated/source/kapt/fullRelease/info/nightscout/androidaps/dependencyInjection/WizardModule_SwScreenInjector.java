package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.SWScreen;

@Module(subcomponents = WizardModule_SwScreenInjector.SWScreenSubcomponent.class)
public abstract class WizardModule_SwScreenInjector {
  private WizardModule_SwScreenInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWScreen.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWScreenSubcomponent.Factory builder);

  @Subcomponent
  public interface SWScreenSubcomponent extends AndroidInjector<SWScreen> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWScreen> {}
  }
}
