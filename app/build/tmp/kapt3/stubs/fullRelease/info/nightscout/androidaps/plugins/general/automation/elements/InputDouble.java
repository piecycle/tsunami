package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "minValue", "maxValue", "step", "decimalFormat", "Ljava/text/DecimalFormat;", "(Ldagger/android/HasAndroidInjector;DDDDLjava/text/DecimalFormat;)V", "inputDouble", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;)V", "(Ldagger/android/HasAndroidInjector;)V", "numberPicker", "Linfo/nightscout/androidaps/utils/ui/NumberPicker;", "getValue", "()D", "setValue", "(D)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "app_fullRelease"})
public final class InputDouble extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    private double value = 0.0;
    private double minValue = 0.0;
    private double maxValue = 0.0;
    private double step = 0.0;
    private java.text.DecimalFormat decimalFormat;
    private info.nightscout.androidaps.utils.ui.NumberPicker numberPicker;
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDouble setValue(double value) {
        return null;
    }
    
    public InputDouble(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputDouble(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, double value, double minValue, double maxValue, double step, @org.jetbrains.annotations.NotNull()
    java.text.DecimalFormat decimalFormat) {
        super(null);
    }
    
    public InputDouble(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDouble inputDouble) {
        super(null);
    }
}