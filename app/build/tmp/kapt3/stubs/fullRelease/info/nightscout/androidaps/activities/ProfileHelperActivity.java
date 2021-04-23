package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001kB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020BH\u0002J0\u0010^\u001a\u00020_2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u00112\u0006\u0010]\u001a\u00020BH\u0002J\u0012\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\u0010\u0010e\u001a\u00020b2\u0006\u0010]\u001a\u00020BH\u0002J\b\u0010f\u001a\u00020bH\u0002J\"\u0010g\u001a\u00020b2\u0006\u0010]\u001a\u00020B2\u0006\u0010h\u001a\u00020T2\b\b\u0002\u0010i\u001a\u00020jH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u001e\u00104\u001a\u0002058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u0012\u0012\u0004\u0012\u00020<0;j\b\u0012\u0004\u0012\u00020<`=X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010CR\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010CR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010L\u001a\u00020M8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010UR\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012\u00a8\u0006l"}, d2 = {"Linfo/nightscout/androidaps/activities/ProfileHelperActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "ageUsed", "", "", "[Ljava/lang/Double;", "binding", "Linfo/nightscout/androidaps/databinding/ActivityProfilehelperBinding;", "databaseHelper", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "getDatabaseHelper", "()Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "setDatabaseHelper", "(Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "defaultProfile", "Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;", "getDefaultProfile", "()Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;", "setDefaultProfile", "(Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;)V", "defaultProfileDPV", "Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfileDPV;", "getDefaultProfileDPV", "()Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfileDPV;", "setDefaultProfileDPV", "(Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfileDPV;)V", "localProfilePlugin", "Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;", "getLocalProfilePlugin", "()Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;", "setLocalProfilePlugin", "(Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;)V", "pctUsed", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "profileList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "profileSwitch", "", "Linfo/nightscout/androidaps/db/ProfileSwitch;", "profileSwitchUsed", "", "[Ljava/lang/Integer;", "profileUsed", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "tabSelected", "tddCalculator", "Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "getTddCalculator", "()Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "setTddCalculator", "(Linfo/nightscout/androidaps/utils/stats/TddCalculator;)V", "tddUsed", "typeSelected", "Linfo/nightscout/androidaps/activities/ProfileHelperActivity$ProfileType;", "[Linfo/nightscout/androidaps/activities/ProfileHelperActivity$ProfileType;", "weightUsed", "getProfile", "Linfo/nightscout/androidaps/data/Profile;", "age", "tdd", "weight", "basalPct", "tab", "getProfileName", "", "basalSumPct", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setBackgroundColorOnSelected", "storeValues", "switchTab", "newContent", "storeOld", "", "ProfileType", "app_fullRelease"})
public final class ProfileHelperActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.stats.TddCalculator tddCalculator;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.data.defaultProfile.DefaultProfile defaultProfile;
    @javax.inject.Inject()
    public info.nightscout.androidaps.data.defaultProfile.DefaultProfileDPV defaultProfileDPV;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin localProfilePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper;
    private int tabSelected = 0;
    private final info.nightscout.androidaps.activities.ProfileHelperActivity.ProfileType[] typeSelected = {info.nightscout.androidaps.activities.ProfileHelperActivity.ProfileType.MOTOL_DEFAULT, info.nightscout.androidaps.activities.ProfileHelperActivity.ProfileType.CURRENT};
    private final java.lang.Double[] ageUsed = {15.0, 15.0};
    private final java.lang.Double[] weightUsed = {0.0, 0.0};
    private final java.lang.Double[] tddUsed = {0.0, 0.0};
    private final java.lang.Double[] pctUsed = {32.0, 32.0};
    private java.util.ArrayList<java.lang.CharSequence> profileList;
    private final java.lang.Integer[] profileUsed = {0, 0};
    private java.util.List<? extends info.nightscout.androidaps.db.ProfileSwitch> profileSwitch;
    private final java.lang.Integer[] profileSwitchUsed = {0, 0};
    private info.nightscout.androidaps.databinding.ActivityProfilehelperBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TddCalculator getTddCalculator() {
        return null;
    }
    
    public final void setTddCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.stats.TddCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.data.defaultProfile.DefaultProfile getDefaultProfile() {
        return null;
    }
    
    public final void setDefaultProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.defaultProfile.DefaultProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.data.defaultProfile.DefaultProfileDPV getDefaultProfileDPV() {
        return null;
    }
    
    public final void setDefaultProfileDPV(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.defaultProfile.DefaultProfileDPV p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin getLocalProfilePlugin() {
        return null;
    }
    
    public final void setLocalProfilePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.DatabaseHelperInterface getDatabaseHelper() {
        return null;
    }
    
    public final void setDatabaseHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.DatabaseHelperInterface p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final info.nightscout.androidaps.data.Profile getProfile(double age, double tdd, double weight, double basalPct, int tab) {
        return null;
    }
    
    private final java.lang.String getProfileName(double age, double tdd, double weight, double basalSumPct, int tab) {
        return null;
    }
    
    private final void storeValues() {
    }
    
    private final void switchTab(int tab, info.nightscout.androidaps.activities.ProfileHelperActivity.ProfileType newContent, boolean storeOld) {
    }
    
    private final void setBackgroundColorOnSelected(int tab) {
    }
    
    public ProfileHelperActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/activities/ProfileHelperActivity$ProfileType;", "", "(Ljava/lang/String;I)V", "MOTOL_DEFAULT", "DPV_DEFAULT", "CURRENT", "AVAILABLE_PROFILE", "PROFILE_SWITCH", "app_fullRelease"})
    public static enum ProfileType {
        /*public static final*/ MOTOL_DEFAULT /* = new MOTOL_DEFAULT() */,
        /*public static final*/ DPV_DEFAULT /* = new DPV_DEFAULT() */,
        /*public static final*/ CURRENT /* = new CURRENT() */,
        /*public static final*/ AVAILABLE_PROFILE /* = new AVAILABLE_PROFILE() */,
        /*public static final*/ PROFILE_SWITCH /* = new PROFILE_SWITCH() */;
        
        ProfileType() {
        }
    }
}