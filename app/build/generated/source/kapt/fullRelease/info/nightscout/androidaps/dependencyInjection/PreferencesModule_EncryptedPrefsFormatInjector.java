package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.maintenance.formats.EncryptedPrefsFormat;

@Module(
  subcomponents =
      PreferencesModule_EncryptedPrefsFormatInjector.EncryptedPrefsFormatSubcomponent.class
)
public abstract class PreferencesModule_EncryptedPrefsFormatInjector {
  private PreferencesModule_EncryptedPrefsFormatInjector() {}

  @Binds
  @IntoMap
  @ClassKey(EncryptedPrefsFormat.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EncryptedPrefsFormatSubcomponent.Factory builder);

  @Subcomponent
  public interface EncryptedPrefsFormatSubcomponent extends AndroidInjector<EncryptedPrefsFormat> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EncryptedPrefsFormat> {}
  }
}
