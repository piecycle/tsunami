package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.activities.InsightPairingInformationActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesInsightPairingInformationActivity
          .InsightPairingInformationActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesInsightPairingInformationActivity {
  private ActivitiesModule_ContributesInsightPairingInformationActivity() {}

  @Binds
  @IntoMap
  @ClassKey(InsightPairingInformationActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsightPairingInformationActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface InsightPairingInformationActivitySubcomponent
      extends AndroidInjector<InsightPairingInformationActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsightPairingInformationActivity> {}
  }
}
