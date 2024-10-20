package app.aaps.core.data.model

import java.util.TimeZone

data class TSU(
    override var id: Long = 0,
    override var version: Int = 0,
    override var dateCreated: Long = -1,
    override var isValid: Boolean = true,
    override var referenceId: Long? = null,
    override var ids: IDs = IDs(),
    var timestamp: Long,
    var utcOffset: Long = TimeZone.getDefault().getOffset(timestamp).toLong(),
    var duration: Long,
    var tsunamiMode: Int
) : HasIDs {
    val end
        get() = timestamp + duration
}