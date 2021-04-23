package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/APSModule;", "", "()V", "determineBasalAdapterAMAJSInjector", "Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/DetermineBasalAdapterAMAJS;", "determineBasalAdapterSMBJSInjector", "Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/DetermineBasalAdapterSMBJS;", "determineBasalResultAMAInjector", "Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/DetermineBasalResultAMA;", "determineBasalResultSMBInjector", "Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/DetermineBasalResultSMB;", "iobCobOref1ThreadInjector", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobOref1Thread;", "iobCobThreadInjector", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobThread;", "loggerCallbackInjector", "Linfo/nightscout/androidaps/plugins/aps/logger/LoggerCallback;", "app_fullRelease"})
@dagger.Module()
public abstract class APSModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.logger.LoggerCallback loggerCallbackInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSSMB.DetermineBasalResultSMB determineBasalResultSMBInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSAMA.DetermineBasalResultAMA determineBasalResultAMAInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSAMA.DetermineBasalAdapterAMAJS determineBasalAdapterAMAJSInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSSMB.DetermineBasalAdapterSMBJS determineBasalAdapterSMBJSInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobThread iobCobThreadInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread iobCobOref1ThreadInjector();
    
    public APSModule() {
        super();
    }
}