package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.WizardInfoDialog;

@Module(
  subcomponents = FragmentsModule_ContributesWizardInfoDialog.WizardInfoDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesWizardInfoDialog {
  private FragmentsModule_ContributesWizardInfoDialog() {}

  @Binds
  @IntoMap
  @ClassKey(WizardInfoDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WizardInfoDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface WizardInfoDialogSubcomponent extends AndroidInjector<WizardInfoDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WizardInfoDialog> {}
  }
}
