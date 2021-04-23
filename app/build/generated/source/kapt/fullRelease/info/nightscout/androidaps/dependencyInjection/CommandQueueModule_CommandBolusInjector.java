package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandBolus;

@Module(subcomponents = CommandQueueModule_CommandBolusInjector.CommandBolusSubcomponent.class)
public abstract class CommandQueueModule_CommandBolusInjector {
  private CommandQueueModule_CommandBolusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandBolus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandBolusSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandBolusSubcomponent extends AndroidInjector<CommandBolus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandBolus> {}
  }
}
