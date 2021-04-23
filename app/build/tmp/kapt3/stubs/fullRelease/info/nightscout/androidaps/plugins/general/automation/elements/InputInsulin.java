package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "another", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;)V", "(Ldagger/android/HasAndroidInjector;)V", "value", "", "getValue", "()D", "setValue", "(D)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "app_fullRelease"})
public final class InputInsulin extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    private double value = 0.0;
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public InputInsulin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputInsulin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin another) {
        super(null);
    }
}