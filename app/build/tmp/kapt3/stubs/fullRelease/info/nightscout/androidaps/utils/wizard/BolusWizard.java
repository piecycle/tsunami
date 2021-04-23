package info.nightscout.androidaps.utils.wizard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u00ac\u0001\u001a\u00030\u00ad\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u0001H\u0002J\u0014\u0010\u00b0\u0001\u001a\u00030\u00ad\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u0001H\u0002J\u0012\u0010\u00b1\u0001\u001a\u00030\u00ad\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u0001J\u0013\u0010\u00b2\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00b4\u0001\u001a\u00020\fH\u0002J\u00aa\u0001\u0010\u00b5\u0001\u001a\u00020\u00002\u0006\u0010w\u001a\u00020x2\u0007\u0010\u0083\u0001\u001a\u00020q2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010v\u001a\u00020\u001a2\u0007\u0010\u00a7\u0001\u001a\u00020\f2\u0007\u0010\u00a8\u0001\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020\f2\u0007\u0010\u00a9\u0001\u001a\u00020\f2\u0007\u0010\u00aa\u0001\u001a\u00020\f2\u0007\u0010\u00ab\u0001\u001a\u00020\f2\u0007\u0010\u00a6\u0001\u001a\u00020\f2\b\b\u0002\u0010p\u001a\u00020q2\b\b\u0002\u0010#\u001a\u00020$H\u0007J\n\u0010\u00b6\u0001\u001a\u00030\u00b7\u0001H\u0002J\n\u0010\u00b8\u0001\u001a\u00030\u00ad\u0001H\u0002J\u0014\u0010\u00b9\u0001\u001a\u00030\u00ad\u00012\b\u0010\u00ba\u0001\u001a\u00030\u00bb\u0001H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u0004\u0018\u00010H2\b\u0010 \u001a\u0004\u0018\u00010H@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u001cR\u000e\u0010N\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u001e\u0010R\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010\u001cR\u001e\u0010T\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010\u001cR\u001e\u0010V\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010\u001cR\u001e\u0010X\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\u001cR\u001e\u0010Z\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\u001cR\u001e\u0010\\\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\u001cR\u001e\u0010^\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010\u001cR\u001e\u0010`\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\u001cR\u001e\u0010b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010\u001cR\u001e\u0010d\u001a\u00020e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001e\u0010j\u001a\u00020k8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001a\u0010p\u001a\u00020qX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u000e\u0010v\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010w\u001a\u00020xX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R!\u0010}\u001a\u00020~8\u0006@\u0006X\u0087.\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0083\u0001\u001a\u00020qX\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010s\"\u0005\b\u0085\u0001\u0010uR$\u0010\u0086\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010\u008c\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0092\u0001\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u001cR$\u0010\u0094\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u000f\u0010\u009a\u0001\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b\u00a0\u0001\u0010\u00a1\u0001R \u0010\u00a2\u0001\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u001cR \u0010\u00a4\u0001\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010\u001cR\u000f\u0010\u00a6\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a7\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a8\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a9\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00aa\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ab\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00bc\u0001"}, d2 = {"Linfo/nightscout/androidaps/utils/wizard/BolusWizard;", "", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "accepted", "", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "bg", "", "getBg", "()D", "setBg", "(D)V", "bgDiff", "<set-?>", "calculatedTotalInsulin", "getCalculatedTotalInsulin", "carbTime", "", "carbs", "getCarbs", "()I", "setCarbs", "(I)V", "carbsEquivalent", "getCarbsEquivalent", "cob", "getCob", "setCob", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "getCommandQueue", "()Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "setCommandQueue", "(Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;)V", "config", "Linfo/nightscout/androidaps/Config;", "getConfig", "()Linfo/nightscout/androidaps/Config;", "setConfig", "(Linfo/nightscout/androidaps/Config;)V", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "getConstraintChecker", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "setConstraintChecker", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;)V", "correction", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/GlucoseStatus;", "glucoseStatus", "getGlucoseStatus", "()Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/GlucoseStatus;", "ic", "getIc", "includeBasalIOB", "includeBolusIOB", "getInjector", "()Ldagger/android/HasAndroidInjector;", "insulinAfterConstraints", "getInsulinAfterConstraints", "insulinFromBG", "getInsulinFromBG", "insulinFromBasalIOB", "getInsulinFromBasalIOB", "insulinFromBolusIOB", "getInsulinFromBolusIOB", "insulinFromCOB", "getInsulinFromCOB", "insulinFromCarbs", "getInsulinFromCarbs", "insulinFromCorrection", "getInsulinFromCorrection", "insulinFromSuperBolus", "getInsulinFromSuperBolus", "insulinFromTrend", "getInsulinFromTrend", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "getIobCobCalculatorPlugin", "()Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "setIobCobCalculatorPlugin", "(Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;)V", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "getLoopPlugin", "()Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "setLoopPlugin", "(Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;)V", "notes", "", "getNotes", "()Ljava/lang/String;", "setNotes", "(Ljava/lang/String;)V", "percentageCorrection", "profile", "Linfo/nightscout/androidaps/data/Profile;", "getProfile", "()Linfo/nightscout/androidaps/data/Profile;", "setProfile", "(Linfo/nightscout/androidaps/data/Profile;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "profileName", "getProfileName", "setProfileName", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "sens", "getSens", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "targetBGHigh", "targetBGLow", "tempTarget", "Linfo/nightscout/androidaps/db/TempTarget;", "getTempTarget", "()Linfo/nightscout/androidaps/db/TempTarget;", "setTempTarget", "(Linfo/nightscout/androidaps/db/TempTarget;)V", "totalBeforePercentageAdjustment", "getTotalBeforePercentageAdjustment", "trend", "getTrend", "useAlarm", "useBg", "useCob", "useSuperBolus", "useTT", "useTrend", "bolusAdvisorProcessing", "", "ctx", "Landroid/content/Context;", "commonProcessing", "confirmAndExecute", "confirmMessageAfterConstraints", "Landroid/text/Spanned;", "advisor", "doCalc", "nsJSON", "Lorg/json/JSONObject;", "scheduleEatReminder", "scheduleReminder", "time", "", "app_fullRelease"})
public final class BolusWizard {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @javax.inject.Inject()
    public info.nightscout.androidaps.Config config;
    private double sens = 0.0;
    private double ic = 0.0;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.iob.iobCobCalculator.GlucoseStatus glucoseStatus;
    private double targetBGLow = 0.0;
    private double targetBGHigh = 0.0;
    private double bgDiff = 0.0;
    private double insulinFromBG = 0.0;
    private double insulinFromCarbs = 0.0;
    private double insulinFromBolusIOB = 0.0;
    private double insulinFromBasalIOB = 0.0;
    private double insulinFromCorrection = 0.0;
    private double insulinFromSuperBolus = 0.0;
    private double insulinFromCOB = 0.0;
    private double insulinFromTrend = 0.0;
    private double trend = 0.0;
    private boolean accepted = false;
    private double calculatedTotalInsulin = 0.0;
    private double totalBeforePercentageAdjustment = 0.0;
    private double carbsEquivalent = 0.0;
    private double insulinAfterConstraints = 0.0;
    public info.nightscout.androidaps.data.Profile profile;
    public java.lang.String profileName;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.db.TempTarget tempTarget;
    private int carbs = 0;
    private double cob = 0.0;
    private double bg = 0.0;
    private double correction = 0.0;
    private double percentageCorrection = 0.0;
    private boolean useBg = false;
    private boolean useCob = false;
    private boolean includeBolusIOB = false;
    private boolean includeBasalIOB = false;
    private boolean useSuperBolus = false;
    private boolean useTT = false;
    private boolean useTrend = false;
    private boolean useAlarm = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String notes = "";
    private int carbTime = 0;
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker getConstraintChecker() {
        return null;
    }
    
