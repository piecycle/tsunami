package info.nightscout.androidaps.setupwizard.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/elements/SWEditString;", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "updateDelay", "", "validator", "Linfo/nightscout/androidaps/setupwizard/SWTextValidator;", "generateDialog", "", "layout", "Landroid/widget/LinearLayout;", "preferenceId", "", "app_fullRelease"})
public final class SWEditString extends info.nightscout.androidaps.setupwizard.elements.SWItem {
    private info.nightscout.androidaps.setupwizard.SWTextValidator validator;
    private long updateDelay = 0L;
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWEditString preferenceId(int preferenceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWEditString validator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWTextValidator validator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWEditString updateDelay(long updateDelay) {
        return null;
    }
    
    public SWEditString(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null, null);
    }
}