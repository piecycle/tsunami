package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.TimeDateOrTZChangeReceiver;

@Module(
  subcomponents =
      ReceiversModule_ContributesTimeDateOrTZChangeReceiver.TimeDateOrTZChangeReceiverSubcomponent
          .class
)
public abstract class ReceiversModule_ContributesTimeDateOrTZChangeReceiver {
  private ReceiversModule_ContributesTimeDateOrTZChangeReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(TimeDateOrTZChangeReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TimeDateOrTZChangeReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface TimeDateOrTZChangeReceiverSubcomponent
      extends AndroidInjector<TimeDateOrTZChangeReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TimeDateOrTZChangeReceiver> {}
  }
}
