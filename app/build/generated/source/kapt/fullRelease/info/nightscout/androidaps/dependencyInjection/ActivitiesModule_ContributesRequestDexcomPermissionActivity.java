package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.RequestDexcomPermissionActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesRequestDexcomPermissionActivity
          .RequestDexcomPermissionActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesRequestDexcomPermissionActivity {
  private ActivitiesModule_ContributesRequestDexcomPermissionActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RequestDexcomPermissionActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RequestDexcomPermissionActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface RequestDexcomPermissionActivitySubcomponent
      extends AndroidInjector<RequestDexcomPermissionActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RequestDexcomPermissionActivity> {}
  }
}
