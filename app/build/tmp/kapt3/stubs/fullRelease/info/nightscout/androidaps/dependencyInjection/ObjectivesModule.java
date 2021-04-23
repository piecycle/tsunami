package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/ObjectivesModule;", "", "()V", "objective0Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective0;", "objective10Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective10;", "objective1Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective1;", "objective2Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective2;", "objective3Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective3;", "objective4Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective4;", "objective5Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective5;", "objective6Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective6;", "objective7Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective7;", "objective8Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective8;", "objective9Injector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective9;", "objectiveInjector", "Linfo/nightscout/androidaps/plugins/constraints/objectives/objectives/Objective;", "app_fullRelease"})
@dagger.Module()
public abstract class ObjectivesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective objectiveInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective0 objective0Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective1 objective1Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective2 objective2Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective3 objective3Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective4 objective4Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective5 objective5Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective6 objective6Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective7 objective7Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective8 objective8Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective9 objective9Injector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.constraints.objectives.objectives.Objective10 objective10Injector();
    
    public ObjectivesModule() {
        super();
    }
}