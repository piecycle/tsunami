package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandLoadTDDs;

@Module(
  subcomponents = CommandQueueModule_CommandLoadTDDsInjector.CommandLoadTDDsSubcomponent.class
)
public abstract class CommandQueueModule_CommandLoadTDDsInjector {
  private CommandQueueModule_CommandLoadTDDsInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandLoadTDDs.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandLoadTDDsSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandLoadTDDsSubcomponent extends AndroidInjector<CommandLoadTDDs> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandLoadTDDs> {}
  }
}
