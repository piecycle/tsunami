package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective10;

@Module(subcomponents = ObjectivesModule_Objective10Injector.Objective10Subcomponent.class)
public abstract class ObjectivesModule_Objective10Injector {
  private ObjectivesModule_Objective10Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective10.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective10Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective10Subcomponent extends AndroidInjector<Objective10> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective10> {}
  }
}
