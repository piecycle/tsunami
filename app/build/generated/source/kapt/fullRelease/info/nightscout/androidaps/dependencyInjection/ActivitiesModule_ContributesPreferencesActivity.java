package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.PreferencesActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesPreferencesActivity.PreferencesActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesPreferencesActivity {
  private ActivitiesModule_ContributesPreferencesActivity() {}

  @Binds
  @IntoMap
  @ClassKey(PreferencesActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PreferencesActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface PreferencesActivitySubcomponent extends AndroidInjector<PreferencesActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PreferencesActivity> {}
  }
}
