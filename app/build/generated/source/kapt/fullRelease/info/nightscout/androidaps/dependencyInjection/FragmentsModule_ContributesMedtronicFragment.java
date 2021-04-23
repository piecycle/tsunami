package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.MedtronicFragment;

@Module(
  subcomponents = FragmentsModule_ContributesMedtronicFragment.MedtronicFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesMedtronicFragment {
  private FragmentsModule_ContributesMedtronicFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MedtronicFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MedtronicFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MedtronicFragmentSubcomponent extends AndroidInjector<MedtronicFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MedtronicFragment> {}
  }
}
