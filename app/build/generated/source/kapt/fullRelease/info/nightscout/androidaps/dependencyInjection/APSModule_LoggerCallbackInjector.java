package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.logger.LoggerCallback;

@Module(subcomponents = APSModule_LoggerCallbackInjector.LoggerCallbackSubcomponent.class)
public abstract class APSModule_LoggerCallbackInjector {
  private APSModule_LoggerCallbackInjector() {}

  @Binds
  @IntoMap
  @ClassKey(LoggerCallback.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoggerCallbackSubcomponent.Factory builder);

  @Subcomponent
  public interface LoggerCallbackSubcomponent extends AndroidInjector<LoggerCallback> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoggerCallback> {}
  }
}
