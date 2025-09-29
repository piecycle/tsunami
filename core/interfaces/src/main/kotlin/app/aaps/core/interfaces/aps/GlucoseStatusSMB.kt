package app.aaps.core.interfaces.aps

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(InternalSerializationApi::class)
@Serializable
data class GlucoseStatusSMB(
    override val glucose: Double,
    override val noise: Double = 0.0,
    override val delta: Double = 0.0,
    override val shortAvgDelta: Double = 0.0,
    override val longAvgDelta: Double = 0.0,
    override val date: Long = 0L,
) : GlucoseStatus