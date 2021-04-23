package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.InsulinDialog;

@Module(subcomponents = FragmentsModule_ContributesInsulinDialog.InsulinDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesInsulinDialog {
  private FragmentsModule_ContributesInsulinDialog() {}

  @Binds
  @IntoMap
  @ClassKey(InsulinDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsulinDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface InsulinDialogSubcomponent extends AndroidInjector<InsulinDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsulinDialog> {}
  }
}
