package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.persistentNotification.DummyService;

@Module(subcomponents = ServicesModule_ContributesDummyService.DummyServiceSubcomponent.class)
public abstract class ServicesModule_ContributesDummyService {
  private ServicesModule_ContributesDummyService() {}

  @Binds
  @IntoMap
  @ClassKey(DummyService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DummyServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface DummyServiceSubcomponent extends AndroidInjector<DummyService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DummyService> {}
  }
}
