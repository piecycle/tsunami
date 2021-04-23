package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsBolusFragment.TreatmentsBolusFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsBolusFragment {
  private FragmentsModule_ContributesTreatmentsBolusFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsBolusFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsBolusFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsBolusFragmentSubcomponent
      extends AndroidInjector<TreatmentsBolusFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsBolusFragment> {}
  }
}
