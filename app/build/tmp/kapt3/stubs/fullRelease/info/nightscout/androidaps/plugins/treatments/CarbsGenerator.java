package info.nightscout.androidaps.plugins.treatments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "context", "Landroid/content/Context;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;Landroid/content/Context;)V", "createCarb", "", "carbs", "", "time", "", "eventType", "", "notes", "generateCarbs", "amount", "startTime", "duration", "app_fullRelease"})
@javax.inject.Singleton()
public final class CarbsGenerator {
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin = null;
    private final info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue = null;
    private final android.content.Context context = null;
    
    public final void generateCarbs(int amount, long startTime, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    public final void createCarb(int carbs, long time, @org.jetbrains.annotations.NotNull()
    java.lang.String eventType, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    @javax.inject.Inject()
    public CarbsGenerator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}