package info.nightscout.androidaps.plugins.general.wear;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u00b7\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u00a2\u0006\u0002\u0010.J\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000200H\u0002J \u0010E\u001a\u00020A2\u0006\u0010D\u001a\u0002002\u0006\u0010F\u001a\u0002062\u0006\u0010G\u001a\u000200H\u0002J\u0010\u0010H\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J$\u0010I\u001a\u0002042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002J \u0010N\u001a\u00020A2\u0006\u0010G\u001a\u0002002\u0006\u0010O\u001a\u00020C2\u0006\u0010P\u001a\u00020CH\u0002J\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002J\u000e\u0010S\u001a\u00020A2\u0006\u0010T\u001a\u000204J\u000e\u0010U\u001a\u00020A2\u0006\u0010T\u001a\u000204J\u0016\u0010V\u001a\u00020W2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0XH\u0002J\u0010\u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u000204H\u0002J\u0010\u0010[\u001a\u00020A2\u0006\u0010\\\u001a\u000204H\u0002J\u0018\u0010]\u001a\u00020A2\u0006\u0010^\u001a\u0002002\u0006\u0010_\u001a\u000200H\u0002R\u000e\u0010/\u001a\u000200X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u00109R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u00109R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b?\u00109R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006`"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/wear/ActionStringHandler;", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "injector", "Ldagger/android/HasAndroidInjector;", "context", "Landroid/content/Context;", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "wearPlugin", "Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "localInsightPlugin", "Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;", "danaRPlugin", "Linfo/nightscout/androidaps/danar/DanaRPlugin;", "danaRKoreanPlugin", "Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;", "danaRv2Plugin", "Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;", "danaRSPlugin", "Linfo/nightscout/androidaps/danars/DanaRSPlugin;", "danaPump", "Linfo/nightscout/androidaps/dana/DanaPump;", "hardLimits", "Linfo/nightscout/androidaps/utils/HardLimits;", "carbsGenerator", "Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Ldagger/android/HasAndroidInjector;Landroid/content/Context;Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/plugins/general/wear/WearPlugin;Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightPlugin;Linfo/nightscout/androidaps/danar/DanaRPlugin;Linfo/nightscout/androidaps/danaRKorean/DanaRKoreanPlugin;Linfo/nightscout/androidaps/danaRv2/DanaRv2Plugin;Linfo/nightscout/androidaps/danars/DanaRSPlugin;Linfo/nightscout/androidaps/dana/DanaPump;Linfo/nightscout/androidaps/utils/HardLimits;Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;Linfo/nightscout/androidaps/utils/DateUtil;Linfo/nightscout/androidaps/Config;)V", "TIMEOUT", "", "lastBolusWizard", "Linfo/nightscout/androidaps/utils/wizard/BolusWizard;", "lastConfirmActionString", "", "lastSentTimestamp", "", "loopStatus", "getLoopStatus", "()Ljava/lang/String;", "oAPSResultStatus", "getOAPSResultStatus", "pumpStatus", "getPumpStatus", "targetsStatus", "getTargetsStatus", "doBolus", "", "amount", "", "carbs", "doECarbs", "time", "duration", "doFillBolus", "generateTDDMessage", "historyList", "", "Linfo/nightscout/androidaps/db/TDD;", "dummies", "generateTempTarget", "low", "high", "getTDDList", "returnDummies", "handleConfirmation", "actionString", "handleInitiate", "isOldData", "", "", "sendError", "errormessage", "sendStatusMessage", "message", "setCPP", "timeshift", "percentage", "app_fullRelease"})
@javax.inject.Singleton()
public final class ActionStringHandler {
    private final int TIMEOUT = 65000;
    private long lastSentTimestamp = 0L;
    private java.lang.String lastConfirmActionString;
    private info.nightscout.androidaps.utils.wizard.BolusWizard lastBolusWizard;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final dagger.android.HasAndroidInjector injector = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.plugins.general.wear.WearPlugin wearPlugin = null;
    private final info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin localInsightPlugin = null;
    private final info.nightscout.androidaps.danar.DanaRPlugin danaRPlugin = null;
    private final info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin danaRKoreanPlugin = null;
    private final info.nightscout.androidaps.danaRv2.DanaRv2Plugin danaRv2Plugin = null;
    private final info.nightscout.androidaps.danars.DanaRSPlugin danaRSPlugin = null;
    private final info.nightscout.androidaps.dana.DanaPump danaPump = null;
    private final info.nightscout.androidaps.utils.HardLimits hardLimits = null;
    private final info.nightscout.androidaps.plugins.treatments.CarbsGenerator carbsGenerator = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    private final info.nightscout.androidaps.Config config = null;
    
    public final synchronized void handleInitiate(@org.jetbrains.annotations.NotNull()
    java.lang.String actionString) {
    }
    
    private final java.lang.String generateTDDMessage(java.util.List<info.nightscout.androidaps.db.TDD> historyList, java.util.List<info.nightscout.androidaps.db.TDD> dummies) {
        return null;
    }
    
    private final boolean isOldData(java.util.List<? extends info.nightscout.androidaps.db.TDD> historyList) {
        return false;
    }
    
    private final java.util.List<info.nightscout.androidaps.db.TDD> getTDDList(java.util.List<info.nightscout.androidaps.db.TDD> returnDummies) {
        return null;
    }
    
    private final java.lang.String getPumpStatus() {
        return null;
    }
    
    private final java.lang.String getLoopStatus() {
        return null;
    }
    
    private final java.lang.String getTargetsStatus() {
        return null;
    }
    
    private final java.lang.String getOAPSResultStatus() {
        return null;
    }
    
    public final synchronized void handleConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String actionString) {
    }
    
    private final void doECarbs(int carbs, long time, int duration) {
    }
    
    private final void setCPP(int timeshift, int percentage) {
    }
    
    private final void generateTempTarget(int duration, double low, double high) {
    }
    
    private final void doFillBolus(double amount) {
    }
    
    private final void doBolus(double amount, int carbs) {
    }
    
    private final synchronized void sendError(java.lang.String errormessage) {
    }
    
    private final synchronized void sendStatusMessage(java.lang.String message) {
    }
    
    @javax.inject.Inject()
    public ActionStringHandler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.wear.WearPlugin wearPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.LocalInsightPlugin localInsightPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danar.DanaRPlugin danaRPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin danaRKoreanPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danaRv2.DanaRv2Plugin danaRv2Plugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.danars.DanaRSPlugin danaRSPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.dana.DanaPump danaPump, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.HardLimits hardLimits, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.CarbsGenerator carbsGenerator, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}