package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.ProfileHelperActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesDefaultProfileActivity.ProfileHelperActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesDefaultProfileActivity {
  private ActivitiesModule_ContributesDefaultProfileActivity() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileHelperActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileHelperActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileHelperActivitySubcomponent
      extends AndroidInjector<ProfileHelperActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileHelperActivity> {}
  }
}
