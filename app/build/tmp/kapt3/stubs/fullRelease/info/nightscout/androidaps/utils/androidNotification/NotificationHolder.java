package info.nightscout.androidaps.utils.androidNotification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;", "Linfo/nightscout/androidaps/interfaces/NotificationHolderInterface;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "iconsProvider", "Linfo/nightscout/androidaps/utils/resources/IconsProvider;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/resources/IconsProvider;)V", "channelID", "", "getChannelID", "()Ljava/lang/String;", "notification", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "setNotification", "(Landroid/app/Notification;)V", "notificationID", "", "getNotificationID", "()I", "app_fullRelease"})
@javax.inject.Singleton()
public final class NotificationHolder implements info.nightscout.androidaps.interfaces.NotificationHolderInterface {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String channelID = "AndroidAPS-Ongoing";
    private final int notificationID = 4711;
    public android.app.Notification notification;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getChannelID() {
        return null;
    }
    
    @java.lang.Override()
    public int getNotificationID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Notification getNotification() {
        return null;
    }
    
    @java.lang.Override()
    public void setNotification(@org.jetbrains.annotations.NotNull()
    android.app.Notification p0) {
    }
    
    @javax.inject.Inject()
    public NotificationHolder(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider) {
        super();
    }
}