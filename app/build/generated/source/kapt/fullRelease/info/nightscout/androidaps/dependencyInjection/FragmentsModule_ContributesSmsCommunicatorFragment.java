package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesSmsCommunicatorFragment.SmsCommunicatorFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesSmsCommunicatorFragment {
  private FragmentsModule_ContributesSmsCommunicatorFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SmsCommunicatorFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SmsCommunicatorFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SmsCommunicatorFragmentSubcomponent
      extends AndroidInjector<SmsCommunicatorFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SmsCommunicatorFragment> {}
  }
}
