package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.AutomationFragment;

@Module(
  subcomponents = FragmentsModule_ContributesAutomationFragment.AutomationFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesAutomationFragment {
  private FragmentsModule_ContributesAutomationFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AutomationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AutomationFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AutomationFragmentSubcomponent extends AndroidInjector<AutomationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AutomationFragment> {}
  }
}
