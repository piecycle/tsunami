package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "getInjector", "()Ldagger/android/HasAndroidInjector;", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "app_fullRelease"})
public abstract class Element {
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    
    public abstract void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root);
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public Element(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}