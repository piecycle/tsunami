package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.AutoStartReceiver;

@Module(
  subcomponents = ReceiversModule_ContributesAutoStartReceiver.AutoStartReceiverSubcomponent.class
)
public abstract class ReceiversModule_ContributesAutoStartReceiver {
  private ReceiversModule_ContributesAutoStartReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(AutoStartReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AutoStartReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface AutoStartReceiverSubcomponent extends AndroidInjector<AutoStartReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AutoStartReceiver> {}
  }
}
