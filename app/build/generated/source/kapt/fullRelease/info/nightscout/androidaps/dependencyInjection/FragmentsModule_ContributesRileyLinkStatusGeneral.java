package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusGeneralFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesRileyLinkStatusGeneral.RileyLinkStatusGeneralFragmentSubcomponent
          .class
)
public abstract class FragmentsModule_ContributesRileyLinkStatusGeneral {
  private FragmentsModule_ContributesRileyLinkStatusGeneral() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkStatusGeneralFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkStatusGeneralFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkStatusGeneralFragmentSubcomponent
      extends AndroidInjector<RileyLinkStatusGeneralFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkStatusGeneralFragment> {}
  }
}
