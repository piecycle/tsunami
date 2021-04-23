package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\'B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0001J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0005J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0016J\b\u0010&\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006("}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "connectorType", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector$Type;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector$Type;)V", "(Ldagger/android/HasAndroidInjector;)V", "list", "", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "createSpinner", "Landroid/widget/Spinner;", "context", "Landroid/content/Context;", "duplicate", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "pos", "trigger", "setType", "type", "shouldRun", "", "size", "toJSON", "Type", "app_fullRelease"})
public final class TriggerConnector extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<info.nightscout.androidaps.plugins.general.automation.triggers.Trigger> list;
    private info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector.Type connectorType = info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector.Type.AND;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.plugins.general.automation.triggers.Trigger> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.plugins.general.automation.triggers.Trigger> p0) {
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector.Type type) {
    }
    
    public final int size() {
        return 0;
    }
    
    public final int pos(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.Trigger trigger) {
        return 0;
    }
    
    @java.lang.Override()
    public synchronized boolean shouldRun() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public synchronized java.lang.String toJSON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.general.automation.triggers.Trigger fromJSON(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @java.lang.Override()
    public int friendlyName() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String friendlyDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.common.base.Optional<java.lang.Integer> icon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.general.automation.triggers.Trigger duplicate() {
        return null;
    }
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    private final android.widget.Spinner createSpinner(android.content.Context context) {
        return null;
    }
    
    public TriggerConnector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public TriggerConnector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector.Type connectorType) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector$Type;", "", "(Ljava/lang/String;I)V", "stringRes", "", "getStringRes", "()I", "apply", "", "a", "b", "AND", "OR", "XOR", "Companion", "app_fullRelease"})
    public static enum Type {
        /*public static final*/ AND /* = new AND() */,
        /*public static final*/ OR /* = new OR() */,
        /*public static final*/ XOR /* = new XOR() */;
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector.Type.Companion Companion = null;
        
        public final boolean apply(boolean a, boolean b) {
            return false;
        }
        
        @androidx.annotation.StringRes()
        public final int getStringRes() {
            return 0;
        }
        
        Type() {
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector$Type$Companion;", "", "()V", "labels", "", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> labels(@org.jetbrains.annotations.NotNull()
            info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}