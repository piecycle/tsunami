package info.nightscout.androidaps.plugins.general.tidepool.comm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\'J<\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/comm/TidepoolApiService;", "", "closeDataSet", "Lretrofit2/Call;", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;", "token", "", "id", "body", "Lokhttp3/RequestBody;", "deleteAllData", "deleteDataSet", "doUpload", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/UploadReplyMessage;", "getDataSet", "getLogin", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthReplyMessage;", "secret", "getOpenDataSets", "", "clientName", "size", "", "openDataSet", "app_fullRelease"})
public abstract interface TidepoolApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/login")
    @retrofit2.http.Headers(value = {"User-Agent: AAPS- 2.8.2-UAM_tsunami_0.5", "X-Tidepool-Client-Name: info.nightscout.androidapsinfo.nightscout.androidaps", "X-Tidepool-Client-Version: 0.1.0"})
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.AuthReplyMessage> getLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String secret);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/v1/users/{userId}/data")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage> deleteAllData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/v1/datasets/{dataSetId}")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage> deleteDataSet(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "dataSetId")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v1/users/{userId}/data_sets")
    public abstract retrofit2.Call<java.util.List<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage>> getOpenDataSets(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client.name")
    java.lang.String clientName, @retrofit2.http.Query(value = "size")
    int size);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v1/datasets/{dataSetId}")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage> getDataSet(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "dataSetId")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/users/{userId}/data_sets")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage> openDataSet(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/datasets/{sessionId}/data")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.UploadReplyMessage> doUpload(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "sessionId")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/v1/datasets/{sessionId}")
    public abstract retrofit2.Call<info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage> closeDataSet(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-tidepool-session-token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "sessionId")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
}