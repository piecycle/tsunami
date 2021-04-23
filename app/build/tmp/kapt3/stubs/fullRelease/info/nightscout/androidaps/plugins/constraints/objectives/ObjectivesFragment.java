package info.nightscout.androidaps.plugins.constraints.objectives;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001RB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020JH\u0016J\u001a\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020B2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010O\u001a\u00020JH\u0002J\b\u0010P\u001a\u00020JH\u0002J\u0006\u0010Q\u001a\u00020JR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006S"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "setAapsLogger", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "getDateUtil", "()Linfo/nightscout/androidaps/utils/DateUtil;", "setDateUtil", "(Linfo/nightscout/androidaps/utils/DateUtil;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "handler", "Landroid/os/Handler;", "objectiveUpdater", "Ljava/lang/Runnable;", "objectivesAdapter", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment$ObjectivesAdapter;", "objectivesPlugin", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;", "getObjectivesPlugin", "()Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;", "setObjectivesPlugin", "(Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesPlugin;)V", "receiverStatusStore", "Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "getReceiverStatusStore", "()Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;", "setReceiverStatusStore", "(Linfo/nightscout/androidaps/receivers/ReceiverStatusStore;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "sntpClient", "Linfo/nightscout/androidaps/utils/SntpClient;", "getSntpClient", "()Linfo/nightscout/androidaps/utils/SntpClient;", "setSntpClient", "(Linfo/nightscout/androidaps/utils/SntpClient;)V", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "getSp", "()Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "setSp", "(Linfo/nightscout/androidaps/utils/sharedPreferences/SP;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onPause", "onResume", "onViewCreated", "view", "scrollToCurrentObjective", "startUpdateTimer", "updateGUI", "ObjectivesAdapter", "app_fullRelease"})
public final class ObjectivesFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.logging.AAPSLogger aapsLogger;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.sharedPreferences.SP sp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin objectivesPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.receivers.ReceiverStatusStore receiverStatusStore;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DateUtil dateUtil;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.SntpClient sntpClient;
    private final info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment.ObjectivesAdapter objectivesAdapter = null;
    private final android.os.Handler handler = null;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private final java.lang.Runnable objectiveUpdater = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public final void setAapsLogger(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.sharedPreferences.SP getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP p0) {
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
    public final info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin getObjectivesPlugin() {
        return null;
    }
    
    public final void setObjectivesPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.receivers.ReceiverStatusStore getReceiverStatusStore() {
        return null;
    }
    
    public final void setReceiverStatusStore(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.receivers.ReceiverStatusStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DateUtil getDateUtil() {
        return null;
    }
    
    public final void setDateUtil(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.SntpClient getSntpClient() {
        return null;
    }
    
    public final void setSntpClient(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.SntpClient p0) {
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
    
    @java.lang.Override()
    public synchronized void onDestroyView() {
    }
    
    private final void startUpdateTimer() {
    }
    
    private final void scrollToCurrentObjective() {
    }
    
    public final void updateGUI() {
    }
    
    public ObjectivesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment$ObjectivesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment$ObjectivesAdapter$ViewHolder;", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment;", "(Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_fullRelease"})
    final class ObjectivesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment.ObjectivesAdapter.ViewHolder> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment.ObjectivesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment.ObjectivesAdapter.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public ObjectivesAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\f\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment$ObjectivesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment$ObjectivesAdapter;Landroid/view/View;)V", "accomplished", "Landroid/widget/TextView;", "getAccomplished", "()Landroid/widget/TextView;", "enterButton", "Landroid/widget/Button;", "getEnterButton", "()Landroid/widget/Button;", "gate", "getGate", "input", "Landroid/widget/EditText;", "getInput", "()Landroid/widget/EditText;", "inputHint", "getInputHint", "objective", "getObjective", "progress", "Landroid/widget/LinearLayout;", "getProgress", "()Landroid/widget/LinearLayout;", "requestCode", "getRequestCode", "start", "getStart", "title", "getTitle", "unFinish", "getUnFinish", "unStart", "getUnStart", "verify", "getVerify", "app_fullRelease"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView title = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView objective = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView gate = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView accomplished = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.LinearLayout progress = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.Button verify = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.Button start = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.Button unFinish = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.Button unStart = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView inputHint = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.EditText input = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.Button enterButton = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView requestCode = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getObjective() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getGate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getAccomplished() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.LinearLayout getProgress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getVerify() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getStart() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getUnFinish() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getUnStart() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getInputHint() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.EditText getInput() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.Button getEnterButton() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getRequestCode() {
                return null;
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
        }
    }
}