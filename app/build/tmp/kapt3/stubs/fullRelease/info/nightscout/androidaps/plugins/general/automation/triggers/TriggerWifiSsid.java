package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\b\u0010\u001d\u001a\u00020\u0001H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0(H\u0016J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006-"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerWifiSsid;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "ssid", "", "compare", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;", "(Ldagger/android/HasAndroidInjector;Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator$Compare;)V", "triggerWifiSsid", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerWifiSsid;)V", "(Ldagger/android/HasAndroidInjector;)V", "comparator", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "getComparator", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "setComparator", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;)V", "receiverStatusStore", "Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "getReceiverStatusStore", "()Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "setReceiverStatusStore", "(Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;)V", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "getSsid", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "setSsid", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;)V", "duplicate", "friendlyDescription", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "setValue", "shouldRun", "", "toJSON", "app_fullRelease"})
public final class TriggerWifiSsid extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @javax.inject.Inject()
    public info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputString ssid;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.Comparator comparator;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.receivers.ReceiverStatusStore getReceiverStatusStore() {
        return null;
    }
    
    public final void setReceiverStatusStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.receivers.ReceiverStatusStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputString getSsid() {
        return null;
    }
    
    public final void setSsid(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputString p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.Comparator getComparator() {
        return null;
    }
    
    public final void setComparator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerWifiSsid setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String ssid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerWifiSsid comparator(@org.jetbrains.annotations.NotNull()
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
    
    public TriggerWifiSsid(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public TriggerWifiSsid(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    java.lang.String ssid, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Comparator.Compare compare) {
        super(null);
    }
    
    public TriggerWifiSsid(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerWifiSsid triggerWifiSsid) {
        super(null);
    }
}