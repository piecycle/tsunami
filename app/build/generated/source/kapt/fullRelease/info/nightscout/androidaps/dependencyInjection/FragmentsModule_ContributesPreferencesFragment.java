package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.MyPreferenceFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesPreferencesFragment.MyPreferenceFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesPreferencesFragment {
  private FragmentsModule_ContributesPreferencesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MyPreferenceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MyPreferenceFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MyPreferenceFragmentSubcomponent extends AndroidInjector<MyPreferenceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MyPreferenceFragment> {}
  }
}
