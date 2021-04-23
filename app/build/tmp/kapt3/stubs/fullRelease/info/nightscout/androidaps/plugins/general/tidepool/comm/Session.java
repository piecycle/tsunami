package info.nightscout.androidaps.plugins.general.tidepool.comm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001J\u000e\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u000200R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010*\u00a8\u00061"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/Session;", "", "authHeader", "", "sessionTokenHeader", "service", "Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolApiService;", "(Ljava/lang/String;Ljava/lang/String;Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolApiService;)V", "getAuthHeader", "()Ljava/lang/String;", "authReply", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthReplyMessage;", "getAuthReply$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthReplyMessage;", "setAuthReply$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthReplyMessage;)V", "datasetReply", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;", "getDatasetReply$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;", "setDatasetReply$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;)V", "end", "", "getEnd$app_fullRelease", "()J", "setEnd$app_fullRelease", "(J)V", "iterations", "", "getIterations$app_fullRelease", "()I", "setIterations$app_fullRelease", "(I)V", "getService", "()Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolApiService;", "start", "getStart$app_fullRelease", "setStart$app_fullRelease", "token", "getToken$app_fullRelease", "setToken$app_fullRelease", "(Ljava/lang/String;)V", "populateBody", "", "obj", "populateHeaders", "headers", "Lokhttp3/Headers;", "app_fullRelease"})
public final class Session {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.tidepool.messages.AuthReplyMessage authReply;
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage datasetReply;
    private long start = 0L;
    private long end = 0L;
    private volatile int iterations = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String authHeader = null;
    private final java.lang.String sessionTokenHeader = null;
    @org.jetbrains.annotations.Nullable()
    private final info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolApiService service = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken$app_fullRelease() {
        return null;
    }
    
    public final void setToken$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.messages.AuthReplyMessage getAuthReply$app_fullRelease() {
        return null;
    }
    
    public final void setAuthReply$app_fullRelease(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.messages.AuthReplyMessage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage getDatasetReply$app_fullRelease() {
        return null;
    }
    
    public final void setDatasetReply$app_fullRelease(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage p0) {
    }
    
    public final long getStart$app_fullRelease() {
        return 0L;
    }
    
    public final void setStart$app_fullRelease(long p0) {
    }
    
    public final long getEnd$app_fullRelease() {
        return 0L;
    }
    
    public final void setEnd$app_fullRelease(long p0) {
    }
    
    public final int getIterations$app_fullRelease() {
        return 0;
    }
    
    public final void setIterations$app_fullRelease(int p0) {
    }
    
    public final void populateHeaders(@org.jetbrains.annotations.NotNull()
    okhttp3.Headers headers) {
    }
    
    public final void populateBody(@org.jetbrains.annotations.Nullable()
    java.lang.Object obj) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolApiService getService() {
        return null;
    }
    
    public Session(@org.jetbrains.annotations.Nullable()
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionTokenHeader, @org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.comm.TidepoolApiService service) {
        super();
    }
}