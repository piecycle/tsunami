package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective8;

@Module(subcomponents = ObjectivesModule_Objective8Injector.Objective8Subcomponent.class)
public abstract class ObjectivesModule_Objective8Injector {
  private ObjectivesModule_Objective8Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective8.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective8Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective8Subcomponent extends AndroidInjector<Objective8> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective8> {}
  }
}
