package info.nightscout.androidaps.plugins.general.smsCommunicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J\u0012\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010%H\u0002J\b\u0010F\u001a\u00020%H\u0002J\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020%J\u0016\u0010M\u001a\u00020D2\u0006\u0010N\u001a\u00020%2\u0006\u0010L\u001a\u00020%J\b\u0010O\u001a\u00020HH\u0014J\b\u0010P\u001a\u00020HH\u0014J\u0010\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020SH\u0016J#\u0010T\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ\u0010\u0010Y\u001a\u00020H2\u0006\u0010W\u001a\u00020>H\u0002J#\u0010Z\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010[\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010\\\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010]\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010^\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010_\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010`\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010a\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010b\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010c\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ\u0012\u0010d\u001a\u00020H2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002J\u000e\u0010g\u001a\u00020H2\u0006\u0010W\u001a\u00020>J#\u0010h\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ#\u0010i\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020%0V2\u0006\u0010W\u001a\u00020>H\u0002\u00a2\u0006\u0002\u0010XJ\u000e\u0010j\u001a\u00020D2\u0006\u0010k\u001a\u00020%J\u000e\u0010l\u001a\u00020D2\u0006\u0010m\u001a\u00020>J\u0010\u0010n\u001a\u00020H2\u0006\u0010m\u001a\u00020>H\u0002J\u0010\u0010o\u001a\u00020%2\u0006\u0010p\u001a\u00020%H\u0002J\u0010\u0010q\u001a\u00020H2\u0006\u0010r\u001a\u00020sH\u0016R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0+\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006t"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "xdripCalibrations", "Linfo/nightscout/androidaps/utils/XdripCalibrations;", "otp", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;", "config", "Linfo/nightscout/androidaps/Config;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/utils/FabricPrivacy;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/utils/XdripCalibrations;Linfo/nightscout/androidaps/plugins/general/smsCommunicator/otp/OneTimePassword;Linfo/nightscout/androidaps/Config;Linfo/nightscout/androidaps/utils/DateUtil;)V", "allowedNumbers", "", "", "getAllowedNumbers", "()Ljava/util/List;", "setAllowedNumbers", "(Ljava/util/List;)V", "commands", "", "getCommands", "()Ljava/util/Map;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastRemoteBolusTime", "", "getLastRemoteBolusTime", "()J", "setLastRemoteBolusTime", "(J)V", "messageToConfirm", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/AuthRequest;", "getMessageToConfirm", "()Linfo/nightscout/androidaps/plugins/general/smsCommunicator/AuthRequest;", "setMessageToConfirm", "(Linfo/nightscout/androidaps/plugins/general/smsCommunicator/AuthRequest;)V", "messages", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;", "getMessages", "()Ljava/util/ArrayList;", "setMessages", "(Ljava/util/ArrayList;)V", "areMoreNumbers", "", "allowednumbers", "generatePasscode", "handleNewData", "", "intent", "Landroid/content/Intent;", "isAllowedNumber", "number", "isCommand", "command", "onStart", "onStop", "preprocessPreferences", "preferenceFragment", "Landroidx/preference/PreferenceFragmentCompat;", "processBASAL", "splitted", "", "receivedSms", "([Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;)V", "processBG", "processBOLUS", "processCAL", "processCARBS", "processEXTENDED", "processHELP", "processLOOP", "processNSCLIENT", "processPROFILE", "processPUMP", "processSMS", "processSettings", "ev", "Linfo/nightscout/androidaps/events/EventPreferenceChange;", "processSms", "processTARGET", "processTREATMENTS", "sendNotificationToAllNumbers", "text", "sendSMS", "sms", "sendSMSToAllNumbers", "stripAccents", "str", "updatePreferenceSummary", "pref", "Landroidx/preference/Preference;", "app_fullRelease"})
@javax.inject.Singleton()
public final class SmsCommunicatorPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> allowedNumbers;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.smsCommunicator.AuthRequest messageToConfirm;
    private long lastRemoteBolusTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<info.nightscout.androidaps.plugins.general.smsCommunicator.Sms> messages;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> commands = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.utils.XdripCalibrations xdripCalibrations = null;
    private info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword otp;
    private final info.nightscout.androidaps.Config config = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllowedNumbers() {
        return null;
    }
    
    public final void setAllowedNumbers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.smsCommunicator.AuthRequest getMessageToConfirm() {
        return null;
    }
    
    public final void setMessageToConfirm(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.smsCommunicator.AuthRequest p0) {
    }
    
    public final long getLastRemoteBolusTime() {
        return 0L;
    }
    
    public final void setLastRemoteBolusTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<info.nightscout.androidaps.plugins.general.smsCommunicator.Sms> getMessages() {
        return null;
    }
    
    public final void setMessages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<info.nightscout.androidaps.plugins.general.smsCommunicator.Sms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getCommands() {
        return null;
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
    public void updatePreferenceSummary(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference pref) {
    }
    
    private final void processSettings(info.nightscout.androidaps.events.EventPreferenceChange ev) {
    }
    
    public final boolean isCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String command, @org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return false;
    }
    
    public final boolean isAllowedNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return false;
    }
    
    public final void handleNewData(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public final void processSms(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processBG(info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processLOOP(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processTREATMENTS(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processNSCLIENT(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processHELP(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processPUMP(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processPROFILE(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processBASAL(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processEXTENDED(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processBOLUS(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processCARBS(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processTARGET(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processSMS(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    private final void processCAL(java.lang.String[] splitted, info.nightscout.androidaps.plugins.general.smsCommunicator.Sms receivedSms) {
    }
    
    public final boolean sendNotificationToAllNumbers(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return false;
    }
    
    private final void sendSMSToAllNumbers(info.nightscout.androidaps.plugins.general.smsCommunicator.Sms sms) {
    }
    
    public final boolean sendSMS(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.Sms sms) {
        return false;
    }
    
    private final java.lang.String generatePasscode() {
        return null;
    }
    
    private final java.lang.String stripAccents(java.lang.String str) {
        return null;
    }
    
    private final boolean areMoreNumbers(java.lang.String allowednumbers) {
        return false;
    }
    
    @javax.inject.Inject()
    public SmsCommunicatorPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.XdripCalibrations xdripCalibrations, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.otp.OneTimePassword otp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super(null, null, null, null);
    }
}