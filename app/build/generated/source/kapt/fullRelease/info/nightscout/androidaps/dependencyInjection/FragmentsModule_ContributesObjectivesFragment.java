package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment;

@Module(
  subcomponents = FragmentsModule_ContributesObjectivesFragment.ObjectivesFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesObjectivesFragment {
  private FragmentsModule_ContributesObjectivesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ObjectivesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ObjectivesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ObjectivesFragmentSubcomponent extends AndroidInjector<ObjectivesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ObjectivesFragment> {}
  }
}
