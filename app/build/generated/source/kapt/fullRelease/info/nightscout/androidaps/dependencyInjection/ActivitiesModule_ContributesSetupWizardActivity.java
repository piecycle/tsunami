package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.SetupWizardActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesSetupWizardActivity.SetupWizardActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesSetupWizardActivity {
  private ActivitiesModule_ContributesSetupWizardActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SetupWizardActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SetupWizardActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SetupWizardActivitySubcomponent extends AndroidInjector<SetupWizardActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SetupWizardActivity> {}
  }
}
