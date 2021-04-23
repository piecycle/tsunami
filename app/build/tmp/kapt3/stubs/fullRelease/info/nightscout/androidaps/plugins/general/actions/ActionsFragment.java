package info.nightscout.androidaps.plugins.general.actions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010e\u001a\u00020fH\u0002J&\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010l2\b\u0010m\u001a\u0004\u0018\u00010nH\u0016J\b\u0010o\u001a\u00020fH\u0016J\b\u0010p\u001a\u00020fH\u0016J\u001a\u0010q\u001a\u00020f2\u0006\u0010r\u001a\u00020h2\b\u0010m\u001a\u0004\u0018\u00010nH\u0016J\b\u0010s\u001a\u00020fH\u0002J\u0006\u0010t\u001a\u00020fR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010D\u001a\u00020E8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u00020K8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010P\u001a\u00020Q8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020WX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020WX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010Y\u001a\u00020Z8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010_\u001a\u00020`8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d\u00a8\u0006u"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/actions/ActionsFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "getBuildHelper", "()Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "setBuildHelper", "(Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;)V", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "getCommandQueue", "()Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "setCommandQueue", "(Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;)V", "config", "Linfo/nightscout/androidaps/Config;", "getConfig", "()Linfo/nightscout/androidaps/Config;", "setConfig", "(Linfo/nightscout/androidaps/Config;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "dm", "Landroid/util/DisplayMetrics;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "protectionCheck", "Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "getProtectionCheck", "()Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;", "setProtectionCheck", "(Linfo/nightscout/androidaps/utils/protection/ProtectionCheck;)V", "pumpCustomActions", "Ljava/util/HashMap;", "", "Linfo/nightscout/androidaps/plugins/general/actions/defs/CustomAction;", "pumpCustomButtons", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/utils/ui/SingleClickButton;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "skinProvider", "Linfo/nightscout/androidaps/skins/SkinProvider;", "getSkinProvider", "()Linfo/nightscout/androidaps/skins/SkinProvider;", "setSkinProvider", "(Linfo/nightscout/androidaps/skins/SkinProvider;)V", "smallHeight", "", "smallWidth", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "statusLightHandler", "Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;", "getStatusLightHandler", "()Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;", "setStatusLightHandler", "(Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;)V", "checkPumpCustomActions", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "removePumpCustomActions", "updateGui", "app_fullRelease"})
public final class ActionsFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public android.content.Context ctx;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.overview.StatusLightHandler statusLightHandler;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.protection.ProtectionCheck protectionCheck;
    @javax.inject.Inject()
    public info.nightscout.androidaps.skins.SkinProvider skinProvider;
    @javax.inject.Inject()
    public info.nightscout.androidaps.Config config;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private final java.util.HashMap<java.lang.String, info.nightscout.androidaps.plugins.general.actions.defs.CustomAction> pumpCustomActions = null;
    private final java.util.ArrayList<info.nightscout.androidaps.utils.ui.SingleClickButton> pumpCustomButtons = null;
    private boolean smallWidth = false;
    private boolean smallHeight = false;
    private android.util.DisplayMetrics dm;
    private java.util.HashMap _$_findViewCache;
    
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
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.overview.StatusLightHandler getStatusLightHandler() {
        return null;
    }
    
    public final void setStatusLightHandler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.overview.StatusLightHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
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
    public final info.nightscout.androidaps.utils.buildHelper.BuildHelper getBuildHelper() {
        return null;
    }
    
    public final void setBuildHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.protection.ProtectionCheck getProtectionCheck() {
        return null;
    }
    
    public final void setProtectionCheck(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.ProtectionCheck p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.skins.SkinProvider getSkinProvider() {
        return null;
    }
    
    public final void setSkinProvider(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    @java.lang.Override()
    public synchronized void onPause() {
    }
    
    public final synchronized void updateGui() {
    }
    
    private final void checkPumpCustomActions() {
    }
    
    private final void removePumpCustomActions() {
    }
    
    public ActionsFragment() {
        super();
    }
}