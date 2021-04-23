package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.SmsReceiver;

@Module(subcomponents = ReceiversModule_ContributesSmsReceiver.SmsReceiverSubcomponent.class)
public abstract class ReceiversModule_ContributesSmsReceiver {
  private ReceiversModule_ContributesSmsReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(SmsReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SmsReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface SmsReceiverSubcomponent extends AndroidInjector<SmsReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SmsReceiver> {}
  }
}
