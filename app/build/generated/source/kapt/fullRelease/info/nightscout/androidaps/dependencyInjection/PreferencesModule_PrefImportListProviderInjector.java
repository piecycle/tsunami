package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.maintenance.PrefFileListProvider;

@Module(
  subcomponents =
      PreferencesModule_PrefImportListProviderInjector.PrefFileListProviderSubcomponent.class
)
public abstract class PreferencesModule_PrefImportListProviderInjector {
  private PreferencesModule_PrefImportListProviderInjector() {}

  @Binds
  @IntoMap
  @ClassKey(PrefFileListProvider.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PrefFileListProviderSubcomponent.Factory builder);

  @Subcomponent
  public interface PrefFileListProviderSubcomponent extends AndroidInjector<PrefFileListProvider> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PrefFileListProvider> {}
  }
}
