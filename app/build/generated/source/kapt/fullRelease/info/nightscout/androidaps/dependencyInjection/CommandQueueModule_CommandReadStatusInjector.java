package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandReadStatus;

@Module(
  subcomponents = CommandQueueModule_CommandReadStatusInjector.CommandReadStatusSubcomponent.class
)
public abstract class CommandQueueModule_CommandReadStatusInjector {
  private CommandQueueModule_CommandReadStatusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandReadStatus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandReadStatusSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandReadStatusSubcomponent extends AndroidInjector<CommandReadStatus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandReadStatus> {}
  }
}
