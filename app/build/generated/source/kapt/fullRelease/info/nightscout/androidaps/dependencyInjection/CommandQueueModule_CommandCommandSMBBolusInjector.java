package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandSMBBolus;

@Module(
  subcomponents =
      CommandQueueModule_CommandCommandSMBBolusInjector.CommandSMBBolusSubcomponent.class
)
public abstract class CommandQueueModule_CommandCommandSMBBolusInjector {
  private CommandQueueModule_CommandCommandSMBBolusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandSMBBolus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandSMBBolusSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandSMBBolusSubcomponent extends AndroidInjector<CommandSMBBolus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandSMBBolus> {}
  }
}
