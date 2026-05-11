package app.aaps.core.keys

import app.aaps.core.keys.interfaces.LongNonPreferenceKey

enum class LongNonKey(
    override val key: String,
    override val defaultValue: Long,
    override val exportable: Boolean = true
) : LongNonPreferenceKey {

    LocalProfileLastChange("local_profile_last_change", 0L),
    BtWatchdogLastBark("bt_watchdog_last", 0L),
    ActivePumpChangeTimestamp("active_pump_change_timestamp", 0L),
    LastCleanupRun("last_cleanup_run", 0L),

    /** Adaptive smoothing UKF: last processed glucose timestamp (internal persistence). */
    UkfLastProcessedTimestamp("ukf_last_processed_timestamp", 0L, exportable = true),
    /** Adaptive smoothing UKF: sensor change TE timestamp (internal persistence). */
    UkfSensorChangeTimestamp("ukf_sensor_change_timestamp", 0L, exportable = true),
}

