package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.LoopDialog;

@Module(subcomponents = FragmentsModule_ContributesLoopDialog.LoopDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesLoopDialog {
  private FragmentsModule_ContributesLoopDialog() {}

  @Binds
  @IntoMap
  @ClassKey(LoopDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoopDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface LoopDialogSubcomponent extends AndroidInjector<LoopDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoopDialog> {}
  }
}
