package info.nightscout.androidaps.skins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0012"}, d2 = {"Linfo/nightscout/androidaps/skins/SkinClassic;", "Linfo/nightscout/androidaps/skins/SkinInterface;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/Config;)V", "description", "", "getDescription", "()I", "mainGraphHeight", "getMainGraphHeight", "secondaryGraphHeight", "getSecondaryGraphHeight", "overviewLayout", "isLandscape", "", "isTablet", "isSmallHeight", "app_fullRelease"})
@javax.inject.Singleton()
public final class SkinClassic implements info.nightscout.androidaps.skins.SkinInterface {
    private final info.nightscout.androidaps.Config config = null;
    
    @java.lang.Override()
    public int getDescription() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMainGraphHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSecondaryGraphHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public int overviewLayout(boolean isLandscape, boolean isTablet, boolean isSmallHeight) {
        return 0;
    }
    
    @javax.inject.Inject()
    public SkinClassic(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
    
    @androidx.annotation.LayoutRes()
    public int actionsLayout(boolean isLandscape, boolean isSmallWidth) {
        return 0;
    }
    
    public void preProcessLandscapeOverviewLayout(@org.jetbrains.annotations.NotNull()
    android.util.DisplayMetrics dm, @org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isTablet) {
    }
}