package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.omnipod.rileylink.service.RileyLinkOmnipodService;

@Module(
  subcomponents =
      ServicesModule_ContributesRileyLinkOmnipodService.RileyLinkOmnipodServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesRileyLinkOmnipodService {
  private ServicesModule_ContributesRileyLinkOmnipodService() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkOmnipodService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkOmnipodServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkOmnipodServiceSubcomponent
      extends AndroidInjector<RileyLinkOmnipodService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkOmnipodService> {}
  }
}
