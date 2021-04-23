package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWInfotext;

@Module(subcomponents = WizardModule_SwInfotextInjector.SWInfotextSubcomponent.class)
public abstract class WizardModule_SwInfotextInjector {
  private WizardModule_SwInfotextInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWInfotext.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWInfotextSubcomponent.Factory builder);

  @Subcomponent
  public interface SWInfotextSubcomponent extends AndroidInjector<SWInfotext> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWInfotext> {}
  }
}
