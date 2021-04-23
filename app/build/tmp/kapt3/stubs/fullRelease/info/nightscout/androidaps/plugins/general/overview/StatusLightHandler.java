package info.nightscout.androidaps.plugins.general.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ>\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002JB\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0012H\u0002JJ\u0010 \u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002JB\u0010#\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0012H\u0002JL\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010\'\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u00102\b\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010*\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/StatusLightHandler;", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "warnColors", "Linfo/nightscout/androidaps/utils/WarnColors;", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/utils/WarnColors;Linfo/nightscout/androidaps/Config;)V", "handleAge", "", "view", "Landroid/widget/TextView;", "eventName", "", "warnSettings", "", "defaultWarnThreshold", "", "urgentSettings", "defaultUrgentThreshold", "handleLevel", "criticalSetting", "criticalDefaultValue", "warnSetting", "warnDefaultValue", "level", "units", "handleOmnipodBatteryLevel", "useRileyLinkBatteryLevel", "", "handleOmnipodReservoirLevel", "updateStatusLights", "careportal_cannula_age", "careportal_insulin_age", "careportal_reservoir_level", "careportal_sensor_age", "careportal_sensor_battery_level", "careportal_pb_age", "careportal_battery_level", "app_fullRelease"})
@javax.inject.Singleton()
public final class StatusLightHandler {
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.utils.WarnColors warnColors = null;
    private final info.nightscout.androidaps.Config config = null;
    
    /**
     * applies the extended statusLight subview on the overview fragment
     */
    public final void updateStatusLights(@org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_cannula_age, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_insulin_age, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_reservoir_level, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_sensor_age, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_sensor_battery_level, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_pb_age, @org.jetbrains.annotations.Nullable()
    android.widget.TextView careportal_battery_level) {
    }
    
    private final void handleAge(android.widget.TextView view, java.lang.String eventName, @androidx.annotation.StringRes()
    int warnSettings, double defaultWarnThreshold, @androidx.annotation.StringRes()
    int urgentSettings, double defaultUrgentThreshold) {
    }
    
    private final void handleLevel(android.widget.TextView view, int criticalSetting, double criticalDefaultValue, int warnSetting, double warnDefaultValue, double level, java.lang.String units) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void handleOmnipodReservoirLevel(android.widget.TextView view, int criticalSetting, double criticalDefaultValue, int warnSetting, double warnDefaultValue, double level, java.lang.String units) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void handleOmnipodBatteryLevel(android.widget.TextView view, int criticalSetting, double criticalDefaultValue, int warnSetting, double warnDefaultValue, double level, java.lang.String units, boolean useRileyLinkBatteryLevel) {
    }
    
    @javax.inject.Inject()
    public StatusLightHandler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.WarnColors warnColors, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}