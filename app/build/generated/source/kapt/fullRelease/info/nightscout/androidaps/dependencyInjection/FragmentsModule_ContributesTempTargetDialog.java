package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.TempTargetDialog;

@Module(
  subcomponents = FragmentsModule_ContributesTempTargetDialog.TempTargetDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesTempTargetDialog {
  private FragmentsModule_ContributesTempTargetDialog() {}

  @Binds
  @IntoMap
  @ClassKey(TempTargetDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TempTargetDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface TempTargetDialogSubcomponent extends AndroidInjector<TempTargetDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TempTargetDialog> {}
  }
}
