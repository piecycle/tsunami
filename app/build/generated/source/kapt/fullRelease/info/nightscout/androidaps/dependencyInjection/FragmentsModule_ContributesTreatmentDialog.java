package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.TreatmentDialog;

@Module(
  subcomponents = FragmentsModule_ContributesTreatmentDialog.TreatmentDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesTreatmentDialog {
  private FragmentsModule_ContributesTreatmentDialog() {}

  @Binds
  @IntoMap
  @ClassKey(TreatmentDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface TreatmentDialogSubcomponent extends AndroidInjector<TreatmentDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentDialog> {}
  }
}
