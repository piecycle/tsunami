package info.nightscout.androidaps.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/utils/Profiler;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "log", "", "lTag", "Linfo/nightscout/androidaps/logging/LTag;", "function", "", "start", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class Profiler {
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    
    public final void log(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.LTag lTag, @org.jetbrains.annotations.NotNull()
    java.lang.String function, long start) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    @javax.inject.Inject()
    public Profiler(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super();
    }
}