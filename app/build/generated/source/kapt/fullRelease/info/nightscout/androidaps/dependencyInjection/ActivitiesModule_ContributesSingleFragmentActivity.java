package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.SingleFragmentActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesSingleFragmentActivity.SingleFragmentActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesSingleFragmentActivity {
  private ActivitiesModule_ContributesSingleFragmentActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SingleFragmentActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SingleFragmentActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SingleFragmentActivitySubcomponent
      extends AndroidInjector<SingleFragmentActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SingleFragmentActivity> {}
  }
}
