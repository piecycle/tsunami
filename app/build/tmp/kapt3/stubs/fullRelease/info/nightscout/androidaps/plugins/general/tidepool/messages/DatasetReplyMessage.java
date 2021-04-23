package info.nightscout.androidaps.plugins.general.tidepool.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\nR \u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;", "", "()V", "data", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Data;", "getData$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Data;", "setData$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Data;)V", "id", "", "getId$app_fullRelease", "()Ljava/lang/String;", "setId$app_fullRelease", "(Ljava/lang/String;)V", "uploadId", "getUploadId$app_fullRelease", "setUploadId$app_fullRelease", "getUploadId", "Client", "Data", "app_fullRelease"})
public final class DatasetReplyMessage {
    @org.jetbrains.annotations.Nullable()
    private info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Data data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String uploadId;
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Data getData$app_fullRelease() {
        return null;
    }
    
    public final void setData$app_fullRelease(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Data p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId$app_fullRelease() {
        return null;
    }
    
    public final void setId$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUploadId$app_fullRelease() {
        return null;
    }
    
    public final void setUploadId$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUploadId() {
        return null;
    }
    
    public DatasetReplyMessage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001aX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001aX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001eR\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001c\u0010+\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001c\u00101\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001a\u00104\u001a\u000205X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001c\u0010=\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001c\u0010@\u001a\u0004\u0018\u00010\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000f\u00a8\u0006C"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Data;", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;)V", "client", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Client;", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;", "getClient$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Client;", "setClient$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Client;)V", "computerTime", "", "getComputerTime$app_fullRelease", "()Ljava/lang/String;", "setComputerTime$app_fullRelease", "(Ljava/lang/String;)V", "createdTime", "getCreatedTime$app_fullRelease", "setCreatedTime$app_fullRelease", "dataSetType", "getDataSetType$app_fullRelease", "setDataSetType$app_fullRelease", "deviceId", "getDeviceId$app_fullRelease", "setDeviceId$app_fullRelease", "deviceManufacturers", "", "getDeviceManufacturers$app_fullRelease", "()Ljava/util/List;", "setDeviceManufacturers$app_fullRelease", "(Ljava/util/List;)V", "deviceModel", "getDeviceModel$app_fullRelease", "setDeviceModel$app_fullRelease", "deviceSerialNumber", "getDeviceSerialNumber$app_fullRelease", "setDeviceSerialNumber$app_fullRelease", "deviceTags", "getDeviceTags$app_fullRelease", "setDeviceTags$app_fullRelease", "id", "getId$app_fullRelease", "setId$app_fullRelease", "time", "getTime$app_fullRelease", "setTime$app_fullRelease", "timeProcessing", "getTimeProcessing$app_fullRelease", "setTimeProcessing$app_fullRelease", "timezone", "getTimezone$app_fullRelease", "setTimezone$app_fullRelease", "timezoneOffset", "", "getTimezoneOffset$app_fullRelease", "()I", "setTimezoneOffset$app_fullRelease", "(I)V", "type", "getType$app_fullRelease", "setType$app_fullRelease", "uploadId", "getUploadId$app_fullRelease", "setUploadId$app_fullRelease", "version", "getVersion$app_fullRelease", "setVersion$app_fullRelease", "app_fullRelease"})
    public final class Data {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createdTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String deviceId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String time;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String timezone;
        private int timezoneOffset = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String type;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String uploadId;
        @org.jetbrains.annotations.Nullable()
        private info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Client client;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String computerTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String dataSetType;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> deviceManufacturers;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String deviceModel;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String deviceSerialNumber;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> deviceTags;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String timeProcessing;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String version;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreatedTime$app_fullRelease() {
            return null;
        }
        
        public final void setCreatedTime$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeviceId$app_fullRelease() {
            return null;
        }
        
        public final void setDeviceId$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId$app_fullRelease() {
            return null;
        }
        
        public final void setId$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTime$app_fullRelease() {
            return null;
        }
        
        public final void setTime$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimezone$app_fullRelease() {
            return null;
        }
        
        public final void setTimezone$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getTimezoneOffset$app_fullRelease() {
            return 0;
        }
        
        public final void setTimezoneOffset$app_fullRelease(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType$app_fullRelease() {
            return null;
        }
        
        public final void setType$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUploadId$app_fullRelease() {
            return null;
        }
        
        public final void setUploadId$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Client getClient$app_fullRelease() {
            return null;
        }
        
        public final void setClient$app_fullRelease(@org.jetbrains.annotations.Nullable()
        info.nightscout.androidaps.plugins.general.tidepool.messages.DatasetReplyMessage.Client p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getComputerTime$app_fullRelease() {
            return null;
        }
        
        public final void setComputerTime$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDataSetType$app_fullRelease() {
            return null;
        }
        
        public final void setDataSetType$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getDeviceManufacturers$app_fullRelease() {
            return null;
        }
        
        public final void setDeviceManufacturers$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeviceModel$app_fullRelease() {
            return null;
        }
        
        public final void setDeviceModel$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeviceSerialNumber$app_fullRelease() {
            return null;
        }
        
        public final void setDeviceSerialNumber$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getDeviceTags$app_fullRelease() {
            return null;
        }
        
        public final void setDeviceTags$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTimeProcessing$app_fullRelease() {
            return null;
        }
        
        public final void setTimeProcessing$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVersion$app_fullRelease() {
            return null;
        }
        
        public final void setVersion$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Data() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage$Client;", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/messages/DatasetReplyMessage;)V", "name", "", "getName$app_fullRelease", "()Ljava/lang/String;", "setName$app_fullRelease", "(Ljava/lang/String;)V", "version", "getVersion$app_fullRelease", "setVersion$app_fullRelease", "app_fullRelease"})
    public final class Client {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String version;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName$app_fullRelease() {
            return null;
        }
        
        public final void setName$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVersion$app_fullRelease() {
            return null;
        }
        
        public final void setVersion$app_fullRelease(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Client() {
            super();
        }
    }
}