package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.activities.InsightAlertActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesInsightAlertActivity.InsightAlertActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesInsightAlertActivity {
  private ActivitiesModule_ContributesInsightAlertActivity() {}

  @Binds
  @IntoMap
  @ClassKey(InsightAlertActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsightAlertActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface InsightAlertActivitySubcomponent extends AndroidInjector<InsightAlertActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsightAlertActivity> {}
  }
}
