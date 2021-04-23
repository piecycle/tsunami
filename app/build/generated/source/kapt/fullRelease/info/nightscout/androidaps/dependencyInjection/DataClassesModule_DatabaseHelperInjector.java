package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.db.DatabaseHelper;

@Module(subcomponents = DataClassesModule_DatabaseHelperInjector.DatabaseHelperSubcomponent.class)
public abstract class DataClassesModule_DatabaseHelperInjector {
  private DataClassesModule_DatabaseHelperInjector() {}

  @Binds
  @IntoMap
  @ClassKey(DatabaseHelper.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DatabaseHelperSubcomponent.Factory builder);

  @Subcomponent
  public interface DatabaseHelperSubcomponent extends AndroidInjector<DatabaseHelper> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DatabaseHelper> {}
  }
}
