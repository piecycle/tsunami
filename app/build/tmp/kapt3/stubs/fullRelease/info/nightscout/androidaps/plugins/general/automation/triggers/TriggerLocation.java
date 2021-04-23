package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0001H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020,H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.06H\u0016J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020,H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerLocation;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "triggerLocation", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerLocation;)V", "(Ldagger/android/HasAndroidInjector;)V", "buttonAction", "Ljava/lang/Runnable;", "distance", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "getDistance", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "setDistance", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;)V", "lastMode", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode$Mode;", "getLastMode", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode$Mode;", "setLastMode", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode$Mode;)V", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "modeSelected", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode;", "getModeSelected", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode;", "setModeSelected", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode;)V", "name", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "getName", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "setName", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;)V", "currentMode", "currentDistance", "", "duplicate", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "shouldRun", "", "toJSON", "app_fullRelease"})
public final class TriggerLocation extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDouble latitude;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDouble longitude;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDouble distance;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode modeSelected;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputString name;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode.Mode lastMode = info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode.Mode.INSIDE;
    private final java.lang.Runnable buttonAction = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDouble getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDouble getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDouble getDistance() {
        return null;
    }
    
    public final void setDistance(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode getModeSelected() {
        return null;
    }
    
    public final void setModeSelected(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputString getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputString p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode.Mode getLastMode() {
        return null;
    }
    
    public final void setLastMode(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode.Mode p0) {
    }
    
    @java.lang.Override()
    public synchronized boolean shouldRun() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode.Mode currentMode(double currentDistance) {
        return null;
    }
    
    public TriggerLocation(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    private TriggerLocation(dagger.android.HasAndroidInjector injector, info.nightscout.androidaps.plugins.general.automation.triggers.TriggerLocation triggerLocation) {
        super(null);
    }
}