package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.WizardDialog;

@Module(subcomponents = FragmentsModule_ContributesWizardDialog.WizardDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesWizardDialog {
  private FragmentsModule_ContributesWizardDialog() {}

  @Binds
  @IntoMap
  @ClassKey(WizardDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WizardDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface WizardDialogSubcomponent extends AndroidInjector<WizardDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WizardDialog> {}
  }
}
