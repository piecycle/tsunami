package info.nightscout.androidaps.setupwizard.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/elements/SWButton;", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "button", "Landroid/widget/Button;", "buttonRunnable", "Ljava/lang/Runnable;", "buttonText", "", "buttonValidator", "Linfo/nightscout/androidaps/setupwizard/SWValidator;", "action", "generateDialog", "", "layout", "Landroid/widget/LinearLayout;", "processVisibility", "text", "visibility", "app_fullRelease"})
public final class SWButton extends info.nightscout.androidaps.setupwizard.elements.SWItem {
    private java.lang.Runnable buttonRunnable;
    private int buttonText = 0;
    private info.nightscout.androidaps.setupwizard.SWValidator buttonValidator;
    private android.widget.Button button;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWButton text(int buttonText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWButton action(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable buttonRunnable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWButton visibility(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWValidator buttonValidator) {
        return null;
    }
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout) {
    }
    
    @java.lang.Override()
    public void processVisibility() {
    }
    
    public SWButton(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null, null);
    }
}