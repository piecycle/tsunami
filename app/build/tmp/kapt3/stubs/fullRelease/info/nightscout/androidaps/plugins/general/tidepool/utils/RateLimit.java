package info.nightscout.androidaps.plugins.general.tidepool.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/utils/RateLimit;", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "rateLimits", "Ljava/util/HashMap;", "", "", "rateLimit", "", "name", "seconds", "", "app_fullRelease"})
@javax.inject.Singleton()
public final class RateLimit {
    private final java.util.HashMap<java.lang.String, java.lang.Long> rateLimits = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    
    public final synchronized boolean rateLimit(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int seconds) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    @javax.inject.Inject()
    public RateLimit(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super();
    }
}