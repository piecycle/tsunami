package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesOpenHumansLoginActivity.OpenHumansLoginActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesOpenHumansLoginActivity {
  private ActivitiesModule_ContributesOpenHumansLoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(OpenHumansLoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OpenHumansLoginActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface OpenHumansLoginActivitySubcomponent
      extends AndroidInjector<OpenHumansLoginActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OpenHumansLoginActivity> {}
  }
}
