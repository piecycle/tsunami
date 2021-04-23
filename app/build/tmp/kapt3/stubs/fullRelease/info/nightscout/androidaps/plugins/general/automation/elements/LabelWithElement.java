package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017\u00a8\u0006\u001e"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/LabelWithElement;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "textPre", "", "textPost", "element", "(Ldagger/android/HasAndroidInjector;Ljava/lang/String;Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;)V", "(Ldagger/android/HasAndroidInjector;)V", "getElement", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "setElement", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "getTextPost", "()Ljava/lang/String;", "setTextPost", "(Ljava/lang/String;)V", "getTextPre", "setTextPre", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "app_fullRelease"})
public final class LabelWithElement extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.automation.elements.Element element;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String textPre = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String textPost = "";
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.automation.elements.Element getElement() {
        return null;
    }
    
    public final void setElement(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.automation.elements.Element p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextPre() {
        return null;
    }
    
    public final void setTextPre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextPost() {
        return null;
    }
    
    public final void setTextPost(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public LabelWithElement(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public LabelWithElement(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    java.lang.String textPre, @org.jetbrains.annotations.NotNull()
    java.lang.String textPost, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.Element element) {
        super(null);
    }
}