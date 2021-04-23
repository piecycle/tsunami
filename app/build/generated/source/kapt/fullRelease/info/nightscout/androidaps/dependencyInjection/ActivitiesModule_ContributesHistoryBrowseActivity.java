package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.historyBrowser.HistoryBrowseActivity;

@Module(
  subcomponents =
      ActivitiesModule_ContributesHistoryBrowseActivity.HistoryBrowseActivitySubcomponent.class
)
public abstract class ActivitiesModule_ContributesHistoryBrowseActivity {
  private ActivitiesModule_ContributesHistoryBrowseActivity() {}

  @Binds
  @IntoMap
  @ClassKey(HistoryBrowseActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HistoryBrowseActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HistoryBrowseActivitySubcomponent
      extends AndroidInjector<HistoryBrowseActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HistoryBrowseActivity> {}
  }
}
