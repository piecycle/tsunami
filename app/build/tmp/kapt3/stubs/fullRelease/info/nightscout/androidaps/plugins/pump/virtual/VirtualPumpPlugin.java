package info.nightscout.androidaps.plugins.pump.virtual;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u00020/H\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002012\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020>H\u0016J\u0014\u0010?\u001a\u0004\u0018\u0001012\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u000205H\u0016J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020\u001bH\u0016J\u0010\u0010F\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GH\u0016J\u0006\u0010I\u001a\u00020/J \u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u0002072\u0006\u0010O\u001a\u000207H\u0016J\b\u0010P\u001a\u00020%H\u0016J\u0012\u0010Q\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u0010R\u001a\u00020DH\u0016J\b\u0010S\u001a\u00020/H\u0016J\b\u0010T\u001a\u00020/H\u0016J\b\u0010U\u001a\u00020/H\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020/H\u0016J\b\u0010Y\u001a\u00020/H\u0016J\u0010\u0010Z\u001a\u00020/2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010[\u001a\u000201H\u0016J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020\'H\u0016J\b\u0010_\u001a\u000205H\u0014J\b\u0010`\u001a\u000205H\u0014J\u0010\u0010a\u001a\u0002052\u0006\u0010b\u001a\u00020cH\u0016J\u0006\u0010d\u001a\u000205J\b\u0010e\u001a\u000207H\u0016J\u0018\u0010f\u001a\u0002012\u0006\u0010g\u001a\u00020D2\u0006\u0010h\u001a\u00020\u001bH\u0016J\u000e\u0010i\u001a\u0002052\u0006\u0010j\u001a\u00020/J\u0010\u0010k\u001a\u0002012\u0006\u0010L\u001a\u00020MH\u0016J(\u0010l\u001a\u0002012\u0006\u0010m\u001a\u00020D2\u0006\u0010h\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020M2\u0006\u0010n\u001a\u00020/H\u0016J(\u0010o\u001a\u0002012\u0006\u0010p\u001a\u00020\u001b2\u0006\u0010h\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020M2\u0006\u0010n\u001a\u00020/H\u0016J\u0010\u0010q\u001a\u0002072\u0006\u0010r\u001a\u00020/H\u0016J\b\u0010s\u001a\u000205H\u0016J\b\u0010t\u001a\u000205H\u0016J\u0012\u0010u\u001a\u0002052\b\u0010v\u001a\u0004\u0018\u00010wH\u0016R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010(\u001a\u0004\u0018\u00010\'2\b\u0010&\u001a\u0004\u0018\u00010\'@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006x"}, d2 = {"Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpPlugin;", "Linfo/nightscout/androidaps/interfaces/PumpPluginBase;", "Linfo/nightscout/androidaps/interfaces/PumpInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "config", "Linfo/nightscout/androidaps/Config;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;Linfo/nightscout/androidaps/Config;Linfo/nightscout/androidaps/utils/DateUtil;)V", "batteryPercent", "", "getBatteryPercent", "()I", "setBatteryPercent", "(I)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastDataTime", "", "pumpDescription", "Linfo/nightscout/androidaps/interfaces/PumpDescription;", "<set-?>", "Linfo/nightscout/androidaps/plugins/pump/common/defs/PumpType;", "pumpType", "getPumpType", "()Linfo/nightscout/androidaps/plugins/pump/common/defs/PumpType;", "reservoirInUnits", "getReservoirInUnits", "setReservoirInUnits", "canHandleDST", "", "cancelExtendedBolus", "Linfo/nightscout/androidaps/data/PumpEnactResult;", "cancelTempBasal", "force", "connect", "", "reason", "", "deliverTreatment", "detailedBolusInfo", "Linfo/nightscout/androidaps/data/DetailedBolusInfo;", "disconnect", "executeCustomAction", "customActionType", "Linfo/nightscout/androidaps/plugins/general/actions/defs/CustomActionType;", "executeCustomCommand", "customCommand", "Linfo/nightscout/androidaps/queue/commands/CustomCommand;", "finishHandshaking", "getBaseBasalRate", "", "getBatteryLevel", "getCustomActions", "", "Linfo/nightscout/androidaps/plugins/general/actions/defs/CustomAction;", "getFakingStatus", "getJSONStatus", "Lorg/json/JSONObject;", "profile", "Linfo/nightscout/androidaps/data/Profile;", "profileName", "version", "getPumpDescription", "getPumpStatus", "getReservoirLevel", "isBusy", "isConnected", "isConnecting", "isFakingTempsByExtendedBoluses", "isHandshakeInProgress", "isInitialized", "isSuspended", "isThisProfileSet", "loadTDDs", "manufacturer", "Linfo/nightscout/androidaps/plugins/common/ManufacturerType;", "model", "onStart", "onStop", "preprocessPreferences", "preferenceFragment", "Landroidx/preference/PreferenceFragmentCompat;", "refreshConfiguration", "serialNumber", "setExtendedBolus", "insulin", "durationInMinutes", "setFakingStatus", "newStatus", "setNewBasalProfile", "setTempBasalAbsolute", "absoluteRate", "enforceNew", "setTempBasalPercent", "percent", "shortStatus", "veryShort", "stopBolusDelivering", "stopConnecting", "timezoneOrDSTChanged", "timeChangeType", "Linfo/nightscout/androidaps/utils/TimeChangeType;", "app_fullRelease"})
@javax.inject.Singleton()
public final class VirtualPumpPlugin extends info.nightscout.androidaps.interfaces.PumpPluginBase implements info.nightscout.androidaps.interfaces.PumpInterface {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private int batteryPercent = 50;
    private int reservoirInUnits = 50;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.pump.common.defs.PumpType pumpType;
    private long lastDataTime = 0L;
    private final info.nightscout.androidaps.interfaces.PumpDescription pumpDescription = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin = null;
    private final info.nightscout.androidaps.Config config = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    public final int getBatteryPercent() {
        return 0;
    }
    
    public final void setBatteryPercent(int p0) {
    }
    
    public final int getReservoirInUnits() {
        return 0;
    }
    
    public final void setReservoirInUnits(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.pump.common.defs.PumpType getPumpType() {
        return null;
    }
    
    public final boolean getFakingStatus() {
        return false;
    }
    
    public final void setFakingStatus(boolean newStatus) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void preprocessPreferences(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat preferenceFragment) {
    }
    
    @java.lang.Override()
    public boolean isFakingTempsByExtendedBoluses() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult loadTDDs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<info.nightscout.androidaps.plugins.general.actions.defs.CustomAction> getCustomActions() {
        return null;
    }
    
    @java.lang.Override()
    public void executeCustomAction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.actions.defs.CustomActionType customActionType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult executeCustomCommand(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.commands.CustomCommand customCommand) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSuspended() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isBusy() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isConnected() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isConnecting() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isHandshakeInProgress() {
        return false;
    }
    
    @java.lang.Override()
    public void finishHandshaking() {
    }
    
    @java.lang.Override()
    public void connect(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    @java.lang.Override()
    public void disconnect(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    @java.lang.Override()
    public void stopConnecting() {
    }
    
    @java.lang.Override()
    public void getPumpStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String reason) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult setNewBasalProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isThisProfileSet(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile) {
        return false;
    }
    
    @java.lang.Override()
    public long lastDataTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public double getBaseBasalRate() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getReservoirLevel() {
        return 0.0;
    }
    
    @java.lang.Override()
    public int getBatteryLevel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult deliverTreatment(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.DetailedBolusInfo detailedBolusInfo) {
        return null;
    }
    
    @java.lang.Override()
    public void stopBolusDelivering() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult setTempBasalAbsolute(double absoluteRate, int durationInMinutes, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, boolean enforceNew) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult setTempBasalPercent(int percent, int durationInMinutes, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, boolean enforceNew) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult setExtendedBolus(double insulin, int durationInMinutes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult cancelTempBasal(boolean force) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.data.PumpEnactResult cancelExtendedBolus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.json.JSONObject getJSONStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String profileName, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.common.ManufacturerType manufacturer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.pump.common.defs.PumpType model() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String serialNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.PumpDescription getPumpDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String shortStatus(boolean veryShort) {
        return null;
    }
    
    @java.lang.Override()
    public boolean canHandleDST() {
        return false;
    }
    
    public final void refreshConfiguration() {
    }
    
    @java.lang.Override()
    public void timezoneOrDSTChanged(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.utils.TimeChangeType timeChangeType) {
    }
    
    @javax.inject.Inject()
    public VirtualPumpPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super(null, null, null, null, null);
    }
}