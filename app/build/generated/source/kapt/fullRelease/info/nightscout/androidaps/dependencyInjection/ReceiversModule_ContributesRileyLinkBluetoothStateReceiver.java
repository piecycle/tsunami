package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkBluetoothStateReceiver;

@Module(
  subcomponents =
      ReceiversModule_ContributesRileyLinkBluetoothStateReceiver
          .RileyLinkBluetoothStateReceiverSubcomponent.class
)
public abstract class ReceiversModule_ContributesRileyLinkBluetoothStateReceiver {
  private ReceiversModule_ContributesRileyLinkBluetoothStateReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkBluetoothStateReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkBluetoothStateReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkBluetoothStateReceiverSubcomponent
      extends AndroidInjector<RileyLinkBluetoothStateReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkBluetoothStateReceiver> {}
  }
}
