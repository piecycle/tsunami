package info.nightscout.androidaps.historyBrowser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\b\u0010e\u001a\u00020bH\u0016J\b\u0010f\u001a\u00020bH\u0016J\u0010\u0010g\u001a\u00020b2\u0006\u0010h\u001a\u00020dH\u0014J\u0010\u0010i\u001a\u00020b2\u0006\u0010j\u001a\u00020\u0010H\u0002J\u0010\u0010k\u001a\u00020b2\u0006\u0010l\u001a\u00020mH\u0002J\u0016\u0010n\u001a\u00020b2\u0006\u0010l\u001a\u00020m2\u0006\u0010o\u001a\u00020pR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0OX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010S\u001a\u00020T8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u000e\u0010Y\u001a\u00020ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010[\u001a\u00020\\8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\u00a8\u0006q"}, d2 = {"Linfo/nightscout/androidaps/historyBrowser/HistoryBrowseActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "axisWidth", "", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "getBuildHelper", "()Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "setBuildHelper", "(Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "getDefaultValueHelper", "()Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "setDefaultValueHelper", "(Linfo/nightscout/androidaps/utils/DefaultValueHelper;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "eventCustomCalculationFinished", "Linfo/nightscout/androidaps/events/EventCustomCalculationFinished;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "graphLock", "Ljava/lang/Object;", "injector", "Ldagger/android/HasAndroidInjector;", "getInjector", "()Ldagger/android/HasAndroidInjector;", "setInjector", "(Ldagger/android/HasAndroidInjector;)V", "iobCobCalculatorPluginHistory", "Linfo/nightscout/androidaps/historyBrowser/IobCobCalculatorPluginHistory;", "getIobCobCalculatorPluginHistory", "()Linfo/nightscout/androidaps/historyBrowser/IobCobCalculatorPluginHistory;", "setIobCobCalculatorPluginHistory", "(Linfo/nightscout/androidaps/historyBrowser/IobCobCalculatorPluginHistory;)V", "overviewMenus", "Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;", "getOverviewMenus", "()Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;", "setOverviewMenus", "(Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "rangeToDisplay", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "secondaryGraphs", "Ljava/util/ArrayList;", "Lcom/jjoe64/graphview/GraphView;", "secondaryGraphsLabel", "Landroid/widget/TextView;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "start", "", "treatmentsPluginHistory", "Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;", "getTreatmentsPluginHistory", "()Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;", "setTreatmentsPluginHistory", "(Linfo/nightscout/androidaps/historyBrowser/TreatmentsPluginHistory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onSaveInstanceState", "outState", "prepareGraphsIfNeeded", "numOfGraphs", "runCalculation", "from", "", "updateGUI", "bgOnly", "", "app_fullRelease"})
public final class HistoryBrowseActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public dagger.android.HasAndroidInjector injector;
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.historyBrowser.IobCobCalculatorPluginHistory iobCobCalculatorPluginHistory;
    @javax.inject.Inject()
    public info.nightscout.androidaps.historyBrowser.TreatmentsPluginHistory treatmentsPluginHistory;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.overview.OverviewMenus overviewMenus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final java.util.ArrayList<com.jjoe64.graphview.GraphView> secondaryGraphs = null;
    private final java.util.ArrayList<android.widget.TextView> secondaryGraphsLabel = null;
    private int axisWidth = 0;
    private int rangeToDisplay = 24;
    private long start = 0L;
    private final java.lang.Object graphLock = null;
    private info.nightscout.androidaps.events.EventCustomCalculationFinished eventCustomCalculationFinished;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public final void setInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
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
    public final info.nightscout.androidaps.utils.DefaultValueHelper getDefaultValueHelper() {
        return null;
    }
    
    public final void setDefaultValueHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.historyBrowser.IobCobCalculatorPluginHistory getIobCobCalculatorPluginHistory() {
        return null;
    }
    
    public final void setIobCobCalculatorPluginHistory(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.historyBrowser.IobCobCalculatorPluginHistory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.historyBrowser.TreatmentsPluginHistory getTreatmentsPluginHistory() {
        return null;
    }
    
    public final void setTreatmentsPluginHistory(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.historyBrowser.TreatmentsPluginHistory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.buildHelper.BuildHelper getBuildHelper() {
        return null;
    }
    
    public final void setBuildHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.overview.OverviewMenus getOverviewMenus() {
        return null;
    }
    
    public final void setOverviewMenus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.OverviewMenus p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void prepareGraphsIfNeeded(int numOfGraphs) {
    }
    
    private final void runCalculation(java.lang.String from) {
    }
    
    public final void updateGUI(@org.jetbrains.annotations.NotNull()
    java.lang.String from, boolean bgOnly) {
    }
    
    public HistoryBrowseActivity() {
        super();
    }
}