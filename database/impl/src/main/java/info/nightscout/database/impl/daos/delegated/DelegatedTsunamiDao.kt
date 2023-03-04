package info.nightscout.database.impl.daos.delegated

import info.nightscout.database.entities.Tsunami
import info.nightscout.database.entities.interfaces.DBEntry
import info.nightscout.database.impl.daos.TsunamiDao

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