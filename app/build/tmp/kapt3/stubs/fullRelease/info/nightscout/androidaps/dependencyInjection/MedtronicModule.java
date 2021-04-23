package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/MedtronicModule;", "", "()V", "medtronicCommunicationManagerProvider", "Linfo/nightscout/androidaps/plugins/pump/medtronic/comm/MedtronicCommunicationManager;", "medtronicUITaskProvider", "Linfo/nightscout/androidaps/plugins/pump/medtronic/comm/ui/MedtronicUITask;", "app_fullRelease"})
@dagger.Module()
public abstract class MedtronicModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.comm.MedtronicCommunicationManager medtronicCommunicationManagerProvider();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.comm.ui.MedtronicUITask medtronicUITaskProvider();
    
    public MedtronicModule() {
        super();
    }
}