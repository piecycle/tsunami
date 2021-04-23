package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.utils.wizard.QuickWizardEntry;

@Module(
  subcomponents = DataClassesModule_QuickWizardEntryInjector.QuickWizardEntrySubcomponent.class
)
public abstract class DataClassesModule_QuickWizardEntryInjector {
  private DataClassesModule_QuickWizardEntryInjector() {}

  @Binds
  @IntoMap
  @ClassKey(QuickWizardEntry.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QuickWizardEntrySubcomponent.Factory builder);

  @Subcomponent
  public interface QuickWizardEntrySubcomponent extends AndroidInjector<QuickWizardEntry> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QuickWizardEntry> {}
  }
}
