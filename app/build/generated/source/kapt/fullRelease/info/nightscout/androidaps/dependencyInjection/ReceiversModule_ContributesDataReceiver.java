package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.receivers.DataReceiver;

@Module(subcomponents = ReceiversModule_ContributesDataReceiver.DataReceiverSubcomponent.class)
public abstract class ReceiversModule_ContributesDataReceiver {
  private ReceiversModule_ContributesDataReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(DataReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DataReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface DataReceiverSubcomponent extends AndroidInjector<DataReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DataReceiver> {}
  }
}
