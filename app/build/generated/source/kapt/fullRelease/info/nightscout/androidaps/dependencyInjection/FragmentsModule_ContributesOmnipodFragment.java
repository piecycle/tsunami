package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.omnipod.ui.OmnipodOverviewFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesOmnipodFragment.OmnipodOverviewFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesOmnipodFragment {
  private FragmentsModule_ContributesOmnipodFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OmnipodOverviewFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OmnipodOverviewFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface OmnipodOverviewFragmentSubcomponent
      extends AndroidInjector<OmnipodOverviewFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OmnipodOverviewFragment> {}
  }
}
