package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.CalibrationDialog;

@Module(
  subcomponents = FragmentsModule_ContributesCalibrationDialog.CalibrationDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesCalibrationDialog {
  private FragmentsModule_ContributesCalibrationDialog() {}

  @Binds
  @IntoMap
  @ClassKey(CalibrationDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CalibrationDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface CalibrationDialogSubcomponent extends AndroidInjector<CalibrationDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CalibrationDialog> {}
  }
}
