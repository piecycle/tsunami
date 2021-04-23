package info.nightscout.androidaps.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0003>?@B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016J\"\u0010:\u001a\u00020;2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006A"}, d2 = {"Linfo/nightscout/androidaps/services/LocationService;", "Ldagger/android/DaggerService;", "()V", "LOCATION_INTERVAL_ACTIVE", "", "LOCATION_INTERVAL_PASSIVE", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "binder", "Linfo/nightscout/androidaps/services/LocationService$LocalBinder;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "lastLocationDataContainer", "Linfo/nightscout/androidaps/services/LastLocationDataContainer;", "getLastLocationDataContainer", "()Linfo/nightscout/androidaps/services/LastLocationDataContainer;", "setLastLocationDataContainer", "(Linfo/nightscout/androidaps/services/LastLocationDataContainer;)V", "locationListener", "Linfo/nightscout/androidaps/services/LocationService$LocationListener;", "locationManager", "Landroid/location/LocationManager;", "notificationHolder", "Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;", "getNotificationHolder", "()Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;", "setNotificationHolder", "(Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "initializeLocationManager", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "LocalBinder", "LocationListener", "app_fullRelease"})
public final class LocationService extends dagger.android.DaggerService {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.androidNotification.NotificationHolder notificationHolder;
    @javax.inject.Inject()
    public info.nightscout.androidaps.services.LastLocationDataContainer lastLocationDataContainer;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private android.location.LocationManager locationManager;
    private info.nightscout.androidaps.services.LocationService.LocationListener locationListener;
    private final long LOCATION_INTERVAL_ACTIVE = 0L;
    private final long LOCATION_INTERVAL_PASSIVE = 0L;
    private final info.nightscout.androidaps.services.LocationService.LocalBinder binder = null;
    private static final float LOCATION_DISTANCE = 10.0F;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.services.LocationService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.androidNotification.NotificationHolder getNotificationHolder() {
        return null;
    }
    
    public final void setNotificationHolder(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.androidNotification.NotificationHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.services.LastLocationDataContainer getLastLocationDataContainer() {
        return null;
    }
    
    public final void setLastLocationDataContainer(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.services.LastLocationDataContainer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void initializeLocationManager() {
    }
    
    public LocationService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/services/LocationService$LocalBinder;", "Landroid/os/Binder;", "(Linfo/nightscout/androidaps/services/LocationService;)V", "getService", "Linfo/nightscout/androidaps/services/LocationService;", "app_fullRelease"})
    public final class LocalBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.services.LocationService getService() {
            return null;
        }
        
        public LocalBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Linfo/nightscout/androidaps/services/LocationService$LocationListener;", "Landroid/location/LocationListener;", "provider", "", "(Linfo/nightscout/androidaps/services/LocationService;Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "app_fullRelease"})
    public final class LocationListener implements android.location.LocationListener {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String provider = null;
        
        @java.lang.Override()
        public void onLocationChanged(@org.jetbrains.annotations.NotNull()
        android.location.Location location) {
        }
        
        @java.lang.Override()
        public void onProviderDisabled(@org.jetbrains.annotations.NotNull()
        java.lang.String provider) {
        }
        
        @java.lang.Override()
        public void onProviderEnabled(@org.jetbrains.annotations.NotNull()
        java.lang.String provider) {
        }
        
        @java.lang.Override()
        public void onStatusChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String provider, int status, @org.jetbrains.annotations.NotNull()
        android.os.Bundle extras) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProvider() {
            return null;
        }
        
        public LocationListener(@org.jetbrains.annotations.NotNull()
        java.lang.String provider) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/services/LocationService$Companion;", "", "()V", "LOCATION_DISTANCE", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}