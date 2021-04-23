package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.services.DataService;

@Module(subcomponents = ServicesModule_ContributesDataService.DataServiceSubcomponent.class)
public abstract class ServicesModule_ContributesDataService {
  private ServicesModule_ContributesDataService() {}

  @Binds
  @IntoMap
  @ClassKey(DataService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DataServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface DataServiceSubcomponent extends AndroidInjector<DataService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DataService> {}
  }
}
