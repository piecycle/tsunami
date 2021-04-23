package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective5;

@Module(subcomponents = ObjectivesModule_Objective5Injector.Objective5Subcomponent.class)
public abstract class ObjectivesModule_Objective5Injector {
  private ObjectivesModule_Objective5Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective5.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective5Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective5Subcomponent extends AndroidInjector<Objective5> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective5> {}
  }
}
