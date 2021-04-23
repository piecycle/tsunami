package info.nightscout.androidaps.plugins.general.maintenance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0016J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0002J(\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0014H\u0002J \u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u001c\u0010+\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/maintenance/MaintenancePlugin;", "Linfo/nightscout/androidaps/interfaces/PluginBase;", "injector", "Ldagger/android/HasAndroidInjector;", "context", "Landroid/content/Context;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "nsSettingsStatus", "Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "config", "Linfo/nightscout/androidaps/Config;", "(Ldagger/android/HasAndroidInjector;Landroid/content/Context;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSSettingsStatus;Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;Linfo/nightscout/androidaps/Config;)V", "constructName", "", "deleteLogs", "", "getLogFiles", "", "Ljava/io/File;", "directory", "amount", "", "preprocessPreferences", "preferenceFragment", "Landroidx/preference/PreferenceFragmentCompat;", "sendLogs", "sendMail", "Landroid/content/Intent;", "attachmentUri", "Landroid/net/Uri;", "recipient", "subject", "body", "zip", "zipFile", "files", "zipLogs", "app_fullRelease"})
@javax.inject.Singleton()
public final class MaintenancePlugin extends info.nightscout.androidaps.interfaces.PluginBase {
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.data.NSSettingsStatus nsSettingsStatus = null;
    private final info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper = null;
    private final info.nightscout.androidaps.Config config = null;
    
    public final void sendLogs() {
    }
    
    public final void deleteLogs() {
    }
    
    /**
     * returns a list of log files. The number of returned logs is given via the amount
     * parameter.
     *
     * The log files are sorted by the name descending.
     *
     * @param directory
     * @param amount
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.io.File> getLogFiles(@org.jetbrains.annotations.NotNull()
    java.lang.String directory, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File zipLogs(@org.jetbrains.annotations.NotNull()
    java.io.File zipFile, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.io.File> files) {
        return null;
    }
    
    /**
     * construct the name of zip file which is used to export logs.
     *
     * The name is constructed using the following scheme:
     * AndroidAPS_LOG_ + Long Time + .log.zip
     *
     * @return
     */
    private final java.lang.String constructName() {
        return null;
    }
    
    private final void zip(java.io.File zipFile, java.util.List<? extends java.io.File> files) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final android.content.Intent sendMail(android.net.Uri attachmentUri, java.lang.String recipient, java.lang.String subject) {
        return null;
    }
    
    /**
     * send a mail with the given file to the recipients with the given subject.
     *
     * the returned intent should be used to really send the mail using
     *
     * startActivity(Intent.createChooser(emailIntent , "Send email..."));
     *
     * @param attachmentUri
     * @param recipient
     * @param subject
     * @param body
     *
     * @return
     */
    private final android.content.Intent sendMail(android.net.Uri attachmentUri, java.lang.String recipient, java.lang.String subject, java.lang.String body) {
        return null;
    }
    
    @java.lang.Override()
    public void preprocessPreferences(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat preferenceFragment) {
    }
    
    @javax.inject.Inject()
    public MaintenancePlugin(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.data.NSSettingsStatus nsSettingsStatus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super(null, null, null, null);
    }
}