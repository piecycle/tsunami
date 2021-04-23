package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.connection_service.InsightConnectionService;

@Module(
  subcomponents =
      ServicesModule_ContributesInsightConnectionService.InsightConnectionServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesInsightConnectionService {
  private ServicesModule_ContributesInsightConnectionService() {}

  @Binds
  @IntoMap
  @ClassKey(InsightConnectionService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsightConnectionServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface InsightConnectionServiceSubcomponent
      extends AndroidInjector<InsightConnectionService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsightConnectionService> {}
  }
}
