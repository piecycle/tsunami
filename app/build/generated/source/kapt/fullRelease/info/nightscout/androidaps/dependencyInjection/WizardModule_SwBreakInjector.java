package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWBreak;

@Module(subcomponents = WizardModule_SwBreakInjector.SWBreakSubcomponent.class)
public abstract class WizardModule_SwBreakInjector {
  private WizardModule_SwBreakInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWBreak.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWBreakSubcomponent.Factory builder);

  @Subcomponent
  public interface SWBreakSubcomponent extends AndroidInjector<SWBreak> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWBreak> {}
  }
}
