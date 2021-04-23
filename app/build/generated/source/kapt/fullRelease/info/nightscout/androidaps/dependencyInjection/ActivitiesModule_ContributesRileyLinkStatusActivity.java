package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesRileyLinkStatusActivity.RileyLinkStatusActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesRileyLinkStatusActivity {
  private ActivitiesModule_ContributesRileyLinkStatusActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkStatusActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkStatusActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkStatusActivitySubcomponent
      extends AndroidInjector<RileyLinkStatusActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkStatusActivity> {}
  }
}
