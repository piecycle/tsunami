package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/AppComponent;", "Ldagger/android/AndroidInjector;", "Linfo/nightscout/androidaps/MainApp;", "Builder", "app_fullRelease"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, info.nightscout.androidaps.dependencyInjection.PluginsModule.class, info.nightscout.androidaps.dependencyInjection.SkinsModule.class, info.nightscout.androidaps.dependencyInjection.ActivitiesModule.class, info.nightscout.androidaps.dependencyInjection.FragmentsModule.class, info.nightscout.androidaps.dependencyInjection.AppModule.class, info.nightscout.androidaps.dependencyInjection.ReceiversModule.class, info.nightscout.androidaps.dependencyInjection.ServicesModule.class, info.nightscout.androidaps.dependencyInjection.AutomationModule.class, info.nightscout.androidaps.dependencyInjection.CommandQueueModule.class, info.nightscout.androidaps.dependencyInjection.ObjectivesModule.class, info.nightscout.androidaps.dependencyInjection.WizardModule.class, info.nightscout.androidaps.plugins.pump.common.dagger.RileyLinkModule.class, info.nightscout.androidaps.dependencyInjection.MedtronicModule.class, info.nightscout.androidaps.plugins.pump.omnipod.dagger.OmnipodModule.class, info.nightscout.androidaps.dependencyInjection.APSModule.class, info.nightscout.androidaps.dependencyInjection.PreferencesModule.class, info.nightscout.androidaps.dependencyInjection.OverviewModule.class, info.nightscout.androidaps.dependencyInjection.DataClassesModule.class, info.nightscout.androidaps.dependencyInjection.SMSModule.class, info.nightscout.androidaps.dependencyInjection.UIModule.class, info.nightscout.androidaps.core.di.CoreModule.class, info.nightscout.androidaps.dana.di.DanaModule.class, info.nightscout.androidaps.danar.di.DanaRModule.class, info.nightscout.androidaps.danars.di.DanaRSModule.class, info.nightscout.androidaps.dependencyInjection.OHUploaderModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<info.nightscout.androidaps.MainApp> {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/AppComponent$Builder;", "", "application", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "build", "Linfo/nightscout/androidaps/dependencyInjection/AppComponent;", "app_fullRelease"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract info.nightscout.androidaps.dependencyInjection.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.MainApp mainApp);
        
        @org.jetbrains.annotations.NotNull()
        public abstract info.nightscout.androidaps.dependencyInjection.AppComponent build();
    }
}