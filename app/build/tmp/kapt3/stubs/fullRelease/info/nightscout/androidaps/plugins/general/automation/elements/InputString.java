package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "", "(Ldagger/android/HasAndroidInjector;Ljava/lang/String;)V", "(Ldagger/android/HasAndroidInjector;)V", "textWatcher", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "setTextWatcher", "(Landroid/text/TextWatcher;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "app_fullRelease"})
public final class InputString extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @org.jetbrains.annotations.NotNull()
    private android.text.TextWatcher textWatcher;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String value = "";
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.TextWatcher getTextWatcher() {
        return null;
    }
    
    public final void setTextWatcher(@org.jetbrains.annotations.NotNull()
    android.text.TextWatcher p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public InputString(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public InputString(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        super(null);
    }
}