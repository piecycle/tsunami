package info.nightscout.androidaps.plugins.general.overview.graphData;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ&\u0010:\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ\u001e\u0010;\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00109\u001a\u00020\u001bJ6\u0010<\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001b2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010.J&\u0010@\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ&\u0010A\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ&\u0010B\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ&\u0010C\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001bJ.\u0010D\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001b2\u0006\u0010E\u001a\u000208J\u000e\u0010F\u001a\u0002032\u0006\u0010G\u001a\u000205J&\u0010H\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001bJ\u0014\u0010I\u001a\u0002082\n\u0010J\u001a\u0006\u0012\u0002\b\u00030/H\u0002J(\u0010K\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PJ\u0016\u0010Q\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010R\u001a\u000205J\u0016\u0010S\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010R\u001a\u000205J\u0010\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u000205H\u0002J\u0006\u0010V\u001a\u000203R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/graphData/GraphData;", "", "injector", "Ldagger/android/HasAndroidInjector;", "graph", "Lcom/jjoe64/graphview/GraphView;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "treatmentsPlugin", "Linfo/nightscout/androidaps/interfaces/TreatmentsInterface;", "(Ldagger/android/HasAndroidInjector;Lcom/jjoe64/graphview/GraphView;Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;Linfo/nightscout/androidaps/interfaces/TreatmentsInterface;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "bgReadingsArray", "", "Linfo/nightscout/androidaps/db/BgReading;", "maxY", "", "getMaxY", "()D", "setMaxY", "(D)V", "minY", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "series", "", "Lcom/jjoe64/graphview/series/Series;", "units", "", "addAbsIob", "", "fromTime", "", "toTime", "useForScale", "", "scale", "addActivity", "addBasals", "addBgReadings", "lowLine", "highLine", "predictions", "addCob", "addDeviationSlope", "addDeviations", "addInRangeArea", "addIob", "showPrediction", "addNowLine", "now", "addRatio", "addSeries", "s", "addTargetLine", "toTimeParam", "profile", "Linfo/nightscout/androidaps/data/Profile;", "lastRun", "Linfo/nightscout/androidaps/interfaces/LoopInterface$LastRun;", "addTreatments", "endTime", "formatAxis", "getNearestBg", "date", "performUpdate", "app_fullRelease"})
public final class GraphData {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    private double maxY = 4.9E-324;
    private double minY = 1.7976931348623157E308;
    private java.util.List<? extends info.nightscout.androidaps.db.BgReading> bgReadingsArray;
    private final java.lang.String units = null;
    private final java.util.List<com.jjoe64.graphview.series.Series<?>> series = null;
    private final com.jjoe64.graphview.GraphView graph = null;
    private final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin = null;
    private final info.nightscout.androidaps.interfaces.TreatmentsInterface treatmentsPlugin = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    public final double getMaxY() {
        return 0.0;
    }
    
    public final void setMaxY(double p0) {
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void addBgReadings(long fromTime, long toTime, double lowLine, double highLine, @org.jetbrains.annotations.Nullable()
    java.util.List<info.nightscout.androidaps.db.BgReading> predictions) {
    }
    
    public final void addInRangeArea(long fromTime, long toTime, double lowLine, double highLine) {
    }
    
    public final void addBasals(long fromTime, long toTime, double scale) {
    }
    
    public final void addTargetLine(long fromTime, long toTimeParam, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.interfaces.LoopInterface.LastRun lastRun) {
    }
    
    public final void addTreatments(long fromTime, long endTime) {
    }
    
    private final double getNearestBg(long date) {
        return 0.0;
    }
    
    public final void addActivity(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addIob(long fromTime, long toTime, boolean useForScale, double scale, boolean showPrediction) {
    }
    
    public final void addAbsIob(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addCob(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addDeviations(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addRatio(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addDeviationSlope(long fromTime, long toTime, boolean useForScale, double scale) {
    }
    
    public final void addNowLine(long now) {
    }
    
    public final void formatAxis(long fromTime, long endTime) {
    }
    
    private final boolean addSeries(com.jjoe64.graphview.series.Series<?> s) {
        return false;
    }
    
    public final void performUpdate() {
    }
    
    public GraphData(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.GraphView graph, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.TreatmentsInterface treatmentsPlugin) {
        super();
    }
}