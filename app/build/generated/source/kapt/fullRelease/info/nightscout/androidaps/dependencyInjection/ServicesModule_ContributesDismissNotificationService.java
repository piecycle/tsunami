package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.notifications.DismissNotificationService;

@Module(
  subcomponents =
      ServicesModule_ContributesDismissNotificationService.DismissNotificationServiceSubcomponent
          .class
)
public abstract class ServicesModule_ContributesDismissNotificationService {
  private ServicesModule_ContributesDismissNotificationService() {}

  @Binds
  @IntoMap
  @ClassKey(DismissNotificationService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DismissNotificationServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface DismissNotificationServiceSubcomponent
      extends AndroidInjector<DismissNotificationService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DismissNotificationService> {}
  }
}
