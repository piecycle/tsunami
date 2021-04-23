package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.overview.graphData.GraphData;

@Module(subcomponents = OverviewModule_GraphDataInjector.GraphDataSubcomponent.class)
public abstract class OverviewModule_GraphDataInjector {
  private OverviewModule_GraphDataInjector() {}

  @Binds
  @IntoMap
  @ClassKey(GraphData.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GraphDataSubcomponent.Factory builder);

  @Subcomponent
  public interface GraphDataSubcomponent extends AndroidInjector<GraphData> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<GraphData> {}
  }
}
