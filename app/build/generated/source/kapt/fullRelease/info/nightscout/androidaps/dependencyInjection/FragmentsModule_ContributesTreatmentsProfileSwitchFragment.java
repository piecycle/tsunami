package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsProfileSwitchFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsProfileSwitchFragment
          .TreatmentsProfileSwitchFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsProfileSwitchFragment {
  private FragmentsModule_ContributesTreatmentsProfileSwitchFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsProfileSwitchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsProfileSwitchFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsProfileSwitchFragmentSubcomponent
      extends AndroidInjector<TreatmentsProfileSwitchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsProfileSwitchFragment> {}
  }
}
