package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective0;

@Module(subcomponents = ObjectivesModule_Objective0Injector.Objective0Subcomponent.class)
public abstract class ObjectivesModule_Objective0Injector {
  private ObjectivesModule_Objective0Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective0.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective0Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective0Subcomponent extends AndroidInjector<Objective0> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective0> {}
  }
}
