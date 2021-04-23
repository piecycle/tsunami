package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.activities.ObjectivesExamDialog;

@Module(
  subcomponents =
      FragmentsModule_ContributesObjectivesExamDialog.ObjectivesExamDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesObjectivesExamDialog {
  private FragmentsModule_ContributesObjectivesExamDialog() {}

  @Binds
  @IntoMap
  @ClassKey(ObjectivesExamDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ObjectivesExamDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ObjectivesExamDialogSubcomponent extends AndroidInjector<ObjectivesExamDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ObjectivesExamDialog> {}
  }
}
