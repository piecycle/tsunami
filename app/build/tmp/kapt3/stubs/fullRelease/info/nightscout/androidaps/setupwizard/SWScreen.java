package info.nightscout.androidaps.setupwizard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010\'\u001a\u00020(J\u0006\u0010)\u001a\u00020*J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u00a8\u0006+"}, d2 = {"Linfo/nightscout/androidaps/setupwizard/SWScreen;", "", "injector", "Ldagger/android/HasAndroidInjector;", "header", "", "(Ldagger/android/HasAndroidInjector;I)V", "getInjector", "()Ldagger/android/HasAndroidInjector;", "items", "", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "skippable", "", "getSkippable", "()Z", "setSkippable", "(Z)V", "validator", "Linfo/nightscout/androidaps/setupwizard/SWValidator;", "getValidator", "()Linfo/nightscout/androidaps/setupwizard/SWValidator;", "setValidator", "(Linfo/nightscout/androidaps/setupwizard/SWValidator;)V", "visibility", "getVisibility", "setVisibility", "add", "newItem", "getHeader", "", "processVisibility", "", "app_fullRelease"})
public final class SWScreen {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<info.nightscout.androidaps.setupwizard.elements.SWItem> items;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.setupwizard.SWValidator validator;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.setupwizard.SWValidator visibility;
    private boolean skippable = false;
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    private int header;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<info.nightscout.androidaps.setupwizard.elements.SWItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<info.nightscout.androidaps.setupwizard.elements.SWItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.setupwizard.SWValidator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.setupwizard.SWValidator p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.setupwizard.SWValidator getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.setupwizard.SWValidator p0) {
    }
    
    public final boolean getSkippable() {
        return false;
    }
    
    public final void setSkippable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWScreen skippable(boolean skippable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWScreen add(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.elements.SWItem newItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWScreen validator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWValidator validator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.setupwizard.SWScreen visibility(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.setupwizard.SWValidator visibility) {
        return null;
    }
    
    public final void processVisibility() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public SWScreen(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, int header) {
        super();
    }
}