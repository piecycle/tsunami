package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.CareDialog;

@Module(subcomponents = FragmentsModule_ContributesCareDialog.CareDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesCareDialog {
  private FragmentsModule_ContributesCareDialog() {}

  @Binds
  @IntoMap
  @ClassKey(CareDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CareDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface CareDialogSubcomponent extends AndroidInjector<CareDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CareDialog> {}
  }
}
