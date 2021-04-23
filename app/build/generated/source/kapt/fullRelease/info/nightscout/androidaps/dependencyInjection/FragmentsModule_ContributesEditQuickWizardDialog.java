package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.dialogs.EditQuickWizardDialog;

@Module(
  subcomponents =
      FragmentsModule_ContributesEditQuickWizardDialog.EditQuickWizardDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesEditQuickWizardDialog {
  private FragmentsModule_ContributesEditQuickWizardDialog() {}

  @Binds
  @IntoMap
  @ClassKey(EditQuickWizardDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditQuickWizardDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface EditQuickWizardDialogSubcomponent
      extends AndroidInjector<EditQuickWizardDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditQuickWizardDialog> {}
  }
}
