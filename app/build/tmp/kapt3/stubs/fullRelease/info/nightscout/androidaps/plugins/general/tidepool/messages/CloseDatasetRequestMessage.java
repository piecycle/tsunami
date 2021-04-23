package info.nightscout.androidaps.plugins.general.tidepool.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/CloseDatasetRequestMessage;", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/BaseMessage;", "()V", "dataState", "", "getDataState$app_fullRelease", "()Ljava/lang/String;", "setDataState$app_fullRelease", "(Ljava/lang/String;)V", "app_fullRelease"})
public final class CloseDatasetRequestMessage extends info.nightscout.androidaps.plugins.general.tidepool.messages.BaseMessage {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String dataState = "closed";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDataState$app_fullRelease() {
        return null;
    }
    
    public final void setDataState$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CloseDatasetRequestMessage() {
        super();
    }
}