package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.source.BGSourceFragment;

@Module(
  subcomponents = FragmentsModule_ContributesBGSourceFragment.BGSourceFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesBGSourceFragment {
  private FragmentsModule_ContributesBGSourceFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BGSourceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BGSourceFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface BGSourceFragmentSubcomponent extends AndroidInjector<BGSourceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BGSourceFragment> {}
  }
}
