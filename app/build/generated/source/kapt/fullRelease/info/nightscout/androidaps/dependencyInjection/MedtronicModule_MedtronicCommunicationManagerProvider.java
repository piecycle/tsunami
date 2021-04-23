package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.comm.MedtronicCommunicationManager;

@Module(
  subcomponents =
      MedtronicModule_MedtronicCommunicationManagerProvider
          .MedtronicCommunicationManagerSubcomponent.class
)
public abstract class MedtronicModule_MedtronicCommunicationManagerProvider {
  private MedtronicModule_MedtronicCommunicationManagerProvider() {}

  @Binds
  @IntoMap
  @ClassKey(MedtronicCommunicationManager.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MedtronicCommunicationManagerSubcomponent.Factory builder);

  @Subcomponent
  public interface MedtronicCommunicationManagerSubcomponent
      extends AndroidInjector<MedtronicCommunicationManager> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MedtronicCommunicationManager> {}
  }
}
