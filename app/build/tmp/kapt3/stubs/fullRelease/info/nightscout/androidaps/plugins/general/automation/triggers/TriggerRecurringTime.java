package info.nightscout.androidaps.plugins.general.automation.triggers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0001H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0019J\b\u0010\'\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0019H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerRecurringTime;", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "injector", "Ldagger/android/HasAndroidInjector;", "triggerRecurringTime", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerRecurringTime;)V", "(Ldagger/android/HasAndroidInjector;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "days", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay;", "getDays", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay;", "time", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputTime;", "getTime", "()Linfo/nightscout/androidaps/plugins/general/automation/elements/InputTime;", "duplicate", "friendlyDescription", "", "friendlyName", "", "fromJSON", "data", "generateDialog", "", "root", "Landroid/widget/LinearLayout;", "getMinSinceMidnight", "", "icon", "Lcom/google/common/base/Optional;", "shouldRun", "", "minutes", "toJSON", "toMills", "minutesSinceMidnight", "app_fullRelease"})
public final class TriggerRecurringTime extends info.nightscout.androidaps.plugins.general.automation.triggers.Trigger {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay days = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.plugins.general.automation.elements.InputTime time = null;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay getDays() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputTime getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.triggers.TriggerRecurringTime time(int minutes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldRun() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toJSON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.general.automation.triggers.Trigger fromJSON(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @java.lang.Override()
    public int friendlyName() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String friendlyDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.common.base.Optional<java.lang.Integer> icon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public info.nightscout.androidaps.plugins.general.automation.triggers.Trigger duplicate() {
        return null;
    }
    
    private final long toMills(int minutesSinceMidnight) {
        return 0L;
    }
    
    private final int getMinSinceMidnight(long time) {
        return 0;
    }
    
    @java.lang.Override()
    public void generateDialog(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public TriggerRecurringTime(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    public TriggerRecurringTime(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerRecurringTime triggerRecurringTime) {
        super(null);
    }
}