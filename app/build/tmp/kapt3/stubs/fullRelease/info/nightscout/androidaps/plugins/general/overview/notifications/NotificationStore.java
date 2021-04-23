package info.nightscout.androidaps.plugins.general.overview.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003,-.BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fH\u0002J\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u000e\u0010\'\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\b\u0010(\u001a\u00020!H\u0002J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "iconsProvider", "Linfo/nightscout/androidaps/utils/resources/IconsProvider;", "alarmSoundServiceHelper", "Linfo/nightscout/androidaps/services/AlarmSoundServiceHelper;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/resources/IconsProvider;Linfo/nightscout/androidaps/services/AlarmSoundServiceHelper;Linfo/nightscout/androidaps/utils/DateUtil;)V", "store", "", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/Notification;", "getStore", "()Ljava/util/List;", "setStore", "(Ljava/util/List;)V", "usesChannels", "", "add", "n", "cloneStore", "", "createNotificationChannel", "", "deleteIntent", "Landroid/app/PendingIntent;", "id", "", "raiseSystemNotification", "remove", "removeExpired", "updateNotifications", "notificationsView", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "NotificationComparator", "NotificationRecyclerViewAdapter", "app_fullRelease"})
@javax.inject.Singleton()
public final class NotificationStore {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> store;
    private boolean usesChannels = false;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider = null;
    private final info.nightscout.androidaps.services.AlarmSoundServiceHelper alarmSoundServiceHelper = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    private static final java.lang.String CHANNEL_ID = "AndroidAPS-Overview";
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> getStore() {
        return null;
    }
    
    public final void setStore(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> p0) {
    }
    
    public final synchronized boolean add(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.notifications.Notification n) {
        return false;
    }
    
    public final synchronized boolean remove(int id) {
        return false;
    }
    
    private final synchronized void removeExpired() {
    }
    
    private final void raiseSystemNotification(info.nightscout.androidaps.plugins.general.overview.notifications.Notification n) {
    }
    
    private final android.app.PendingIntent deleteIntent(int id) {
        return null;
    }
    
    public final void createNotificationChannel() {
    }
    
    public final synchronized void updateNotifications(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView notificationsView) {
    }
    
    private final synchronized java.util.List<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> cloneStore() {
        return null;
    }
    
    @javax.inject.Inject()
    public NotificationStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.IconsProvider iconsProvider, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.services.AlarmSoundServiceHelper alarmSoundServiceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$NotificationComparator;", "Ljava/util/Comparator;", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/Notification;", "(Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;)V", "compare", "", "o1", "o2", "app_fullRelease"})
    public final class NotificationComparator implements java.util.Comparator<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> {
        
        @java.lang.Override()
        public int compare(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.overview.notifications.Notification o1, @org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.overview.notifications.Notification o2) {
            return 0;
        }
        
        public NotificationComparator() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0015\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$NotificationRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$NotificationRecyclerViewAdapter$NotificationsViewHolder;", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;", "notificationsList", "", "Linfo/nightscout/androidaps/plugins/general/overview/notifications/Notification;", "(Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "NotificationsViewHolder", "app_fullRelease"})
    public final class NotificationRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore.NotificationRecyclerViewAdapter.NotificationsViewHolder> {
        private final java.util.List<info.nightscout.androidaps.plugins.general.overview.notifications.Notification> notificationsList = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore.NotificationRecyclerViewAdapter.NotificationsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore.NotificationRecyclerViewAdapter.NotificationsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public NotificationRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends info.nightscout.androidaps.plugins.general.overview.notifications.Notification> notificationsList) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$NotificationRecyclerViewAdapter$NotificationsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$NotificationRecyclerViewAdapter;Landroid/view/View;)V", "cv", "Landroidx/cardview/widget/CardView;", "getCv", "()Landroidx/cardview/widget/CardView;", "setCv", "(Landroidx/cardview/widget/CardView;)V", "dismiss", "Landroid/widget/Button;", "getDismiss", "()Landroid/widget/Button;", "setDismiss", "(Landroid/widget/Button;)V", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "app_fullRelease"})
        public final class NotificationsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private androidx.cardview.widget.CardView cv;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView text;
            @org.jetbrains.annotations.NotNull()
            private android.widget.Button dismiss;
            
            @org.jetbrains.annotations.NotNull()
            public final androidx.cardview.widget.CardView getCv() {
                return null;
            }
            
            public final void setCv(@org.jetbrains.annotations.NotNull()
            androidx.cardview.widget.CardView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getText() {
                return null;
            }
            
            public final void setText(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getDismiss() {
                return null;
            }
            
            public final void setDismiss(@org.jetbrains.annotations.NotNull()
            android.widget.Button p0) {
            }
            
            public NotificationsViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/notifications/NotificationStore$Companion;", "", "()V", "CHANNEL_ID", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}