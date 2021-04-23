package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.openhumans.OpenHumansFragment;

@Module(
  subcomponents = FragmentsModule_ContributesOpenHumansFragment.OpenHumansFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesOpenHumansFragment {
  private FragmentsModule_ContributesOpenHumansFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OpenHumansFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OpenHumansFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface OpenHumansFragmentSubcomponent extends AndroidInjector<OpenHumansFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OpenHumansFragment> {}
  }
}
