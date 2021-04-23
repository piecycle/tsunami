package info.nightscout.androidaps.plugins.general.maintenance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00062"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenanceFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "foodPlugin", "Linfo/nightscout/androidaps/plugins/general/food/FoodPlugin;", "getFoodPlugin", "()Linfo/nightscout/androidaps/plugins/general/food/FoodPlugin;", "setFoodPlugin", "(Linfo/nightscout/androidaps/plugins/general/food/FoodPlugin;)V", "importExportPrefs", "Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;", "getImportExportPrefs", "()Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;", "setImportExportPrefs", "(Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;)V", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "setMainApp", "(Linfo/nightscout/androidaps/MainApp;)V", "maintenancePlugin", "Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "getMaintenancePlugin", "()Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "setMaintenancePlugin", "(Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "getTreatmentsPlugin", "()Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "setTreatmentsPlugin", "(Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_fullRelease"})
public final class MaintenanceFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin maintenancePlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.MainApp mainApp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.food.FoodPlugin foodPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ImportExportPrefsInterface importExportPrefs;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin getMaintenancePlugin() {
        return null;
    }
    
    public final void setMaintenancePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.MaintenancePlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.MainApp getMainApp() {
        return null;
    }
    
    public final void setMainApp(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.MainApp p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin getTreatmentsPlugin() {
        return null;
    }
    
    public final void setTreatmentsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.food.FoodPlugin getFoodPlugin() {
        return null;
    }
    
    public final void setFoodPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.food.FoodPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ImportExportPrefsInterface getImportExportPrefs() {
        return null;
    }
    
    public final void setImportExportPrefs(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ImportExportPrefsInterface p0) {
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
    
    public MaintenanceFragment() {
        super();
    }
}