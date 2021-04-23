package info.nightscout.androidaps.plugins.general.automation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020.H\u0016J\b\u0010=\u001a\u00020.H\u0016J\b\u0010>\u001a\u00020.H\u0016J\u0010\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020AH\u0016J\u001a\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010D\u001a\u00020.H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006F"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment;", "Ldagger/android/support/DaggerFragment;", "Linfo/nightscout/androidaps/plugins/general/automation/dragHelpers/OnStartDragListener;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/AutomationFragmentBinding;", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/AutomationFragmentBinding;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "eventListAdapter", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment$EventListAdapter;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "injector", "Ldagger/android/HasAndroidInjector;", "getInjector", "()Ldagger/android/HasAndroidInjector;", "setInjector", "(Ldagger/android/HasAndroidInjector;)V", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "fillIconSet", "", "connector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector;", "set", "Ljava/util/HashSet;", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "onStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewCreated", "view", "updateGui", "EventListAdapter", "app_fullRelease"})
public final class AutomationFragment extends dagger.android.support.DaggerFragment implements info.nightscout.androidaps.plugins.general.automation.dragHelpers.OnStartDragListener {
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    @javax.inject.Inject()
    public dagger.android.HasAndroidInjector injector;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private info.nightscout.androidaps.plugins.general.automation.AutomationFragment.EventListAdapter eventListAdapter;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private info.nightscout.androidaps.databinding.AutomationFragmentBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin getAutomationPlugin() {
        return null;
    }
    
    public final void setAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.HasAndroidInjector getInjector() {
        return null;
    }
    
    public final void setInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector p0) {
    }
    
    private final info.nightscout.androidaps.databinding.AutomationFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    @java.lang.Override()
    public synchronized void onPause() {
    }
    
    @java.lang.Override()
    public synchronized void onDestroyView() {
    }
    
    private final synchronized void updateGui() {
    }
    
    @java.lang.Override()
    public void onStartDrag(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    public final void fillIconSet(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector connector, @org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.Integer> set) {
    }
    
    public AutomationFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0017J \u0010\u0012\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016\u00a8\u0006\u001c"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment$EventListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment$EventListAdapter$ViewHolder;", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment;", "Linfo/nightscout/androidaps/plugins/general/automation/dragHelpers/ItemTouchHelperAdapter;", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment;)V", "addImage", "", "res", "", "context", "Landroid/content/Context;", "layout", "Landroid/widget/LinearLayout;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemDismiss", "onItemMove", "", "fromPosition", "toPosition", "ViewHolder", "app_fullRelease"})
    public final class EventListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.general.automation.AutomationFragment.EventListAdapter.ViewHolder> implements info.nightscout.androidaps.plugins.general.automation.dragHelpers.ItemTouchHelperAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.general.automation.AutomationFragment.EventListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        private final void addImage(@androidx.annotation.DrawableRes()
        int res, android.content.Context context, android.widget.LinearLayout layout) {
        }
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.automation.AutomationFragment.EventListAdapter.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean onItemMove(int fromPosition, int toPosition) {
            return false;
        }
        
        @java.lang.Override()
        public void onItemDismiss(int position) {
        }
        
        public EventListAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment$EventListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Linfo/nightscout/androidaps/plugins/general/automation/dragHelpers/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment$EventListAdapter;Landroid/view/View;Landroid/content/Context;)V", "binding", "Linfo/nightscout/androidaps/databinding/AutomationEventItemBinding;", "getBinding", "()Linfo/nightscout/androidaps/databinding/AutomationEventItemBinding;", "getContext", "()Landroid/content/Context;", "onItemClear", "", "onItemSelected", "app_fullRelease"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements info.nightscout.androidaps.plugins.general.automation.dragHelpers.ItemTouchHelperViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final info.nightscout.androidaps.databinding.AutomationEventItemBinding binding = null;
            @org.jetbrains.annotations.NotNull()
            private final android.content.Context context = null;
            
            @org.jetbrains.annotations.NotNull()
            public final info.nightscout.androidaps.databinding.AutomationEventItemBinding getBinding() {
                return null;
            }
            
            @java.lang.Override()
            public void onItemSelected() {
            }
            
            @java.lang.Override()
            public void onItemClear() {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.content.Context getContext() {
                return null;
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View view, @org.jetbrains.annotations.NotNull()
            android.content.Context context) {
                super(null);
            }
        }
    }
}