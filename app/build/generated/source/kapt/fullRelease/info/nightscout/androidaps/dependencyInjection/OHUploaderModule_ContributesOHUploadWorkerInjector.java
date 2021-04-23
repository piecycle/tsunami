package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.plugins.general.openhumans.OHUploadWorker;

@Module(
  subcomponents =
      OHUploaderModule_ContributesOHUploadWorkerInjector.OHUploadWorkerSubcomponent.class
)
public abstract class OHUploaderModule_ContributesOHUploadWorkerInjector {
  private OHUploaderModule_ContributesOHUploadWorkerInjector() {}

  @Binds
  @IntoMap
  @ClassKey(OHUploadWorker.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OHUploadWorkerSubcomponent.Factory builder);

  @Subcomponent
  public interface OHUploadWorkerSubcomponent extends AndroidInjector<OHUploadWorker> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OHUploadWorker> {}
  }
}
