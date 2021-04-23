package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWPlugin;

@Module(subcomponents = WizardModule_SwPluginInjector.SWPluginSubcomponent.class)
public abstract class WizardModule_SwPluginInjector {
  private WizardModule_SwPluginInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWPlugin.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWPluginSubcomponent.Factory builder);

  @Subcomponent
  public interface SWPluginSubcomponent extends AndroidInjector<SWPlugin> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWPlugin> {}
  }
}
