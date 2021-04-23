package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.medtronic.dialog.MedtronicHistoryActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesMedtronicHistoryActivity.MedtronicHistoryActivitySubcomponent
          .class
)
public abstract class ActivitiesModule_ContributesMedtronicHistoryActivity {
  private ActivitiesModule_ContributesMedtronicHistoryActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MedtronicHistoryActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MedtronicHistoryActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MedtronicHistoryActivitySubcomponent
      extends AndroidInjector<MedtronicHistoryActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MedtronicHistoryActivity> {}
  }
}
