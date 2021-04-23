package info.nightscout.androidaps.plugins.general.nsclient.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\n\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0002J\u001d\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u0004\u0018\u00010\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u0015\u0010)\u001a\u0004\u0018\u00010 2\u0006\u0010*\u001a\u00020\u0016\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u0004\u0018\u00010\u0016J\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/DefaultValueHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/Config;)V", "data", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "setData", "(Lorg/json/JSONObject;)V", "nightscoutVersionName", "", "getNightscoutVersionName", "()Ljava/lang/String;", "setNightscoutVersionName", "(Ljava/lang/String;)V", "copyStatusLightsNsSettings", "", "context", "Landroid/content/Context;", "extendedPumpSettings", "", "setting", "getExtendedSettings", "getExtendedWarnValue", "plugin", "property", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;", "getName", "getSettings", "getSettingsThreshold", "what", "(Ljava/lang/String;)Ljava/lang/Double;", "getVersion", "getVersionNum", "", "handleNewData", "nightscoutVersionCode", "status", "openAPSEnabledAlerts", "", "pumpExtendedSettingsEnabledAlerts", "pumpExtendedSettingsFields", "app_fullRelease"})
@javax.inject.Singleton()
public final class NSSettingsStatus {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nightscoutVersionName = "";
    @org.jetbrains.annotations.Nullable()
    private org.json.JSONObject data;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.Config config = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNightscoutVersionName() {
        return null;
    }
    
    public final void setNightscoutVersionName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject p0) {
    }
    
    public final void handleNewData(@org.jetbrains.annotations.NotNull()
    java.lang.String nightscoutVersionName, int nightscoutVersionCode, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject status) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final int getVersionNum() {
        return 0;
    }
    
    private final org.json.JSONObject getSettings() {
        return null;
    }
    
    private final org.json.JSONObject getExtendedSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getExtendedWarnValue(@org.jetbrains.annotations.NotNull()
    java.lang.String plugin, @org.jetbrains.annotations.NotNull()
    java.lang.String property) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSettingsThreshold(@org.jetbrains.annotations.NotNull()
    java.lang.String what) {
        return null;
    }
    
    public final double extendedPumpSettings(@org.jetbrains.annotations.Nullable()
    java.lang.String setting) {
        return 0.0;
    }
    
    private final org.json.JSONObject extendedPumpSettings() {
        return null;
    }
    
    public final boolean pumpExtendedSettingsEnabledAlerts() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String pumpExtendedSettingsFields() {
        return null;
    }
    
    public final boolean openAPSEnabledAlerts() {
        return false;
    }
    
    public final void copyStatusLightsNsSettings(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @javax.inject.Inject()
    public NSSettingsStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}