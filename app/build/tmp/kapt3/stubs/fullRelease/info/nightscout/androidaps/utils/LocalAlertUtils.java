package info.nightscout.androidaps.utils;

import java.lang.System;

/**
 * Created by adrian on 17/12/17.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001aJ\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\u001aJ\b\u0010&\u001a\u00020\u001cH\u0002J\u0006\u0010\'\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Linfo/nightscout/androidaps/utils/LocalAlertUtils;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "smsCommunicatorPlugin", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;", "config", "Linfo/nightscout/androidaps/Config;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorPlugin;Linfo/nightscout/androidaps/Config;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;Linfo/nightscout/androidaps/utils/DateUtil;)V", "checkPumpUnreachableAlarm", "", "lastConnection", "", "isStatusOutdated", "", "isDisconnected", "checkStaleBGAlert", "isAlarmTimeoutExpired", "unreachableThreshold", "missedReadingsThreshold", "notifyPumpStatusRead", "preSnoozeAlarms", "pumpUnreachableThreshold", "shortenSnoozeInterval", "app_fullRelease"})
@javax.inject.Singleton()
public final class LocalAlertUtils {
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin = null;
    private final info.nightscout.androidaps.Config config = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    private final long missedReadingsThreshold() {
        return 0L;
    }
    
    private final long pumpUnreachableThreshold() {
        return 0L;
    }
    
    public final void checkPumpUnreachableAlarm(long lastConnection, boolean isStatusOutdated, boolean isDisconnected) {
    }
    
    private final boolean isAlarmTimeoutExpired(long lastConnection, long unreachableThreshold) {
        return false;
    }
    
    public final void preSnoozeAlarms() {
    }
    
    public final void shortenSnoozeInterval() {
    }
    
    public final void notifyPumpStatusRead() {
    }
    
    public final void checkStaleBGAlert() {
    }
    
    @javax.inject.Inject()
    public LocalAlertUtils(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin smsCommunicatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super();
    }
}