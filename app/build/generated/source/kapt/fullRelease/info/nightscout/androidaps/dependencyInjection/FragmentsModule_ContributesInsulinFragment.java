package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.insulin.InsulinFragment;

@Module(
  subcomponents = FragmentsModule_ContributesInsulinFragment.InsulinFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesInsulinFragment {
  private FragmentsModule_ContributesInsulinFragment() {}

  @Binds
  @IntoMap
  @ClassKey(InsulinFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InsulinFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface InsulinFragmentSubcomponent extends AndroidInjector<InsulinFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InsulinFragment> {}
  }
}
