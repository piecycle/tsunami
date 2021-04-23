package info.nightscout.androidaps.plugins.general.openhumans;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0006*+,-./B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u0003J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001f\u001a\u00020\u0003J\u001e\u0010 \u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00160\u00160\u00152\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\'J\u001a\u0010(\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\r0\r0\u0015*\u00020)H\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00060"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI;", "", "baseUrl", "", "clientId", "clientSecret", "redirectUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "authHeader", "client", "Lokhttp3/OkHttpClient;", "jsonBody", "Lorg/json/JSONObject;", "Lokhttp3/Response;", "getJsonBody", "(Lokhttp3/Response;)Lorg/json/JSONObject;", "completeFileUpload", "Lio/reactivex/Completable;", "accessToken", "fileId", "exchangeAuthToken", "Lio/reactivex/Single;", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OAuthTokens;", "code", "getProjectMemberId", "prepareFileUpload", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$PreparedUpload;", "fileName", "metadata", "Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;", "refreshAccessToken", "refreshToken", "sendTokenRequest", "kotlin.jvm.PlatformType", "body", "Lokhttp3/FormBody;", "uploadFile", "url", "content", "", "toSingle", "Lokhttp3/Request;", "Companion", "FileMetadata", "OAuthTokens", "OHHttpException", "OHMissingFieldException", "PreparedUpload", "app_fullRelease"})
public final class OpenHumansAPI {
    private final java.lang.String authHeader = null;
    private final okhttp3.OkHttpClient client = null;
    private final java.lang.String baseUrl = null;
    private final java.lang.String redirectUri = null;
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private static final java.text.SimpleDateFormat iso8601DateFormatter = null;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens> exchangeAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens> refreshAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
        return null;
    }
    
    private final io.reactivex.Single<info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens> sendTokenRequest(okhttp3.FormBody body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> getProjectMemberId(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.PreparedUpload> prepareFileUpload(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.FileMetadata metadata) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadFile(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    byte[] content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable completeFileUpload(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String fileId) {
        return null;
    }
    
    private final io.reactivex.Single<okhttp3.Response> toSingle(okhttp3.Request $this$toSingle) {
        return null;
    }
    
    private final org.json.JSONObject getJsonBody(okhttp3.Response $this$jsonBody) {
        return null;
    }
    
    public OpenHumansAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String redirectUri) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OAuthTokens;", "", "accessToken", "", "refreshToken", "expiresAt", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresAt", "()J", "getRefreshToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fullRelease"})
    public static final class OAuthTokens {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String accessToken = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String refreshToken = null;
        private final long expiresAt = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccessToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRefreshToken() {
            return null;
        }
        
        public final long getExpiresAt() {
            return 0L;
        }
        
        public OAuthTokens(@org.jetbrains.annotations.NotNull()
        java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
        java.lang.String refreshToken, long expiresAt) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OAuthTokens copy(@org.jetbrains.annotations.NotNull()
        java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
        java.lang.String refreshToken, long expiresAt) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJX\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u0004H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;", "", "tags", "", "", "description", "md5", "creationDate", "", "startDate", "endDate", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCreationDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDescription", "()Ljava/lang/String;", "getEndDate", "getMd5", "getStartDate", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$FileMetadata;", "equals", "", "other", "hashCode", "", "toJSON", "Lorg/json/JSONObject;", "toString", "app_fullRelease"})
    public static final class FileMetadata {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> tags = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String md5 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long creationDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long startDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long endDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.json.JSONObject toJSON() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getTags() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMd5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getCreationDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getStartDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getEndDate() {
            return null;
        }
        
        public FileMetadata(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String md5, @org.jetbrains.annotations.Nullable()
        java.lang.Long creationDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long startDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long endDate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.FileMetadata copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String md5, @org.jetbrains.annotations.Nullable()
        java.lang.Long creationDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long startDate, @org.jetbrains.annotations.Nullable()
        java.lang.Long endDate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$PreparedUpload;", "", "fileId", "", "uploadURL", "(Ljava/lang/String;Ljava/lang/String;)V", "getFileId", "()Ljava/lang/String;", "getUploadURL", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fullRelease"})
    public static final class PreparedUpload {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fileId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String uploadURL = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFileId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUploadURL() {
            return null;
        }
        
        public PreparedUpload(@org.jetbrains.annotations.NotNull()
        java.lang.String fileId, @org.jetbrains.annotations.NotNull()
        java.lang.String uploadURL) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.PreparedUpload copy(@org.jetbrains.annotations.NotNull()
        java.lang.String fileId, @org.jetbrains.annotations.NotNull()
        java.lang.String uploadURL) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u001a"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OHHttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "meaning", "", "detail", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getDetail", "()Ljava/lang/String;", "getMeaning", "message", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_fullRelease"})
    public static final class OHHttpException extends java.lang.RuntimeException {
        private final int code = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String meaning = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String detail = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getMessage() {
            return null;
        }
        
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMeaning() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetail() {
            return null;
        }
        
        public OHHttpException(int code, @org.jetbrains.annotations.NotNull()
        java.lang.String meaning, @org.jetbrains.annotations.Nullable()
        java.lang.String detail) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OHHttpException copy(int code, @org.jetbrains.annotations.NotNull()
        java.lang.String meaning, @org.jetbrains.annotations.Nullable()
        java.lang.String detail) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$OHMissingFieldException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "name", "", "(Ljava/lang/String;)V", "message", "getMessage", "()Ljava/lang/String;", "getName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_fullRelease"})
    public static final class OHMissingFieldException extends java.lang.RuntimeException {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public OHMissingFieldException(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final info.nightscout.androidaps.plugins.general.openhumans.OpenHumansAPI.OHMissingFieldException copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/openhumans/OpenHumansAPI$Companion;", "", "()V", "iso8601DateFormatter", "Ljava/text/SimpleDateFormat;", "app_fullRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}