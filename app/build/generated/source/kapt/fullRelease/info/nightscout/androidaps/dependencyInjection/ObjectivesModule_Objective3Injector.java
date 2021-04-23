package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective3;

@Module(subcomponents = ObjectivesModule_Objective3Injector.Objective3Subcomponent.class)
public abstract class ObjectivesModule_Objective3Injector {
  private ObjectivesModule_Objective3Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective3.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective3Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective3Subcomponent extends AndroidInjector<Objective3> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective3> {}
  }
}
