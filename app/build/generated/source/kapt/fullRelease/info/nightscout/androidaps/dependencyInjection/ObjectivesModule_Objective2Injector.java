package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective2;

@Module(subcomponents = ObjectivesModule_Objective2Injector.Objective2Subcomponent.class)
public abstract class ObjectivesModule_Objective2Injector {
  private ObjectivesModule_Objective2Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective2.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective2Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective2Subcomponent extends AndroidInjector<Objective2> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective2> {}
  }
}
