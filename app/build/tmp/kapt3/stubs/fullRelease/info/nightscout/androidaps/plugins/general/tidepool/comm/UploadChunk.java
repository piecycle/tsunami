package info.nightscout.androidaps.plugins.general.tidepool.comm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0086\u0002J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00142\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0006\u0010\"\u001a\u00020\u0012J\u0012\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010$\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u00020\u0012H\u0002J\u001e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00142\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/UploadChunk;", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/utils/DateUtil;)V", "MAX_UPLOAD_SIZE", "", "fromTemporaryBasals", "", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BasalElement;", "tbrList", "Linfo/nightscout/androidaps/data/Intervals;", "Linfo/nightscout/androidaps/db/TemporaryBasal;", "start", "end", "get", "", "getBasals", "getBgReadings", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/SensorGlucoseElement;", "getBloodTests", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BloodGlucoseElement;", "getLastEnd", "getNext", "session", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/Session;", "getOldestRecordTimeStamp", "getProfiles", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "getTreatments", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "newInstanceOrNull", "ps", "Linfo/nightscout/androidaps/db/ProfileSwitch;", "setLastEnd", "", "time", "app_fullRelease"})
@javax.inject.Singleton()
public final class UploadChunk {
    private final long MAX_UPLOAD_SIZE = 0L;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNext(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.comm.Session session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get(long start, long end) {
        return null;
    }
    
    public final long getLastEnd() {
        return 0L;
    }
    
    public final void setLastEnd(long time) {
    }
    
    private final long getOldestRecordTimeStamp() {
        return 0L;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement> getTreatments(long start, long end) {
        return null;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.BloodGlucoseElement> getBloodTests(long start, long end) {
        return null;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.SensorGlucoseElement> getBgReadings(long start, long end) {
        return null;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.BasalElement> fromTemporaryBasals(info.nightscout.androidaps.data.Intervals<info.nightscout.androidaps.db.TemporaryBasal> tbrList, long start, long end) {
        return null;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.BasalElement> getBasals(long start, long end) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement newInstanceOrNull(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ProfileSwitch ps) {
        return null;
    }
    
    private final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement> getProfiles(long start, long end) {
        return null;
    }
    
    @javax.inject.Inject()
    public UploadChunk(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super();
    }
}