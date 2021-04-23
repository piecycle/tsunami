package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective9;

@Module(subcomponents = ObjectivesModule_Objective9Injector.Objective9Subcomponent.class)
public abstract class ObjectivesModule_Objective9Injector {
  private ObjectivesModule_Objective9Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective9.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective9Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective9Subcomponent extends AndroidInjector<Objective9> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective9> {}
  }
}
