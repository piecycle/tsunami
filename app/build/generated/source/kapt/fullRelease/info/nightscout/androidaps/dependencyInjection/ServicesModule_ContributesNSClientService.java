package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.nsclient.services.NSClientService;

@Module(subcomponents = ServicesModule_ContributesNSClientService.NSClientServiceSubcomponent.class)
public abstract class ServicesModule_ContributesNSClientService {
  private ServicesModule_ContributesNSClientService() {}

  @Binds
  @IntoMap
  @ClassKey(NSClientService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NSClientServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface NSClientServiceSubcomponent extends AndroidInjector<NSClientService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NSClientService> {}
  }
}
