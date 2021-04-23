package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity;

@Module(
  subcomponents =
      FragmentsModule_ContributesExchangeAuthTokenDialot.ExchangeAuthTokenDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesExchangeAuthTokenDialot {
  private FragmentsModule_ContributesExchangeAuthTokenDialot() {}

  @Binds
  @IntoMap
  @ClassKey(OpenHumansLoginActivity.ExchangeAuthTokenDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ExchangeAuthTokenDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ExchangeAuthTokenDialogSubcomponent
      extends AndroidInjector<OpenHumansLoginActivity.ExchangeAuthTokenDialog> {
    @Subcomponent.Factory
    interface Factory
        extends AndroidInjector.Factory<OpenHumansLoginActivity.ExchangeAuthTokenDialog> {}
  }
}
