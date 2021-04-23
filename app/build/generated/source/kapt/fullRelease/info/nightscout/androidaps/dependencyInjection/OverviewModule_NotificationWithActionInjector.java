package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.notifications.NotificationWithAction;

@Module(
  subcomponents =
      OverviewModule_NotificationWithActionInjector.NotificationWithActionSubcomponent.class
)
public abstract class OverviewModule_NotificationWithActionInjector {
  private OverviewModule_NotificationWithActionInjector() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationWithAction.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationWithActionSubcomponent.Factory builder);

  @Subcomponent
  public interface NotificationWithActionSubcomponent
      extends AndroidInjector<NotificationWithAction> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NotificationWithAction> {}
  }
}
