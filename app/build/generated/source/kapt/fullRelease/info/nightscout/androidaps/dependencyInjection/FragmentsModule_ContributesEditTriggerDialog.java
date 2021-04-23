package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.dialogs.EditTriggerDialog;

@Module(
  subcomponents = FragmentsModule_ContributesEditTriggerDialog.EditTriggerDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesEditTriggerDialog {
  private FragmentsModule_ContributesEditTriggerDialog() {}

  @Binds
  @IntoMap
  @ClassKey(EditTriggerDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditTriggerDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface EditTriggerDialogSubcomponent extends AndroidInjector<EditTriggerDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditTriggerDialog> {}
  }
}
