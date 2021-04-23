package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread;

@Module(subcomponents = APSModule_IobCobOref1ThreadInjector.IobCobOref1ThreadSubcomponent.class)
public abstract class APSModule_IobCobOref1ThreadInjector {
  private APSModule_IobCobOref1ThreadInjector() {}

  @Binds
  @IntoMap
  @ClassKey(IobCobOref1Thread.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      IobCobOref1ThreadSubcomponent.Factory builder);

  @Subcomponent
  public interface IobCobOref1ThreadSubcomponent extends AndroidInjector<IobCobOref1Thread> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<IobCobOref1Thread> {}
  }
}
