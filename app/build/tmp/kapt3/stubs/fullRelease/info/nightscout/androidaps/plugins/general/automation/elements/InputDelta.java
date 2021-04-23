package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006$"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "minValue", "maxValue", "step", "decimalFormat", "Ljava/text/DecimalFormat;", "deltaType", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType;", "(Ldagger/android/HasAndroidInjector;DDDDLjava/text/DecimalFormat;Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType;)V", "inputDelta", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta;)V", "(Ldagger/android/HasAndroidInjector;)V", "getDeltaType", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType;", "setDeltaType", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "getValue", "()D", "setValue", "(D)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "DeltaType", "app_fullRelease"})
public final class InputDelta extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    private double value = 0.0;
    private double minValue = 0.0;
    private double maxValue = 0.0;
    private double step = 0.0;
    private java.text.DecimalFormat decimalFormat;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType deltaType = info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType.DELTA;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    public final double getValue() {
        return 0.0;
    }
    
    public final void setValue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType getDeltaType() {
        return null;
    }
    
    public final void setDeltaType(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public InputDelta(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputDelta(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, double value, double minValue, double maxValue, double step, @org.jetbrains.annotations.NotNull()
    java.text.DecimalFormat decimalFormat, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType deltaType) {
        super(null);
    }
    
    public InputDelta(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputDelta inputDelta) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType;", "", "(Ljava/lang/String;I)V", "stringRes", "", "getStringRes", "()I", "DELTA", "SHORT_AVERAGE", "LONG_AVERAGE", "Companion", "app_fullRelease"})
    public static enum DeltaType {
        /*public static final*/ DELTA /* = new DELTA() */,
        /*public static final*/ SHORT_AVERAGE /* = new SHORT_AVERAGE() */,
        /*public static final*/ LONG_AVERAGE /* = new LONG_AVERAGE() */;
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.DeltaType.Companion Companion = null;
        
        @androidx.annotation.StringRes()
        public final int getStringRes() {
            return 0;
        }
        
        DeltaType() {
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta$DeltaType$Companion;", "", "()V", "labels", "", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> labels(@org.jetbrains.annotations.NotNull()
            info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}