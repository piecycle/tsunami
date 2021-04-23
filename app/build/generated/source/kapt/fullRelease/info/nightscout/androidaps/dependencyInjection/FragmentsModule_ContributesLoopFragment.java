package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.loop.LoopFragment;

@Module(subcomponents = FragmentsModule_ContributesLoopFragment.LoopFragmentSubcomponent.class)
public abstract class FragmentsModule_ContributesLoopFragment {
  private FragmentsModule_ContributesLoopFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LoopFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoopFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LoopFragmentSubcomponent extends AndroidInjector<LoopFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoopFragment> {}
  }
}
