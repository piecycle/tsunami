package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.dialogs.EditActionDialog;

@Module(
  subcomponents = FragmentsModule_ContributesEditActionDialog.EditActionDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesEditActionDialog {
  private FragmentsModule_ContributesEditActionDialog() {}

  @Binds
  @IntoMap
  @ClassKey(EditActionDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditActionDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface EditActionDialogSubcomponent extends AndroidInjector<EditActionDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditActionDialog> {}
  }
}
