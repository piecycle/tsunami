package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180 H\u0016J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerIob;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "triggerIob", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerIob;)V", "(Ldagger/android/HasAndroidInjector;)V", "comparator", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "getComparator", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "setComparator", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;)V", "insulin", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;", "getInsulin", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;", "setInsulin", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;)V", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;", "duplicate", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "setValue", "value", "", "shouldRun", "", "toJSON", "app_fullRelease"})
public final class TriggerIob extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin insulin;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.Comparator comparator;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin getInsulin() {
        return null;
    }
    
    public final void setInsulin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.Comparator getComparator() {
        return null;
    }
    
    public final void setComparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerIob setValue(double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerIob comparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator.Compare comparator) {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldRun() {
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
    
    public TriggerIob(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public TriggerIob(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerIob triggerIob) {
        super(null);
    }
}