package app.aaps.plugins.aps.tsunami

import android.content.Context
import app.aaps.core.interfaces.aps.DetermineBasalAdapter
import app.aaps.core.interfaces.bgQualityCheck.BgQualityCheck
import app.aaps.core.interfaces.configuration.Config
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.core.interfaces.db.PersistenceLayer
import app.aaps.core.interfaces.db.ProcessedTbrEbData
import app.aaps.core.interfaces.iob.GlucoseStatusProvider
import app.aaps.core.interfaces.iob.IobCobCalculator
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.plugin.ActivePlugin
import app.aaps.core.interfaces.profile.ProfileFunction
import app.aaps.core.interfaces.profiling.Profiler
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.rx.bus.RxBus
import app.aaps.core.interfaces.stats.TddCalculator
import app.aaps.core.interfaces.utils.DateUtil
import app.aaps.core.interfaces.utils.HardLimits
import app.aaps.core.keys.Preferences
import app.aaps.plugins.aps.R
import app.aaps.plugins.aps.openAPSSMB.TestOpenAPSSMBPlugin
import app.aaps.plugins.aps.utils.ScriptReader
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TestTsunamiPlugin @Inject constructor(
    private val injector: HasAndroidInjector,
    aapsLogger: AAPSLogger,
    rxBus: RxBus,
    constraintChecker: ConstraintsChecker,
    rh: ResourceHelper,
    profileFunction: ProfileFunction,
    context: Context,
    activePlugin: ActivePlugin,
    iobCobCalculator: IobCobCalculator,
    processedTbrEbData: ProcessedTbrEbData,
    hardLimits: HardLimits,
    profiler: Profiler,
    preferences: Preferences,
    dateUtil: DateUtil,
    persistenceLayer: PersistenceLayer,
    glucoseStatusProvider: GlucoseStatusProvider,
    bgQualityCheck: BgQualityCheck,
    tddCalculator: TddCalculator,
    private val config: Config
) : TestOpenAPSSMBPlugin(
    injector,
    aapsLogger,
    rxBus,
    constraintChecker,
    rh,
    profileFunction,
    context,
    activePlugin,
    iobCobCalculator,
    processedTbrEbData,
    hardLimits,
    profiler,
    preferences,
    dateUtil,
    persistenceLayer,
    glucoseStatusProvider,
    bgQualityCheck,
    tddCalculator
) {

    init {
        pluginDescription
            .pluginName(R.string.tsunami)
            .description(R.string.description_tsunami)
            .shortName(R.string.tsunami_shortname)
            .preferencesVisibleInSimpleMode(true)
            .setDefault(false)
            .showInList(config.isEngineeringMode() && config.isDev())
    }

    override fun specialEnableCondition(): Boolean = config.isEngineeringMode() && config.isDev()

    override fun provideDetermineBasalAdapter(): DetermineBasalAdapter = DetermineBasalAdapterTsunamiJS(ScriptReader(), injector)
}