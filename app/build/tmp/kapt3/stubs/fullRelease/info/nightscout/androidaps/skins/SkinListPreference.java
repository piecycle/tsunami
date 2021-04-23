package info.nightscout.androidaps.skins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Linfo/nightscout/androidaps/skins/SkinListPreference;", "Landroidx/preference/ListPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "skinProvider", "Linfo/nightscout/androidaps/skins/SkinProvider;", "getSkinProvider", "()Linfo/nightscout/androidaps/skins/SkinProvider;", "setSkinProvider", "(Linfo/nightscout/androidaps/skins/SkinProvider;)V", "app_fullRelease"})
public final class SkinListPreference extends androidx.preference.ListPreference {
    @javax.inject.Inject()
    public info.nightscout.androidaps.skins.SkinProvider skinProvider;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.skins.SkinProvider getSkinProvider() {
        return null;
    }
    
    public final void setSkinProvider(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.skins.SkinProvider p0) {
    }
    
    public SkinListPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public SkinListPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
}