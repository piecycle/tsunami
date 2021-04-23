package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.aps.loop.CarbSuggestionReceiver;

@Module(
  subcomponents =
      ReceiversModule_ContributesCarbSuggestionReceiver.CarbSuggestionReceiverSubcomponent.class
)
public abstract class ReceiversModule_ContributesCarbSuggestionReceiver {
  private ReceiversModule_ContributesCarbSuggestionReceiver() {}

  @Binds
  @IntoMap
  @ClassKey(CarbSuggestionReceiver.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CarbSuggestionReceiverSubcomponent.Factory builder);

  @Subcomponent
  public interface CarbSuggestionReceiverSubcomponent
      extends AndroidInjector<CarbSuggestionReceiver> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CarbSuggestionReceiver> {}
  }
}
