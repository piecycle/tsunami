package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsExtendedBolusesFragment
          .TreatmentsExtendedBolusesFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsExtendedBolusesFragment {
  private FragmentsModule_ContributesTreatmentsExtendedBolusesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsExtendedBolusesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsExtendedBolusesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsExtendedBolusesFragmentSubcomponent
      extends AndroidInjector<TreatmentsExtendedBolusesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsExtendedBolusesFragment> {}
  }
}
