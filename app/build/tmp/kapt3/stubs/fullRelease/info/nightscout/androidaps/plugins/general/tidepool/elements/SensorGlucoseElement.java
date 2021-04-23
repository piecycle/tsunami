package info.nightscout.androidaps.plugins.general.tidepool.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/SensorGlucoseElement;", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/BaseElement;", "bgReading", "Linfo/nightscout/androidaps/db/BgReading;", "(Linfo/nightscout/androidaps/db/BgReading;)V", "units", "", "getUnits$app_fullRelease", "()Ljava/lang/String;", "setUnits$app_fullRelease", "(Ljava/lang/String;)V", "value", "", "getValue$app_fullRelease", "()I", "setValue$app_fullRelease", "(I)V", "Companion", "app_fullRelease"})
public final class SensorGlucoseElement extends info.nightscout.androidaps.plugins.general.tidepool.elements.BaseElement {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private java.lang.String units = "mg/dL";
    @com.google.gson.annotations.Expose()
    private int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final info.nightscout.androidaps.plugins.general.tidepool.elements.SensorGlucoseElement.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnits$app_fullRelease() {
        return null;
    }
    
    public final void setUnits$app_fullRelease(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getValue$app_fullRelease() {
        return 0;
    }
    
    public final void setValue$app_fullRelease(int p0) {
    }
    
    public SensorGlucoseElement(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.db.BgReading bgReading) {
        super(0L, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0000\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/tidepool/elements/SensorGlucoseElement$Companion;", "", "()V", "fromBgReadings", "", "Linfo/nightscout/androidaps/plugins/general/tidepool/elements/SensorGlucoseElement;", "bgReadingList", "Linfo/nightscout/androidaps/db/BgReading;", "fromBgReadings$app_fullRelease", "app_fullRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<info.nightscout.androidaps.plugins.general.tidepool.elements.SensorGlucoseElement> fromBgReadings$app_fullRelease(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends info.nightscout.androidaps.db.BgReading> bgReadingList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}