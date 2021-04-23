package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandStopPump;

@Module(
  subcomponents = CommandQueueModule_CommandStopPumpInjector.CommandStopPumpSubcomponent.class
)
public abstract class CommandQueueModule_CommandStopPumpInjector {
  private CommandQueueModule_CommandStopPumpInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandStopPump.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandStopPumpSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandStopPumpSubcomponent extends AndroidInjector<CommandStopPump> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandStopPump> {}
  }
}
