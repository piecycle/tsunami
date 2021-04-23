package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "value", "Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare;)V", "(Ldagger/android/HasAndroidInjector;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "getValue", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare;", "setValue", "(Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare;)V", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "Compare", "app_fullRelease"})
public final class ComparatorConnect extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @org.jetbrains.annotations.NotNull()
    private info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare value = info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare.ON_CONNECT;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare p0) {
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public ComparatorConnect(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public ComparatorConnect(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare value) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare;", "", "(Ljava/lang/String;I)V", "stringRes", "", "getStringRes", "()I", "ON_CONNECT", "ON_DISCONNECT", "Companion", "app_fullRelease"})
    public static enum Compare {
        /*public static final*/ ON_CONNECT /* = new ON_CONNECT() */,
        /*public static final*/ ON_DISCONNECT /* = new ON_DISCONNECT() */;
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect.Compare.Companion Companion = null;
        
        @androidx.annotation.StringRes()
        public final int getStringRes() {
            return 0;
        }
        
        Compare() {
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect$Compare$Companion;", "", "()V", "labels", "", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> labels(@org.jetbrains.annotations.NotNull()
            info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}