package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandSetProfile;

@Module(
  subcomponents = CommandQueueModule_CommandSetProfileInjector.CommandSetProfileSubcomponent.class
)
public abstract class CommandQueueModule_CommandSetProfileInjector {
  private CommandQueueModule_CommandSetProfileInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandSetProfile.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandSetProfileSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandSetProfileSubcomponent extends AndroidInjector<CommandSetProfile> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandSetProfile> {}
  }
}
