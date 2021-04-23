package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSAMA.DetermineBasalAdapterAMAJS;

@Module(
  subcomponents =
      APSModule_DetermineBasalAdapterAMAJSInjector.DetermineBasalAdapterAMAJSSubcomponent.class
)
public abstract class APSModule_DetermineBasalAdapterAMAJSInjector {
  private APSModule_DetermineBasalAdapterAMAJSInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DetermineBasalAdapterAMAJS.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetermineBasalAdapterAMAJSSubcomponent.Factory builder);

  @Subcomponent
  public interface DetermineBasalAdapterAMAJSSubcomponent
      extends AndroidInjector<DetermineBasalAdapterAMAJS> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetermineBasalAdapterAMAJS> {}
  }
}
