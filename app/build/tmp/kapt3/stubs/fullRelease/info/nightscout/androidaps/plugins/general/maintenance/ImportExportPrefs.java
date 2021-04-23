package info.nightscout.androidaps.plugins.general.maintenance;

import java.lang.System;

/**
 * Created by mike on 03.07.2016.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018Jd\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001e2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u001a0#H\u0002\u00a2\u0006\u0002\u0010(J=\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u001a0#H\u0002J=\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u001a0#H\u0002J;\u0010+\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u001a0#H\u0002J;\u0010.\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010/\u001a\u0002002!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u001a0#H\u0002J\u001a\u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u00103\u001a\u00020\u001eH\u0002J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010?\u001a\u000200H\u0016J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0016J\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C2\u0006\u00108\u001a\u000209H\u0002Jh\u0010F\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00105\u001a\u0002062\u0006\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020I2\u0006\u0010?\u001a\u00020026\u0010\"\u001a2\u0012\u0013\u0012\u001106\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(5\u0012\u0013\u0012\u001102\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\u001a0JH\u0002J\u0010\u0010K\u001a\u00020\u001a2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010L\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020<2\u0006\u0010M\u001a\u00020NH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/maintenance/ImportExportPrefs;", "Linfo/nightscout/androidaps/interfaces/ImportExportPrefsInterface;", "log", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "buildHelper", "Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "passwordCheck", "Linfo/nightscout/androidaps/utils/protection/PasswordCheck;", "config", "Linfo/nightscout/androidaps/interfaces/ConfigInterface;", "androidPermission", "Linfo/nightscout/androidaps/utils/AndroidPermission;", "classicPrefsFormat", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/ClassicPrefsFormat;", "encryptedPrefsFormat", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/EncryptedPrefsFormat;", "prefFileList", "Linfo/nightscout/androidaps/plugins/general/maintenance/PrefFileListProvider;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/protection/PasswordCheck;Linfo/nightscout/androidaps/interfaces/ConfigInterface;Linfo/nightscout/androidaps/utils/AndroidPermission;Linfo/nightscout/androidaps/plugins/general/maintenance/formats/ClassicPrefsFormat;Linfo/nightscout/androidaps/plugins/general/maintenance/formats/EncryptedPrefsFormat;Linfo/nightscout/androidaps/plugins/general/maintenance/PrefFileListProvider;)V", "askForEncryptionPass", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "canceledMsg", "", "passwordName", "passwordExplanation", "passwordWarning", "then", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "password", "(Landroidx/fragment/app/FragmentActivity;IILjava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "askForMasterPass", "askForMasterPassIfNeeded", "askToConfirmExport", "fileToExport", "Ljava/io/File;", "askToConfirmImport", "fileToImport", "Linfo/nightscout/androidaps/plugins/general/maintenance/PrefsFile;", "assureMasterPasswordSet", "", "wrongPwdTitle", "checkIfImportIsOk", "prefs", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/Prefs;", "detectUserName", "context", "Landroid/content/Context;", "exportSharedPreferences", "f", "Landroidx/fragment/app/Fragment;", "importSharedPreferences", "fragment", "importFile", "prefsEncryptionIsDisabled", "prefsFileExists", "prepareMetadata", "", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/PrefsMetadataKey;", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/PrefMetadata;", "promptForDecryptionPasswordIfNeeded", "importOk", "format", "Linfo/nightscout/androidaps/plugins/general/maintenance/formats/PrefsFormat;", "Lkotlin/Function2;", "restartAppAfterImport", "verifyStoragePermissions", "onGranted", "Ljava/lang/Runnable;", "app_fullRelease"})
@javax.inject.Singleton()
public final class ImportExportPrefs implements info.nightscout.androidaps.interfaces.ImportExportPrefsInterface {
    private info.nightscout.androidaps.logging.AAPSLogger log;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.protection.PasswordCheck passwordCheck = null;
    private final info.nightscout.androidaps.interfaces.ConfigInterface config = null;
    private final info.nightscout.androidaps.utils.AndroidPermission androidPermission = null;
    private final info.nightscout.androidaps.plugins.general.maintenance.formats.ClassicPrefsFormat classicPrefsFormat = null;
    private final info.nightscout.androidaps.plugins.general.maintenance.formats.EncryptedPrefsFormat encryptedPrefsFormat = null;
    private final info.nightscout.androidaps.plugins.general.maintenance.PrefFileListProvider prefFileList = null;
    
    @java.lang.Override()
    public boolean prefsFileExists() {
        return false;
    }
    
    @java.lang.Override()
    public void exportSharedPreferences(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment f) {
    }
    
    @java.lang.Override()
    public void verifyStoragePermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable onGranted) {
    }
    
    private final java.util.Map<info.nightscout.androidaps.plugins.general.maintenance.formats.PrefsMetadataKey, info.nightscout.androidaps.plugins.general.maintenance.formats.PrefMetadata> prepareMetadata(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String detectUserName(android.content.Context context) {
        return null;
    }
    
    private final boolean prefsEncryptionIsDisabled() {
        return false;
    }
    
    private final void askForMasterPass(androidx.fragment.app.FragmentActivity activity, @androidx.annotation.StringRes()
    int canceledMsg, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> then) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void askForEncryptionPass(androidx.fragment.app.FragmentActivity activity, @androidx.annotation.StringRes()
    int canceledMsg, @androidx.annotation.StringRes()
    int passwordName, @androidx.annotation.StringRes()
    java.lang.Integer passwordExplanation, @androidx.annotation.StringRes()
    java.lang.Integer passwordWarning, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> then) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void askForMasterPassIfNeeded(androidx.fragment.app.FragmentActivity activity, @androidx.annotation.StringRes()
    int canceledMsg, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> then) {
    }
    
    private final boolean assureMasterPasswordSet(androidx.fragment.app.FragmentActivity activity, @androidx.annotation.StringRes()
    int wrongPwdTitle) {
        return false;
    }
    
    private final void askToConfirmExport(androidx.fragment.app.FragmentActivity activity, java.io.File fileToExport, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> then) {
    }
    
    private final void askToConfirmImport(androidx.fragment.app.FragmentActivity activity, info.nightscout.androidaps.plugins.general.maintenance.PrefsFile fileToImport, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> then) {
    }
    
    private final void promptForDecryptionPasswordIfNeeded(androidx.fragment.app.FragmentActivity activity, info.nightscout.androidaps.plugins.general.maintenance.formats.Prefs prefs, boolean importOk, info.nightscout.androidaps.plugins.general.maintenance.formats.PrefsFormat format, info.nightscout.androidaps.plugins.general.maintenance.PrefsFile importFile, kotlin.jvm.functions.Function2<? super info.nightscout.androidaps.plugins.general.maintenance.formats.Prefs, ? super java.lang.Boolean, kotlin.Unit> then) {
    }
    
    private final void exportSharedPreferences(androidx.fragment.app.FragmentActivity activity) {
    }
    
    @java.lang.Override()
    public void importSharedPreferences(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void importSharedPreferences(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    @java.lang.Override()
    public void importSharedPreferences(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.PrefsFile importFile) {
    }
    
    private final boolean checkIfImportIsOk(info.nightscout.androidaps.plugins.general.maintenance.formats.Prefs prefs) {
        return false;
    }
    
    private final void restartAppAfterImport(android.content.Context context) {
    }
    
    @javax.inject.Inject()
    public ImportExportPrefs(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger log, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.buildHelper.BuildHelper buildHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.protection.PasswordCheck passwordCheck, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ConfigInterface config, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.AndroidPermission androidPermission, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.formats.ClassicPrefsFormat classicPrefsFormat, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.formats.EncryptedPrefsFormat encryptedPrefsFormat, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.maintenance.PrefFileListProvider prefFileList) {
        super();
    }
}