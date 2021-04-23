package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.nsclient.NSClientFragment;

@Module(
  subcomponents = FragmentsModule_ContributesNSClientFragment.NSClientFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesNSClientFragment {
  private FragmentsModule_ContributesNSClientFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NSClientFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NSClientFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NSClientFragmentSubcomponent extends AndroidInjector<NSClientFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NSClientFragment> {}
  }
}
