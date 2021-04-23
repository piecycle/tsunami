package info.nightscout.androidaps.plugins.general.overview.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020/R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u00060"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationWithAction;", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/Notification;", "injector", "Ldagger/android/HasAndroidInjector;", "id", "", "text", "", "level", "(Ldagger/android/HasAndroidInjector;ILjava/lang/String;I)V", "nsAlarm", "Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSAlarm;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSAlarm;)V", "(Ldagger/android/HasAndroidInjector;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "getDefaultValueHelper", "()Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "setDefaultValueHelper", "(Linfo/nightscout/androidaps/utils/DefaultValueHelper;)V", "nsClientPlugin", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "getNsClientPlugin", "()Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;", "setNsClientPlugin", "(Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientPlugin;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "action", "", "buttonText", "Ljava/lang/Runnable;", "app_fullRelease"})
public final class NotificationWithAction extends info.nightscout.androidaps.plugins.general.overview.notifications.Notification {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin nsClientPlugin;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DefaultValueHelper getDefaultValueHelper() {
        return null;
    }
    
    public final void setDefaultValueHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin getNsClientPlugin() {
        return null;
    }
    
    public final void setNsClientPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSClientPlugin p0) {
    }
    
    public final void action(int buttonText, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable action) {
    }
    
    public NotificationWithAction(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
    
    public NotificationWithAction(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int level) {
        super();
    }
    
    public NotificationWithAction(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.data.NSAlarm nsAlarm) {
        super();
    }
}