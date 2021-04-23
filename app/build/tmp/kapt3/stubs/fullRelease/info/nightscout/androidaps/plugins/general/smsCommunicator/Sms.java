package info.nightscout.androidaps.plugins.general.smsCommunicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020\u0006H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018\u00a8\u0006%"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/Sms;", "", "message", "Landroid/telephony/SmsMessage;", "(Landroid/telephony/SmsMessage;)V", "phoneNumber", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "date", "", "getDate", "()J", "setDate", "(J)V", "ignored", "", "getIgnored", "()Z", "setIgnored", "(Z)V", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "processed", "getProcessed", "setProcessed", "received", "getReceived", "setReceived", "sent", "getSent", "setSent", "getText", "setText", "toString", "app_fullRelease"})
public final class Sms {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String text;
    private long date;
    private boolean received = false;
    private boolean sent = false;
    private boolean processed = false;
    private boolean ignored = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final boolean getReceived() {
        return false;
    }
    
    public final void setReceived(boolean p0) {
    }
    
    public final boolean getSent() {
        return false;
    }
    
    public final void setSent(boolean p0) {
    }
    
    public final boolean getProcessed() {
        return false;
    }
    
    public final void setProcessed(boolean p0) {
    }
    
    public final boolean getIgnored() {
        return false;
    }
    
    public final void setIgnored(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Sms(@org.jetbrains.annotations.NotNull()
    android.telephony.SmsMessage message) {
        super();
    }
    
    public Sms(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        super();
    }
}