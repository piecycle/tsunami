package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesVirtualPumpFragment.VirtualPumpFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesVirtualPumpFragment {
  private FragmentsModule_ContributesVirtualPumpFragment() {}

  @Binds
  @IntoMap
  @ClassKey(VirtualPumpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      VirtualPumpFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface VirtualPumpFragmentSubcomponent extends AndroidInjector<VirtualPumpFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<VirtualPumpFragment> {}
  }
}
