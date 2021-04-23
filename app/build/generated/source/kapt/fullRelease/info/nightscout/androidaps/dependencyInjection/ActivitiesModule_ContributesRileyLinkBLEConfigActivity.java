package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.pump.common.dialog.RileyLinkBLEConfigActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesRileyLinkBLEConfigActivity.RileyLinkBLEConfigActivitySubcomponent
          .class
)
public abstract class ActivitiesModule_ContributesRileyLinkBLEConfigActivity {
  private ActivitiesModule_ContributesRileyLinkBLEConfigActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RileyLinkBLEConfigActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RileyLinkBLEConfigActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface RileyLinkBLEConfigActivitySubcomponent
      extends AndroidInjector<RileyLinkBLEConfigActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RileyLinkBLEConfigActivity> {}
  }
}
