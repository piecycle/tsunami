package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011\u00a8\u0006$"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "units", "", "(Ldagger/android/HasAndroidInjector;DLjava/lang/String;)V", "(Ldagger/android/HasAndroidInjector;)V", "decimalFormat", "Ljava/text/DecimalFormat;", "maxValue", "minValue", "getMinValue", "()D", "setMinValue", "(D)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "step", "getUnits", "()Ljava/lang/String;", "setUnits", "(Ljava/lang/String;)V", "getValue", "setValue", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "Companion", "app_fullRelease"})
public final class InputBg extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String units = "mg/dl";
    private double value = 0.0;
    private double minValue = 0.0;
    private double maxValue = 0.0;
    private double step = 0.0;
    private java.text.DecimalFormat decimalFormat;
    public static final double MMOL_MIN = 3.0;
    public static final double MMOL_MAX = 20.0;
    public static final double MGDL_MIN = 54.0;
    public static final double MGDL_MAX = 360.0;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.automation.elements.InputBg.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnits() {
        return null;
    }
    
    public final void setUnits(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    public final double getMinValue() {
        return 0.0;
    }
    
    public final void setMinValue(double p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputBg setValue(double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputBg setUnits(@org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        return null;
    }
    
    public InputBg(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputBg(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, double value, @org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg$Companion;", "", "()V", "MGDL_MAX", "", "MGDL_MIN", "MMOL_MAX", "MMOL_MIN", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}