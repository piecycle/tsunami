package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandInsightSetTBROverNotification;

@Module(
  subcomponents =
      CommandQueueModule_CommandInsightSetTBROverNotificationInjector
          .CommandInsightSetTBROverNotificationSubcomponent.class
)
public abstract class CommandQueueModule_CommandInsightSetTBROverNotificationInjector {
  private CommandQueueModule_CommandInsightSetTBROverNotificationInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandInsightSetTBROverNotification.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandInsightSetTBROverNotificationSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandInsightSetTBROverNotificationSubcomponent
      extends AndroidInjector<CommandInsightSetTBROverNotification> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandInsightSetTBROverNotification> {}
  }
}
