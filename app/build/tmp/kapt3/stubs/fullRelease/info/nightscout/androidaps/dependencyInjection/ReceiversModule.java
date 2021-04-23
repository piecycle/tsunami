package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/ReceiversModule;", "", "()V", "contributesAutoStartReceiver", "Linfo/nightscout/androidaps/receivers/AutoStartReceiver;", "contributesBTReceiver", "Linfo/nightscout/androidaps/receivers/BTReceiver;", "contributesCarbSuggestionReceiver", "Linfo/nightscout/androidaps/plugins/aps/loop/CarbSuggestionReceiver;", "contributesChargingStateReceiver", "Linfo/nightscout/androidaps/receivers/ChargingStateReceiver;", "contributesDataReceiver", "Linfo/nightscout/androidaps/receivers/DataReceiver;", "contributesKeepAliveReceiver", "Linfo/nightscout/androidaps/receivers/KeepAliveReceiver;", "contributesRileyLinkBluetoothStateReceiver", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/service/RileyLinkBluetoothStateReceiver;", "contributesRileyLinkBroadcastReceiver", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/service/RileyLinkBroadcastReceiver;", "contributesSmsReceiver", "Linfo/nightscout/androidaps/receivers/SmsReceiver;", "contributesTimeDateOrTZChangeReceiver", "Linfo/nightscout/androidaps/receivers/TimeDateOrTZChangeReceiver;", "app_fullRelease"})
@dagger.Module()
public abstract class ReceiversModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.AutoStartReceiver contributesAutoStartReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.BTReceiver contributesBTReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.ChargingStateReceiver contributesChargingStateReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.DataReceiver contributesDataReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.KeepAliveReceiver contributesKeepAliveReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkBluetoothStateReceiver contributesRileyLinkBluetoothStateReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.SmsReceiver contributesSmsReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.receivers.TimeDateOrTZChangeReceiver contributesTimeDateOrTZChangeReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.loop.CarbSuggestionReceiver contributesCarbSuggestionReceiver();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkBroadcastReceiver contributesRileyLinkBroadcastReceiver();
    
    public ReceiversModule() {
        super();
    }
}