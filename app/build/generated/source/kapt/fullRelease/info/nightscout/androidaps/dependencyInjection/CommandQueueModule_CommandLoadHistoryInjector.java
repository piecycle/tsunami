package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandLoadHistory;

@Module(
  subcomponents = CommandQueueModule_CommandLoadHistoryInjector.CommandLoadHistorySubcomponent.class
)
public abstract class CommandQueueModule_CommandLoadHistoryInjector {
  private CommandQueueModule_CommandLoadHistoryInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandLoadHistory.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandLoadHistorySubcomponent.Factory builder);

  @Subcomponent
  public interface CommandLoadHistorySubcomponent extends AndroidInjector<CommandLoadHistory> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandLoadHistory> {}
  }
}
