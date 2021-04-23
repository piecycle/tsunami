package info.nightscout.androidaps.utils.buildHelper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Linfo/nightscout/androidaps/utils/buildHelper/BuildHelper;", "", "config", "Linfo/nightscout/androidaps/Config;", "(Linfo/nightscout/androidaps/Config;)V", "devBranch", "", "engineeringMode", "isDev", "isEngineeringMode", "isEngineeringModeOrRelease", "app_fullRelease"})
@javax.inject.Singleton()
public final class BuildHelper {
    private boolean devBranch = false;
    private boolean engineeringMode = false;
    private final info.nightscout.androidaps.Config config = null;
    
    public final boolean isEngineeringModeOrRelease() {
        return false;
    }
    
    public final boolean isEngineeringMode() {
        return false;
    }
    
    public final boolean isDev() {
        return false;
    }
    
    @javax.inject.Inject()
    public BuildHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.Config config) {
        super();
    }
}