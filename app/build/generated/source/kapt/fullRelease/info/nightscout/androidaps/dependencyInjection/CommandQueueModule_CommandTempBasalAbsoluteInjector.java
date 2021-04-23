package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandTempBasalAbsolute;

@Module(
  subcomponents =
      CommandQueueModule_CommandTempBasalAbsoluteInjector.CommandTempBasalAbsoluteSubcomponent.class
)
public abstract class CommandQueueModule_CommandTempBasalAbsoluteInjector {
  private CommandQueueModule_CommandTempBasalAbsoluteInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandTempBasalAbsolute.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandTempBasalAbsoluteSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandTempBasalAbsoluteSubcomponent
      extends AndroidInjector<CommandTempBasalAbsolute> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandTempBasalAbsolute> {}
  }
}
