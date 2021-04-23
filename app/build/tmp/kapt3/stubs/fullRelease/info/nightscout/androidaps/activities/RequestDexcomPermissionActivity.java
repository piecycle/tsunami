package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Linfo/nightscout/androidaps/activities/RequestDexcomPermissionActivity;", "Linfo/nightscout/androidaps/activities/DialogAppCompatActivity;", "()V", "dexcomPlugin", "Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "getDexcomPlugin", "()Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "setDexcomPlugin", "(Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;)V", "requestCode", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_fullRelease"})
public final class RequestDexcomPermissionActivity extends info.nightscout.androidaps.activities.DialogAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.source.DexcomPlugin dexcomPlugin;
    private final int requestCode = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.source.DexcomPlugin getDexcomPlugin() {
        return null;
    }
    
    public final void setDexcomPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.source.DexcomPlugin p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public RequestDexcomPermissionActivity() {
        super();
    }
}