package info.nightscout.androidaps.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"isRunningRealPumpTest", "", "isRunningTest", "app_fullRelease"})
public final class EspressoTestHelperKt {
    
    public static final synchronized boolean isRunningTest() {
        return false;
    }
    
    public static final synchronized boolean isRunningRealPumpTest() {
        return false;
    }
}