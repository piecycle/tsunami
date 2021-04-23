package info.nightscout.androidaps.skins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\'J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/skins/SkinInterface;", "", "description", "", "getDescription", "()I", "mainGraphHeight", "getMainGraphHeight", "secondaryGraphHeight", "getSecondaryGraphHeight", "actionsLayout", "isLandscape", "", "isSmallWidth", "overviewLayout", "isTablet", "isSmallHeight", "preProcessLandscapeOverviewLayout", "", "dm", "Landroid/util/DisplayMetrics;", "view", "Landroid/view/View;", "app_fullRelease"})
public abstract interface SkinInterface {
    
    @androidx.annotation.StringRes()
    public abstract int getDescription();
    
    public abstract int getMainGraphHeight();
    
    public abstract int getSecondaryGraphHeight();
    
    @androidx.annotation.LayoutRes()
    public abstract int overviewLayout(boolean isLandscape, boolean isTablet, boolean isSmallHeight);
    
    @androidx.annotation.LayoutRes()
    public abstract int actionsLayout(boolean isLandscape, boolean isSmallWidth);
    
    public abstract void preProcessLandscapeOverviewLayout(@org.jetbrains.annotations.NotNull()
    android.util.DisplayMetrics dm, @org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isTablet);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.annotation.LayoutRes()
        public static int actionsLayout(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.skins.SkinInterface $this, boolean isLandscape, boolean isSmallWidth) {
            return 0;
        }
        
        public static void preProcessLandscapeOverviewLayout(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.skins.SkinInterface $this, @org.jetbrains.annotations.NotNull()
        android.util.DisplayMetrics dm, @org.jetbrains.annotations.NotNull()
        android.view.View view, boolean isTablet) {
        }
    }
}