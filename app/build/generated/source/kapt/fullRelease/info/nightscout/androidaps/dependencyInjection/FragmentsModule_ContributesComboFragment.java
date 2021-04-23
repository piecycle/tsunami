package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.combo.ComboFragment;

@Module(subcomponents = FragmentsModule_ContributesComboFragment.ComboFragmentSubcomponent.class)
public abstract class FragmentsModule_ContributesComboFragment {
  private FragmentsModule_ContributesComboFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ComboFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ComboFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ComboFragmentSubcomponent extends AndroidInjector<ComboFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ComboFragment> {}
  }
}
