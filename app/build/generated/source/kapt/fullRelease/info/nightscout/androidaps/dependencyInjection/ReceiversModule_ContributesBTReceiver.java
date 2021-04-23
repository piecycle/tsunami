package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.BTReceiver;

@Module(subcomponents = ReceiversModule_ContributesBTReceiver.BTReceiverSubcomponent.class)
public abstract class ReceiversModule_ContributesBTReceiver {
  private ReceiversModule_ContributesBTReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(BTReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BTReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface BTReceiverSubcomponent extends AndroidInjector<BTReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BTReceiver> {}
  }
}
