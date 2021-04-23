package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.services.LocationService;

@Module(subcomponents = ServicesModule_ContributesLocationService.LocationServiceSubcomponent.class)
public abstract class ServicesModule_ContributesLocationService {
  private ServicesModule_ContributesLocationService() {}

  @Binds
  @IntoMap
  @ClassKey(LocationService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LocationServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface LocationServiceSubcomponent extends AndroidInjector<LocationService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LocationService> {}
  }
}
