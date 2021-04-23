package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandCustomCommand;

@Module(
  subcomponents =
      CommandQueueModule_CommandCustomCommandInjector.CommandCustomCommandSubcomponent.class
)
public abstract class CommandQueueModule_CommandCustomCommandInjector {
  private CommandQueueModule_CommandCustomCommandInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandCustomCommand.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandCustomCommandSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandCustomCommandSubcomponent extends AndroidInjector<CommandCustomCommand> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandCustomCommand> {}
  }
}
