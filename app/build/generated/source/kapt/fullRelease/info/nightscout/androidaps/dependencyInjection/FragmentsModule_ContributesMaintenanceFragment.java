package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesMaintenanceFragment.MaintenanceFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesMaintenanceFragment {
  private FragmentsModule_ContributesMaintenanceFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MaintenanceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MaintenanceFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MaintenanceFragmentSubcomponent extends AndroidInjector<MaintenanceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MaintenanceFragment> {}
  }
}
