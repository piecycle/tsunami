package info.nightscout.androidaps.plugins.general.tidepool.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/events/EventTidepoolStatus;", "Linfo/nightscout/androidaps/events/Event;", "status", "", "(Ljava/lang/String;)V", "date", "", "getDate", "()J", "setDate", "(J)V", "getStatus", "()Ljava/lang/String;", "timeFormat", "Ljava/text/SimpleDateFormat;", "toPreparedHtml", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "app_fullRelease"})
public final class EventTidepoolStatus extends info.nightscout.androidaps.events.Event {
    private long date;
    private java.text.SimpleDateFormat timeFormat;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder toPreparedHtml() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public EventTidepoolStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        super();
    }
}