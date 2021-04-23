package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseActionDialog;

@Module(
  subcomponents = FragmentsModule_ContributesChooseActionDialog.ChooseActionDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesChooseActionDialog {
  private FragmentsModule_ContributesChooseActionDialog() {}

  @Binds
  @IntoMap
  @ClassKey(ChooseActionDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ChooseActionDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ChooseActionDialogSubcomponent extends AndroidInjector<ChooseActionDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ChooseActionDialog> {}
  }
}
