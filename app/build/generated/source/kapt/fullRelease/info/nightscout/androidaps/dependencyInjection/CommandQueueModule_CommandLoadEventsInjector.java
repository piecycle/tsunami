package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandLoadEvents;

@Module(
  subcomponents = CommandQueueModule_CommandLoadEventsInjector.CommandLoadEventsSubcomponent.class
)
public abstract class CommandQueueModule_CommandLoadEventsInjector {
  private CommandQueueModule_CommandLoadEventsInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandLoadEvents.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandLoadEventsSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandLoadEventsSubcomponent extends AndroidInjector<CommandLoadEvents> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandLoadEvents> {}
  }
}
