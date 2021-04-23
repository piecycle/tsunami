package info.nightscout.androidaps.plugins.general.smsCommunicator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\b&\u0018\u00002\u00020\u0001B\u0007\b\u0010\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bB\u000f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\rB\u0017\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000eB\u0017\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006\'"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/smsCommunicator/SmsAction;", "Ljava/lang/Runnable;", "()V", "aDouble", "", "(D)V", "secondInteger", "", "(DI)V", "aString", "", "(Ljava/lang/String;I)V", "anInteger", "(I)V", "(II)V", "secondLong", "", "(IJ)V", "getADouble", "()Ljava/lang/Double;", "setADouble", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAString", "()Ljava/lang/String;", "setAString", "(Ljava/lang/String;)V", "getAnInteger", "()Ljava/lang/Integer;", "setAnInteger", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSecondInteger", "setSecondInteger", "getSecondLong", "()Ljava/lang/Long;", "setSecondLong", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "app_fullRelease"})
public abstract class SmsAction implements java.lang.Runnable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double aDouble;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer anInteger;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer secondInteger;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long secondLong;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String aString;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getADouble() {
        return null;
    }
    
    public final void setADouble(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAnInteger() {
        return null;
    }
    
    public final void setAnInteger(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSecondInteger() {
        return null;
    }
    
    public final void setSecondInteger(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSecondLong() {
        return null;
    }
    
    public final void setSecondLong(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAString() {
        return null;
    }
    
    public final void setAString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double aDouble() {
        return 0.0;
    }
    
    public final int anInteger() {
        return 0;
    }
    
    public final int secondInteger() {
        return 0;
    }
    
    public final long secondLong() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String aString() {
        return null;
    }
    
    public SmsAction() {
        super();
    }
    
    public SmsAction(double aDouble) {
        super();
    }
    
    public SmsAction(double aDouble, int secondInteger) {
        super();
    }
    
    public SmsAction(@org.jetbrains.annotations.NotNull()
    java.lang.String aString, int secondInteger) {
        super();
    }
    
    public SmsAction(int anInteger) {
        super();
    }
    
    public SmsAction(int anInteger, int secondInteger) {
        super();
    }
    
    public SmsAction(int anInteger, long secondLong) {
        super();
    }
}