package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.wear.WearFragment;

@Module(subcomponents = FragmentsModule_ContributesWearFragment.WearFragmentSubcomponent.class)
public abstract class FragmentsModule_ContributesWearFragment {
  private FragmentsModule_ContributesWearFragment() {}

  @Binds
  @IntoMap
  @ClassKey(WearFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WearFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface WearFragmentSubcomponent extends AndroidInjector<WearFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WearFragment> {}
  }
}
