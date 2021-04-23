package info.nightscout.androidaps.services;

import java.lang.System;

/**
 * Created by adrian on 2020-01-06.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Linfo/nightscout/androidaps/services/LastLocationDataContainer;", "", "()V", "lastLocation", "Landroid/location/Location;", "getLastLocation", "()Landroid/location/Location;", "setLastLocation", "(Landroid/location/Location;)V", "app_fullRelease"})
@javax.inject.Singleton()
public final class LastLocationDataContainer {
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastLocation;
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLastLocation() {
        return null;
    }
    
    public final void setLastLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @javax.inject.Inject()
    public LastLocationDataContainer() {
        super();
    }
}