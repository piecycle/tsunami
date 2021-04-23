package info.nightscout.androidaps.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/services/LocationServiceHelper;", "", "notificationHolder", "Linfo/nightscout/androidaps/interfaces/NotificationHolderInterface;", "(Linfo/nightscout/androidaps/interfaces/NotificationHolderInterface;)V", "startService", "", "context", "Landroid/content/Context;", "stopService", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class LocationServiceHelper {
    private final info.nightscout.androidaps.interfaces.NotificationHolderInterface notificationHolder = null;
    
    public final void startService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean stopService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @javax.inject.Inject()
    public LocationServiceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.NotificationHolderInterface notificationHolder) {
        super();
    }
}