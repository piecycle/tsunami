package info.nightscout.androidaps.queue;

import java.lang.System;

/**
 * Created by mike on 08.11.2017.
 *
 *
 * DATA FLOW:
 * ---------
 *
 *
 * (request) - > ConfigBuilder.getCommandQueue().bolus(...)
 *
 *
 * app no longer waits for result but passes Callback
 *
 *
 * request is added to queue, if another request of the same type already exists in queue, it's removed prior adding
 * but if request of the same type is currently executed (probably important only for bolus which is running long time), new request is declined
 * new QueueThread is created and started if current if finished
 * CommandReadStatus is added automatically before command if queue is empty
 *
 *
 * biggest change is we don't need exec pump commands in Handler because it's finished immediately
 * command queueing if not realized by stacking in different Handlers and threads anymore but by internal queue with better control
 *
 *
 * QueueThread calls ConfigBuilder#connect which is passed to getActivePump().connect
 * connect should be executed on background and return immediately. afterwards isConnecting() is expected to be true
 *
 *
 * while isConnecting() == true GUI is updated by posting connection progress
 *
 *
 * if connect is successful: isConnected() becomes true, isConnecting() becomes false
 * CommandQueue starts calling execute() of commands. execute() is expected to be blocking (return after finish).
 * callback with result is called after finish automatically
 * if connect failed: isConnected() becomes false, isConnecting() becomes false
 * connect() is called again
 *
 *
 * when queue is empty, disconnect is called
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Be\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\u0019J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\'H\u0002J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u00020<H\u0016J\b\u0010B\u001a\u000209H\u0016J\u0012\u0010C\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010F\u001a\u000209H\u0016J\u001a\u0010G\u001a\u00020<2\u0006\u0010G\u001a\u00020H2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010I\u001a\u00020JH\u0002J\"\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020R2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010S\u001a\u00020<2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0UH\u0016J\u0018\u0010V\u001a\u00020<2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0UH\u0016J\u0010\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020<2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010[\u001a\u00020<2\u0006\u0010\\\u001a\u00020]H\u0016J\u0012\u0010^\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010_\u001a\u00020<2\u0006\u0010X\u001a\u00020`2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010a\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010b\u001a\u000209H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010c\u001a\u000209H\u0016J\u001a\u0010d\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010e\u001a\u0002092\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010f\u001a\u0002092\u000e\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0UH\u0002J\b\u0010h\u001a\u000209H\u0016J\u001a\u0010i\u001a\u00020<2\u0006\u0010\\\u001a\u00020]2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010j\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010k\u001a\u00020<H\u0016J\u0012\u0010l\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010m\u001a\u0002092\u0006\u0010L\u001a\u00020M2\b\u0010n\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010o\u001a\u00020OH\u0016J\b\u0010p\u001a\u00020qH\u0016J\u0012\u0010r\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010s\u001a\u00020<H\u0016J\u0012\u0010t\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J2\u0010u\u001a\u00020<2\u0006\u0010v\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010E\u001a\u00020<2\u0006\u0010\\\u001a\u00020]2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J2\u0010w\u001a\u00020<2\u0006\u0010x\u001a\u00020O2\u0006\u0010N\u001a\u00020O2\u0006\u0010E\u001a\u00020<2\u0006\u0010\\\u001a\u00020]2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\'0/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"}, d2 = {"Linfo/nightscout/androidaps/queue/CommandQueue;", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "activePlugin", "Ldagger/Lazy;", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "context", "Landroid/content/Context;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Ldagger/Lazy;Landroid/content/Context;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "getActivePlugin", "()Ldagger/Lazy;", "getConstraintChecker", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "getContext", "()Landroid/content/Context;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "performing", "Linfo/nightscout/androidaps/queue/commands/Command;", "getPerforming", "()Linfo/nightscout/androidaps/queue/commands/Command;", "setPerforming", "(Linfo/nightscout/androidaps/queue/commands/Command;)V", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "queue", "Ljava/util/LinkedList;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "thread", "Linfo/nightscout/androidaps/queue/QueueThread;", "add", "", "command", "bolus", "", "detailedBolusInfo", "Linfo/nightscout/androidaps/data/DetailedBolusInfo;", "callback", "Linfo/nightscout/androidaps/queue/Callback;", "bolusInQueue", "cancelAllBoluses", "cancelExtended", "cancelTempBasal", "enforceNew", "clear", "customCommand", "Linfo/nightscout/androidaps/queue/commands/CustomCommand;", "executingNowError", "Linfo/nightscout/androidaps/data/PumpEnactResult;", "extendedBolus", "insulin", "", "durationInMinutes", "", "independentConnect", "reason", "", "isCustomCommandInQueue", "customCommandType", "Ljava/lang/Class;", "isCustomCommandRunning", "isLastScheduled", "type", "Linfo/nightscout/androidaps/queue/commands/Command$CommandType;", "isRunning", "isThisProfileSet", "profile", "Linfo/nightscout/androidaps/data/Profile;", "loadEvents", "loadHistory", "", "loadTDDs", "notifyAboutNewCommand", "pickup", "readStatus", "removeAll", "removeAllCustomCommands", "targetType", "resetPerforming", "setProfile", "setTBROverNotification", "enable", "setUserOptions", "showBolusProgressDialog", "ctx", "size", "spannedStatus", "Landroid/text/Spanned;", "startPump", "statusInQueue", "stopPump", "tempBasalAbsolute", "absoluteRate", "tempBasalPercent", "percent", "app_fullRelease"})
@javax.inject.Singleton()
public final class CommandQueue implements info.nightscout.androidaps.interfaces.CommandQueueProvider {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final java.util.LinkedList<info.nightscout.androidaps.queue.commands.Command> queue = null;
    private info.nightscout.androidaps.queue.QueueThread thread;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.queue.commands.Command performing;
    private final dagger.android.HasAndroidInjector injector = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    @org.jetbrains.annotations.NotNull()
    private final dagger.Lazy<info.nightscout.androidaps.interfaces.ActivePluginProvider> activePlugin = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.queue.commands.Command getPerforming() {
        return null;
    }
    
    public final void setPerforming(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.commands.Command p0) {
    }
    
    private final info.nightscout.androidaps.data.PumpEnactResult executingNowError() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRunning(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.queue.commands.Command.CommandType type) {
        return false;
    }
    
    private final synchronized void removeAll(info.nightscout.androidaps.queue.commands.Command.CommandType type) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final synchronized boolean isLastScheduled(info.nightscout.androidaps.queue.commands.Command.CommandType type) {
        return false;
    }
    
    private final synchronized void add(info.nightscout.androidaps.queue.commands.Command command) {
    }
    
    @java.lang.Override()
    public synchronized void pickup() {
    }
    
    @java.lang.Override()
    public synchronized void clear() {
    }
    
    @java.lang.Override()
    public int size() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public info.nightscout.androidaps.queue.commands.Command performing() {
        return null;
    }
    
    @java.lang.Override()
    public void resetPerforming() {
    }
    
    private final synchronized void notifyAboutNewCommand() {
    }
    
    @java.lang.Override()
    public void independentConnect(@org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
    }
    
    @java.lang.Override()
    public synchronized boolean bolusInQueue() {
        return false;
    }
    
    @java.lang.Override()
    public synchronized boolean bolus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.DetailedBolusInfo detailedBolusInfo, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public void stopPump(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
    }
    
    @java.lang.Override()
    public void startPump(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
    }
    
    @java.lang.Override()
    public void setTBROverNotification(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback, boolean enable) {
    }
    
    @java.lang.Override()
    public synchronized void cancelAllBoluses() {
    }
    
    @java.lang.Override()
    public boolean tempBasalAbsolute(double absoluteRate, int durationInMinutes, boolean enforceNew, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean tempBasalPercent(int percent, int durationInMinutes, boolean enforceNew, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean extendedBolus(double insulin, int durationInMinutes, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean cancelTempBasal(boolean enforceNew, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean cancelExtended(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean setProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean readStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public synchronized boolean statusInQueue() {
        return false;
    }
    
    @java.lang.Override()
    public boolean loadHistory(byte type, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean setUserOptions(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean loadTDDs(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean loadEvents(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public boolean customCommand(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.queue.commands.CustomCommand customCommand, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.queue.Callback callback) {
        return false;
    }
    
    @java.lang.Override()
    public synchronized boolean isCustomCommandInQueue(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends info.nightscout.androidaps.queue.commands.CustomCommand> customCommandType) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCustomCommandRunning(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends info.nightscout.androidaps.queue.commands.CustomCommand> customCommandType) {
        return false;
    }
    
    private final synchronized void removeAllCustomCommands(java.lang.Class<? extends info.nightscout.androidaps.queue.commands.CustomCommand> targetType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.text.Spanned spannedStatus() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isThisProfileSet(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile) {
        return false;
    }
    
    private final void showBolusProgressDialog(double insulin, android.content.Context ctx) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker getConstraintChecker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<info.nightscout.androidaps.interfaces.ActivePluginProvider> getActivePlugin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    @javax.inject.Inject()
    public CommandQueue(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<info.nightscout.androidaps.interfaces.ActivePluginProvider> activePlugin, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy) {
        super();
    }
}