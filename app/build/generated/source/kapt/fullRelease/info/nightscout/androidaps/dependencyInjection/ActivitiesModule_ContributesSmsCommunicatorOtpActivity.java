package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.smsCommunicator.activities.SmsCommunicatorOtpActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesSmsCommunicatorOtpActivity.SmsCommunicatorOtpActivitySubcomponent
          .class
)
public abstract class ActivitiesModule_ContributesSmsCommunicatorOtpActivity {
  private ActivitiesModule_ContributesSmsCommunicatorOtpActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SmsCommunicatorOtpActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SmsCommunicatorOtpActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SmsCommunicatorOtpActivitySubcomponent
      extends AndroidInjector<SmsCommunicatorOtpActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SmsCommunicatorOtpActivity> {}
  }
}
