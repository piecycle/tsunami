package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/PreferencesModule;", "", "()V", "classicPrefsFormatInjector", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/ClassicPrefsFormat;", "cryptoUtilInjector", "Linfo/nightscout/androidaps/utils/CryptoUtil;", "encryptedPrefsFormatInjector", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/EncryptedPrefsFormat;", "prefImportListProviderInjector", "Linfo/nightscout/androidaps/plugins/general/maintenance/PrefFileListProvider;", "app_fullRelease"})
@dagger.Module()
public abstract class PreferencesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.utils.CryptoUtil cryptoUtilInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.maintenance.formats.EncryptedPrefsFormat encryptedPrefsFormatInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.maintenance.formats.ClassicPrefsFormat classicPrefsFormatInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.maintenance.PrefFileListProvider prefImportListProviderInjector();
    
    public PreferencesModule() {
        super();
    }
}