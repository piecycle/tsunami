package info.nightscout.androidaps.plugins.profile.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001CB?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$J\u0006\u00100\u001a\u00020-J\u0016\u00101\u001a\u00020$2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0019J\b\u00105\u001a\u00020-H\u0002J\u0006\u00106\u001a\u00020+J\b\u00107\u001a\u0004\u0018\u00010$J\n\u00108\u001a\u0004\u0018\u00010+H\u0016J\b\u00109\u001a\u00020\u0019H\u0016J\u0012\u0010:\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010\u0019H\u0002J\u0006\u0010<\u001a\u00020\u001bJ\u0006\u0010=\u001a\u00020-J\b\u0010>\u001a\u00020-H\u0014J\u0006\u0010?\u001a\u00020-J\u0012\u0010@\u001a\u00020-2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010BR\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ProfileInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "currentProfileIndex", "", "getCurrentProfileIndex$app_fullRelease", "()I", "setCurrentProfileIndex$app_fullRelease", "(I)V", "defaultArray", "", "isEdited", "", "()Z", "setEdited", "(Z)V", "numOfProfiles", "getNumOfProfiles", "setNumOfProfiles", "profiles", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin$SingleProfile;", "Lkotlin/collections/ArrayList;", "getProfiles", "()Ljava/util/ArrayList;", "setProfiles", "(Ljava/util/ArrayList;)V", "rawProfile", "Linfo/nightscout/androidaps/interfaces/ProfileStore;", "addNewProfile", "", "addProfile", "p", "cloneProfile", "copyFrom", "profile", "Linfo/nightscout/androidaps/data/Profile;", "newName", "createAndStoreConvertedProfile", "createProfileStore", "currentProfile", "getProfile", "getProfileName", "isExistingName", "name", "isValidEditState", "loadSettings", "onStart", "removeCurrentProfile", "storeSettings", "activity", "Landroidx/fragment/app/FragmentActivity;", "SingleProfile", "app_fullRelease"})
@javax.inject.Singleton()
public final class LocalProfilePlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ProfileInterface {
    private info.nightscout.androidaps.interfaces.ProfileStore rawProfile;
    private final java.lang.String defaultArray = "[{\"time\":\"00:00\",\"timeAsSeconds\":0,\"value\":0}]";
    private boolean isEdited = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile> profiles;
    private int numOfProfiles = 0;
    private int currentProfileIndex = 0;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload = null;
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public final boolean isEdited() {
        return false;
    }
    
    public final void setEdited(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile> getProfiles() {
        return null;
    }
    
    public final void setProfiles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile> p0) {
    }
    
    public final int getNumOfProfiles() {
        return 0;
    }
    
    public final void setNumOfProfiles(int p0) {
    }
    
    public final int getCurrentProfileIndex$app_fullRelease() {
        return 0;
    }
    
    public final void setCurrentProfileIndex$app_fullRelease(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile currentProfile() {
        return null;
    }
    
    public final synchronized boolean isValidEditState() {
        return false;
    }
    
    public final synchronized void storeSettings(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final synchronized void loadSettings() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile copyFrom(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.data.Profile profile, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
        return null;
    }
    
    private final boolean isExistingName(java.lang.String name) {
        return false;
    }
    
    private final void createAndStoreConvertedProfile() {
    }
    
    public final void addNewProfile() {
    }
    
    public final void cloneProfile() {
    }
    
    public final void addProfile(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile p) {
    }
    
    public final void removeCurrentProfile() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileStore createProfileStore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.ProfileStore getProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getProfileName() {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalProfilePlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\'\u001a\u00020\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b\u00a8\u0006("}, d2 = {"Linfo/nightscout/androidaps/plugins/profile/local/LocalProfilePlugin$SingleProfile;", "", "()V", "basal", "Lorg/json/JSONArray;", "getBasal$app_fullRelease", "()Lorg/json/JSONArray;", "setBasal$app_fullRelease", "(Lorg/json/JSONArray;)V", "dia", "", "getDia$app_fullRelease", "()D", "setDia$app_fullRelease", "(D)V", "ic", "getIc$app_fullRelease", "setIc$app_fullRelease", "isf", "getIsf$app_fullRelease", "setIsf$app_fullRelease", "mgdl", "", "getMgdl$app_fullRelease", "()Z", "setMgdl$app_fullRelease", "(Z)V", "name", "", "getName$app_fullRelease", "()Ljava/lang/String;", "setName$app_fullRelease", "(Ljava/lang/String;)V", "targetHigh", "getTargetHigh$app_fullRelease", "setTargetHigh$app_fullRelease", "targetLow", "getTargetLow$app_fullRelease", "setTargetLow$app_fullRelease", "deepClone", "app_fullRelease"})
    public static final class SingleProfile {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        private boolean mgdl = false;
        private double dia = info.nightscout.androidaps.Constants.defaultDIA;
        @org.jetbrains.annotations.Nullable()
        private org.json.JSONArray ic;
        @org.jetbrains.annotations.Nullable()
        private org.json.JSONArray isf;
        @org.jetbrains.annotations.Nullable()
        private org.json.JSONArray basal;
        @org.jetbrains.annotations.Nullable()
        private org.json.JSONArray targetLow;
        @org.jetbrains.annotations.Nullable()
        private org.json.JSONArray targetHigh;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName$app_fullRelease() {
            return null;
        }
        
        public final void setName$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean getMgdl$app_fullRelease() {
            return false;
        }
        
        public final void setMgdl$app_fullRelease(boolean p0) {
        }
        
        public final double getDia$app_fullRelease() {
            return 0.0;
        }
        
        public final void setDia$app_fullRelease(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.json.JSONArray getIc$app_fullRelease() {
            return null;
        }
        
        public final void setIc$app_fullRelease(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.json.JSONArray getIsf$app_fullRelease() {
            return null;
        }
        
        public final void setIsf$app_fullRelease(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.json.JSONArray getBasal$app_fullRelease() {
            return null;
        }
        
        public final void setBasal$app_fullRelease(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.json.JSONArray getTargetLow$app_fullRelease() {
            return null;
        }
        
        public final void setTargetLow$app_fullRelease(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.json.JSONArray getTargetHigh$app_fullRelease() {
            return null;
        }
        
        public final void setTargetHigh$app_fullRelease(@org.jetbrains.annotations.Nullable()
        org.json.JSONArray p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin.SingleProfile deepClone() {
            return null;
        }
        
        public SingleProfile() {
            super();
        }
    }
}