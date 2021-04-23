package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.food.FoodService;

@Module(subcomponents = DataClassesModule_FoodServiceInjector.FoodServiceSubcomponent.class)
public abstract class DataClassesModule_FoodServiceInjector {
  private DataClassesModule_FoodServiceInjector() {}

  @Binds
  @IntoMap
  @ClassKey(FoodService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FoodServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface FoodServiceSubcomponent extends AndroidInjector<FoodService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FoodService> {}
  }
}
