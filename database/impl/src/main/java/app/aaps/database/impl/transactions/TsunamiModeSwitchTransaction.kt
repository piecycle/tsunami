package app.aaps.database.impl.transactions

import app.aaps.database.entities.Tsunami
import app.aaps.database.entities.interfaces.end

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