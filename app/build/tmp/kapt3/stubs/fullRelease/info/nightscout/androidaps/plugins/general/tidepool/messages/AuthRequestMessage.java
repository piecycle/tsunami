package info.nightscout.androidaps.plugins.general.tidepool.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthRequestMessage;", "Linfo/nightscout/androidaps/plugins/general/tidepool/messages/BaseMessage;", "()V", "Companion", "app_fullRelease"})
public final class AuthRequestMessage extends info.nightscout.androidaps.plugins.general.tidepool.messages.BaseMessage {
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.tidepool.messages.AuthRequestMessage.Companion Companion = null;
    
    public AuthRequestMessage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthRequestMessage$Companion;", "", "()V", "getAuthRequestHeader", "", "sp", "Linfo/nightscout/androidaps/utils/sharedPreferences/SP;", "app_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthRequestHeader(@org.jetbrains.annotations.NotNull()
        info.nightscout.androidaps.utils.sharedPreferences.SP sp) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}