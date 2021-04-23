package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.insight.LocalInsightFragment;

@Module(
  subcomponents =
      FragmentsModule_ContributesLocalInsightFragment.LocalInsightFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesLocalInsightFragment {
  private FragmentsModule_ContributesLocalInsightFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LocalInsightFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LocalInsightFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LocalInsightFragmentSubcomponent extends AndroidInjector<LocalInsightFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LocalInsightFragment> {}
  }
}
