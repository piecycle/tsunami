package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'\u00a8\u0006)"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/ActivitiesModule;", "", "()V", "contributeMainActivity", "Linfo/nightscout/androidaps/MainActivity;", "contributesDefaultProfileActivity", "Linfo/nightscout/androidaps/activities/ProfileHelperActivity;", "contributesHistoryBrowseActivity", "Linfo/nightscout/androidaps/historyBrowser/HistoryBrowseActivity;", "contributesInsightAlertActivity", "Linfo/nightscout/androidaps/plugins/pump/insight/activities/InsightAlertActivity;", "contributesInsightPairingActivity", "Linfo/nightscout/androidaps/plugins/pump/insight/activities/InsightPairingActivity;", "contributesInsightPairingInformationActivity", "Linfo/nightscout/androidaps/plugins/pump/insight/activities/InsightPairingInformationActivity;", "contributesLogSettingActivity", "Linfo/nightscout/androidaps/plugins/general/maintenance/activities/LogSettingActivity;", "contributesMedtronicHistoryActivity", "Linfo/nightscout/androidaps/plugins/pump/medtronic/dialog/MedtronicHistoryActivity;", "contributesOpenHumansLoginActivity", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansLoginActivity;", "contributesPreferencesActivity", "Linfo/nightscout/androidaps/activities/PreferencesActivity;", "contributesQuickWizardListActivity", "Linfo/nightscout/androidaps/plugins/general/overview/activities/QuickWizardListActivity;", "contributesRequestDexcomPermissionActivity", "Linfo/nightscout/androidaps/activities/RequestDexcomPermissionActivity;", "contributesRileyLinkBLEConfigActivity", "Linfo/nightscout/androidaps/plugins/pump/common/dialog/RileyLinkBLEConfigActivity;", "contributesRileyLinkStatusActivity", "Linfo/nightscout/androidaps/plugins/pump/common/hw/rileylink/dialog/RileyLinkStatusActivity;", "contributesSetupWizardActivity", "Linfo/nightscout/androidaps/setupwizard/SetupWizardActivity;", "contributesSingleFragmentActivity", "Linfo/nightscout/androidaps/activities/SingleFragmentActivity;", "contributesSmsCommunicatorOtpActivity", "Linfo/nightscout/androidaps/plugins/general/smsCommunicator/activities/SmsCommunicatorOtpActivity;", "contributesStatsActivity", "Linfo/nightscout/androidaps/activities/StatsActivity;", "contributesSurveyActivity", "Linfo/nightscout/androidaps/activities/SurveyActivity;", "app_fullRelease"})
@dagger.Module()
public abstract class ActivitiesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.historyBrowser.HistoryBrowseActivity contributesHistoryBrowseActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.activities.InsightAlertActivity contributesInsightAlertActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.activities.InsightPairingActivity contributesInsightPairingActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.insight.activities.InsightPairingInformationActivity contributesInsightPairingInformationActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.maintenance.activities.LogSettingActivity contributesLogSettingActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.MainActivity contributeMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.medtronic.dialog.MedtronicHistoryActivity contributesMedtronicHistoryActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.PreferencesActivity contributesPreferencesActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.overview.activities.QuickWizardListActivity contributesQuickWizardListActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.RequestDexcomPermissionActivity contributesRequestDexcomPermissionActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.hw.rileylink.dialog.RileyLinkStatusActivity contributesRileyLinkStatusActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.pump.common.dialog.RileyLinkBLEConfigActivity contributesRileyLinkBLEConfigActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.SetupWizardActivity contributesSetupWizardActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.SingleFragmentActivity contributesSingleFragmentActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.smsCommunicator.activities.SmsCommunicatorOtpActivity contributesSmsCommunicatorOtpActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.StatsActivity contributesStatsActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.SurveyActivity contributesSurveyActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.activities.ProfileHelperActivity contributesDefaultProfileActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.openhumans.OpenHumansLoginActivity contributesOpenHumansLoginActivity();
    
    public ActivitiesModule() {
        super();
    }
}