package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWEditUrl;

@Module(subcomponents = WizardModule_SwEditUrlInjector.SWEditUrlSubcomponent.class)
public abstract class WizardModule_SwEditUrlInjector {
  private WizardModule_SwEditUrlInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWEditUrl.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWEditUrlSubcomponent.Factory builder);

  @Subcomponent
  public interface SWEditUrlSubcomponent extends AndroidInjector<SWEditUrl> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWEditUrl> {}
  }
}
