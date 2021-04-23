package info.nightscout.androidaps.utils.tabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/utils/tabs/TabPageAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "visibleFragmentList", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "getPluginAt", "registerNewFragment", "", "plugin", "app_fullRelease"})
public final class TabPageAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.ArrayList<info.nightscout.androidaps.interfaces.PluginBase> visibleFragmentList = null;
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.PluginBase getPluginAt(int position) {
        return null;
    }
    
    public final void registerNewFragment(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.PluginBase plugin) {
    }
    
    public TabPageAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super(null);
    }
}