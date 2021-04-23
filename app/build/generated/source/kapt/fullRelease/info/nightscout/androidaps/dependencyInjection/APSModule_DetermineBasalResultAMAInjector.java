package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSAMA.DetermineBasalResultAMA;

@Module(
  subcomponents =
      APSModule_DetermineBasalResultAMAInjector.DetermineBasalResultAMASubcomponent.class
)
public abstract class APSModule_DetermineBasalResultAMAInjector {
  private APSModule_DetermineBasalResultAMAInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DetermineBasalResultAMA.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetermineBasalResultAMASubcomponent.Factory builder);

  @Subcomponent
  public interface DetermineBasalResultAMASubcomponent
      extends AndroidInjector<DetermineBasalResultAMA> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetermineBasalResultAMA> {}
  }
}
