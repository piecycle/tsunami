package info.nightscout.androidaps.receivers;

import java.lang.System;

/**
 * Forward received SMS intents. This is a separate class, because unlike local broadcasts handled by DataReceiver,
 * receiving SMS requires a special permission in the manifest, which necessitates a separate receiver.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Linfo/nightscout/androidaps/receivers/SmsReceiver;", "Linfo/nightscout/androidaps/receivers/DataReceiver;", "()V", "app_fullRelease"})
public final class SmsReceiver extends info.nightscout.androidaps.receivers.DataReceiver {
    
    public SmsReceiver() {
        super();
    }
}