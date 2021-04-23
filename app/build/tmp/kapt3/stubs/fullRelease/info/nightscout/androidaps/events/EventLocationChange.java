package info.nightscout.androidaps.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/events/EventLocationChange;", "Linfo/nightscout/androidaps/events/Event;", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "getLocation", "()Landroid/location/Location;", "setLocation", "app_fullRelease"})
public final class EventLocationChange extends info.nightscout.androidaps.events.Event {
    @org.jetbrains.annotations.NotNull()
    private android.location.Location location;
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location p0) {
    }
    
    public EventLocationChange(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        super();
    }
}