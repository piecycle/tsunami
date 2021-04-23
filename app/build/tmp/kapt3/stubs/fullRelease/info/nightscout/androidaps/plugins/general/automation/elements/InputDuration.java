package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0000J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "unit", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration$TimeUnit;", "(Ldagger/android/HasAndroidInjector;ILinfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration$TimeUnit;)V", "(Ldagger/android/HasAndroidInjector;)V", "getUnit", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration$TimeUnit;", "setUnit", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration$TimeUnit;)V", "getValue", "()I", "setValue", "(I)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "duplicate", "getMinutes", "setMinutes", "TimeUnit", "app_fullRelease"})
public final class InputDuration extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDuration.TimeUnit unit = info.nightscout.androidaps.plugins.general.automation.elements.InputDuration.TimeUnit.MINUTES;
    private int value = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDuration.TimeUnit getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDuration.TimeUnit p0) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final void setValue(int p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDuration duplicate() {
        return null;
    }
    
    public final int getMinutes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDuration setMinutes(int value) {
        return null;
    }
    
    public InputDuration(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputDuration(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, int value, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDuration.TimeUnit unit) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration$TimeUnit;", "", "(Ljava/lang/String;I)V", "MINUTES", "HOURS", "app_fullRelease"})
    public static enum TimeUnit {
        /*public static final*/ MINUTES /* = new MINUTES() */,
        /*public static final*/ HOURS /* = new HOURS() */;
        
        TimeUnit() {
        }
    }
}