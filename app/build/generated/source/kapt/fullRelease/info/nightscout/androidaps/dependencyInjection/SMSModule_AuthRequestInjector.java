package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.smsCommunicator.AuthRequest;

@Module(subcomponents = SMSModule_AuthRequestInjector.AuthRequestSubcomponent.class)
public abstract class SMSModule_AuthRequestInjector {
  private SMSModule_AuthRequestInjector() {}

  @Binds
  @IntoMap
  @ClassKey(AuthRequest.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AuthRequestSubcomponent.Factory builder);

  @Subcomponent
  public interface AuthRequestSubcomponent extends AndroidInjector<AuthRequest> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AuthRequest> {}
  }
}
