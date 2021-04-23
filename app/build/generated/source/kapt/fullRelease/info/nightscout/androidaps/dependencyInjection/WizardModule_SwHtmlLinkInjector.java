package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.setupwizard.elements.SWHtmlLink;

@Module(subcomponents = WizardModule_SwHtmlLinkInjector.SWHtmlLinkSubcomponent.class)
public abstract class WizardModule_SwHtmlLinkInjector {
  private WizardModule_SwHtmlLinkInjector() {}

  @Binds
  @IntoMap
  @ClassKey(SWHtmlLink.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SWHtmlLinkSubcomponent.Factory builder);

  @Subcomponent
  public interface SWHtmlLinkSubcomponent extends AndroidInjector<SWHtmlLink> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SWHtmlLink> {}
  }
}
