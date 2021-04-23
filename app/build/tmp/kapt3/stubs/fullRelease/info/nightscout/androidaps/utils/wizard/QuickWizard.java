package info.nightscout.androidaps.utils.wizard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/utils/wizard/QuickWizard;", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "injector", "Ldagger/android/HasAndroidInjector;", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Ldagger/android/HasAndroidInjector;)V", "storage", "Lorg/json/JSONArray;", "addOrUpdate", "", "newItem", "Linfo/nightscout/androidaps/utils/wizard/QuickWizardEntry;", "get", "position", "", "getActive", "newEmptyItem", "remove", "save", "setData", "newData", "size", "app_fullRelease"})
@javax.inject.Singleton()
public final class QuickWizard {
    private org.json.JSONArray storage;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final dagger.android.HasAndroidInjector injector = null;
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.utils.wizard.QuickWizardEntry getActive() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    org.json.JSONArray newData) {
    }
    
    public final void save() {
    }
    
    public final int size() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.QuickWizardEntry get(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.wizard.QuickWizardEntry newEmptyItem() {
        return null;
    }
    
    public final void addOrUpdate(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.wizard.QuickWizardEntry newItem) {
    }
    
    public final void remove(int position) {
    }
    
    @javax.inject.Inject()
    public QuickWizard(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
}