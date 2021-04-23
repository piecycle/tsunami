package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.food.FoodFragment;

@Module(subcomponents = FragmentsModule_ContributesFoodFragment.FoodFragmentSubcomponent.class)
public abstract class FragmentsModule_ContributesFoodFragment {
  private FragmentsModule_ContributesFoodFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FoodFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FoodFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FoodFragmentSubcomponent extends AndroidInjector<FoodFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FoodFragment> {}
  }
}
