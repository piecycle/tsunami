package app.aaps.database.impl

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import app.aaps.database.entities.*
import app.aaps.database.impl.daos.*
import app.aaps.database.entities.Tsunami
import app.aaps.database.impl.daos.TsunamiDao
import java.io.Closeable

const val DATABASE_VERSION = 25

@Database(
    version = DATABASE_VERSION,
    entities = [app.aaps.database.entities.APSResult::class, Bolus::class, BolusCalculatorResult::class, Carbs::class,
        EffectiveProfileSwitch::class, ExtendedBolus::class, GlucoseValue::class, ProfileSwitch::class,
        TemporaryBasal::class, TemporaryTarget::class, TherapyEvent::class, TotalDailyDose::class, app.aaps.database.entities.APSResultLink::class,
        MultiwaveBolusLink::class, PreferenceChange::class, VersionChange::class, UserEntry::class,
        Food::class, DeviceStatus::class, OfflineEvent::class, HeartRate::class, Tsunami::class],
    exportSchema = true
)
@TypeConverters(Converters::class)
internal abstract class AppDatabase : Closeable, RoomDatabase() {

    abstract val glucoseValueDao: GlucoseValueDao

    abstract val therapyEventDao: TherapyEventDao

    abstract val temporaryBasalDao: TemporaryBasalDao

    abstract val bolusDao: BolusDao

    abstract val extendedBolusDao: ExtendedBolusDao

    abstract val multiwaveBolusLinkDao: MultiwaveBolusLinkDao

    abstract val totalDailyDoseDao: TotalDailyDoseDao

    abstract val carbsDao: CarbsDao

    abstract val temporaryTargetDao: TemporaryTargetDao

    abstract val apsResultLinkDao: APSResultLinkDao

    abstract val bolusCalculatorResultDao: BolusCalculatorResultDao

    abstract val effectiveProfileSwitchDao: EffectiveProfileSwitchDao

    abstract val profileSwitchDao: ProfileSwitchDao

    abstract val apsResultDao: APSResultDao

    abstract val versionChangeDao: VersionChangeDao

    abstract val userEntryDao: UserEntryDao

    abstract val preferenceChangeDao: PreferenceChangeDao

    abstract val foodDao: FoodDao

    abstract val deviceStatusDao: DeviceStatusDao

    abstract val offlineEventDao: OfflineEventDao

    abstract val heartRateDao: HeartRateDao

    abstract val tsunamiDao: TsunamiDao
}
