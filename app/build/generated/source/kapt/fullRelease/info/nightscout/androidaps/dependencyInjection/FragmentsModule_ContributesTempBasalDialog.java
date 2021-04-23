package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.TempBasalDialog;

@Module(
  subcomponents = FragmentsModule_ContributesTempBasalDialog.TempBasalDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesTempBasalDialog {
  private FragmentsModule_ContributesTempBasalDialog() {}

  @Binds
  @IntoMap
  @ClassKey(TempBasalDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TempBasalDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface TempBasalDialogSubcomponent extends AndroidInjector<TempBasalDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TempBasalDialog> {}
  }
}
