package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.queue.commands.CommandSetUserSettings;

@Module(
  subcomponents =
      CommandQueueModule_CommandSetUserSettingsInjector.CommandSetUserSettingsSubcomponent.class
)
public abstract class CommandQueueModule_CommandSetUserSettingsInjector {
  private CommandQueueModule_CommandSetUserSettingsInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CommandSetUserSettings.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CommandSetUserSettingsSubcomponent.Factory builder);

  @Subcomponent
  public interface CommandSetUserSettingsSubcomponent
      extends AndroidInjector<CommandSetUserSettings> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CommandSetUserSettings> {}
  }
}
