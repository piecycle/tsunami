package info.nightscout.androidaps.plugins.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010+\u001a&\u0012\f\u0012\n .*\u0004\u0018\u00010-0- .*\u0012\u0012\f\u0012\n .*\u0004\u0018\u00010-0-\u0018\u00010/0,2\u0006\u00100\u001a\u00020\u0004H\u0002J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020:H\u0016J\u001a\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010?\u001a\u00020:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006A"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/BGSourceFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "MILLS_TO_THE_PAST", "", "databaseHelper", "Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "getDatabaseHelper", "()Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;", "setDatabaseHelper", "(Linfo/nightscout/androidaps/interfaces/DatabaseHelperInterface;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "getBgData", "", "Linfo/nightscout/androidaps/db/BgReading;", "kotlin.jvm.PlatformType", "", "now", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onPause", "onResume", "onViewCreated", "view", "updateGUI", "RecyclerViewAdapter", "app_fullRelease"})
public final class BGSourceFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.DatabaseHelperInterface databaseHelper;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final long MILLS_TO_THE_PAST = 0L;
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
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.DatabaseHelperInterface getDatabaseHelper() {
        return null;
    }
    
    public final void setDatabaseHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.DatabaseHelperInterface p0) {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public synchronized void onResume() {
    }
    
    @java.lang.Override()
    public synchronized void onPause() {
    }
    
    private final void updateGUI() {
    }
    
    private final java.util.List<info.nightscout.androidaps.db.BgReading> getBgData(long now) {
        return null;
    }
    
    public BGSourceFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001cB\u0015\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J \u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0015\u001a\u00020\rH\u0016J \u0010\u0016\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/BGSourceFragment$RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/source/BGSourceFragment$RecyclerViewAdapter$BgReadingsViewHolder;", "Linfo/nightscout/androidaps/plugins/source/BGSourceFragment;", "bgReadings", "", "Linfo/nightscout/androidaps/db/BgReading;", "(Linfo/nightscout/androidaps/plugins/source/BGSourceFragment;Ljava/util/List;)V", "callbackHelper", "Linfo/nightscout/androidaps/utils/ListUpdateCallbackHelper;", "currentData", "", "getItemCount", "", "getListDiffCallback", "Linfo/nightscout/androidaps/utils/ListDiffCallback;", "newItems", "oldItems", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "BgReadingsViewHolder", "app_fullRelease"})
    public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.source.BGSourceFragment.RecyclerViewAdapter.BgReadingsViewHolder> {
        private info.nightscout.androidaps.utils.ListUpdateCallbackHelper callbackHelper;
        private final java.util.List<info.nightscout.androidaps.db.BgReading> currentData = null;
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends info.nightscout.androidaps.db.BgReading> newList) {
        }
        
        private final info.nightscout.androidaps.utils.ListDiffCallback<info.nightscout.androidaps.db.BgReading> getListDiffCallback(java.util.List<? extends info.nightscout.androidaps.db.BgReading> newItems, java.util.List<? extends info.nightscout.androidaps.db.BgReading> oldItems) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.source.BGSourceFragment.RecyclerViewAdapter.BgReadingsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.source.BGSourceFragment.RecyclerViewAdapter.BgReadingsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends info.nightscout.androidaps.db.BgReading> bgReadings) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n\u00a8\u0006\u001d"}, d2 = {"Linfo/nightscout/androidaps/plugins/source/BGSourceFragment$RecyclerViewAdapter$BgReadingsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Linfo/nightscout/androidaps/plugins/source/BGSourceFragment$RecyclerViewAdapter;Landroid/view/View;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "setDate", "(Landroid/widget/TextView;)V", "direction", "Landroid/widget/ImageView;", "getDirection", "()Landroid/widget/ImageView;", "setDirection", "(Landroid/widget/ImageView;)V", "invalid", "getInvalid", "setInvalid", "ns", "getNs", "setNs", "remove", "getRemove", "setRemove", "value", "getValue", "setValue", "app_fullRelease"})
        public final class BgReadingsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView date;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView value;
            @org.jetbrains.annotations.NotNull()
            private android.widget.ImageView direction;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView invalid;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView ns;
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView remove;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getDate() {
                return null;
            }
            
            public final void setDate(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getValue() {
                return null;
            }
            
            public final void setValue(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getDirection() {
                return null;
            }
            
            public final void setDirection(@org.jetbrains.annotations.NotNull()
            android.widget.ImageView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getInvalid() {
                return null;
            }
            
            public final void setInvalid(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getNs() {
                return null;
            }
            
            public final void setNs(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getRemove() {
                return null;
            }
            
            public final void setRemove(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
            
            public BgReadingsViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
        }
    }
}