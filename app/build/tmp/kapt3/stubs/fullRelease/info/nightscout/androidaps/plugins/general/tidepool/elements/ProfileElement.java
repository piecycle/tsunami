package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\b9:;<=>?@B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00060\rR\u00020\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00060\u0013R\u00020\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00060\u0019R\u00020\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u001f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010\'\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001e\u0010*\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\"\u0010-\u001a\u00060.R\u00020\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u000604R\u00020\u00008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006A"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "ps", "Linfo/nightscout/androidaps/db/ProfileSwitch;", "serialNumber", "", "(Linfo/nightscout/androidaps/db/ProfileSwitch;Ljava/lang/String;)V", "activeSchedule", "getActiveSchedule$app_fullRelease", "()Ljava/lang/String;", "setActiveSchedule$app_fullRelease", "(Ljava/lang/String;)V", "basalSchedules", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalProfile;", "getBasalSchedules$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalProfile;", "setBasalSchedules$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalProfile;)V", "bgTargets", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$TargetProfile;", "getBgTargets$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$TargetProfile;", "setBgTargets$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$TargetProfile;)V", "carbRatios", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IcProfile;", "getCarbRatios$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IcProfile;", "setCarbRatios$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IcProfile;)V", "clockDriftOffset", "", "getClockDriftOffset$app_fullRelease", "()J", "setClockDriftOffset$app_fullRelease", "(J)V", "conversionOffset", "getConversionOffset$app_fullRelease", "setConversionOffset$app_fullRelease", "deviceId", "getDeviceId$app_fullRelease", "setDeviceId$app_fullRelease", "deviceSerialNumber", "getDeviceSerialNumber$app_fullRelease", "setDeviceSerialNumber$app_fullRelease", "insulinSensitivities", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IsfProfile;", "getInsulinSensitivities$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IsfProfile;", "setInsulinSensitivities$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IsfProfile;)V", "units", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Units;", "getUnits$app_fullRelease", "()Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Units;", "setUnits$app_fullRelease", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Units;)V", "BasalProfile", "BasalRate", "IcProfile", "IsfProfile", "Ratio", "Target", "TargetProfile", "Units", "app_fullRelease"})
public final class ProfileElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String activeSchedule = "Normal";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalProfile basalSchedules;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Units units;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.TargetProfile bgTargets;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IcProfile carbRatios;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IsfProfile insulinSensitivities;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String deviceId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String deviceSerialNumber;
    @com.google.gson.annotations.Expose()
    private long clockDriftOffset = 0L;
    @com.google.gson.annotations.Expose()
    private long conversionOffset = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActiveSchedule$app_fullRelease() {
        return null;
    }
    
    public final void setActiveSchedule$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalProfile getBasalSchedules$app_fullRelease() {
        return null;
    }
    
    public final void setBasalSchedules$app_fullRelease(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Units getUnits$app_fullRelease() {
        return null;
    }
    
    public final void setUnits$app_fullRelease(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Units p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.TargetProfile getBgTargets$app_fullRelease() {
        return null;
    }
    
    public final void setBgTargets$app_fullRelease(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.TargetProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IcProfile getCarbRatios$app_fullRelease() {
        return null;
    }
    
    public final void setCarbRatios$app_fullRelease(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IcProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IsfProfile getInsulinSensitivities$app_fullRelease() {
        return null;
    }
    
    public final void setInsulinSensitivities$app_fullRelease(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.IsfProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceId$app_fullRelease() {
        return null;
    }
    
    public final void setDeviceId$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceSerialNumber$app_fullRelease() {
        return null;
    }
    
    public final void setDeviceSerialNumber$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getClockDriftOffset$app_fullRelease() {
        return 0L;
    }
    
    public final void setClockDriftOffset$app_fullRelease(long p0) {
    }
    
    public final long getConversionOffset$app_fullRelease() {
        return 0L;
    }
    
    public final void setConversionOffset$app_fullRelease(long p0) {
    }
    
    public ProfileElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.ProfileSwitch ps, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber) {
        super(0L, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007R6\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalProfile;", "", "Normal", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalRate;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "Lkotlin/collections/ArrayList;", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;Ljava/util/ArrayList;)V", "getNormal$app_fullRelease", "()Ljava/util/ArrayList;", "setNormal$app_fullRelease", "(Ljava/util/ArrayList;)V", "app_fullRelease"})
    public final class BasalProfile {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalRate> Normal;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalRate> getNormal$app_fullRelease() {
            return null;
        }
        
        public final void setNormal$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalRate> p0) {
        }
        
        public BasalProfile(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.BasalRate> Normal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$BasalRate;", "", "start", "", "rate", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;ID)V", "getRate$app_fullRelease", "()D", "setRate$app_fullRelease", "(D)V", "getStart$app_fullRelease", "()I", "setStart$app_fullRelease", "(I)V", "app_fullRelease"})
    public final class BasalRate {
        @com.google.gson.annotations.Expose()
        private int start;
        @com.google.gson.annotations.Expose()
        private double rate;
        
        public final int getStart$app_fullRelease() {
            return 0;
        }
        
        public final void setStart$app_fullRelease(int p0) {
        }
        
        public final double getRate$app_fullRelease() {
            return 0.0;
        }
        
        public final void setRate$app_fullRelease(double p0) {
        }
        
        public BasalRate(int start, double rate) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Units;", "", "carb", "", "bg", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;Ljava/lang/String;Ljava/lang/String;)V", "getBg$app_fullRelease", "()Ljava/lang/String;", "setBg$app_fullRelease", "(Ljava/lang/String;)V", "getCarb$app_fullRelease", "setCarb$app_fullRelease", "app_fullRelease"})
    public final class Units {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.lang.String carb;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.lang.String bg;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCarb$app_fullRelease() {
            return null;
        }
        
        public final void setCarb$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBg$app_fullRelease() {
            return null;
        }
        
        public final void setBg$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Units(@org.jetbrains.annotations.NotNull()
        java.lang.String carb, @org.jetbrains.annotations.NotNull()
        java.lang.String bg) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007R6\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$TargetProfile;", "", "Normal", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Target;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "Lkotlin/collections/ArrayList;", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;Ljava/util/ArrayList;)V", "getNormal$app_fullRelease", "()Ljava/util/ArrayList;", "setNormal$app_fullRelease", "(Ljava/util/ArrayList;)V", "app_fullRelease"})
    public final class TargetProfile {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Target> Normal;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Target> getNormal$app_fullRelease() {
            return null;
        }
        
        public final void setNormal$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Target> p0) {
        }
        
        public TargetProfile(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Target> Normal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Target;", "", "start", "", "target", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;ID)V", "getStart$app_fullRelease", "()I", "setStart$app_fullRelease", "(I)V", "getTarget$app_fullRelease", "()D", "setTarget$app_fullRelease", "(D)V", "app_fullRelease"})
    public final class Target {
        @com.google.gson.annotations.Expose()
        private int start;
        @com.google.gson.annotations.Expose()
        private double target;
        
        public final int getStart$app_fullRelease() {
            return 0;
        }
        
        public final void setStart$app_fullRelease(int p0) {
        }
        
        public final double getTarget$app_fullRelease() {
            return 0.0;
        }
        
        public final void setTarget$app_fullRelease(double p0) {
        }
        
        public Target(int start, double target) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007R6\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IcProfile;", "", "Normal", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Ratio;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "Lkotlin/collections/ArrayList;", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;Ljava/util/ArrayList;)V", "getNormal$app_fullRelease", "()Ljava/util/ArrayList;", "setNormal$app_fullRelease", "(Ljava/util/ArrayList;)V", "app_fullRelease"})
    public final class IcProfile {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> Normal;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> getNormal$app_fullRelease() {
            return null;
        }
        
        public final void setNormal$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> p0) {
        }
        
        public IcProfile(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> Normal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007R6\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$IsfProfile;", "", "Normal", "Ljava/util/ArrayList;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Ratio;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;", "Lkotlin/collections/ArrayList;", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;Ljava/util/ArrayList;)V", "getNormal$app_fullRelease", "()Ljava/util/ArrayList;", "setNormal$app_fullRelease", "(Ljava/util/ArrayList;)V", "app_fullRelease"})
    public final class IsfProfile {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.Expose()
        private java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> Normal;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> getNormal$app_fullRelease() {
            return null;
        }
        
        public final void setNormal$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> p0) {
        }
        
        public IsfProfile(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<info.nightscout.androidaps.plugins.general.tidepool.elements.ProfileElement.Ratio> Normal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement$Ratio;", "", "start", "", "amount", "", "(Linfo/nightscout/androidaps/plugins/general/tidepool/elements/ProfileElement;ID)V", "getAmount$app_fullRelease", "()D", "setAmount$app_fullRelease", "(D)V", "getStart$app_fullRelease", "()I", "setStart$app_fullRelease", "(I)V", "app_fullRelease"})
    public final class Ratio {
        @com.google.gson.annotations.Expose()
        private int start;
        @com.google.gson.annotations.Expose()
        private double amount;
        
        public final int getStart$app_fullRelease() {
            return 0;
        }
        
        public final void setStart$app_fullRelease(int p0) {
        }
        
        public final double getAmount$app_fullRelease() {
            return 0.0;
        }
        
        public final void setAmount$app_fullRelease(double p0) {
        }
        
        public Ratio(int start, double amount) {
            super();
        }
    }
}