package app.aaps.database.persistence.converters

import app.aaps.core.data.model.TSU
import app.aaps.database.entities.Tsunami

fun Tsunami.fromDb(): TSU =
    TSU(
        id = this.id,
        version = this.version,
        dateCreated = this.dateCreated,
        isValid = this.isValid,
        referenceId = this.referenceId,
        timestamp = this.timestamp,
        utcOffset = this.utcOffset,
        duration = this.duration,
        tsunamiMode = this.tsunamiMode,
        ids = this.interfaceIDs.fromDb()
    )

fun TSU.toDb(): Tsunami =
    Tsunami(
        id = this.id,
        version = this.version,
        dateCreated = this.dateCreated,
        isValid = this.isValid,
        referenceId = this.referenceId,
        timestamp = this.timestamp,
        utcOffset = this.utcOffset,
        duration = this.duration,
        tsunamiMode = this.tsunamiMode,
        interfaceIDs_backing = this.ids.toDb()
    )
