package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.maintenance.formats.ClassicPrefsFormat;

@Module(
  subcomponents = PreferencesModule_ClassicPrefsFormatInjector.ClassicPrefsFormatSubcomponent.class
)
public abstract class PreferencesModule_ClassicPrefsFormatInjector {
  private PreferencesModule_ClassicPrefsFormatInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ClassicPrefsFormat.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ClassicPrefsFormatSubcomponent.Factory builder);

  @Subcomponent
  public interface ClassicPrefsFormatSubcomponent extends AndroidInjector<ClassicPrefsFormat> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ClassicPrefsFormat> {}
  }
}
