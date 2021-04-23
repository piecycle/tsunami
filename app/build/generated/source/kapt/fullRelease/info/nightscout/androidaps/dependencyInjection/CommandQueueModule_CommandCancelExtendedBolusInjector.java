package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandCancelExtendedBolus;

@Module(
  subcomponents =
      CommandQueueModule_CommandCancelExtendedBolusInjector.CommandCancelExtendedBolusSubcomponent
          .class
)
public abstract class CommandQueueModule_CommandCancelExtendedBolusInjector {
  private CommandQueueModule_CommandCancelExtendedBolusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandCancelExtendedBolus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandCancelExtendedBolusSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandCancelExtendedBolusSubcomponent
      extends AndroidInjector<CommandCancelExtendedBolus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandCancelExtendedBolus> {}
  }
}
