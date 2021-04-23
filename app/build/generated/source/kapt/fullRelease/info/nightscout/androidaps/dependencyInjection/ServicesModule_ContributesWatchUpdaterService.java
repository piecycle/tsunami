package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService;

@Module(
  subcomponents =
      ServicesModule_ContributesWatchUpdaterService.WatchUpdaterServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesWatchUpdaterService {
  private ServicesModule_ContributesWatchUpdaterService() {}

  @Binds
  @IntoMap
  @ClassKey(WatchUpdaterService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WatchUpdaterServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface WatchUpdaterServiceSubcomponent extends AndroidInjector<WatchUpdaterService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WatchUpdaterService> {}
  }
}
