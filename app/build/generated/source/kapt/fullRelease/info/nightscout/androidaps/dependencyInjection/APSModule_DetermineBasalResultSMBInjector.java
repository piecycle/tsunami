package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSSMB.DetermineBasalResultSMB;

@Module(
  subcomponents =
      APSModule_DetermineBasalResultSMBInjector.DetermineBasalResultSMBSubcomponent.class
)
public abstract class APSModule_DetermineBasalResultSMBInjector {
  private APSModule_DetermineBasalResultSMBInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DetermineBasalResultSMB.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DetermineBasalResultSMBSubcomponent.Factory builder);

  @Subcomponent
  public interface DetermineBasalResultSMBSubcomponent
      extends AndroidInjector<DetermineBasalResultSMB> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DetermineBasalResultSMB> {}
  }
}
