package info.nightscout.androidaps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Linfo/nightscout/androidaps/utils/AndroidPermission;", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "injector", "Ldagger/android/HasAndroidInjector;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Ldagger/android/HasAndroidInjector;)V", "getInjector", "()Ldagger/android/HasAndroidInjector;", "permissionBatteryOptimizationFailed", "", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "askForPermission", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permissions", "", "", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;)V", "permission", "notifyForBatteryOptimizationPermission", "notifyForLocationPermissions", "notifyForSMSPermissions", "smsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "notifyForStoragePermission", "notifyForSystemWindowPermissions", "permissionNotGranted", "context", "Landroid/content/Context;", "app_fullRelease"})
@javax.inject.Singleton()
public final class AndroidPermission {
    private boolean permissionBatteryOptimizationFailed = false;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    
    @android.annotation.SuppressLint(value = {"BatteryLife"})
    public final void askForPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
    }
    
    public final void askForPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
    }
    
    public final boolean permissionNotGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final synchronized void notifyForSMSPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin) {
    }
    
    public final synchronized void notifyForBatteryOptimizationPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final synchronized void notifyForStoragePermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final synchronized void notifyForLocationPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final synchronized void notifyForSystemWindowPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    @javax.inject.Inject()
    public AndroidPermission(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}