package info.nightscout.androidaps.plugins.general.openhumans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014\u00a8\u0006\r"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "ErrorDialog", "ExchangeAuthTokenDialog", "SetupDoneDialog", "app_fullRelease"})
public final class OpenHumansLoginActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public OpenHumansLoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ExchangeAuthTokenDialog;", "Ldagger/android/support/DaggerDialogFragment;", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "openHumansUploader", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "getOpenHumansUploader", "()Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;", "setOpenHumansUploader", "(Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansUploader;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDestroy", "Companion", "app_fullRelease"})
    public static final class ExchangeAuthTokenDialog extends dagger.android.support.DaggerDialogFragment {
        @javax.inject.Inject()
        public info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader openHumansUploader;
        private io.reactivex.disposables.Disposable disposable;
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity.ExchangeAuthTokenDialog.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader getOpenHumansUploader() {
            return null;
        }
        
        public final void setOpenHumansUploader(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.openhumans.OpenHumansUploader p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public void onDestroy() {
        }
        
        public ExchangeAuthTokenDialog() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ExchangeAuthTokenDialog$Companion;", "", "()V", "invoke", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ExchangeAuthTokenDialog;", "authToken", "", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity.ExchangeAuthTokenDialog invoke(@org.jetbrains.annotations.NotNull()
            java.lang.String authToken) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ErrorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_fullRelease"})
    public static final class ErrorDialog extends androidx.fragment.app.DialogFragment {
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity.ErrorDialog.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        public ErrorDialog() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ErrorDialog$Companion;", "", "()V", "invoke", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ErrorDialog;", "message", "", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity.ErrorDialog invoke(@org.jetbrains.annotations.Nullable()
            java.lang.String message) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$SetupDoneDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "app_fullRelease"})
    public static final class SetupDoneDialog extends androidx.fragment.app.DialogFragment {
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        public SetupDoneDialog() {
            super();
        }
    }
}