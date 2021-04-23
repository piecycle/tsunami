package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.dialog.RileyLinkStatusDeviceMedtronic;

@Module(
  subcomponents =
      FragmentsModule_ContributesRileyLinkStatusDeviceMedtronic
          .RileyLinkStatusDeviceMedtronicSubcomponent.class
)
public abstract class FragmentsModule_ContributesRileyLinkStatusDeviceMedtronic {
  private FragmentsModule_ContributesRileyLinkStatusDeviceMedtronic() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkStatusDeviceMedtronic.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkStatusDeviceMedtronicSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkStatusDeviceMedtronicSubcomponent
      extends AndroidInjector<RileyLinkStatusDeviceMedtronic> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkStatusDeviceMedtronic> {}
  }
}
