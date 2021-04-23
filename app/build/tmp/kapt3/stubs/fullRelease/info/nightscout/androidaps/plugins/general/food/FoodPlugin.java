package info.nightscout.androidaps.plugins.general.food;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/food/FoodPlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "(Ldagger/android/HasAndroidInjector;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "service", "Linfo/nightscout/androidaps/plugins/general/food/FoodService;", "getService", "()Linfo/nightscout/androidaps/plugins/general/food/FoodService;", "setService", "(Linfo/nightscout/androidaps/plugins/general/food/FoodService;)V", "onStart", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class FoodPlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.food.FoodService service;
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.food.FoodService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.food.FoodService p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @javax.inject.Inject()
    public FoodPlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
        super(null, null, null, null);
    }
}