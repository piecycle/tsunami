package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d0\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'J\b\u0010)\u001a\u00020*H\'J\b\u0010+\u001a\u00020,H\'J\b\u0010-\u001a\u00020.H\'J\b\u0010/\u001a\u000200H\'J\b\u00101\u001a\u000202H\'J\b\u00103\u001a\u000204H\'J\b\u00105\u001a\u000206H\'J\b\u00107\u001a\u000208H\'J\b\u00109\u001a\u00020:H\'J\b\u0010;\u001a\u00020<H\'J\b\u0010=\u001a\u00020>H\'J\b\u0010?\u001a\u00020@H\'J\b\u0010A\u001a\u00020BH\'J\b\u0010C\u001a\u00020DH\'J\b\u0010E\u001a\u00020FH\'J\b\u0010G\u001a\u00020HH\'J\b\u0010I\u001a\u00020JH\'J\b\u0010K\u001a\u00020LH\'J\b\u0010M\u001a\u00020NH\'J\b\u0010O\u001a\u00020PH\'J\b\u0010Q\u001a\u00020RH\'J\b\u0010S\u001a\u00020TH\'J\b\u0010U\u001a\u00020VH\'J\b\u0010W\u001a\u00020XH\'J\b\u0010Y\u001a\u00020ZH\'J\b\u0010[\u001a\u00020\\H\'J\b\u0010]\u001a\u00020^H\'J\b\u0010_\u001a\u00020`H\'J\b\u0010a\u001a\u00020bH\'J\b\u0010c\u001a\u00020dH\'J\b\u0010e\u001a\u00020fH\'J\b\u0010g\u001a\u00020hH\'J\b\u0010i\u001a\u00020jH\'J\b\u0010k\u001a\u00020lH\'J\b\u0010m\u001a\u00020nH\'\u00a8\u0006o"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/AutomationModule;", "", "()V", "actionAlarmInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionAlarm;", "actionDummyInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionDummy;", "actionInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/Action;", "actionLoopDisableInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionLoopDisable;", "actionLoopEnableInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionLoopEnable;", "actionLoopResumeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionLoopResume;", "actionLoopSuspendInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionLoopSuspend;", "actionNotificationInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionNotification;", "actionProfileSwitchInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionProfileSwitch;", "actionProfileSwitchPercentInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionProfileSwitchPercent;", "actionSendSMSInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionSendSMS;", "actionStartTempTargetInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionStartTempTarget;", "actionStopTempTargetInjector", "Linfo/nightscout/androidaps/plugins/general/automation/actions/ActionStopTempTarget;", "automationEventInjector", "Linfo/nightscout/androidaps/plugins/general/automation/AutomationEvent;", "comparatorConnectInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorConnect;", "comparatorExistsInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/ComparatorExists;", "comparatorInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Comparator;", "elementInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "inputBgInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputBg;", "inputButtonInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputButton;", "inputDateTimeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDateTime;", "inputDeltaInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDelta;", "inputDoubleInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDouble;", "inputDropdownMenuInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDropdownMenu;", "inputDurationInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputDuration;", "inputInsulinInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputInsulin;", "inputLocationModeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputLocationMode;", "inputPercentInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputPercent;", "inputProfileNameInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputProfileName;", "inputStringInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputString;", "inputTempTargetInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputTempTarget;", "inputTimeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputTime;", "inputTimeRangeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputTimeRange;", "inputWeekDayInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay;", "labelWithElementInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/LabelWithElement;", "staticLabelInjector", "Linfo/nightscout/androidaps/plugins/general/automation/elements/StaticLabel;", "triggerAutosensValueInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerAutosensValue;", "triggerBTDeviceInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBTDevice;", "triggerBgInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBg;", "triggerBolusAgoInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerBolusAgo;", "triggerCOBInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerCOB;", "triggerConnectorInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerConnector;", "triggerDeltaInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerDelta;", "triggerDummyInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerDummy;", "triggerInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/Trigger;", "triggerIobInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerIob;", "triggerLocationInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerLocation;", "triggerProfilePercentInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerProfilePercent;", "triggerPumpLastConnectionInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerPumpLastConnection;", "triggerRecurringTimeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerRecurringTime;", "triggerTempTargetInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerTempTarget;", "triggerTime", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerTime;", "triggerTimeRangeInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerTimeRange;", "triggerWifiSsidInjector", "Linfo/nightscout/androidaps/plugins/general/automation/triggers/TriggerWifiSsid;", "app_fullRelease"})
@dagger.Module()
public abstract class AutomationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.AutomationEvent automationEventInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.Trigger triggerInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerAutosensValue triggerAutosensValueInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBg triggerBgInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBolusAgo triggerBolusAgoInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerCOB triggerCOBInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerConnector triggerConnectorInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerDelta triggerDeltaInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerDummy triggerDummyInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerIob triggerIobInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerLocation triggerLocationInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerProfilePercent triggerProfilePercentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerPumpLastConnection triggerPumpLastConnectionInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerBTDevice triggerBTDeviceInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerRecurringTime triggerRecurringTimeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTempTarget triggerTempTargetInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTime triggerTime();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerTimeRange triggerTimeRangeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.triggers.TriggerWifiSsid triggerWifiSsidInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.Action actionInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopDisable actionLoopDisableInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopEnable actionLoopEnableInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopResume actionLoopResumeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionLoopSuspend actionLoopSuspendInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionNotification actionNotificationInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionAlarm actionAlarmInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionProfileSwitch actionProfileSwitchInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionProfileSwitchPercent actionProfileSwitchPercentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionSendSMS actionSendSMSInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionStartTempTarget actionStartTempTargetInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionStopTempTarget actionStopTempTargetInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.actions.ActionDummy actionDummyInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.Element elementInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputBg inputBgInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputButton inputButtonInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.Comparator comparatorInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.ComparatorConnect comparatorConnectInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.ComparatorExists comparatorExistsInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputDateTime inputDateTimeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputDelta inputDeltaInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputDouble inputDoubleInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputDropdownMenu inputDropdownMenuInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputDuration inputDurationInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputInsulin inputInsulinInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputLocationMode inputLocationModeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputPercent inputPercentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputProfileName inputProfileNameInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputString inputStringInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputTempTarget inputTempTargetInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputTimeRange inputTimeRangeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputTime inputTimeInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay inputWeekDayInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.LabelWithElement labelWithElementInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.automation.elements.StaticLabel staticLabelInjector();
    
    public AutomationModule() {
        super();
    }
}