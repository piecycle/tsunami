package app.aaps.database.transactions

import app.aaps.database.entities.Tsunami
import app.aaps.database.entities.interfaces.end

class TsunamiModeSwitchTransaction(
    val tsunami: Tsunami
) : Transaction<TsunamiModeSwitchTransaction.TransactionResult>() {

    override fun run(): TransactionResult {
        val result = TransactionResult()
        val current = database.tsunamiDao.getTsunamiActiveAt(tsunami.timestamp).blockingGet()
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