package info.nightscout.androidaps.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/events/EventNewBG;", "Linfo/nightscout/androidaps/events/EventLoop;", "bgReading", "Linfo/nightscout/androidaps/db/BgReading;", "(Linfo/nightscout/androidaps/db/BgReading;)V", "getBgReading", "()Linfo/nightscout/androidaps/db/BgReading;", "app_fullRelease"})
public final class EventNewBG extends info.nightscout.androidaps.events.EventLoop {
    @org.jetbrains.annotations.Nullable()
    private final info.nightscout.androidaps.db.BgReading bgReading = null;
    
    @org.jetbrains.annotations.Nullable()
    public final info.nightscout.androidaps.db.BgReading getBgReading() {
        return null;
    }
    
    public EventNewBG(@org.jetbrains.annotations.Nullable()
    info.nightscout.androidaps.db.BgReading bgReading) {
        super();
    }
}