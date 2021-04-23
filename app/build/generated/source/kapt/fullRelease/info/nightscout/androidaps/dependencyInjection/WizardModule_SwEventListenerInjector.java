package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.SWEventListener;

@Module(subcomponents = WizardModule_SwEventListenerInjector.SWEventListenerSubcomponent.class)
public abstract class WizardModule_SwEventListenerInjector {
  private WizardModule_SwEventListenerInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWEventListener.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWEventListenerSubcomponent.Factory builder);

  @Subcomponent
  public interface SWEventListenerSubcomponent extends AndroidInjector<SWEventListener> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWEventListener> {}
  }
}
