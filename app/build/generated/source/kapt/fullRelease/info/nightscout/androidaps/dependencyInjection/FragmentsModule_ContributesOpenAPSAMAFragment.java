package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAFragment;

@Module(
  subcomponents = FragmentsModule_ContributesOpenAPSAMAFragment.OpenAPSAMAFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesOpenAPSAMAFragment {
  private FragmentsModule_ContributesOpenAPSAMAFragment() {}

  @Binds
  @IntoMap
  @ClassKey(OpenAPSAMAFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OpenAPSAMAFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface OpenAPSAMAFragmentSubcomponent extends AndroidInjector<OpenAPSAMAFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OpenAPSAMAFragment> {}
  }
}
