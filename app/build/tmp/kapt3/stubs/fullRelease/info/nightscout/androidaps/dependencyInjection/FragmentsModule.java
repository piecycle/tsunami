package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'J\b\u0010)\u001a\u00020*H\'J\b\u0010+\u001a\u00020,H\'J\b\u0010-\u001a\u00020.H\'J\b\u0010/\u001a\u000200H\'J\b\u00101\u001a\u000202H\'J\b\u00103\u001a\u000204H\'J\b\u00105\u001a\u000206H\'J\b\u00107\u001a\u000208H\'J\b\u00109\u001a\u00020:H\'J\b\u0010;\u001a\u00020<H\'J\b\u0010=\u001a\u00020>H\'J\b\u0010?\u001a\u00020@H\'J\b\u0010A\u001a\u00020BH\'J\b\u0010C\u001a\u00020DH\'J\b\u0010E\u001a\u00020FH\'J\b\u0010G\u001a\u00020HH\'J\b\u0010I\u001a\u00020JH\'J\b\u0010K\u001a\u00020LH\'J\b\u0010M\u001a\u00020NH\'J\b\u0010O\u001a\u00020PH\'J\b\u0010Q\u001a\u00020RH\'J\b\u0010S\u001a\u00020TH\'J\b\u0010U\u001a\u00020VH\'J\b\u0010W\u001a\u00020XH\'J\b\u0010Y\u001a\u00020ZH\'J\b\u0010[\u001a\u00020\\H\'J\b\u0010]\u001a\u00020^H\'J\b\u0010_\u001a\u00020`H\'J\b\u0010a\u001a\u00020bH\'J\b\u0010c\u001a\u00020dH\'J\b\u0010e\u001a\u00020fH\'J\b\u0010g\u001a\u00020hH\'J\b\u0010i\u001a\u00020jH\'J\b\u0010k\u001a\u00020lH\'J\b\u0010m\u001a\u00020nH\'J\b\u0010o\u001a\u00020pH\'J\b\u0010q\u001a\u00020rH\'J\b\u0010s\u001a\u00020tH\'\u00a8\u0006u"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/FragmentsModule;", "", "()V", "contributesActionsFragment", "Linfo/nightscout/androidaps/plugins/general/actions/ActionsFragment;", "contributesAutomationFragment", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationFragment;", "contributesBGSourceFragment", "Linfo/nightscout/androidaps/plugins/source/BGSourceFragment;", "contributesCalibrationDialog", "Linfo/nightscout/androidaps/dialogs/CalibrationDialog;", "contributesCarbsDialog", "Linfo/nightscout/androidaps/dialogs/CarbsDialog;", "contributesCareDialog", "Linfo/nightscout/androidaps/dialogs/CareDialog;", "contributesChooseActionDialog", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/ChooseActionDialog;", "contributesChooseTriggerDialog", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/ChooseTriggerDialog;", "contributesComboFragment", "Linfo/nightscout/androidaps/plugins/pump/combo/ComboFragment;", "contributesConfigBuilderFragment", "Linfo/nightscout/androidaps/plugins/configBuilder/ConfigBuilderFragment;", "contributesEditActionDialog", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditActionDialog;", "contributesEditEventDialog", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditEventDialog;", "contributesEditQuickWizardDialog", "Linfo/nightscout/androidaps/plugins/general/overview/dialogs/EditQuickWizardDialog;", "contributesEditTriggerDialog", "Linfo/nightscout/androidaps/plugins/general/automation/dialogs/EditTriggerDialog;", "contributesExchangeAuthTokenDialot", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity$ExchangeAuthTokenDialog;", "contributesExtendedBolusDialog", "Linfo/nightscout/androidaps/dialogs/ExtendedBolusDialog;", "contributesFillDialog", "Linfo/nightscout/androidaps/dialogs/FillDialog;", "contributesFoodFragment", "Linfo/nightscout/androidaps/plugins/general/food/FoodFragment;", "contributesInsulinDialog", "Linfo/nightscout/androidaps/dialogs/InsulinDialog;", "contributesInsulinFragment", "Linfo/nightscout/androidaps/plugins/insulin/InsulinFragment;", "contributesLocalInsightFragment", "Linfo/nightscout/androidaps/plugins/pump/insight/LocalInsightFragment;", "contributesLocalProfileFragment", "Linfo/nightscout/androidaps/plugins/profile/local/LocalProfileFragment;", "contributesLoopDialog", "Linfo/nightscout/androidaps/dialogs/LoopDialog;", "contributesLoopFragment", "Linfo/nightscout/androidaps/plugins/aps/loop/LoopFragment;", "contributesMaintenanceFragment", "Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenanceFragment;", "contributesMedtronicFragment", "Linfo/nightscout/androidaps/plugins/pump/medtronic/MedtronicFragment;", "contributesNSClientFragment", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSClientFragment;", "contributesNSProfileFragment", "Linfo/nightscout/androidaps/plugins/profile/ns/NSProfileFragment;", "contributesObjectivesExamDialog", "Linfo/nightscout/androidaps/plugins/constraints/objectives/activities/ObjectivesExamDialog;", "contributesObjectivesFragment", "Linfo/nightscout/androidaps/plugins/constraints/objectives/ObjectivesFragment;", "contributesOmnipodFragment", "Linfo/nightscout/androidaps/plugins/pump/omnipod/ui/OmnipodOverviewFragment;", "contributesOpenAPSAMAFragment", "Linfo/nightscout/androidaps/plugins/aps/openAPSAMA/OpenAPSAMAFragment;", "contributesOpenAPSSMBFragment", "Linfo/nightscout/androidaps/plugins/aps/openAPSSMB/OpenAPSSMBFragment;", "contributesOpenHumansFragment", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansFragment;", "contributesOverviewFragment", "Linfo/nightscout/androidaps/plugins/general/overview/OverviewFragment;", "contributesPasswordCheck", "Linfo/nightscout/androidaps/utils/protection/PasswordCheck;", "contributesPreferencesFragment", "Linfo/nightscout/androidaps/activities/MyPreferenceFragment;", "contributesProfileSwitchDialog", "Linfo/nightscout/androidaps/dialogs/ProfileSwitchDialog;", "contributesRileyLinkStatusDeviceMedtronic", "Linfo/nightscout/androidaps/plugins/pump/medtronic/dialog/RileyLinkStatusDeviceMedtronic;", "contributesRileyLinkStatusGeneral", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/dialog/RileyLinkStatusGeneralFragment;", "contributesRileyLinkStatusHistoryFragment", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/dialog/RileyLinkStatusHistoryFragment;", "contributesSmsCommunicatorFragment", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsCommunicatorFragment;", "contributesTempBasalDialog", "Linfo/nightscout/androidaps/dialogs/TempBasalDialog;", "contributesTempTargetDialog", "Linfo/nightscout/androidaps/dialogs/TempTargetDialog;", "contributesTidepoolFragment", "Linfo/nightscout/androidaps/plugins/general/tidepool/TidepoolFragment;", "contributesTreatmentDialog", "Linfo/nightscout/androidaps/dialogs/TreatmentDialog;", "contributesTreatmentsBolusFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsBolusFragment;", "contributesTreatmentsCareportalFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsCareportalFragment;", "contributesTreatmentsExtendedBolusesFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsExtendedBolusesFragment;", "contributesTreatmentsFragment", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentsFragment;", "contributesTreatmentsProfileSwitchFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsProfileSwitchFragment;", "contributesTreatmentsTempTargetFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTempTargetFragment;", "contributesTreatmentsTemporaryBasalsFragment", "Linfo/nightscout/androidaps/plugins/treatments/fragments/TreatmentsTemporaryBasalsFragment;", "contributesVirtualPumpFragment", "Linfo/nightscout/androidaps/plugins/pump/virtual/VirtualPumpFragment;", "contributesWearFragment", "Linfo/nightscout/androidaps/plugins/general/wear/WearFragment;", "contributesWizardDialog", "Linfo/nightscout/androidaps/dialogs/WizardDialog;", "contributesWizardInfoDialog", "Linfo/nightscout/androidaps/dialogs/WizardInfoDialog;", "app_fullRelease"})
@dagger.Module()
public abstract class FragmentsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.MyPreferenceFragment contributesPreferencesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.actions.ActionsFragment contributesActionsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.AutomationFragment contributesAutomationFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.source.BGSourceFragment contributesBGSourceFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.combo.ComboFragment contributesComboFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderFragment contributesConfigBuilderFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.food.FoodFragment contributesFoodFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.insulin.InsulinFragment contributesInsulinFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.profile.local.LocalProfileFragment contributesLocalProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.ObjectivesFragment contributesObjectivesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSAMA.OpenAPSAMAFragment contributesOpenAPSAMAFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.openAPSSMB.OpenAPSSMBFragment contributesOpenAPSSMBFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.overview.OverviewFragment contributesOverviewFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.LocalInsightFragment contributesLocalInsightFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.aps.loop.LoopFragment contributesLoopFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment contributesMaintenanceFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.MedtronicFragment contributesMedtronicFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.omnipod.ui.OmnipodOverviewFragment contributesOmnipodFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.profile.ns.NSProfileFragment contributesNSProfileFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.nsclient.NSClientFragment contributesNSClientFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorFragment contributesSmsCommunicatorFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.wear.WearFragment contributesWearFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.tidepool.TidepoolFragment contributesTidepoolFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.TreatmentsFragment contributesTreatmentsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment contributesTreatmentsBolusFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTemporaryBasalsFragment contributesTreatmentsTemporaryBasalsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsTempTargetFragment contributesTreatmentsTempTargetFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment contributesTreatmentsExtendedBolusesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsCareportalFragment contributesTreatmentsCareportalFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsProfileSwitchFragment contributesTreatmentsProfileSwitchFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment contributesVirtualPumpFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.openhumans.OpenHumansFragment contributesOpenHumansFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.CalibrationDialog contributesCalibrationDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.CarbsDialog contributesCarbsDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.CareDialog contributesCareDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.dialogs.EditActionDialog contributesEditActionDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.dialogs.EditEventDialog contributesEditEventDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.dialogs.EditTriggerDialog contributesEditTriggerDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.overview.dialogs.EditQuickWizardDialog contributesEditQuickWizardDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.ExtendedBolusDialog contributesExtendedBolusDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.FillDialog contributesFillDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseActionDialog contributesChooseActionDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog contributesChooseTriggerDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.InsulinDialog contributesInsulinDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.LoopDialog contributesLoopDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.activities.ObjectivesExamDialog contributesObjectivesExamDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.ProfileSwitchDialog contributesProfileSwitchDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.TempBasalDialog contributesTempBasalDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.TempTargetDialog contributesTempTargetDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.TreatmentDialog contributesTreatmentDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.WizardDialog contributesWizardDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.dialogs.WizardInfoDialog contributesWizardInfoDialog();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity.ExchangeAuthTokenDialog contributesExchangeAuthTokenDialot();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.utils.protection.PasswordCheck contributesPasswordCheck();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusGeneralFragment contributesRileyLinkStatusGeneral();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusHistoryFragment contributesRileyLinkStatusHistoryFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.dialog.RileyLinkStatusDeviceMedtronic contributesRileyLinkStatusDeviceMedtronic();
    
    public FragmentsModule() {
        super();
    }
}