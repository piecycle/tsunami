package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.automation.elements.StaticLabel;

@Module(subcomponents = AutomationModule_StaticLabelInjector.StaticLabelSubcomponent.class)
public abstract class AutomationModule_StaticLabelInjector {
  private AutomationModule_StaticLabelInjector() {}

  @Binds
  @IntoMap
  @ClassKey(StaticLabel.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StaticLabelSubcomponent.Factory builder);

  @Subcomponent
  public interface StaticLabelSubcomponent extends AndroidInjector<StaticLabel> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StaticLabel> {}
  }
}
