package info.nightscout.androidaps.plugins.general.nsclient.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/nsclient/events/EventNSClientStatus;", "Linfo/nightscout/androidaps/events/EventStatus;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "getStatus", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "app_fullRelease"})
public final class EventNSClientStatus extends info.nightscout.androidaps.events.EventStatus {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String text;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getStatus(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public EventNSClientStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        super();
    }
}