package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective;

@Module(subcomponents = ObjectivesModule_ObjectiveInjector.ObjectiveSubcomponent.class)
public abstract class ObjectivesModule_ObjectiveInjector {
  private ObjectivesModule_ObjectiveInjector() {}

  @Binds
  @IntoMap
  @ClassKey(Objective.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ObjectiveSubcomponent.Factory builder);

  @Subcomponent
  public interface ObjectiveSubcomponent extends AndroidInjector<Objective> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Objective> {}
  }
}
