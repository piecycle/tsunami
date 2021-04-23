package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.InsightAlertService;

@Module(
  subcomponents =
      ServicesModule_ContributesInsightAlertService.InsightAlertServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesInsightAlertService {
  private ServicesModule_ContributesInsightAlertService() {}

  @Binds
  @IntoMap
  @ClassKey(InsightAlertService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsightAlertServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface InsightAlertServiceSubcomponent extends AndroidInjector<InsightAlertService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsightAlertService> {}
  }
}
