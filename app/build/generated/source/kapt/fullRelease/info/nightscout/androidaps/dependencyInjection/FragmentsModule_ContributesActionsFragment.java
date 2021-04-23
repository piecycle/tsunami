package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.actions.ActionsFragment;

@Module(
  subcomponents = FragmentsModule_ContributesActionsFragment.ActionsFragmentSubcomponent.class
)
public abstract class FragmentsModule_ContributesActionsFragment {
  private FragmentsModule_ContributesActionsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ActionsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ActionsFragmentSubcomponent extends AndroidInjector<ActionsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionsFragment> {}
  }
}
