package info.nightscout.androidaps.skins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\b\u0001\u0010\u0004\u001a\u0018\u0012\t\u0012\u00070\u0006\u00a2\u0006\u0002\b\u0007\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\u00070\u0005\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\bR\'\u0010\u0004\u001a\u0018\u0012\t\u0012\u00070\u0006\u00a2\u0006\u0002\b\u0007\u0012\t\u0012\u00070\b\u00a2\u0006\u0002\b\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/skins/SkinProvider;", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "allSkins", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Linfo/nightscout/androidaps/skins/SkinInterface;", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Ljava/util/Map;)V", "getAllSkins", "()Ljava/util/Map;", "list", "", "getList", "()Ljava/util/List;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "activeSkin", "app_fullRelease"})
@javax.inject.Singleton()
public final class SkinProvider {
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, info.nightscout.androidaps.skins.SkinInterface> allSkins = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.skins.SkinInterface activeSkin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.skins.SkinInterface> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, info.nightscout.androidaps.skins.SkinInterface> getAllSkins() {
        return null;
    }
    
    @javax.inject.Inject()
    public SkinProvider(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    @info.nightscout.androidaps.dependencyInjection.SkinsModule.Skin()
    java.util.Map<java.lang.Integer, info.nightscout.androidaps.skins.SkinInterface> allSkins) {
        super();
    }
}