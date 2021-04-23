package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.FillDialog;

@Module(subcomponents = FragmentsModule_ContributesFillDialog.FillDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesFillDialog {
  private FragmentsModule_ContributesFillDialog() {}

  @Binds
  @IntoMap
  @ClassKey(FillDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FillDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface FillDialogSubcomponent extends AndroidInjector<FillDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FillDialog> {}
  }
}
