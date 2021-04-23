package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.activities.QuickWizardListActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesQuickWizardListActivity.QuickWizardListActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesQuickWizardListActivity {
  private ActivitiesModule_ContributesQuickWizardListActivity() {}

  @Binds
  @IntoMap
  @ClassKey(QuickWizardListActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QuickWizardListActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface QuickWizardListActivitySubcomponent
      extends AndroidInjector<QuickWizardListActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QuickWizardListActivity> {}
  }
}
