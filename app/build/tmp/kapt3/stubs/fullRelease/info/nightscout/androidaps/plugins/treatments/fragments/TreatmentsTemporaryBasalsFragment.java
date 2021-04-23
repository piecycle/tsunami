package info.nightscout.androidaps.plugins.treatments.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000202H\u0016J\u001a\u00104\u001a\u0002022\u0006\u00105\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u000202H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00068"}, d2 = {"Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onResume", "onViewCreated", "view", "updateGui", "RecyclerViewAdapter", "app_fullRelease"})
public final class TreatmentsTemporaryBasalsFragment extends dagger.android.support.DaggerFragment {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.FabricPrivacy getFabricPrivacy() {
        return null;
    }
    
    public final void setFabricPrivacy(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.FabricPrivacy p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    private final void updateGui() {
    }
    
    public TreatmentsTemporaryBasalsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0015\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment$RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment$RecyclerViewAdapter$TempBasalsViewHolder;", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment;", "tempBasalList", "Linfo/nightscout/androidaps/data/Intervals;", "Linfo/nightscout/androidaps/db/TemporaryBasal;", "(Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment;Linfo/nightscout/androidaps/data/Intervals;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "TempBasalsViewHolder", "app_fullRelease"})
    public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTemporaryBasalsFragment.RecyclerViewAdapter.TempBasalsViewHolder> {
        private info.nightscout.androidaps.data.Intervals<info.nightscout.androidaps.db.TemporaryBasal> tempBasalList;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTemporaryBasalsFragment.RecyclerViewAdapter.TempBasalsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTemporaryBasalsFragment.RecyclerViewAdapter.TempBasalsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.data.Intervals<info.nightscout.androidaps.db.TemporaryBasal> tempBasalList) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\b\"\u0004\b(\u0010\nR\u001a\u0010)\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001a\u0010,\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001a\u0010/\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\n\u00a8\u00062"}, d2 = {"Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment$RecyclerViewAdapter$TempBasalsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment$RecyclerViewAdapter;Landroid/view/View;)V", "absolute", "Landroid/widget/TextView;", "getAbsolute", "()Landroid/widget/TextView;", "setAbsolute", "(Landroid/widget/TextView;)V", "cv", "Landroidx/cardview/widget/CardView;", "getCv", "()Landroidx/cardview/widget/CardView;", "setCv", "(Landroidx/cardview/widget/CardView;)V", "date", "getDate", "setDate", "duration", "getDuration", "setDuration", "extendedFlag", "getExtendedFlag", "setExtendedFlag", "iob", "getIob", "setIob", "netInsulin", "getNetInsulin", "setNetInsulin", "netRatio", "getNetRatio", "setNetRatio", "ns", "getNs", "setNs", "percent", "getPercent", "setPercent", "ph", "getPh", "setPh", "realDuration", "getRealDuration", "setRealDuration", "remove", "getRemove", "setRemove", "app_fullRelease"})
        public final class TempBasalsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private androidx.cardview.widget.CardView cv;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView date;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView duration;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView absolute;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView percent;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView realDuration;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView netRatio;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView netInsulin;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView iob;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView extendedFlag;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView remove;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView ph;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView ns;
            
            @org.jetbrains.annotations.NotNull()
            public final androidx.cardview.widget.CardView getCv() {
                return null;
            }
            
            public final void setCv(@org.jetbrains.annotations.NotNull()
            androidx.cardview.widget.CardView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getDate() {
                return null;
            }
            
            public final void setDate(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getDuration() {
                return null;
            }
            
            public final void setDuration(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getAbsolute() {
                return null;
            }
            
            public final void setAbsolute(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getPercent() {
                return null;
            }
            
            public final void setPercent(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getRealDuration() {
                return null;
            }
            
            public final void setRealDuration(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getNetRatio() {
                return null;
            }
            
            public final void setNetRatio(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getNetInsulin() {
                return null;
            }
            
            public final void setNetInsulin(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getIob() {
                return null;
            }
            
            public final void setIob(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getExtendedFlag() {
                return null;
            }
            
            public final void setExtendedFlag(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getRemove() {
                return null;
            }
            
            public final void setRemove(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getPh() {
                return null;
            }
            
            public final void setPh(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getNs() {
                return null;
            }
            
            public final void setNs(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            public TempBasalsViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
        }
    }
}