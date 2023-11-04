package app.aaps.database.impl.daos.delegated

import app.aaps.database.entities.Tsunami
import app.aaps.database.entities.interfaces.DBEntry
import app.aaps.database.impl.daos.TsunamiDao

internal class DelegatedTsunamiDao(changes: MutableList<DBEntry>, private val dao: TsunamiDao) : DelegatedDao(changes), TsunamiDao by dao {

    override fun insertNewEntry(entry: Tsunami): Long {
        changes.add(entry)
        return dao.insertNewEntry(entry)
    }

    override fun updateExistingEntry(entry: Tsunami): Long {
        changes.add(entry)
        return dao.updateExistingEntry(entry)
    }
}