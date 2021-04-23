package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandTempBasalPercent;

@Module(
  subcomponents =
      CommandQueueModule_CommandTempBasalPercentInjector.CommandTempBasalPercentSubcomponent.class
)
public abstract class CommandQueueModule_CommandTempBasalPercentInjector {
  private CommandQueueModule_CommandTempBasalPercentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandTempBasalPercent.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandTempBasalPercentSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandTempBasalPercentSubcomponent
      extends AndroidInjector<CommandTempBasalPercent> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandTempBasalPercent> {}
  }
}
