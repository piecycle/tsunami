package info.nightscout.androidaps.plugins.general.automation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GBg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001dJ\u000e\u00103\u001a\u0002012\u0006\u00102\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206J\f\u00107\u001a\b\u0012\u0004\u0012\u00020908J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;08J\b\u0010<\u001a\u000201H\u0002J\b\u0010=\u001a\u000201H\u0014J\b\u0010>\u001a\u000201H\u0014J\b\u0010?\u001a\u000201H\u0002J\u000e\u0010@\u001a\u0002012\u0006\u00105\u001a\u000206J\u0016\u0010A\u001a\u0002012\u0006\u00102\u001a\u00020\u001d2\u0006\u00105\u001a\u000206J\u0006\u0010B\u001a\u000206J\b\u0010C\u001a\u000201H\u0002J\u0016\u0010D\u001a\u0002012\u0006\u0010E\u001a\u0002062\u0006\u0010F\u001a\u000206R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020(X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "config", "Linfo/nightscout/androidaps/Config;", "locationServiceHelper", "Linfo/nightscout/androidaps/services/LocationServiceHelper;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/Config;Linfo/nightscout/androidaps/services/LocationServiceHelper;Linfo/nightscout/androidaps/utils/DateUtil;)V", "automationEvents", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationEvent;", "btConnects", "", "Linfo/nightscout/androidaps/events/EventBTChange;", "getBtConnects", "()Ljava/util/List;", "setBtConnects", "(Ljava/util/List;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "executionLog", "", "getExecutionLog", "setExecutionLog", "keyAutomationEvents", "loopHandler", "Landroid/os/Handler;", "refreshLoop", "Ljava/lang/Runnable;", "add", "", "event", "addIfNotExists", "at", "index", "", "getActionDummyObjects", "", "Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "getTriggerDummyObjects", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "loadFromSP", "onStart", "onStop", "processActions", "removeAt", "set", "size", "storeToSP", "swap", "fromPosition", "toPosition", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class AutomationPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private io.reactivex.disposables.CompositeDisposable disposable;
    private final java.lang.String keyAutomationEvents = "AUTOMATION_EVENTS";
    private final java.util.ArrayList<info.nightscout.androidaps.plugins.general.automation.AutomationEvent> automationEvents = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> executionLog;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<info.nightscout.androidaps.events.EventBTChange> btConnects;
    private final android.os.Handler loopHandler = null;
    private java.lang.Runnable refreshLoop;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker = null;
    private final info.nightscout.androidaps.Config config = null;
    private final info.nightscout.androidaps.services.LocationServiceHelper locationServiceHelper = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String event = "{\"title\":\"Low\",\"enabled\":true,\"trigger\":\"{\\\"type\\\":\\\"info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector\\\",\\\"data\\\":{\\\"connectorType\\\":\\\"AND\\\",\\\"triggerList\\\":[\\\"{\\\\\\\"type\\\\\\\":\\\\\\\"info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg\\\\\\\",\\\\\\\"data\\\\\\\":{\\\\\\\"bg\\\\\\\":4,\\\\\\\"comparator\\\\\\\":\\\\\\\"IS_LESSER\\\\\\\",\\\\\\\"units\\\\\\\":\\\\\\\"mmol\\\\\\\"}}\\\",\\\"{\\\\\\\"type\\\\\\\":\\\\\\\"info.nightscout.androidaps.plugins.general.automation.triggers.TriggerDelta\\\\\\\",\\\\\\\"data\\\\\\\":{\\\\\\\"value\\\\\\\":-0.1,\\\\\\\"units\\\\\\\":\\\\\\\"mmol\\\\\\\",\\\\\\\"deltaType\\\\\\\":\\\\\\\"DELTA\\\\\\\",\\\\\\\"comparator\\\\\\\":\\\\\\\"IS_LESSER\\\\\\\"}}\\\"]}}\",\"actions\":[\"{\\\"type\\\":\\\"info.nightscout.androidaps.plugins.general.automation.actions.ActionStartTempTarget\\\",\\\"data\\\":{\\\"value\\\":8,\\\"units\\\":\\\"mmol\\\",\\\"durationInMinutes\\\":60}}\"]}";
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getExecutionLog() {
        return null;
    }
    
    public final void setExecutionLog(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.events.EventBTChange> getBtConnects() {
        return null;
    }
    
    public final void setBtConnects(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.events.EventBTChange> p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void storeToSP() {
    }
    
    private final void loadFromSP() {
    }
    
    private final synchronized void processActions() {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationEvent event) {
    }
    
    public final void addIfNotExists(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationEvent event) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationEvent event, int index) {
    }
    
    public final void removeAt(int index) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationEvent at(int index) {
        return null;
    }
    
    public final int size() {
        return 0;
    }
    
    public final void swap(int fromPosition, int toPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.general.automation.actions.Action> getActionDummyObjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.general.automation.triggers.Trigger> getTriggerDummyObjects() {
        return null;
    }
    
    @javax.inject.Inject()
    public AutomationPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.services.LocationServiceHelper locationServiceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin$Companion;", "", "()V", "event", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}