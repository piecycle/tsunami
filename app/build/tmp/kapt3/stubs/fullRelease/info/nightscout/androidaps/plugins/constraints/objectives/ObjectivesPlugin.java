package info.nightscout.androidaps.plugins.constraints.objectives;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020 H\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020$H\u0002J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J\b\u00101\u001a\u00020 H\u0016J\u0006\u00102\u001a\u00020 J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020\u0018H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Linfo/nightscout/androidaps/interfaces/ConstraintsInterface;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "config", "Linfo/nightscout/androidaps/Config;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/Config;)V", "objectives", "", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective;", "getObjectives", "()Ljava/util/List;", "setObjectives", "(Ljava/util/List;)V", "allPriorAccomplished", "", "position", "", "applyMaxIOBConstraints", "Linfo/nightscout/androidaps/interfaces/Constraint;", "", "maxIob", "completeObjectives", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "request", "", "convertSP", "doConvertSP", "number", "name", "isAMAModeEnabled", "value", "isAutomationEnabled", "isAutosensModeEnabled", "isClosedLoopAllowed", "isLgsAllowed", "isLoopInvocationAllowed", "isSMBModeEnabled", "onStart", "reset", "setupObjectives", "specialEnableCondition", "Companion", "app_fullRelease"})
@javax.inject.Singleton()
public final class ObjectivesPlugin extends info.nightscout.androidaps.interfaces.PluginBase implements info.nightscout.androidaps.interfaces.ConstraintsInterface {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective> objectives;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.Config config = null;
    public static final int FIRST_OBJECTIVE = 0;
    public static final int USAGE_OBJECTIVE = 1;
    public static final int EXAM_OBJECTIVE = 2;
    public static final int OPENLOOP_OBJECTIVE = 3;
    public static final int MAXBASAL_OBJECTIVE = 4;
    public static final int MAXIOB_ZERO_CL_OBJECTIVE = 5;
    public static final int MAXIOB_OBJECTIVE = 6;
    public static final int AUTOSENS_OBJECTIVE = 7;
    public static final int AMA_OBJECTIVE = 8;
    public static final int SMB_OBJECTIVE = 9;
    public static final int AUTO_OBJECTIVE = 10;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective> getObjectives() {
        return null;
    }
    
    public final void setObjectives(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective> p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public boolean specialEnableCondition() {
        return false;
    }
    
    private final void convertSP() {
    }
    
    private final void doConvertSP(int number, java.lang.String name) {
    }
    
    private final void setupObjectives() {
    }
    
    public final void reset() {
    }
    
    public final void completeObjectives(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String request) {
    }
    
    public final boolean allPriorAccomplished(int position) {
        return false;
    }
    
    /**
     * Constraints interface
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isLoopInvocationAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isLgsAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isClosedLoopAllowed(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isAutosensModeEnabled(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isAMAModeEnabled(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isSMBModeEnabled(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Double> applyMaxIOBConstraints(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Double> maxIob) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> isAutomationEnabled(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.Constraint<java.lang.Boolean> value) {
        return null;
    }
    
    @javax.inject.Inject()
    public ObjectivesPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0014\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u00a8\u0006\u0014"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin$Companion;", "", "()V", "AMA_OBJECTIVE", "", "AUTOSENS_OBJECTIVE", "AUTO_OBJECTIVE", "EXAM_OBJECTIVE", "getEXAM_OBJECTIVE$annotations", "FIRST_OBJECTIVE", "MAXBASAL_OBJECTIVE", "getMAXBASAL_OBJECTIVE$annotations", "MAXIOB_OBJECTIVE", "getMAXIOB_OBJECTIVE$annotations", "MAXIOB_ZERO_CL_OBJECTIVE", "OPENLOOP_OBJECTIVE", "getOPENLOOP_OBJECTIVE$annotations", "SMB_OBJECTIVE", "USAGE_OBJECTIVE", "getUSAGE_OBJECTIVE$annotations", "app_fullRelease"})
    public static final class Companion {
        
        @kotlin.Suppress(names = {"unused"})
        @java.lang.Deprecated()
        public static void getUSAGE_OBJECTIVE$annotations() {
        }
        
        @kotlin.Suppress(names = {"unused"})
        @java.lang.Deprecated()
        public static void getEXAM_OBJECTIVE$annotations() {
        }
        
        @kotlin.Suppress(names = {"unused"})
        @java.lang.Deprecated()
        public static void getOPENLOOP_OBJECTIVE$annotations() {
        }
        
        @kotlin.Suppress(names = {"unused"})
        @java.lang.Deprecated()
        public static void getMAXBASAL_OBJECTIVE$annotations() {
        }
        
        @kotlin.Suppress(names = {"unused"})
        @java.lang.Deprecated()
        public static void getMAXIOB_OBJECTIVE$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}