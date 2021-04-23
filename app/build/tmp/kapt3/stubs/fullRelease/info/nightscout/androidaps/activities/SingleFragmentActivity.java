package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Linfo/nightscout/androidaps/activities/SingleFragmentActivity;", "Linfo/nightscout/androidaps/activities/DaggerAppCompatActivityWithResult;", "()V", "plugin", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "pluginStore", "Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "getPluginStore", "()Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "setPluginStore", "(Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;)V", "protectionCheck", "Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "getProtectionCheck", "()Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "setProtectionCheck", "(Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_fullRelease"})
public final class SingleFragmentActivity extends info.nightscout.androidaps.activities.DaggerAppCompatActivityWithResult {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.PluginStore pluginStore;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.protection.ProtectionCheck protectionCheck;
    private info.nightscout.androidaps.interfaces.PluginBase plugin;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.PluginStore getPluginStore() {
        return null;
    }
    
    public final void setPluginStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.PluginStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.protection.ProtectionCheck getProtectionCheck() {
        return null;
    }
    
    public final void setProtectionCheck(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.ProtectionCheck p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    public SingleFragmentActivity() {
        super();
    }
}