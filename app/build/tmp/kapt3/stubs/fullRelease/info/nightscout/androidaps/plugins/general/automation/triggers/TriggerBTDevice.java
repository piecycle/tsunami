package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010\"\u001a\u00020\u0001H\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020&H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(00H\u0016J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020&H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00063"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBTDevice;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "triggerBTDevice", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBTDevice;)V", "(Ldagger/android/HasAndroidInjector;)V", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "btDevice", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDropdownMenu;", "getBtDevice", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDropdownMenu;", "setBtDevice", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDropdownMenu;)V", "comparator", "Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect;", "getComparator", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect;", "setComparator", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "devicesPaired", "Ljava/util/ArrayList;", "", "duplicate", "eventExists", "", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "shouldRun", "toJSON", "app_fullRelease"})
public final class TriggerBTDevice extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @javax.inject.Inject()
    public android.content.Context context;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDropdownMenu btDevice;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect comparator;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin getAutomationPlugin() {
        return null;
    }
    
    public final void setAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDropdownMenu getBtDevice() {
        return null;
    }
    
    public final void setBtDevice(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDropdownMenu p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect getComparator() {
        return null;
    }
    
    public final void setComparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect p0) {
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
    
    private final java.util.ArrayList<java.lang.CharSequence> devicesPaired() {
        return null;
    }
    
    private final boolean eventExists() {
        return false;
    }
    
    public TriggerBTDevice(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    private TriggerBTDevice(dagger.android.HasAndroidInjector injector, info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBTDevice triggerBTDevice) {
        super(null);
    }
}