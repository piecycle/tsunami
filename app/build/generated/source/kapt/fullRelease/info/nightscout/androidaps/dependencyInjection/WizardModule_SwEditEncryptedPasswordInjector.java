package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWEditEncryptedPassword;

@Module(
  subcomponents =
      WizardModule_SwEditEncryptedPasswordInjector.SWEditEncryptedPasswordSubcomponent.class
)
public abstract class WizardModule_SwEditEncryptedPasswordInjector {
  private WizardModule_SwEditEncryptedPasswordInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWEditEncryptedPassword.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWEditEncryptedPasswordSubcomponent.Factory builder);

  @Subcomponent
  public interface SWEditEncryptedPasswordSubcomponent
      extends AndroidInjector<SWEditEncryptedPassword> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWEditEncryptedPassword> {}
  }
}
