package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesConfigBuilderFragment.ConfigBuilderFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesConfigBuilderFragment {
  private FragmentsModule_ContributesConfigBuilderFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ConfigBuilderFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ConfigBuilderFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ConfigBuilderFragmentSubcomponent
      extends AndroidInjector<ConfigBuilderFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ConfigBuilderFragment> {}
  }
}
