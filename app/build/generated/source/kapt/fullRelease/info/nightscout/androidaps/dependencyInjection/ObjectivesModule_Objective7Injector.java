package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective7;

@Module(subcomponents = ObjectivesModule_Objective7Injector.Objective7Subcomponent.class)
public abstract class ObjectivesModule_Objective7Injector {
  private ObjectivesModule_Objective7Injector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective7.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Objective7Subcomponent.Factory builder);

  @Subcomponent
  public interface Objective7Subcomponent extends AndroidInjector<Objective7> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective7> {}
  }
}
