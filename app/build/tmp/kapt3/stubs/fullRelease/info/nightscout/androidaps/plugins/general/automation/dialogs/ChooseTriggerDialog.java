package info.nightscout.androidaps.plugins.general.automation.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010*\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006."}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dialogs/ChooseTriggerDialog;", "Linfo/nightscout/androidaps/dialogs/DialogFragmentWithDate;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/AutomationDialogChooseTriggerBinding;", "automationPlugin", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "getAutomationPlugin", "()Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;", "setAutomationPlugin", "(Linfo/nightscout/androidaps/plugins/general/automation/AutomationPlugin;)V", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/AutomationDialogChooseTriggerBinding;", "checkedIndex", "", "clickListener", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/ChooseTriggerDialog$OnClickListener;", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "setMainApp", "(Linfo/nightscout/androidaps/MainApp;)V", "determineCheckedIndex", "getTriggerClass", "", "instantiateTrigger", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "onViewCreated", "view", "setOnClickListener", "submit", "", "OnClickListener", "app_fullRelease"})
public final class ChooseTriggerDialog extends info.nightscout.androidaps.dialogs.DialogFragmentWithDate {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.automation.AutomationPlugin automationPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.MainApp mainApp;
    private int checkedIndex = -1;
    private info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog.OnClickListener clickListener;
    private info.nightscout.androidaps.databinding.AutomationDialogChooseTriggerBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.AutomationPlugin getAutomationPlugin() {
        return null;
    }
    
    public final void setAutomationPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.AutomationPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.MainApp getMainApp() {
        return null;
    }
    
    public final void setMainApp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp p0) {
    }
    
    private final info.nightscout.androidaps.databinding.AutomationDialogChooseTriggerBinding getBinding() {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean submit() {
        return false;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog.OnClickListener clickListener) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    private final info.nightscout.androidaps.plugins.general.automation.triggers.Trigger instantiateTrigger() {
        return null;
    }
    
    private final java.lang.String getTriggerClass() {
        return null;
    }
    
    private final int determineCheckedIndex() {
        return 0;
    }
    
    public ChooseTriggerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dialogs/ChooseTriggerDialog$OnClickListener;", "", "onClick", "", "newTriggerObject", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "app_fullRelease"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.plugins.general.automation.triggers.Trigger newTriggerObject);
    }
}