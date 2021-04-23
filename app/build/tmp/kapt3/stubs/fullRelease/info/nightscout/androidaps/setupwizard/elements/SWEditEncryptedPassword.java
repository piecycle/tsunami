package info.nightscout.androidaps.setupwizard.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/elements/SWEditEncryptedPassword;", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "injector", "Ldagger/android/HasAndroidInjector;", "cryptoUtil", "Linfo/nightscout/androidaps/utils/CryptoUtil;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/utils/CryptoUtil;)V", "updateDelay", "", "validator", "Linfo/nightscout/androidaps/setupwizard/SWTextValidator;", "generateDialog", "", "layout", "Landroid/widget/LinearLayout;", "preferenceId", "", "save", "value", "", "app_fullRelease"})
public final class SWEditEncryptedPassword extends info.nightscout.androidaps.setupwizard.elements.SWItem {
    private info.nightscout.androidaps.setupwizard.SWTextValidator validator;
    private long updateDelay = 0L;
    private final info.nightscout.androidaps.utils.CryptoUtil cryptoUtil = null;
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWEditEncryptedPassword preferenceId(int preferenceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.elements.SWEditEncryptedPassword validator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWTextValidator validator) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.lang.String value, long updateDelay) {
    }
    
    public SWEditEncryptedPassword(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.CryptoUtil cryptoUtil) {
        super(null, null);
    }
}