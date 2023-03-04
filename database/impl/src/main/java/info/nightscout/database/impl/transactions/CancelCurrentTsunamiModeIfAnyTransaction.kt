package info.nightscout.database.impl.transactions

import info.nightscout.database.entities.Tsunami
import info.nightscout.database.entities.interfaces.end

class CancelCurrentTsunamiModeIfAnyTransaction(
    val timestamp: Long
) : Transaction<CancelCurrentTsunamiModeIfAnyTransaction.TransactionResult>() {

    override fun run(): TransactionResult {
        val result = TransactionResult()
        val current = database.tsunamiDao.getTsunamiModeActiveAt(timestamp).blockingGet()
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