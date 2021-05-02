package info.nightscout.androidaps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n\u00a8\u0006\u0019"}, d2 = {"Linfo/nightscout/androidaps/Config;", "Linfo/nightscout/androidaps/interfaces/ConfigInterface;", "()V", "APS", "", "getAPS", "()Z", "FLAVOR", "", "getFLAVOR", "()Ljava/lang/String;", "NSCLIENT", "getNSCLIENT", "PUMPCONTROL", "getPUMPCONTROL", "PUMPDRIVERS", "getPUMPDRIVERS", "SUPPORTEDNSVERSION", "", "getSUPPORTEDNSVERSION", "()I", "VERSION_NAME", "getVERSION_NAME", "currentDeviceModelString", "getCurrentDeviceModelString", "app_fullRelease"})
@javax.inject.Singleton()
public final class Config implements info.nightscout.androidaps.interfaces.ConfigInterface {
    private final int SUPPORTEDNSVERSION = 1002;
    private final boolean APS = true;
    private final boolean NSCLIENT = false;
    private final boolean PUMPCONTROL = false;
    private final boolean PUMPDRIVERS = true;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FLAVOR = "full";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String VERSION_NAME = "2.8.2-UAM_tsunami_0.5";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currentDeviceModelString = null;
    
    @java.lang.Override()
    public int getSUPPORTEDNSVERSION() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getAPS() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getNSCLIENT() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getPUMPCONTROL() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getPUMPDRIVERS() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFLAVOR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getVERSION_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentDeviceModelString() {
        return null;
    }
    
    @javax.inject.Inject()
    public Config() {
        super();
    }
}