package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.GlucoseStatus;

@Module(subcomponents = DataClassesModule_GlucoseStatusInjector.GlucoseStatusSubcomponent.class)
public abstract class DataClassesModule_GlucoseStatusInjector {
  private DataClassesModule_GlucoseStatusInjector() {}

  @Binds
  @IntoMap
  @ClassKey(GlucoseStatus.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      GlucoseStatusSubcomponent.Factory builder);

  @Subcomponent
  public interface GlucoseStatusSubcomponent extends AndroidInjector<GlucoseStatus> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<GlucoseStatus> {}
  }
}
