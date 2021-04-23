package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/CommandQueueModule;", "", "()V", "commandBolusInjector", "Linfo/nightscout/androidaps/queue/commands/CommandBolus;", "commandCancelExtendedBolusInjector", "Linfo/nightscout/androidaps/queue/commands/CommandCancelExtendedBolus;", "commandCancelTempBasalInjector", "Linfo/nightscout/androidaps/queue/commands/CommandCancelTempBasal;", "commandCommandSMBBolusInjector", "Linfo/nightscout/androidaps/queue/commands/CommandSMBBolus;", "commandCustomCommandInjector", "Linfo/nightscout/androidaps/queue/commands/CommandCustomCommand;", "commandExtendedBolusInjector", "Linfo/nightscout/androidaps/queue/commands/CommandExtendedBolus;", "commandInsightSetTBROverNotificationInjector", "Linfo/nightscout/androidaps/queue/commands/CommandInsightSetTBROverNotification;", "commandLoadEventsInjector", "Linfo/nightscout/androidaps/queue/commands/CommandLoadEvents;", "commandLoadHistoryInjector", "Linfo/nightscout/androidaps/queue/commands/CommandLoadHistory;", "commandLoadTDDsInjector", "Linfo/nightscout/androidaps/queue/commands/CommandLoadTDDs;", "commandQueueInjector", "Linfo/nightscout/androidaps/queue/CommandQueue;", "commandReadStatusInjector", "Linfo/nightscout/androidaps/queue/commands/CommandReadStatus;", "commandSetProfileInjector", "Linfo/nightscout/androidaps/queue/commands/CommandSetProfile;", "commandSetUserSettingsInjector", "Linfo/nightscout/androidaps/queue/commands/CommandSetUserSettings;", "commandStartPumpInjector", "Linfo/nightscout/androidaps/queue/commands/CommandStartPump;", "commandStopPumpInjector", "Linfo/nightscout/androidaps/queue/commands/CommandStopPump;", "commandTempBasalAbsoluteInjector", "Linfo/nightscout/androidaps/queue/commands/CommandTempBasalAbsolute;", "commandTempBasalPercentInjector", "Linfo/nightscout/androidaps/queue/commands/CommandTempBasalPercent;", "app_fullRelease"})
@dagger.Module()
public abstract class CommandQueueModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.CommandQueue commandQueueInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandBolus commandBolusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandCancelExtendedBolus commandCancelExtendedBolusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandCancelTempBasal commandCancelTempBasalInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandExtendedBolus commandExtendedBolusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandInsightSetTBROverNotification commandInsightSetTBROverNotificationInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandLoadEvents commandLoadEventsInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandLoadHistory commandLoadHistoryInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandLoadTDDs commandLoadTDDsInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandReadStatus commandReadStatusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandSetProfile commandSetProfileInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandSMBBolus commandCommandSMBBolusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandStartPump commandStartPumpInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandStopPump commandStopPumpInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandTempBasalAbsolute commandTempBasalAbsoluteInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandTempBasalPercent commandTempBasalPercentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandSetUserSettings commandSetUserSettingsInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.queue.commands.CommandCustomCommand commandCustomCommandInjector();
    
    public CommandQueueModule() {
        super();
    }
}