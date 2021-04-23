package info.nightscout.androidaps.plugins.pump.insight.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/pump/insight/utils/AlertUtils;", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "getAlertCode", "", "alertType", "Linfo/nightscout/androidaps/plugins/pump/insight/descriptors/AlertType;", "getAlertDescription", "alert", "Linfo/nightscout/androidaps/plugins/pump/insight/descriptors/Alert;", "getAlertIcon", "", "alertCategory", "Linfo/nightscout/androidaps/plugins/pump/insight/descriptors/AlertCategory;", "getAlertTitle", "app_fullRelease"})
@javax.inject.Singleton()
public final class AlertUtils {
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlertCode(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.descriptors.AlertType alertType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlertTitle(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.descriptors.AlertType alertType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlertDescription(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.descriptors.Alert alert) {
        return null;
    }
    
    public final int getAlertIcon(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.pump.insight.descriptors.AlertCategory alertCategory) {
        return 0;
    }
    
    @javax.inject.Inject()
    public AlertUtils(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
        super();
    }
}