    public final void setConstraintChecker(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.CommandQueueProvider getCommandQueue() {
        return null;
    }
    
    public final void setCommandQueue(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin getLoopPlugin() {
        return null;
    }
    
    public final void setLoopPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin getIobCobCalculatorPlugin() {
        return null;
    }
    
    public final void setIobCobCalculatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin getAutomationPlugin() {
        return null;
    }
    
    public final void setAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config p0) {
    }
    
    public final double getSens() {
        return 0.0;
    }
    
    public final double getIc() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.GlucoseStatus getGlucoseStatus() {
        return null;
    }
    
    public final double getInsulinFromBG() {
        return 0.0;
    }
    
    public final double getInsulinFromCarbs() {
        return 0.0;
    }
    
    public final double getInsulinFromBolusIOB() {
        return 0.0;
    }
    
    public final double getInsulinFromBasalIOB() {
        return 0.0;
    }
    
    public final double getInsulinFromCorrection() {
        return 0.0;
    }
    
    public final double getInsulinFromSuperBolus() {
        return 0.0;
    }
    
    public final double getInsulinFromCOB() {
        return 0.0;
    }
    
    public final double getInsulinFromTrend() {
        return 0.0;
    }
    
    public final double getTrend() {
        return 0.0;
    }
    
    public final double getCalculatedTotalInsulin() {
        return 0.0;
    }
    
    public final double getTotalBeforePercentageAdjustment() {
        return 0.0;
    }
    
    public final double getCarbsEquivalent() {
        return 0.0;
    }
    
    public final double getInsulinAfterConstraints() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.data.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfileName() {
        return null;
    }
    
    public final void setProfileName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.db.TempTarget getTempTarget() {
        return null;
    }
    
    public final void setTempTarget(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget p0) {
    }
    
    public final int getCarbs() {
        return 0;
    }
    
    public final void setCarbs(int p0) {
    }
    
    public final double getCob() {
        return 0.0;
    }
    
    public final void setCob(double p0) {
    }
    
    public final double getBg() {
        return 0.0;
    }
    
    public final void setBg(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.BolusWizard doCalc(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String profileName, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget, int carbs, double cob, double bg, double correction, double percentageCorrection, boolean useBg, boolean useCob, boolean includeBolusIOB, boolean includeBasalIOB, boolean useSuperBolus, boolean useTT, boolean useTrend, boolean useAlarm, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, int carbTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.BolusWizard doCalc(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String profileName, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget, int carbs, double cob, double bg, double correction, double percentageCorrection, boolean useBg, boolean useCob, boolean includeBolusIOB, boolean includeBasalIOB, boolean useSuperBolus, boolean useTT, boolean useTrend, boolean useAlarm, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.BolusWizard doCalc(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String profileName, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget, int carbs, double cob, double bg, double correction, double percentageCorrection, boolean useBg, boolean useCob, boolean includeBolusIOB, boolean includeBasalIOB, boolean useSuperBolus, boolean useTT, boolean useTrend, boolean useAlarm) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.BolusWizard doCalc(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String profileName, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.TempTarget tempTarget, int carbs, double cob, double bg, double correction, boolean useBg, boolean useCob, boolean includeBolusIOB, boolean includeBasalIOB, boolean useSuperBolus, boolean useTT, boolean useTrend, boolean useAlarm) {
        return null;
    }
    
    @kotlin.Suppress(names = {"SpellCheckingInspection"})
    private final org.json.JSONObject nsJSON() {
        return null;
    }
    
    private final android.text.Spanned confirmMessageAfterConstraints(boolean advisor) {
        return null;
    }
    
    public final void confirmAndExecute(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
    }
    
    private final void bolusAdvisorProcessing(android.content.Context ctx) {
    }
    
    private final void commonProcessing(android.content.Context ctx) {
    }
    
    private final void scheduleEatReminder() {
    }
    
    private final void scheduleReminder(long time) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    @javax.inject.Inject()
    public BolusWizard(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}