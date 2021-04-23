package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.CarbsDialog;

@Module(subcomponents = FragmentsModule_ContributesCarbsDialog.CarbsDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesCarbsDialog {
  private FragmentsModule_ContributesCarbsDialog() {}

  @Binds
  @IntoMap
  @ClassKey(CarbsDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CarbsDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface CarbsDialogSubcomponent extends AndroidInjector<CarbsDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CarbsDialog> {}
  }
}
