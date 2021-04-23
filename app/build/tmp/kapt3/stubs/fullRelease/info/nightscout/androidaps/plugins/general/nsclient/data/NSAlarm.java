package info.nightscout.androidaps.plugins.general.nsclient.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/nsclient/data/NSAlarm;", "", "data", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "group", "", "high", "", "level", "", "low", "message", "timeago", "title", "app_fullRelease"})
public final class NSAlarm {
    private org.json.JSONObject data;
    
    public final int level() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String group() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String message() {
        return null;
    }
    
    public final boolean low() {
        return false;
    }
    
    public final boolean high() {
        return false;
    }
    
    public final boolean timeago() {
        return false;
    }
    
    public NSAlarm(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject data) {
        super();
    }
}