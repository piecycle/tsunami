package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BloodGlucoseElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "careportalEvent", "Linfo/nightscout/androidaps/db/CareportalEvent;", "(Linfo/nightscout/androidaps/db/CareportalEvent;)V", "subType", "", "getSubType", "()Ljava/lang/String;", "setSubType", "(Ljava/lang/String;)V", "units", "getUnits", "setUnits", "value", "", "getValue", "()I", "setValue", "(I)V", "Companion", "app_fullRelease"})
public final class BloodGlucoseElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String subType = "manual";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String units = "mg/dL";
    @com.google.gson.annotations.Expose()
    private int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.tidepool.elements.BloodGlucoseElement.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubType() {
        return null;
    }
    
    public final void setSubType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnits() {
        return null;
    }
    
    public final void setUnits(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final void setValue(int p0) {
    }
    
    public BloodGlucoseElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.CareportalEvent careportalEvent) {
        super(0L, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a8\u0006\b"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BloodGlucoseElement$Companion;", "", "()V", "fromCareportalEvents", "", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BloodGlucoseElement;", "careportalList", "Linfo/nightscout/androidaps/db/CareportalEvent;", "app_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.BloodGlucoseElement> fromCareportalEvents(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends info.nightscout.androidaps.db.CareportalEvent> careportalList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}