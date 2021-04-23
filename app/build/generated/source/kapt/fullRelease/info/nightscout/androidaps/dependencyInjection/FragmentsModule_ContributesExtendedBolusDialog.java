package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.ExtendedBolusDialog;

@Module(
  subcomponents =
      FragmentsModule_ContributesExtendedBolusDialog.ExtendedBolusDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesExtendedBolusDialog {
  private FragmentsModule_ContributesExtendedBolusDialog() {}

  @Binds
  @IntoMap
  @ClassKey(ExtendedBolusDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ExtendedBolusDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ExtendedBolusDialogSubcomponent extends AndroidInjector<ExtendedBolusDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ExtendedBolusDialog> {}
  }
}
