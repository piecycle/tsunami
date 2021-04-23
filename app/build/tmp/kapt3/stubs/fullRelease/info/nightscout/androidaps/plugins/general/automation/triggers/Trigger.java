package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 X2\u00020\u0001:\u0001XB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BJ\u0016\u0010C\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0000J\u0016\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0000J\b\u0010E\u001a\u00020\u0000H&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020IH&J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020GH&J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0QH&J\u0010\u0010R\u001a\u0004\u0018\u00010\u00002\u0006\u0010S\u001a\u00020TJ\b\u0010U\u001a\u00020VH&J\b\u0010W\u001a\u00020GH&R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u00a8\u0006Y"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "getInjector", "()Ldagger/android/HasAndroidInjector;", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "getIobCobCalculatorPlugin", "()Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "setIobCobCalculatorPlugin", "(Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;)V", "locationDataContainer", "Linfo/nightscout/androidaps/services/LastLocationDataContainer;", "getLocationDataContainer", "()Linfo/nightscout/androidaps/services/LastLocationDataContainer;", "setLocationDataContainer", "(Linfo/nightscout/androidaps/services/LastLocationDataContainer;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "getTreatmentsPlugin", "()Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "setTreatmentsPlugin", "(Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;)V", "createAddButton", "Landroid/widget/ImageButton;", "context", "Landroid/content/Context;", "trigger", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector;", "createCloneButton", "createDeleteButton", "duplicate", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "icon", "Lcom/google/common/base/Optional;", "instantiate", "obj", "Lorg/json/JSONObject;", "shouldRun", "", "toJSON", "Companion", "app_fullRelease"})
public abstract class Trigger {
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.services.LastLocationDataContainer locationDataContainer;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @org.jetbrains.annotations.NotNull()
    private final dagger.android.HasAndroidInjector injector = null;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.automation.triggers.Trigger.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
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
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.services.LastLocationDataContainer getLocationDataContainer() {
        return null;
    }
    
    public final void setLocationDataContainer(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.services.LastLocationDataContainer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin getTreatmentsPlugin() {
        return null;
    }
    
    public final void setTreatmentsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin getIobCobCalculatorPlugin() {
        return null;
    }
    
    public final void setIobCobCalculatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin p0) {
    }
    
    public abstract boolean shouldRun();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String toJSON();
    
    @org.jetbrains.annotations.NotNull()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.Trigger fromJSON(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    public abstract int friendlyName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String friendlyDescription();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.common.base.Optional<java.lang.Integer> icon();
    
    @org.jetbrains.annotations.NotNull()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.Trigger duplicate();
    
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.Trigger instantiate(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject obj) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton createAddButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector trigger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton createDeleteButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.Trigger trigger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton createCloneButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.Trigger trigger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public Trigger(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final androidx.appcompat.app.AppCompatActivity scanForActivity(@org.jetbrains.annotations.Nullable()
    android.content.Context cont) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger$Companion;", "", "()V", "scanForActivity", "Landroidx/appcompat/app/AppCompatActivity;", "cont", "Landroid/content/Context;", "app_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.appcompat.app.AppCompatActivity scanForActivity(@org.jetbrains.annotations.Nullable()
        android.content.Context cont) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}