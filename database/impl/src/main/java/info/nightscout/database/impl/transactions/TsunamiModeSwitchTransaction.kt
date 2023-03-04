package info.nightscout.database.impl.transactions

import info.nightscout.database.entities.Tsunami
import info.nightscout.database.entities.interfaces.end

class TsunamiModeSwitchTransaction(
    val tsunami: Tsunami
) : Transaction<TsunamiModeSwitchTransaction.TransactionResult>() {

    constructor(timestamp: Long, duration: Long, tsunamiMode: Int) :
        this(Tsunami(timestamp = timestamp, duration = duration, tsunamiMode = tsunamiMode))

    override fun run(): TransactionResult {
        val result = TransactionResult()
        val current = database.tsunamiDao.getTsunamiModeActiveAt(tsunami.timestamp).blockingGet()
        if (current != null) {
            current.end = tsunami.timestamp
            database.tsunamiDao.updateExistingEntry(current)
            result.updated.add(current)
        }
        database.tsunamiDao.insertNewEntry(tsunami)
        result.inserted.add(tsunami)
        return result
    }

    class TransactionResult {
        val inserted = mutableListOf<Tsunami>()
        val updated = mutableListOf<Tsunami>()
    }
}