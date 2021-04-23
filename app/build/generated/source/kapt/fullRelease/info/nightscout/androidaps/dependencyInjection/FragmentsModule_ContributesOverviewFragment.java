package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.OverviewFragment;

@Module(
  subcomponents = FragmentsModule_ContributesOverviewFragment.OverviewFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesOverviewFragment {
  private FragmentsModule_ContributesOverviewFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OverviewFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OverviewFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface OverviewFragmentSubcomponent extends AndroidInjector<OverviewFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OverviewFragment> {}
  }
}
