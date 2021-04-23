package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandStartPump;

@Module(
  subcomponents = CommandQueueModule_CommandStartPumpInjector.CommandStartPumpSubcomponent.class
)
public abstract class CommandQueueModule_CommandStartPumpInjector {
  private CommandQueueModule_CommandStartPumpInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandStartPump.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandStartPumpSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandStartPumpSubcomponent extends AndroidInjector<CommandStartPump> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandStartPump> {}
  }
}
