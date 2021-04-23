package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputPercent;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "(Ldagger/android/HasAndroidInjector;D)V", "(Ldagger/android/HasAndroidInjector;)V", "getValue", "()D", "setValue", "(D)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "Companion", "app_fullRelease"})
public final class InputPercent extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    private double value = 100.0;
    public static final double MIN = 70.0;
    public static final double MAX = 130.0;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.automation.elements.InputPercent.Companion Companion = null;
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public InputPercent(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputPercent(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, double value) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputPercent$Companion;", "", "()V", "MAX", "", "MIN", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}