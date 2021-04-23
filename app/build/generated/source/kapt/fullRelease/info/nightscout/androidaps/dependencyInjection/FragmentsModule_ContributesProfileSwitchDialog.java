package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.ProfileSwitchDialog;

@Module(
  subcomponents =
      FragmentsModule_ContributesProfileSwitchDialog.ProfileSwitchDialogSubcomponent.class
)
public abstract class FragmentsModule_ContributesProfileSwitchDialog {
  private FragmentsModule_ContributesProfileSwitchDialog() {}

  @Binds
  @IntoMap
  @ClassKey(ProfileSwitchDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileSwitchDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface ProfileSwitchDialogSubcomponent extends AndroidInjector<ProfileSwitchDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileSwitchDialog> {}
  }
}
