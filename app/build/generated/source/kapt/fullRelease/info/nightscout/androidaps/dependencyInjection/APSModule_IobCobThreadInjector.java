package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobThread;

@Module(subcomponents = APSModule_IobCobThreadInjector.IobCobThreadSubcomponent.class)
public abstract class APSModule_IobCobThreadInjector {
  private APSModule_IobCobThreadInjector() {}

  @Binds
  @IntoMap
  @ClassKey(IobCobThread.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      IobCobThreadSubcomponent.Factory builder);

  @Subcomponent
  public interface IobCobThreadSubcomponent extends AndroidInjector<IobCobThread> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<IobCobThread> {}
  }
}
