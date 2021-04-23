package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.services.AlarmSoundService;

@Module(
  subcomponents = ServicesModule_ContributesAlarmSoundService.AlarmSoundServiceSubcomponent.class
)
public abstract class ServicesModule_ContributesAlarmSoundService {
  private ServicesModule_ContributesAlarmSoundService() {}

  @Binds
  @IntoMap
  @ClassKey(AlarmSoundService.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AlarmSoundServiceSubcomponent.Factory builder);

  @Subcomponent
  public interface AlarmSoundServiceSubcomponent extends AndroidInjector<AlarmSoundService> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AlarmSoundService> {}
  }
}
