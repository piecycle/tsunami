package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/SkinsModule;", "", "()V", "bindsSkinButtonsOn", "Linfo/nightscout/androidaps/skins/SkinInterface;", "skinButtonsOn", "Linfo/nightscout/androidaps/skins/SkinButtonsOn;", "bindsSkinClassic", "skinClassic", "Linfo/nightscout/androidaps/skins/SkinClassic;", "bindsSkinLargeDisplay", "skinLargeDisplay", "Linfo/nightscout/androidaps/skins/SkinLargeDisplay;", "bindsSkinLowRes", "skinLowRes", "Linfo/nightscout/androidaps/skins/SkinLowRes;", "Skin", "app_fullRelease"})
@dagger.Module()
public class SkinsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 0)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.SkinsModule.Skin()
    @dagger.Provides()
    public final info.nightscout.androidaps.skins.SkinInterface bindsSkinClassic(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinClassic skinClassic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 10)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.SkinsModule.Skin()
    @dagger.Provides()
    public final info.nightscout.androidaps.skins.SkinInterface bindsSkinButtonsOn(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinButtonsOn skinButtonsOn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 20)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.SkinsModule.Skin()
    @dagger.Provides()
    public final info.nightscout.androidaps.skins.SkinInterface bindsSkinLargeDisplay(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinLargeDisplay skinLargeDisplay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntKey(value = 30)
    @dagger.multibindings.IntoMap()
    @info.nightscout.androidaps.dependencyInjection.SkinsModule.Skin()
    @dagger.Provides()
    public final info.nightscout.androidaps.skins.SkinInterface bindsSkinLowRes(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinLowRes skinLowRes) {
        return null;
    }
    
    public SkinsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/SkinsModule$Skin;", "", "app_fullRelease"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.inject.Qualifier()
    public static abstract @interface Skin {
    }
}