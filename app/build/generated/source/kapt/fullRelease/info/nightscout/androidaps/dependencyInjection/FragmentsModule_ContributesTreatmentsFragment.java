package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.TreatmentsFragment;

@Module(
  subcomponents = FragmentsModule_ContributesTreatmentsFragment.TreatmentsFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsFragment {
  private FragmentsModule_ContributesTreatmentsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsFragmentSubcomponent extends AndroidInjector<TreatmentsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsFragment> {}
  }
}
