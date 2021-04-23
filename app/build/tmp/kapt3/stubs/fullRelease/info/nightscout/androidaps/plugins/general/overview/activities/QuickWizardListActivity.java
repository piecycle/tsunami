package info.nightscout.androidaps.plugins.general.overview.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006$"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity;", "Linfo/nightscout/androidaps/activities/NoSplashAppCompatActivity;", "()V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "quickWizard", "Linfo/nightscout/androidaps/utils/wizard/QuickWizard;", "getQuickWizard", "()Linfo/nightscout/androidaps/utils/wizard/QuickWizard;", "setQuickWizard", "(Linfo/nightscout/androidaps/utils/wizard/QuickWizard;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "RecyclerViewAdapter", "app_fullRelease"})
public final class QuickWizardListActivity extends info.nightscout.androidaps.activities.NoSplashAppCompatActivity {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.wizard.QuickWizard quickWizard;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private java.util.HashMap _$_findViewCache;
    
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
    public final info.nightscout.androidaps.utils.wizard.QuickWizard getQuickWizard() {
        return null;
    }
    
    public final void setQuickWizard(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.wizard.QuickWizard p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public QuickWizardListActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity$RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity$RecyclerViewAdapter$QuickWizardEntryViewHolder;", "Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity;Landroidx/fragment/app/FragmentManager;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "QuickWizardEntryViewHolder", "app_fullRelease"})
    final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.general.overview.activities.QuickWizardListActivity.RecyclerViewAdapter.QuickWizardEntryViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private androidx.fragment.app.FragmentManager fragmentManager;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.general.overview.activities.QuickWizardListActivity.RecyclerViewAdapter.QuickWizardEntryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.overview.activities.QuickWizardListActivity.RecyclerViewAdapter.QuickWizardEntryViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.FragmentManager getFragmentManager() {
            return null;
        }
        
        public final void setFragmentManager(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager p0) {
        }
        
        public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity$RecyclerViewAdapter$QuickWizardEntryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity$RecyclerViewAdapter;Landroid/view/View;Landroidx/fragment/app/FragmentManager;)V", "buttonText", "Landroid/widget/TextView;", "getButtonText", "()Landroid/widget/TextView;", "carbs", "getCarbs", "editButton", "Landroid/widget/Button;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "from", "getFrom", "removeButton", "to", "getTo", "app_fullRelease"})
        final class QuickWizardEntryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView buttonText = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView carbs = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView from = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView to = null;
            private final android.widget.Button editButton = null;
            private final android.widget.Button removeButton = null;
            @org.jetbrains.annotations.NotNull()
            private androidx.fragment.app.FragmentManager fragmentManager;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getButtonText() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getCarbs() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getFrom() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getTo() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final androidx.fragment.app.FragmentManager getFragmentManager() {
                return null;
            }
            
            public final void setFragmentManager(@org.jetbrains.annotations.NotNull()
            androidx.fragment.app.FragmentManager p0) {
            }
            
            public QuickWizardEntryViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView, @org.jetbrains.annotations.NotNull()
            androidx.fragment.app.FragmentManager fragmentManager) {
                super(null);
            }
        }
    }
}