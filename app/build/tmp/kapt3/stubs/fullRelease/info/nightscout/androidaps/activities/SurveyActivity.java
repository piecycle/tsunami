package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u00064"}, d2 = {"Linfo/nightscout/androidaps/activities/SurveyActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "activityMonitor", "Linfo/nightscout/androidaps/utils/ActivityMonitor;", "getActivityMonitor", "()Linfo/nightscout/androidaps/utils/ActivityMonitor;", "setActivityMonitor", "(Linfo/nightscout/androidaps/utils/ActivityMonitor;)V", "binding", "Linfo/nightscout/androidaps/databinding/ActivitySurveyBinding;", "defaultProfile", "Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;", "getDefaultProfile", "()Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;", "setDefaultProfile", "(Linfo/nightscout/androidaps/data/defaultProfile/DefaultProfile;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "tddCalculator", "Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "getTddCalculator", "()Linfo/nightscout/androidaps/utils/stats/TddCalculator;", "setTddCalculator", "(Linfo/nightscout/androidaps/utils/stats/TddCalculator;)V", "tirCalculator", "Linfo/nightscout/androidaps/utils/stats/TirCalculator;", "getTirCalculator", "()Linfo/nightscout/androidaps/utils/stats/TirCalculator;", "setTirCalculator", "(Linfo/nightscout/androidaps/utils/stats/TirCalculator;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "FirebaseRecord", "app_fullRelease"})
public final class SurveyActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.stats.TddCalculator tddCalculator;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.stats.TirCalculator tirCalculator;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.ActivityMonitor activityMonitor;
    @javax.inject.Inject()
    public info.nightscout.androidaps.data.defaultProfile.DefaultProfile defaultProfile;
    private info.nightscout.androidaps.databinding.ActivitySurveyBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TddCalculator getTddCalculator() {
        return null;
    }
    
    public final void setTddCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.stats.TddCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TirCalculator getTirCalculator() {
        return null;
    }
    
    public final void setTirCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.stats.TirCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.ActivityMonitor getActivityMonitor() {
        return null;
    }
    
    public final void setActivityMonitor(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.ActivityMonitor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.data.defaultProfile.DefaultProfile getDefaultProfile() {
        return null;
    }
    
    public final void setDefaultProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.defaultProfile.DefaultProfile p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SurveyActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Linfo/nightscout/androidaps/activities/SurveyActivity$FirebaseRecord;", "", "(Linfo/nightscout/androidaps/activities/SurveyActivity;)V", "age", "", "getAge", "()I", "setAge", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "profileJson", "getProfileJson", "setProfileJson", "weight", "getWeight", "setWeight", "app_fullRelease"})
    public final class FirebaseRecord {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String id = "";
        private int age = 0;
        private int weight = 0;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String profileJson = "ghfg";
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getAge() {
            return 0;
        }
        
        public final void setAge(int p0) {
        }
        
        public final int getWeight() {
            return 0;
        }
        
        public final void setWeight(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProfileJson() {
            return null;
        }
        
        public final void setProfileJson(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public FirebaseRecord() {
            super();
        }
    }
}