package info.nightscout.androidaps.plugins.general.tidepool.comm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/InfoInterceptor;", "Lokhttp3/Interceptor;", "tag", "", "aapsLogger", "Linfo/nightscout/androidaps/logging/AAPSLogger;", "(Ljava/lang/String;Linfo/nightscout/androidaps/logging/AAPSLogger;)V", "getAapsLogger", "()Linfo/nightscout/androidaps/logging/AAPSLogger;", "getTag", "()Ljava/lang/String;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_fullRelease"})
public final class InfoInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tag = null;
    @org.jetbrains.annotations.NotNull()
    private final info.nightscout.androidaps.logging.AAPSLogger aapsLogger = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.logging.AAPSLogger getAapsLogger() {
        return null;
    }
    
    public InfoInterceptor(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.logging.AAPSLogger aapsLogger) {
        super();
    }
}