package info.nightscout.androidaps.plugins.general.maintenance.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/maintenance/activities/LogSettingActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "binding", "Linfo/nightscout/androidaps/databinding/ActivityLogsettingBinding;", "l", "Linfo/nightscout/androidaps/logging/L;", "getL", "()Linfo/nightscout/androidaps/logging/L;", "setL", "(Linfo/nightscout/androidaps/logging/L;)V", "createViewsForSettings", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "LogViewHolder", "app_fullRelease"})
public final class LogSettingActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.L l;
    private info.nightscout.androidaps.databinding.ActivityLogsettingBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.L getL() {
        return null;
    }
    
    public final void setL(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.L p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createViewsForSettings() {
    }
    
    public LogSettingActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/maintenance/activities/LogSettingActivity$LogViewHolder;", "", "element", "Linfo/nightscout/androidaps/logging/L$LogElement;", "(Linfo/nightscout/androidaps/plugins/general/maintenance/activities/LogSettingActivity;Linfo/nightscout/androidaps/logging/L$LogElement;)V", "baseView", "Landroid/widget/LinearLayout;", "getBaseView$annotations", "()V", "getBaseView", "()Landroid/widget/LinearLayout;", "setBaseView", "(Landroid/widget/LinearLayout;)V", "app_fullRelease"})
    public final class LogViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout baseView;
        
        @kotlin.Suppress(names = {"InflateParams"})
        @java.lang.Deprecated()
        public static void getBaseView$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getBaseView() {
            return null;
        }
        
        public final void setBaseView(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        public LogViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.logging.L.LogElement element) {
            super();
        }
    }
}