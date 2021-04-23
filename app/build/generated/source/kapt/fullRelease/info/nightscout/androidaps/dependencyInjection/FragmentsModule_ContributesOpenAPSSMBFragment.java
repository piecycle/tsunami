package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment;

@Module(
  subcomponents = FragmentsModule_ContributesOpenAPSSMBFragment.OpenAPSSMBFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesOpenAPSSMBFragment {
  private FragmentsModule_ContributesOpenAPSSMBFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OpenAPSSMBFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OpenAPSSMBFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface OpenAPSSMBFragmentSubcomponent extends AndroidInjector<OpenAPSSMBFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OpenAPSSMBFragment> {}
  }
}
