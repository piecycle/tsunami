package info.nightscout.androidaps.events;

import java.lang.System;

/**
 * Event which is published with data fetched from NightScout specific for the
 * Food-class.
 *
 * Payload is the from NS retrieved JSON-String which should be handled by all
 * subscriber.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/events/EventNsFood;", "Linfo/nightscout/androidaps/events/Event;", "mode", "", "foods", "Lorg/json/JSONArray;", "(ILorg/json/JSONArray;)V", "getFoods", "()Lorg/json/JSONArray;", "getMode", "()I", "Companion", "app_fullRelease"})
public final class EventNsFood extends info.nightscout.androidaps.events.Event {
    private final int mode = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.json.JSONArray foods = null;
    private static final int ADD = 0;
    private static final int UPDATE = 1;
    private static final int REMOVE = 2;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.events.EventNsFood.Companion Companion = null;
    
    public final int getMode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONArray getFoods() {
        return null;
    }
    
    public EventNsFood(int mode, @org.jetbrains.annotations.NotNull()
    org.json.JSONArray foods) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/events/EventNsFood$Companion;", "", "()V", "ADD", "", "getADD", "()I", "REMOVE", "getREMOVE", "UPDATE", "getUPDATE", "app_fullRelease"})
    public static final class Companion {
        
        public final int getADD() {
            return 0;
        }
        
        public final int getUPDATE() {
            return 0;
        }
        
        public final int getREMOVE() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}