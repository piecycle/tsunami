package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/ServicesModule;", "", "()V", "contributesAlarmSoundService", "Linfo/nightscout/androidaps/services/AlarmSoundService;", "contributesDataService", "Linfo/nightscout/androidaps/services/DataService;", "contributesDismissNotificationService", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/DismissNotificationService;", "contributesDummyService", "Linfo/nightscout/androidaps/plugins/general/persistentNotification/DummyService;", "contributesInsightAlertService", "Linfo/nightscout/androidaps/plugins/pump/insight/InsightAlertService;", "contributesInsightConnectionService", "Linfo/nightscout/androidaps/plugins/pump/insight/connection_service/InsightConnectionService;", "contributesLocationService", "Linfo/nightscout/androidaps/services/LocationService;", "contributesNSClientService", "Linfo/nightscout/androidaps/plugins/general/nsclient/services/NSClientService;", "contributesRileyLinkMedtronicService", "Linfo/nightscout/androidaps/plugins/pump/medtronic/service/RileyLinkMedtronicService;", "contributesRileyLinkOmnipodService", "Linfo/nightscout/androidaps/plugins/pump/omnipod/rileylink/service/RileyLinkOmnipodService;", "contributesRileyLinkService", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/service/RileyLinkService;", "contributesWatchUpdaterService", "Linfo/nightscout/androidaps/plugins/general/wear/wearintegration/WatchUpdaterService;", "app_fullRelease"})
@dagger.Module()
public abstract class ServicesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.services.AlarmSoundService contributesAlarmSoundService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.services.DataService contributesDataService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.overview.notifications.DismissNotificationService contributesDismissNotificationService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.persistentNotification.DummyService contributesDummyService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.services.LocationService contributesLocationService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.nsclient.services.NSClientService contributesNSClientService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService contributesWatchUpdaterService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.InsightAlertService contributesInsightAlertService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.connection_service.InsightConnectionService contributesInsightConnectionService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkService contributesRileyLinkService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.service.RileyLinkMedtronicService contributesRileyLinkMedtronicService();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.omnipod.rileylink.service.RileyLinkOmnipodService contributesRileyLinkOmnipodService();
    
    public ServicesModule() {
        super();
    }
}