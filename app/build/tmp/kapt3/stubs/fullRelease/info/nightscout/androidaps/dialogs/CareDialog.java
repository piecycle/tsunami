package info.nightscout.androidaps.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002092\u0006\u00106\u001a\u000207H\u0016J\u001a\u0010;\u001a\u0002092\u0006\u0010<\u001a\u0002012\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\b\u001a\u00020\tJ\b\u0010>\u001a\u00020?H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006A"}, d2 = {"Linfo/nightscout/androidaps/dialogs/CareDialog;", "Linfo/nightscout/androidaps/dialogs/DialogFragmentWithDate;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/DialogCareBinding;", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/DialogCareBinding;", "event", "", "injector", "Ldagger/android/HasAndroidInjector;", "getInjector", "()Ldagger/android/HasAndroidInjector;", "setInjector", "(Ldagger/android/HasAndroidInjector;)V", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "setMainApp", "(Linfo/nightscout/androidaps/MainApp;)V", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "getNsUpload", "()Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "setNsUpload", "(Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "options", "Linfo/nightscout/androidaps/dialogs/CareDialog$EventType;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "translator", "Linfo/nightscout/androidaps/utils/Translator;", "getTranslator", "()Linfo/nightscout/androidaps/utils/Translator;", "setTranslator", "(Linfo/nightscout/androidaps/utils/Translator;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "onViewCreated", "view", "setOptions", "submit", "", "EventType", "app_fullRelease"})
public final class CareDialog extends info.nightscout.androidaps.dialogs.DialogFragmentWithDate {
    @javax.inject.Inject()
    public dagger.android.HasAndroidInjector injector;
    @javax.inject.Inject()
    public info.nightscout.androidaps.MainApp mainApp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.Translator translator;
    private info.nightscout.androidaps.dialogs.CareDialog.EventType options = info.nightscout.androidaps.dialogs.CareDialog.EventType.BGCHECK;
    @androidx.annotation.StringRes()
    private int event = info.nightscout.androidaps.R.string.none;
    private info.nightscout.androidaps.databinding.DialogCareBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public final void setInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.MainApp getMainApp() {
        return null;
    }
    
    public final void setMainApp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.NSUpload getNsUpload() {
        return null;
    }
    
    public final void setNsUpload(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.Translator getTranslator() {
        return null;
    }
    
    public final void setTranslator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.Translator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.dialogs.CareDialog setOptions(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.dialogs.CareDialog.EventType options, @androidx.annotation.StringRes()
    int event) {
        return null;
    }
    
    private final info.nightscout.androidaps.databinding.DialogCareBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean submit() {
        return false;
    }
    
    public CareDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Linfo/nightscout/androidaps/dialogs/CareDialog$EventType;", "", "(Ljava/lang/String;I)V", "BGCHECK", "SENSOR_INSERT", "BATTERY_CHANGE", "NOTE", "EXERCISE", "QUESTION", "ANNOUNCEMENT", "app_fullRelease"})
    public static enum EventType {
        /*public static final*/ BGCHECK /* = new BGCHECK() */,
        /*public static final*/ SENSOR_INSERT /* = new SENSOR_INSERT() */,
        /*public static final*/ BATTERY_CHANGE /* = new BATTERY_CHANGE() */,
        /*public static final*/ NOTE /* = new NOTE() */,
        /*public static final*/ EXERCISE /* = new EXERCISE() */,
        /*public static final*/ QUESTION /* = new QUESTION() */,
        /*public static final*/ ANNOUNCEMENT /* = new ANNOUNCEMENT() */;
        
        EventType() {
        }
    }
}