package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective6;

@Module(subcomponents = ObjectivesModule_Objective6Injector.Objective6Subcomponent.class)
public abstract class ObjectivesModule_Objective6Injector {
  private ObjectivesModule_Objective6Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective6.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective6Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective6Subcomponent extends AndroidInjector<Objective6> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective6> {}
  }
}
