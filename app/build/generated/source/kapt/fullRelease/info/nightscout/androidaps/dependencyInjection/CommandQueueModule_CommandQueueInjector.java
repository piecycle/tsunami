package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.CommandQueue;

@Module(subcomponents = CommandQueueModule_CommandQueueInjector.CommandQueueSubcomponent.class)
public abstract class CommandQueueModule_CommandQueueInjector {
  private CommandQueueModule_CommandQueueInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandQueue.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandQueueSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandQueueSubcomponent extends AndroidInjector<CommandQueue> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandQueue> {}
  }
}
