package info.nightscout.androidaps.dependencyInjection;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'\u00a8\u0006\u001f"}, d2 = {"Linfo/nightscout/androidaps/dependencyInjection/WizardModule;", "", "()V", "swBreakInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWBreak;", "swButtonInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWButton;", "swEditEncryptedPasswordInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWEditEncryptedPassword;", "swEditNumberWithUnitsInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWEditNumberWithUnits;", "swEditStringInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWEditString;", "swEditUrlInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWEditUrl;", "swEventListenerInjector", "Linfo/nightscout/androidaps/setupwizard/SWEventListener;", "swFragmentInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWFragment;", "swHtmlLinkInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWHtmlLink;", "swInfotextInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWInfotext;", "swItemInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWItem;", "swPluginInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWPlugin;", "swRadioButtonInjector", "Linfo/nightscout/androidaps/setupwizard/elements/SWRadioButton;", "swScreenInjector", "Linfo/nightscout/androidaps/setupwizard/SWScreen;", "app_fullRelease"})
@dagger.Module()
public abstract class WizardModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWBreak swBreakInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWButton swButtonInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWEditNumberWithUnits swEditNumberWithUnitsInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWEditString swEditStringInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWEditEncryptedPassword swEditEncryptedPasswordInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWEditUrl swEditUrlInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWFragment swFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWHtmlLink swHtmlLinkInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWInfotext swInfotextInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWItem swItemInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWPlugin swPluginInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.elements.SWRadioButton swRadioButtonInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.SWScreen swScreenInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract info.nightscout.androidaps.setupwizard.SWEventListener swEventListenerInjector();
    
    public WizardModule() {
        super();
    }
}