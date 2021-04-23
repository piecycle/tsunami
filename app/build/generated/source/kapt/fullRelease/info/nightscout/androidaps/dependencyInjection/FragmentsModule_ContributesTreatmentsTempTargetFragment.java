package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTempTargetFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesTreatmentsTempTargetFragment
          .TreatmentsTempTargetFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentsTempTargetFragment {
  private FragmentsModule_ContributesTreatmentsTempTargetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentsTempTargetFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentsTempTargetFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentsTempTargetFragmentSubcomponent
      extends AndroidInjector<TreatmentsTempTargetFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentsTempTargetFragment> {}
  }
}
