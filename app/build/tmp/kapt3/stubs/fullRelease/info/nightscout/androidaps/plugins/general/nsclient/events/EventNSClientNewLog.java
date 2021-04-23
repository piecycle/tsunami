package info.nightscout.androidaps.plugins.general.nsclient.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/nsclient/events/EventNSClientNewLog;", "Linfo/nightscout/androidaps/events/Event;", "action", "", "logText", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getLogText", "setLogText", "timeFormat", "Ljava/text/SimpleDateFormat;", "toPreparedHtml", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "app_fullRelease"})
public final class EventNSClientNewLog extends info.nightscout.androidaps.events.Event {
    @org.jetbrains.annotations.NotNull()
    private java.util.Date date;
    private java.text.SimpleDateFormat timeFormat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String action;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String logText;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder toPreparedHtml() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogText() {
        return null;
    }
    
    public final void setLogText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public EventNSClientNewLog(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    java.lang.String logText) {
        super();
    }
}