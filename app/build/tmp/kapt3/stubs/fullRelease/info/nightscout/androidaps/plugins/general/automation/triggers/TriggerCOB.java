package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0001H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\"H\u0016J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerCOB;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "triggerCOB", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerCOB;)V", "(Ldagger/android/HasAndroidInjector;)V", "cob", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "getCob", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "setCob", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;)V", "comparator", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "getComparator", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "setComparator", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;)V", "maxValue", "", "minValue", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;", "duplicate", "friendlyDescription", "", "friendlyName", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "setValue", "value", "", "shouldRun", "", "toJSON", "app_fullRelease"})
public final class TriggerCOB extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    private final int minValue = 0;
    private final int maxValue = 0;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDouble cob;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.Comparator comparator;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDouble getCob() {
        return null;
    }
    
    public final void setCob(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.Comparator getComparator() {
        return null;
    }
    
    public final void setComparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerCOB setValue(double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerCOB comparator(@org.jetbrains.annotations.NotNull()
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
    
    public TriggerCOB(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    private TriggerCOB(dagger.android.HasAndroidInjector injector, info.nightscout.androidaps.plugins.general.automation.triggers.TriggerCOB triggerCOB) {
        super(null);
    }
}