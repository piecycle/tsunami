package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.tidepool.TidepoolFragment;

@Module(
  subcomponents = FragmentsModule_ContributesTidepoolFragment.TidepoolFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesTidepoolFragment {
  private FragmentsModule_ContributesTidepoolFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TidepoolFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TidepoolFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface TidepoolFragmentSubcomponent extends AndroidInjector<TidepoolFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TidepoolFragment> {}
  }
}
