package info.nightscout.androidaps.plugins.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/DexcomPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/BgSourceInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "config", "Linfo/nightscout/androidaps/Config;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/MainApp;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;Linfo/nightscout/androidaps/Config;)V", "advancedFilteringSupported", "", "findDexcomPackageName", "", "handleNewData", "", "intent", "Landroid/content/Intent;", "onStart", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class DexcomPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.BgSourceInterface {
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.MainApp mainApp = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload = null;
    private static final java.lang.String[] PACKAGE_NAMES = {"com.dexcom.cgm.region1.mgdl", "com.dexcom.cgm.region1.mmol", "com.dexcom.cgm.region2.mgdl", "com.dexcom.cgm.region2.mmol", "com.dexcom.g6.region1.mmol", "com.dexcom.g6.region2.mgdl", "com.dexcom.g6.region3.mgdl", "com.dexcom.g6.region3.mmol"};
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERMISSION = "com.dexcom.cgm.EXTERNAL_PERMISSION";
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.source.DexcomPlugin.Companion Companion = null;
    
    @java.lang.Override()
    public boolean advancedFilteringSupported() {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String findDexcomPackageName() {
        return null;
    }
    
    @java.lang.Override()
    public void handleNewData(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @javax.inject.Inject()
    public DexcomPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp mainApp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/DexcomPlugin$Companion;", "", "()V", "PACKAGE_NAMES", "", "", "[Ljava/lang/String;", "PERMISSION", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}