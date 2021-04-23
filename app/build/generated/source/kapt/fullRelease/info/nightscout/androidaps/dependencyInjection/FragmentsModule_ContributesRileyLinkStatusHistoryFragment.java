package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusHistoryFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesRileyLinkStatusHistoryFragment
          .RileyLinkStatusHistoryFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesRileyLinkStatusHistoryFragment {
  private FragmentsModule_ContributesRileyLinkStatusHistoryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkStatusHistoryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkStatusHistoryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkStatusHistoryFragmentSubcomponent
      extends AndroidInjector<RileyLinkStatusHistoryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkStatusHistoryFragment> {}
  }
}
