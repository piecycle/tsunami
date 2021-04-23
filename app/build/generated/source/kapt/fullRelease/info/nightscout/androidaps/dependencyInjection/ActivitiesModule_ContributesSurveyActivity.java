package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.activities.SurveyActivity;

@Module(subcomponents = ActivitiesModule_ContributesSurveyActivity.SurveyActivitySubcomponent.class)
public abstract class ActivitiesModule_ContributesSurveyActivity {
  private ActivitiesModule_ContributesSurveyActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SurveyActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SurveyActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SurveyActivitySubcomponent extends AndroidInjector<SurveyActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SurveyActivity> {}
  }
}
