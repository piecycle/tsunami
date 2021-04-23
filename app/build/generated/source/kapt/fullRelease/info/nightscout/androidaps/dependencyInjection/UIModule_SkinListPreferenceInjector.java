package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.skins.SkinListPreference;

@Module(subcomponents = UIModule_SkinListPreferenceInjector.SkinListPreferenceSubcomponent.class)
public abstract class UIModule_SkinListPreferenceInjector {
  private UIModule_SkinListPreferenceInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SkinListPreference.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SkinListPreferenceSubcomponent.Factory builder);

  @Subcomponent
  public interface SkinListPreferenceSubcomponent extends AndroidInjector<SkinListPreference> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SkinListPreference> {}
  }
}
