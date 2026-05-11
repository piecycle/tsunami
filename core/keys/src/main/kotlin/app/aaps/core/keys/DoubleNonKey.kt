package app.aaps.core.keys

import app.aaps.core.keys.interfaces.DoubleNonPreferenceKey

enum class DoubleNonKey(
    override val key: String,
    override val defaultValue: Double,
    override val exportable: Boolean = true
) : DoubleNonPreferenceKey {

    /** Adaptive smoothing UKF: learned measurement noise variance R (internal persistence). */
    UkfLearnedR("ukf_learned_r", 25.0, exportable = true),
}