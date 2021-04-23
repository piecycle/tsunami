package info.nightscout.androidaps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ(\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"J\b\u0010J\u001a\u00020\u0010H\u0002J\u0006\u0010K\u001a\u00020\"J\u0006\u0010L\u001a\u00020\"J\u0006\u0010M\u001a\u00020\"J\u0006\u0010N\u001a\u00020\"J\u0006\u0010O\u001a\u00020\"J\u0006\u0010P\u001a\u00020\"J\u0006\u0010Q\u001a\u00020\"J\u0006\u0010R\u001a\u00020\"J(\u0010S\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"R\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0014\u0010\'\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0011\u0010+\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0014\u0010-\u001a\u00020\"X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0012R\u0014\u00101\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0012R\u0014\u00103\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0012R\u0011\u00105\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0011\u0010;\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0011\u0010=\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u0011\u0010?\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0011\u0010A\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Linfo/nightscout/androidaps/utils/HardLimits;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "rxBus", "Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "context", "Landroid/content/Context;", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;Linfo/nightscout/androidaps/plugins/bus/RxBusWrapper;Linfo/nightscout/androidaps/utils/sharedPreferences/SP;Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Landroid/content/Context;Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "ADULT", "", "getADULT", "()I", "CHILD", "getCHILD", "MAXBASAL", "", "getMAXBASAL", "()[D", "MAXBOLUS", "getMAXBOLUS", "MAXDIA", "getMAXDIA", "MAXIC", "getMAXIC", "MAXIOB_AMA", "getMAXIOB_AMA", "MAXIOB_LGS", "", "getMAXIOB_LGS", "()D", "MAXIOB_SMB", "getMAXIOB_SMB", "MAXISF", "getMAXISF", "MINDIA", "getMINDIA", "MINIC", "getMINIC", "MINISF", "getMINISF", "PREGNANT", "getPREGNANT", "RESISTANTADULT", "getRESISTANTADULT", "TEENAGE", "getTEENAGE", "VERY_HARD_LIMIT_MAX_BG", "", "getVERY_HARD_LIMIT_MAX_BG", "()[I", "VERY_HARD_LIMIT_MIN_BG", "getVERY_HARD_LIMIT_MIN_BG", "VERY_HARD_LIMIT_TARGET_BG", "getVERY_HARD_LIMIT_TARGET_BG", "VERY_HARD_LIMIT_TEMP_MAX_BG", "getVERY_HARD_LIMIT_TEMP_MAX_BG", "VERY_HARD_LIMIT_TEMP_MIN_BG", "getVERY_HARD_LIMIT_TEMP_MIN_BG", "VERY_HARD_LIMIT_TEMP_TARGET_BG", "getVERY_HARD_LIMIT_TEMP_TARGET_BG", "checkOnlyHardLimits", "", "value", "valueName", "", "lowLimit", "highLimit", "loadAge", "maxBasal", "maxBolus", "maxDia", "maxIC", "maxIobAMA", "maxIobSMB", "minDia", "minIC", "verifyHardLimits", "app_fullRelease"})
@javax.inject.Singleton()
public final class HardLimits {
    private final int CHILD = 0;
    private final int TEENAGE = 1;
    private final int ADULT = 2;
    private final int RESISTANTADULT = 3;
    private final int PREGNANT = 4;
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXBOLUS = {5.0, 10.0, 17.0, 25.0, 60.0};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_MIN_BG = {72, 180};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_MAX_BG = {90, 270};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_TARGET_BG = {80, 200};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_TEMP_MIN_BG = {72, 180};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_TEMP_MAX_BG = {72, 270};
    @org.jetbrains.annotations.NotNull()
    private final int[] VERY_HARD_LIMIT_TEMP_TARGET_BG = {72, 200};
    @org.jetbrains.annotations.NotNull()
    private final double[] MINDIA = {5.0, 5.0, 5.0, 5.0, 5.0};
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXDIA = {7.0, 7.0, 7.0, 7.0, 10.0};
    @org.jetbrains.annotations.NotNull()
    private final double[] MINIC = {2.0, 2.0, 2.0, 2.0, 0.3};
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXIC = {100.0, 100.0, 100.0, 100.0, 100.0};
    private final double MINISF = 2.0;
    private final double MAXISF = 720.0;
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXIOB_AMA = {3.0, 5.0, 7.0, 12.0, 25.0};
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXIOB_SMB = {3.0, 7.0, 12.0, 25.0, 40.0};
    @org.jetbrains.annotations.NotNull()
    private final double[] MAXBASAL = {2.0, 5.0, 10.0, 12.0, 25.0};
    private final double MAXIOB_LGS = 0.0;
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    private final info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus = null;
    private final info.nightscout.androidaps.utils.sharedPreferences.SP sp = null;
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final android.content.Context context = null;
    private final info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload = null;
    
    public final int getCHILD() {
        return 0;
    }
    
    public final int getTEENAGE() {
        return 0;
    }
    
    public final int getADULT() {
        return 0;
    }
    
    public final int getRESISTANTADULT() {
        return 0;
    }
    
    public final int getPREGNANT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXBOLUS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_MIN_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_MAX_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_TARGET_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_TEMP_MIN_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_TEMP_MAX_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getVERY_HARD_LIMIT_TEMP_TARGET_BG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMINDIA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXDIA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMINIC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXIC() {
        return null;
    }
    
    public final double getMINISF() {
        return 0.0;
    }
    
    public final double getMAXISF() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXIOB_AMA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXIOB_SMB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final double[] getMAXBASAL() {
        return null;
    }
    
    public final double getMAXIOB_LGS() {
        return 0.0;
    }
    
    private final int loadAge() {
        return 0;
    }
    
    public final double maxBolus() {
        return 0.0;
    }
    
    public final double maxIobAMA() {
        return 0.0;
    }
    
    public final double maxIobSMB() {
        return 0.0;
    }
    
    public final double maxBasal() {
        return 0.0;
    }
    
    public final double minDia() {
        return 0.0;
    }
    
    public final double maxDia() {
        return 0.0;
    }
    
    public final double minIC() {
        return 0.0;
    }
    
    public final double maxIC() {
        return 0.0;
    }
    
    public final boolean checkOnlyHardLimits(double value, @org.jetbrains.annotations.Nullable()
    java.lang.String valueName, double lowLimit, double highLimit) {
        return false;
    }
    
    public final double verifyHardLimits(double value, @org.jetbrains.annotations.Nullable()
    java.lang.String valueName, double lowLimit, double highLimit) {
        return 0.0;
    }
    
    @javax.inject.Inject()
    public HardLimits(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.bus.RxBusWrapper rxBus, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.sharedPreferences.SP sp, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload) {
        super();
    }
}