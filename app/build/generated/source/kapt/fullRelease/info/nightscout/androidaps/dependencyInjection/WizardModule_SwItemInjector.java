package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWItem;

@Module(subcomponents = WizardModule_SwItemInjector.SWItemSubcomponent.class)
public abstract class WizardModule_SwItemInjector {
  private WizardModule_SwItemInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWItem.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWItemSubcomponent.Factory builder);

  @Subcomponent
  public interface SWItemSubcomponent extends AndroidInjector<SWItem> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWItem> {}
  }
}
