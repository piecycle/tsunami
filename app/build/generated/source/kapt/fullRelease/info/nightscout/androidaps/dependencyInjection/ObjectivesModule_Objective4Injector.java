package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective4;

@Module(subcomponents = ObjectivesModule_Objective4Injector.Objective4Subcomponent.class)
public abstract class ObjectivesModule_Objective4Injector {
  private ObjectivesModule_Objective4Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective4.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective4Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective4Subcomponent extends AndroidInjector<Objective4> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective4> {}
  }
}
