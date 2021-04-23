package info.nightscout.androidaps.plugins.general.automation.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0019\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay;", "Linfo/nightscout/androidaps/plugins/general/automation/elements/Element;", "injector", "Ldagger/android/HasAndroidInjector;", "(Ldagger/android/HasAndroidInjector;)V", "weekdays", "", "getWeekdays", "()[Z", "addToLayout", "", "root", "Landroid/widget/LinearLayout;", "getSelectedDays", "", "", "isSet", "", "day", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay$DayOfWeek;", "set", "value", "setAll", "DayOfWeek", "app_fullRelease"})
public final class InputWeekDay extends info.nightscout.androidaps.plugins.general.automation.elements.Element {
    @org.jetbrains.annotations.NotNull()
    private final boolean[] weekdays = null;
    
    @org.jetbrains.annotations.NotNull()
    public final boolean[] getWeekdays() {
        return null;
    }
    
    public final void setAll(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay set(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay.DayOfWeek day, boolean value) {
        return null;
    }
    
    public final boolean isSet(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay.DayOfWeek day) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getSelectedDays() {
        return null;
    }
    
    @java.lang.Override()
    public void addToLayout(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout root) {
    }
    
    public InputWeekDay(@org.jetbrains.annotations.NotNull()
    dagger.android.HasAndroidInjector injector) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay$DayOfWeek;", "", "(Ljava/lang/String;I)V", "shortName", "", "getShortName", "()I", "toCalendarInt", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "Companion", "app_fullRelease"})
    public static enum DayOfWeek {
        /*public static final*/ MONDAY /* = new MONDAY() */,
        /*public static final*/ TUESDAY /* = new TUESDAY() */,
        /*public static final*/ WEDNESDAY /* = new WEDNESDAY() */,
        /*public static final*/ THURSDAY /* = new THURSDAY() */,
        /*public static final*/ FRIDAY /* = new FRIDAY() */,
        /*public static final*/ SATURDAY /* = new SATURDAY() */,
        /*public static final*/ SUNDAY /* = new SUNDAY() */;
        private static final int[] calendarInts = {2, 3, 4, 5, 6, 7, 1};
        private static final int[] shortNames = {2131888767, 2131888771, 2131888772, 2131888770, 2131888766, 2131888768, 2131888769};
        @org.jetbrains.annotations.NotNull()
        public static final info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay.DayOfWeek.Companion Companion = null;
        
        public final int toCalendarInt() {
            return 0;
        }
        
        @androidx.annotation.StringRes()
        public final int getShortName() {
            return 0;
        }
        
        DayOfWeek() {
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay$DayOfWeek$Companion;", "", "()V", "calendarInts", "", "shortNames", "fromCalendarInt", "Linfo/nightscout/androidaps/plugins/general/automation/elements/InputWeekDay$DayOfWeek;", "day", "", "app_fullRelease"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final info.nightscout.androidaps.plugins.general.automation.elements.InputWeekDay.DayOfWeek fromCalendarInt(int day) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}