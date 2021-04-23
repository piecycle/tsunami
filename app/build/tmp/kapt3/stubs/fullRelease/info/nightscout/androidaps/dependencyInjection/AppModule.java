package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u00ad\u0001\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u001e\b\u0001\u0010\u000b\u001a\u0018\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\f2$\b\u0001\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\f0\u000f2$\b\u0001\u0010\u0010\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\f0\u000f2$\b\u0001\u0010\u0011\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\f0\u000fH\u0007\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/AppModule;", "", "()V", "provideStorage", "Linfo/nightscout/androidaps/utils/storage/Storage;", "providesPlugins", "", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "Lkotlin/jvm/JvmSuppressWildcards;", "configInterface", "Linfo/nightscout/androidaps/interfaces/ConfigInterface;", "allConfigs", "", "", "pumpDrivers", "Ldagger/Lazy;", "notNsClient", "aps", "AppBindings", "app_fullRelease"})
@dagger.Module(includes = {info.nightscout.androidaps.dependencyInjection.AppModule.AppBindings.class})
public class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.util.List<info.nightscout.androidaps.interfaces.PluginBase> providesPlugins(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ConfigInterface configInterface, @org.jetbrains.annotations.NotNull()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.AllConfigs()
    java.util.Map<java.lang.Integer, info.nightscout.androidaps.interfaces.PluginBase> allConfigs, @org.jetbrains.annotations.NotNull()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.PumpDriver()
    dagger.Lazy<java.util.Map<java.lang.Integer, info.nightscout.androidaps.interfaces.PluginBase>> pumpDrivers, @org.jetbrains.annotations.NotNull()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.NotNSClient()
    dagger.Lazy<java.util.Map<java.lang.Integer, info.nightscout.androidaps.interfaces.PluginBase>> notNsClient, @org.jetbrains.annotations.NotNull()
    @info.nightscout.androidaps.dependencyInjection.PluginsModule.APS()
    dagger.Lazy<java.util.Map<java.lang.Integer, info.nightscout.androidaps.interfaces.PluginBase>> aps) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final info.nightscout.androidaps.utils.storage.Storage provideStorage() {
        return null;
    }
    
    public AppModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\'J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\'J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\'\u00a8\u0006,"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/AppModule$AppBindings;", "", "bindActivePluginProvider", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "pluginStore", "Linfo/nightscout/androidaps/plugins/configBuilder/PluginStore;", "bindCommandQueueProvider", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "commandQueue", "Linfo/nightscout/androidaps/queue/CommandQueue;", "bindConfigBuilderInterface", "Linfo/nightscout/androidaps/interfaces/ConfigBuilderInterface;", "configBuilderPlugin", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderPlugin;", "bindConfigInterface", "Linfo/nightscout/androidaps/interfaces/ConfigInterface;", "config", "Linfo/nightscout/androidaps/Config;", "bindContext", "Landroid/content/Context;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "bindDatabaseHelperInterface", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "databaseHelperProvider", "Linfo/nightscout/androidaps/db/DatabaseHelperProvider;", "bindImportExportPrefsInterface", "Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;", "importExportPrefs", "Linfo/nightscout/androidaps/plugins/general/maintenance/ImportExportPrefs;", "bindInjector", "Ldagger/android/HasAndroidInjector;", "bindNotificationHolderInterface", "Linfo/nightscout/androidaps/interfaces/NotificationHolderInterface;", "notificationHolder", "Linfo/nightscout/androidaps/utils/androidNotification/NotificationHolder;", "bindTreatmentInterface", "Linfo/nightscout/androidaps/interfaces/TreatmentsInterface;", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "bindUploadQueueInterface", "Linfo/nightscout/androidaps/interfaces/UploadQueueInterface;", "uploadQueue", "Linfo/nightscout/androidaps/plugins/general/nsclient/UploadQueue;", "app_fullRelease"})
    @dagger.Module()
    public static abstract interface AppBindings {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.MainApp mainApp);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract dagger.android.HasAndroidInjector bindInjector(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.MainApp mainApp);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.ActivePluginProvider bindActivePluginProvider(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.configBuilder.PluginStore pluginStore);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.CommandQueueProvider bindCommandQueueProvider(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.queue.CommandQueue commandQueue);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.ConfigInterface bindConfigInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.Config config);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.ConfigBuilderInterface bindConfigBuilderInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin configBuilderPlugin);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.TreatmentsInterface bindTreatmentInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.DatabaseHelperInterface bindDatabaseHelperInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.db.DatabaseHelperProvider databaseHelperProvider);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.UploadQueueInterface bindUploadQueueInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.nsclient.UploadQueue uploadQueue);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.NotificationHolderInterface bindNotificationHolderInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.utils.androidNotification.NotificationHolder notificationHolder);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract info.nightscout.androidaps.interfaces.ImportExportPrefsInterface bindImportExportPrefsInterface(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.maintenance.ImportExportPrefs importExportPrefs);
    }
}