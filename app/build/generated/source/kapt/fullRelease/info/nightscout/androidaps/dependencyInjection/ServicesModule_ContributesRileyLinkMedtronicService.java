package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.service.RileyLinkMedtronicService;

@Module(
  subcomponents =
      ServicesModule_ContributesRileyLinkMedtronicService.RileyLinkMedtronicServiceSubcomponent
          .class
)
public abstract class ServicesModule_ContributesRileyLinkMedtronicService {
  private ServicesModule_ContributesRileyLinkMedtronicService() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkMedtronicService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkMedtronicServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkMedtronicServiceSubcomponent
      extends AndroidInjector<RileyLinkMedtronicService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkMedtronicService> {}
  }
}
