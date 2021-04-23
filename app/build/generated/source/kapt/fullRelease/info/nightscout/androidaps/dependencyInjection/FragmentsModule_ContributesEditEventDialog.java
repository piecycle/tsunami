package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog;

@Module(
  subcomponents = FragmentsModule_ContributesEditEventDialog.EditEventDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesEditEventDialog {
  private FragmentsModule_ContributesEditEventDialog() {}

  @Binds
  @IntoMap
  @ClassKey(EditEventDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditEventDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface EditEventDialogSubcomponent extends AndroidInjector<EditEventDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditEventDialog> {}
  }
}
