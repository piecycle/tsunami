package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.actions.ActionDummy;

@Module(subcomponents = AutomationModule_ActionDummyInjector.ActionDummySubcomponent.class)
public abstract class AutomationModule_ActionDummyInjector {
  private AutomationModule_ActionDummyInjector() {}

  @Binds
  @IntoMap
  @ClassKey(ActionDummy.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ActionDummySubcomponent.Factory builder);

  @Subcomponent
  public interface ActionDummySubcomponent extends AndroidInjector<ActionDummy> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ActionDummy> {}
  }
}
