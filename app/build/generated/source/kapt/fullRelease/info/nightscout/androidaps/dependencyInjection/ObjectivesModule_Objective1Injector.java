package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective1;

@Module(subcomponents = ObjectivesModule_Objective1Injector.Objective1Subcomponent.class)
public abstract class ObjectivesModule_Objective1Injector {
  private ObjectivesModule_Objective1Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective1.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective1Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective1Subcomponent extends AndroidInjector<Objective1> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective1> {}
  }
}
