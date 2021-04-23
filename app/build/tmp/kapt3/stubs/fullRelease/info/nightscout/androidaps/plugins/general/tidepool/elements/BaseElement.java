package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0018\u00010\rR\u00020\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "", "timestamp", "", "uuid", "", "(JLjava/lang/String;)V", "deviceTime", "getDeviceTime", "()Ljava/lang/String;", "setDeviceTime", "(Ljava/lang/String;)V", "origin", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement$Origin;", "getOrigin", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement$Origin;", "setOrigin", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement$Origin;)V", "time", "getTime", "setTime", "timezoneOffset", "", "getTimezoneOffset", "()I", "setTimezoneOffset", "(I)V", "type", "getType", "setType", "Origin", "app_fullRelease"})
public class BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String deviceTime = "";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String time = "";
    @com.google.gson.annotations.Expose()
    private int timezoneOffset = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement.Origin origin;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceTime() {
        return null;
    }
    
    public final void setDeviceTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTimezoneOffset() {
        return 0;
    }
    
    public final void setTimezoneOffset(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement.Origin getOrigin() {
        return null;
    }
    
    public final void setOrigin(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement.Origin p0) {
    }
    
    public BaseElement(long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement$Origin;", "", "id", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;Ljava/lang/String;)V", "getId$app_fullRelease", "()Ljava/lang/String;", "setId$app_fullRelease", "(Ljava/lang/String;)V", "app_fullRelease"})
    public final class Origin {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.lang.String id;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId$app_fullRelease() {
            return null;
        }
        
        public final void setId$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Origin(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            super();
        }
    }
}