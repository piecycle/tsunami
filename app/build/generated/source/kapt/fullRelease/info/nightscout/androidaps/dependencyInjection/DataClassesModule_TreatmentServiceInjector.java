package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.treatments.TreatmentService;

@Module(
  subcomponents = DataClassesModule_TreatmentServiceInjector.TreatmentServiceSubcomponent.class
)
public abstract class DataClassesModule_TreatmentServiceInjector {
  private DataClassesModule_TreatmentServiceInjector() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentServiceSubcomponent extends AndroidInjector<TreatmentService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentService> {}
  }
}
