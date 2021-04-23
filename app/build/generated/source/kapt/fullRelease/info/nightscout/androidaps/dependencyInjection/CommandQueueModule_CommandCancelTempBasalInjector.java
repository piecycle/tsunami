package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandCancelTempBasal;

@Module(
  subcomponents =
      CommandQueueModule_CommandCancelTempBasalInjector.CommandCancelTempBasalSubcomponent.class
)
public abstract class CommandQueueModule_CommandCancelTempBasalInjector {
  private CommandQueueModule_CommandCancelTempBasalInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandCancelTempBasal.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandCancelTempBasalSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandCancelTempBasalSubcomponent
      extends AndroidInjector<CommandCancelTempBasal> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandCancelTempBasal> {}
  }
}
