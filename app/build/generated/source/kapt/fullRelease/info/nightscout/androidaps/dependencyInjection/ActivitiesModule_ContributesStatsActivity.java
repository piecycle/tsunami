package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.StatsActivity;

@Module(subcomponents = ActivitiesModule_ContributesStatsActivity.StatsActivitySubcomponent.class)
public abstract class ActivitiesModule_ContributesStatsActivity {
  private ActivitiesModule_ContributesStatsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(StatsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StatsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface StatsActivitySubcomponent extends AndroidInjector<StatsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StatsActivity> {}
  }
}
