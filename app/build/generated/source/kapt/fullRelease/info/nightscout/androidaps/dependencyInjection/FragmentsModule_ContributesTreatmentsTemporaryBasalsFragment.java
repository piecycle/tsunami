package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTemporaryBasalsFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsTemporaryBasalsFragment
          .TreatmentsTemporaryBasalsFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsTemporaryBasalsFragment {
  private FragmentsModule_ContributesTreatmentsTemporaryBasalsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsTemporaryBasalsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsTemporaryBasalsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsTemporaryBasalsFragmentSubcomponent
      extends AndroidInjector<TreatmentsTemporaryBasalsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsTemporaryBasalsFragment> {}
  }
}
