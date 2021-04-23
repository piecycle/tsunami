package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.maintenance.activities.LogSettingActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesLogSettingActivity.LogSettingActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesLogSettingActivity {
  private ActivitiesModule_ContributesLogSettingActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LogSettingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LogSettingActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface LogSettingActivitySubcomponent extends AndroidInjector<LogSettingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LogSettingActivity> {}
  }
}
