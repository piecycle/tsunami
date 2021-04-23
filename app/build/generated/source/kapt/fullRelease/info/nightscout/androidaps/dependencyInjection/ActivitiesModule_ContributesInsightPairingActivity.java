package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.activities.InsightPairingActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesInsightPairingActivity.InsightPairingActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesInsightPairingActivity {
  private ActivitiesModule_ContributesInsightPairingActivity() {}

  @Binds
  @IntoMap
  @ClassKey(InsightPairingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsightPairingActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface InsightPairingActivitySubcomponent
      extends AndroidInjector<InsightPairingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsightPairingActivity> {}
  }
}
