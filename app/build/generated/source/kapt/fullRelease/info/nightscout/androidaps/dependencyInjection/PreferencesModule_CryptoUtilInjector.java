package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.utils.CryptoUtil;

@Module(subcomponents = PreferencesModule_CryptoUtilInjector.CryptoUtilSubcomponent.class)
public abstract class PreferencesModule_CryptoUtilInjector {
  private PreferencesModule_CryptoUtilInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CryptoUtil.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CryptoUtilSubcomponent.Factory builder);

  @Subcomponent
  public interface CryptoUtilSubcomponent extends AndroidInjector<CryptoUtil> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CryptoUtil> {}
  }
}
