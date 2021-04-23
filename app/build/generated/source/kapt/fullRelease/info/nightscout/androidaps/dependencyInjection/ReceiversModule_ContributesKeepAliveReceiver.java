package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.KeepAliveReceiver;

@Module(
  subcomponents = ReceiversModule_ContributesKeepAliveReceiver.KeepAliveReceiverSubcomponent.class
)
public abstract class ReceiversModule_ContributesKeepAliveReceiver {
  private ReceiversModule_ContributesKeepAliveReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(KeepAliveReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      KeepAliveReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface KeepAliveReceiverSubcomponent extends AndroidInjector<KeepAliveReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<KeepAliveReceiver> {}
  }
}
