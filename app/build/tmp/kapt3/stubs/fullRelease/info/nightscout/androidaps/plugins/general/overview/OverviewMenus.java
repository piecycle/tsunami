package info.nightscout.androidaps.plugins.general.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u001eH\u0002R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "loopPlugin", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;Linfo/nightscout/androidaps/plugins/aps/loop/LoopPlugin;Linfo/nightscout/androidaps/Config;)V", "_setting", "", "", "", "setting", "", "getSetting", "()Ljava/util/List;", "enabledTypes", "", "graph", "", "loadGraphConfig", "", "setupChartMenu", "chartButton", "Landroid/widget/ImageButton;", "storeGraphConfig", "CharType", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class OverviewMenus {
    private java.util.List<java.lang.Boolean[]> _setting;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper = null;
    private final info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin = null;
    private final info.nightscout.androidaps.Config config = null;
    public static final int MAX_GRAPHS = 5;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.overview.OverviewMenus.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String enabledTypes(int graph) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Boolean[]> getSetting() {
        return null;
    }
    
    private final void storeGraphConfig() {
    }
    
    private final void loadGraphConfig() {
    }
    
    public final void setupChartMenu(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton chartButton) {
    }
    
    @javax.inject.Inject()
    public OverviewMenus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.aps.loop.LoopPlugin loopPlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus$CharType;", "", "nameId", "", "colorId", "primary", "", "secondary", "shortnameId", "(Ljava/lang/String;IIIZZI)V", "getColorId", "()I", "getNameId", "getPrimary", "()Z", "getSecondary", "getShortnameId", "PRE", "BAS", "ABS", "IOB", "COB", "DEV", "SEN", "ACT", "DEVSLOPE", "app_fullRelease"})
    public static enum CharType {
        /*public static final*/ PRE /* = new PRE(0, 0, false, false, 0) */,
        /*public static final*/ BAS /* = new BAS(0, 0, false, false, 0) */,
        /*public static final*/ ABS /* = new ABS(0, 0, false, false, 0) */,
        /*public static final*/ IOB /* = new IOB(0, 0, false, false, 0) */,
        /*public static final*/ COB /* = new COB(0, 0, false, false, 0) */,
        /*public static final*/ DEV /* = new DEV(0, 0, false, false, 0) */,
        /*public static final*/ SEN /* = new SEN(0, 0, false, false, 0) */,
        /*public static final*/ ACT /* = new ACT(0, 0, false, false, 0) */,
        /*public static final*/ DEVSLOPE /* = new DEVSLOPE(0, 0, false, false, 0) */;
        private final int nameId = 0;
        private final int colorId = 0;
        private final boolean primary = false;
        private final boolean secondary = false;
        private final int shortnameId = 0;
        
        public final int getNameId() {
            return 0;
        }
        
        public final int getColorId() {
            return 0;
        }
        
        public final boolean getPrimary() {
            return false;
        }
        
        public final boolean getSecondary() {
            return false;
        }
        
        public final int getShortnameId() {
            return 0;
        }
        
        CharType(@androidx.annotation.StringRes()
        int nameId, @androidx.annotation.ColorRes()
        int colorId, boolean primary, boolean secondary, @androidx.annotation.StringRes()
        int shortnameId) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/OverviewMenus$Companion;", "", "()V", "MAX_GRAPHS", "", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}