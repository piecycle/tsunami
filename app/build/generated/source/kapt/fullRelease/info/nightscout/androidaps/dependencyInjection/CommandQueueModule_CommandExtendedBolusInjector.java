package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandExtendedBolus;

@Module(
  subcomponents =
      CommandQueueModule_CommandExtendedBolusInjector.CommandExtendedBolusSubcomponent.class
)
public abstract class CommandQueueModule_CommandExtendedBolusInjector {
  private CommandQueueModule_CommandExtendedBolusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandExtendedBolus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandExtendedBolusSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandExtendedBolusSubcomponent extends AndroidInjector<CommandExtendedBolus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandExtendedBolus> {}
  }
}
