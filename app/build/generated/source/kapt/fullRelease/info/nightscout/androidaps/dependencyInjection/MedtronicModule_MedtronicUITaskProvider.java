package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.comm.ui.MedtronicUITask;

@Module(subcomponents = MedtronicModule_MedtronicUITaskProvider.MedtronicUITaskSubcomponent.class)
public abstract class MedtronicModule_MedtronicUITaskProvider {
  private MedtronicModule_MedtronicUITaskProvider() {}

  @Binds
  @IntoMap
  @ClassKey(MedtronicUITask.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MedtronicUITaskSubcomponent.Factory builder);

  @Subcomponent
  public interface MedtronicUITaskSubcomponent extends AndroidInjector<MedtronicUITask> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MedtronicUITask> {}
  }
}
