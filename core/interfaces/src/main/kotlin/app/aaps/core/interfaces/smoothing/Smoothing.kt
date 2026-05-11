package app.aaps.core.interfaces.smoothing

import app.aaps.core.data.iob.InMemoryGlucoseValue

interface Smoothing {

    /**
     * Smooth values in List
     *
     * @param data  input glucose values ([0] to be the most recent one)
     * @param context optional hints (IOB cache, etc.); plugins that do not use it may ignore it
     *
     * @return new List with smoothed values (smoothed values are stored in [InMemoryGlucoseValue.smoothed])
     */
    suspend fun smooth(
        data: MutableList<InMemoryGlucoseValue>,
        context: SmoothingContext = SmoothingContext.NONE
    ): MutableList<InMemoryGlucoseValue>
}
