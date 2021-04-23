package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsCareportalFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsCareportalFragment
          .TreatmentsCareportalFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsCareportalFragment {
  private FragmentsModule_ContributesTreatmentsCareportalFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsCareportalFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsCareportalFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsCareportalFragmentSubcomponent
      extends AndroidInjector<TreatmentsCareportalFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsCareportalFragment> {}
  }
}
