package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog;

@Module(
  subcomponents =
      FragmentsModule_ContributesChooseTriggerDialog.ChooseTriggerDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesChooseTriggerDialog {
  private FragmentsModule_ContributesChooseTriggerDialog() {}

  @Binds
  @IntoMap
  @ClassKey(ChooseTriggerDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChooseTriggerDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ChooseTriggerDialogSubcomponent extends AndroidInjector<ChooseTriggerDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ChooseTriggerDialog> {}
  }
}
