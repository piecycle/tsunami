package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.profile.ns.NSProfileFragment;

@Module(
  subcomponents = FragmentsModule_ContributesNSProfileFragment.NSProfileFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesNSProfileFragment {
  private FragmentsModule_ContributesNSProfileFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NSProfileFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NSProfileFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NSProfileFragmentSubcomponent extends AndroidInjector<NSProfileFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NSProfileFragment> {}
  }
}
