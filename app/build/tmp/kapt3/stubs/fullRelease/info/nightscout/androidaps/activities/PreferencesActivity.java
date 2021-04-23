package info.nightscout.androidaps.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/activities/PreferencesActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartScreenCallback;", "()V", "binding", "Linfo/nightscout/androidaps/databinding/ActivityPreferencesBinding;", "myPreferenceFragment", "Linfo/nightscout/androidaps/activities/MyPreferenceFragment;", "preferenceId", "", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "filterPreferences", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPreferenceStartScreen", "", "caller", "Landroidx/preference/PreferenceFragmentCompat;", "pref", "Landroidx/preference/PreferenceScreen;", "app_fullRelease"})
public final class PreferencesActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback {
    private int preferenceId = 0;
    private info.nightscout.androidaps.activities.MyPreferenceFragment myPreferenceFragment;
    private info.nightscout.androidaps.databinding.ActivityPreferencesBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartScreen(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceScreen pref) {
        return false;
    }
    
    @java.lang.Override()
    public void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    private final void filterPreferences() {
    }
    
    public PreferencesActivity() {
        super();
    }
}