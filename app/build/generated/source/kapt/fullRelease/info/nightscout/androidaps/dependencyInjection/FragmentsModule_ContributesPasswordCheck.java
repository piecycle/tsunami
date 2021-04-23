package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.utils.protection.PasswordCheck;

@Module(subcomponents = FragmentsModule_ContributesPasswordCheck.PasswordCheckSubcomponent.class)
public abstract class FragmentsModule_ContributesPasswordCheck {
  private FragmentsModule_ContributesPasswordCheck() {}

  @Binds
  @IntoMap
  @ClassKey(PasswordCheck.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PasswordCheckSubcomponent.Factory builder);

  @Subcomponent
  public interface PasswordCheckSubcomponent extends AndroidInjector<PasswordCheck> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PasswordCheck> {}
  }
}
