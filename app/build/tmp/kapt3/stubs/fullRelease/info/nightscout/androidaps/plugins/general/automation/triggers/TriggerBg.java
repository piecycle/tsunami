package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0001H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0%H\u0016J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006+"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBg;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "units", "", "compare", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;", "(Ldagger/android/HasAndroidInjector;DLjava/lang/String;Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;)V", "triggerBg", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBg;)V", "(Ldagger/android/HasAndroidInjector;)V", "bg", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg;", "getBg", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg;", "setBg", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg;)V", "comparator", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "getComparator", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "setComparator", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;)V", "duplicate", "friendlyDescription", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "setUnits", "setValue", "shouldRun", "", "toJSON", "app_fullRelease"})
public final class TriggerBg extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputBg bg;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.Comparator comparator;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputBg getBg() {
        return null;
    }
    
    public final void setBg(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputBg p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.Comparator getComparator() {
        return null;
    }
    
    public final void setComparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg setUnits(@org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg setValue(double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg comparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator.Compare comparator) {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldRun() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toJSON() {
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
    
    public TriggerBg(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public TriggerBg(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, double value, @org.jetbrains.annotations.NotNull()
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator.Compare compare) {
        super(null);
    }
    
    public TriggerBg(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg triggerBg) {
        super(null);
    }
}