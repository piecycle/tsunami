package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSSMB.DetermineBasalAdapterSMBJS;

@Module(
  subcomponents =
      APSModule_DetermineBasalAdapterSMBJSInjector.DetermineBasalAdapterSMBJSSubcomponent.class
)
public abstract class APSModule_DetermineBasalAdapterSMBJSInjector {
  private APSModule_DetermineBasalAdapterSMBJSInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DetermineBasalAdapterSMBJS.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetermineBasalAdapterSMBJSSubcomponent.Factory builder);

  @Subcomponent
  public interface DetermineBasalAdapterSMBJSSubcomponent
      extends AndroidInjector<DetermineBasalAdapterSMBJS> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetermineBasalAdapterSMBJS> {}
  }
}
