package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/DataClassesModule;", "", "()V", "DatabaseHelperInjector", "Linfo/nightscout/androidaps/db/DatabaseHelper;", "bolusWizardInjector", "Linfo/nightscout/androidaps/utils/wizard/BolusWizard;", "foodServiceInjector", "Linfo/nightscout/androidaps/plugins/general/food/FoodService;", "glucoseStatusInjector", "Linfo/nightscout/androidaps/plugins/iob/iobCobCalculator/GlucoseStatus;", "quickWizardEntryInjector", "Linfo/nightscout/androidaps/utils/wizard/QuickWizardEntry;", "treatmentServiceInjector", "Linfo/nightscout/androidaps/plugins/treatments/TreatmentService;", "app_fullRelease"})
@dagger.Module()
public abstract class DataClassesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.iob.iobCobCalculator.GlucoseStatus glucoseStatusInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.db.DatabaseHelper DatabaseHelperInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.treatments.TreatmentService treatmentServiceInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.plugins.general.food.FoodService foodServiceInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.utils.wizard.BolusWizard bolusWizardInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.utils.wizard.QuickWizardEntry quickWizardEntryInjector();
    
    public DataClassesModule() {
        super();
    }
}