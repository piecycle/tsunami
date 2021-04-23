package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.ChargingStateReceiver;

@Module(
  subcomponents =
      ReceiversModule_ContributesChargingStateReceiver.ChargingStateReceiverSubcomponent.class
)
public abstract class ReceiversModule_ContributesChargingStateReceiver {
  private ReceiversModule_ContributesChargingStateReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(ChargingStateReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChargingStateReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface ChargingStateReceiverSubcomponent
      extends AndroidInjector<ChargingStateReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ChargingStateReceiver> {}
  }
}
