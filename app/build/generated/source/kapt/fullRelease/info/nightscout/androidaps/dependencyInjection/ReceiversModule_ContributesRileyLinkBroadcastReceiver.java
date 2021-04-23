package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkBroadcastReceiver;

@Module(
  subcomponents =
      ReceiversModule_ContributesRileyLinkBroadcastReceiver.RileyLinkBroadcastReceiverSubcomponent
          .class
)
public abstract class ReceiversModule_ContributesRileyLinkBroadcastReceiver {
  private ReceiversModule_ContributesRileyLinkBroadcastReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkBroadcastReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkBroadcastReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkBroadcastReceiverSubcomponent
      extends AndroidInjector<RileyLinkBroadcastReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkBroadcastReceiver> {}
  }
}
