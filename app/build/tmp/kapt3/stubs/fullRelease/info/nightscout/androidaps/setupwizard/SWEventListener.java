package info.nightscout.androidaps.setupwizard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/SWEventListener;", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "injector", "Ldagger/android/HasAndroidInjector;", "clazz", "Ljava/lang/Class;", "Linfo/nightscout/androidaps/events/EventStatus;", "(Ldagger/android/HasAndroidInjector;Ljava/lang/Class;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "status", "", "textLabel", "", "textView", "Landroid/widget/TextView;", "visibilityValidator", "Linfo/nightscout/androidaps/setupwizard/SWValidator;", "generateDialog", "", "layout", "Landroid/widget/LinearLayout;", "initialStatus", "label", "processVisibility", "visibility", "app_fullRelease"})
public final class SWEventListener extends info.nightscout.androidaps.setupwizard.elements.SWItem {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private int textLabel = 0;
    private java.lang.String status = "";
    private android.widget.TextView textView;
    private info.nightscout.androidaps.setupwizard.SWValidator visibilityValidator;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.setupwizard.SWEventListener label(int label) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWEventListener initialStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWEventListener visibility(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWValidator visibilityValidator) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout) {
    }
    
    @java.lang.Override()
    public void processVisibility() {
    }
    
    public SWEventListener(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends info.nightscout.androidaps.events.EventStatus> clazz) {
        super(null, null);
    }
}