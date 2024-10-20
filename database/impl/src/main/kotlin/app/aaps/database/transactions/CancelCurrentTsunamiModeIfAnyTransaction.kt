package app.aaps.database.transactions

import app.aaps.database.entities.Tsunami
import app.aaps.database.entities.interfaces.end

class CancelCurrentTsunamiModeIfAnyTransaction(
    val timestamp: Long
) : Transaction<CancelCurrentTsunamiModeIfAnyTransaction.TransactionResult>() {

    override fun run(): TransactionResult {
        val result = TransactionResult()
        val current = database.tsunamiDao.getTsunamiActiveAt(timestamp).blockingGet()
        if (current != null) {
            current.end = timestamp
            database.tsunamiDao.updateExistingEntry(current)
            result.updated.add(current)
        }
        return result
    }

    class TransactionResult {

        val updated = mutableListOf<Tsunami>()
    }
}