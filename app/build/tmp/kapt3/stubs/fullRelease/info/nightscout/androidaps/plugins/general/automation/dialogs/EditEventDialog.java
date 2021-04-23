package info.nightscout.androidaps.plugins.general.automation.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00103\u001a\u0002012\u0006\u00104\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00105\u001a\u000201H\u0002J\b\u00106\u001a\u000207H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00069"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog;", "Linfo/nightscout/androidaps/dialogs/DialogFragmentWithDate;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/AutomationDialogEventBinding;", "actionListAdapter", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter;", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/AutomationDialogEventBinding;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "event", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationEvent;", "fabricPrivacy", "Linfo/nightscout/androidaps/utils/FabricPrivacy;", "getFabricPrivacy", "()Linfo/nightscout/androidaps/utils/FabricPrivacy;", "setFabricPrivacy", "(Linfo/nightscout/androidaps/utils/FabricPrivacy;)V", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "setMainApp", "(Linfo/nightscout/androidaps/MainApp;)V", "position", "", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "getRxBus", "()Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "setRxBus", "(Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "onViewCreated", "view", "showPreconditions", "submit", "", "ActionListAdapter", "app_fullRelease"})
public final class EditEventDialog extends info.nightscout.androidaps.dialogs.DialogFragmentWithDate {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus;
    @javax.inject.Inject()
    public info.nightscout.androidaps.MainApp mainApp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.FabricPrivacy fabricPrivacy;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    private info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog.ActionListAdapter actionListAdapter;
    private info.nightscout.androidaps.plugins.general.automation.AutomationEvent event;
    private int position = -1;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private info.nightscout.androidaps.databinding.AutomationDialogEventBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.bus.RxBusWrapper getRxBus() {
        return null;
    }
    
    public final void setRxBus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.MainApp getMainApp() {
        return null;
    }
    
    public final void setMainApp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp p0) {
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
    
    private final info.nightscout.androidaps.databinding.AutomationDialogEventBinding getBinding() {
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
    public boolean submit() {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showPreconditions() {
    }
    
    public EditEventDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter$ViewHolder;", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog;", "(Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_fullRelease"})
    public final class ActionListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog.ActionListAdapter.ViewHolder> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog.ActionListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog.ActionListAdapter.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        public ActionListAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n0\u0000R\u00060\rR\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "action", "Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog$ActionListAdapter;", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog;", "position", "", "app_fullRelease"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.view.View view = null;
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            info.nightscout.androidaps.plugins.general.automation.actions.Action action, @org.jetbrains.annotations.NotNull()
            androidx.recyclerview.widget.RecyclerView.Adapter<info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog.ActionListAdapter.ViewHolder> recyclerView, int position) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View getView() {
                return null;
            }
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View view) {
                super(null);
            }
        }
    }
}