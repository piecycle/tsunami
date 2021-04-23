package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.profile.local.LocalProfileFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesLocalProfileFragment.LocalProfileFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesLocalProfileFragment {
  private FragmentsModule_ContributesLocalProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LocalProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LocalProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LocalProfileFragmentSubcomponent extends AndroidInjector<LocalProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LocalProfileFragment> {}
  }
}
