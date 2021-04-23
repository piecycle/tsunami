package info.nightscout.androidaps.utils.stats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/utils/stats/TirCalculator;", "", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "profileFunction", "Linfo/nightscout/androidaps/interfaces/ProfileFunction;", "dateUtil", "Linfo/nightscout/androidaps/utils/DateUtil;", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;Linfo/nightscout/androidaps/interfaces/ProfileFunction;Linfo/nightscout/androidaps/utils/DateUtil;)V", "averageTIR", "Linfo/nightscout/androidaps/utils/stats/TIR;", "tirs", "Landroid/util/LongSparseArray;", "calculate", "days", "", "lowMgdl", "", "highMgdl", "stats", "Landroid/text/Spanned;", "toText", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class TirCalculator {
    private final info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper = null;
    private final info.nightscout.androidaps.interfaces.ProfileFunction profileFunction = null;
    private final info.nightscout.androidaps.utils.DateUtil dateUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.LongSparseArray<info.nightscout.androidaps.utils.stats.TIR> calculate(long days, double lowMgdl, double highMgdl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.stats.TIR averageTIR(@org.jetbrains.annotations.NotNull()
    android.util.LongSparseArray<info.nightscout.androidaps.utils.stats.TIR> tirs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned stats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toText(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    android.util.LongSparseArray<info.nightscout.androidaps.utils.stats.TIR> tirs) {
        return null;
    }
    
    @javax.inject.Inject()
    public TirCalculator(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ProfileFunction profileFunction, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.DateUtil dateUtil) {
        super();
    }
}