package info.nightscout.androidaps.plugins.general.tidepool.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/messages/AuthReplyMessage;", "", "()V", "emailList", "", "", "getEmailList$app_fullRelease", "()Ljava/util/List;", "setEmailList$app_fullRelease", "(Ljava/util/List;)V", "emailVerified", "", "getEmailVerified$app_fullRelease", "()Ljava/lang/Boolean;", "setEmailVerified$app_fullRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "termsDate", "getTermsDate$app_fullRelease", "()Ljava/lang/String;", "setTermsDate$app_fullRelease", "(Ljava/lang/String;)V", "userid", "getUserid$app_fullRelease", "setUserid$app_fullRelease", "username", "getUsername$app_fullRelease", "setUsername$app_fullRelease", "app_fullRelease"})
public final class AuthReplyMessage {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "emailVerified")
    @com.google.gson.annotations.Expose()
    private java.lang.Boolean emailVerified;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "emails")
    @com.google.gson.annotations.Expose()
    private java.util.List<java.lang.String> emailList;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "termsAccepted")
    @com.google.gson.annotations.Expose()
    private java.lang.String termsDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userid")
    @com.google.gson.annotations.Expose()
    private java.lang.String userid;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "username")
    @com.google.gson.annotations.Expose()
    private java.lang.String username;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEmailVerified$app_fullRelease() {
        return null;
    }
    
    public final void setEmailVerified$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getEmailList$app_fullRelease() {
        return null;
    }
    
    public final void setEmailList$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermsDate$app_fullRelease() {
        return null;
    }
    
    public final void setTermsDate$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserid$app_fullRelease() {
        return null;
    }
    
    public final void setUserid$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername$app_fullRelease() {
        return null;
    }
    
    public final void setUsername$app_fullRelease(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public AuthReplyMessage() {
        super();
    }
}