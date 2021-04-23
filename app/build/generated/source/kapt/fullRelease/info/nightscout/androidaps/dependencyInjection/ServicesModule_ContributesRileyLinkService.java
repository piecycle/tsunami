package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkService;

@Module(
  subcomponents = ServicesModule_ContributesRileyLinkService.RileyLinkServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesRileyLinkService {
  private ServicesModule_ContributesRileyLinkService() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkServiceSubcomponent extends AndroidInjector<RileyLinkService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkService> {}
  }
}
