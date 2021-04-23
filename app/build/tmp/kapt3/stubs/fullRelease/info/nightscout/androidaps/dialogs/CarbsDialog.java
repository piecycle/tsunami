package info.nightscout.androidaps.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020I2\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020A2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020IH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u00a8\u0006U"}, d2 = {"Linfo/nightscout/androidaps/dialogs/CarbsDialog;", "Linfo/nightscout/androidaps/dialogs/DialogFragmentWithDate;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/DialogCarbsBinding;", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/DialogCarbsBinding;", "carbsGenerator", "Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;", "getCarbsGenerator", "()Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;", "setCarbsGenerator", "(Linfo/nightscout/androidaps/plugins/treatments/CarbsGenerator;)V", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "getConstraintChecker", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "setConstraintChecker", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;)V", "defaultValueHelper", "Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "getDefaultValueHelper", "()Linfo/nightscout/androidaps/utils/DefaultValueHelper;", "setDefaultValueHelper", "(Linfo/nightscout/androidaps/utils/DefaultValueHelper;)V", "iobCobCalculatorPlugin", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "getIobCobCalculatorPlugin", "()Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;", "setIobCobCalculatorPlugin", "(Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/IobCobCalculatorPlugin;)V", "mainApp", "Linfo/nightscout/androidaps/MainApp;", "getMainApp", "()Linfo/nightscout/androidaps/MainApp;", "setMainApp", "(Linfo/nightscout/androidaps/MainApp;)V", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "getNsUpload", "()Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "setNsUpload", "(Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "getProfileFunction", "()Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "setProfileFunction", "(Linfo/nightscout/androidaps/interfaces/ProfileFunction;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "textWatcher", "Landroid/text/TextWatcher;", "treatmentsPlugin", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "getTreatmentsPlugin", "()Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;", "setTreatmentsPlugin", "(Linfo/nightscout/androidaps/plugins/treatments/TreatmentsPlugin;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "onViewCreated", "view", "submit", "", "toSignedString", "", "value", "", "validateInputs", "Companion", "app_fullRelease"})
public final class CarbsDialog extends info.nightscout.androidaps.dialogs.DialogFragmentWithDate {
    @javax.inject.Inject()
    public info.nightscout.androidaps.MainApp mainApp;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.DefaultValueHelper defaultValueHelper;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin treatmentsPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ProfileFunction profileFunction;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin iobCobCalculatorPlugin;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.treatments.CarbsGenerator carbsGenerator;
    private final android.text.TextWatcher textWatcher = null;
    private info.nightscout.androidaps.databinding.DialogCarbsBinding _binding;
    private static final int FAV1_DEFAULT = 5;
    private static final int FAV2_DEFAULT = 10;
    private static final int FAV3_DEFAULT = 20;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.dialogs.CarbsDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    public final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker getConstraintChecker() {
        return null;
    }
    
    public final void setConstraintChecker(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.DefaultValueHelper getDefaultValueHelper() {
        return null;
    }
    
    public final void setDefaultValueHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DefaultValueHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin getTreatmentsPlugin() {
        return null;
    }
    
    public final void setTreatmentsPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ProfileFunction getProfileFunction() {
        return null;
    }
    
    public final void setProfileFunction(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin getIobCobCalculatorPlugin() {
        return null;
    }
    
    public final void setIobCobCalculatorPlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.NSUpload getNsUpload() {
        return null;
    }
    
    public final void setNsUpload(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.treatments.CarbsGenerator getCarbsGenerator() {
        return null;
    }
    
    public final void setCarbsGenerator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.treatments.CarbsGenerator p0) {
    }
    
    private final void validateInputs() {
    }
    
    private final info.nightscout.androidaps.databinding.DialogCarbsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
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
    
    private final java.lang.String toSignedString(int value) {
        return null;
    }
    
    @java.lang.Override()
    public boolean submit() {
        return false;
    }
    
    public CarbsDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/dialogs/CarbsDialog$Companion;", "", "()V", "FAV1_DEFAULT", "", "FAV2_DEFAULT", "FAV3_DEFAULT", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}