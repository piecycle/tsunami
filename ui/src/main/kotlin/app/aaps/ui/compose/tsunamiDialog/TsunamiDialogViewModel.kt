package app.aaps.ui.compose.tsunamiDialog

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.aaps.core.data.model.TE
import app.aaps.core.data.model.TSU
import app.aaps.core.data.ue.Action
import app.aaps.core.data.ue.Sources
import app.aaps.core.data.ue.ValueWithUnit
import app.aaps.core.interfaces.automation.Automation
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.core.interfaces.db.PersistenceLayer
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.logging.UserEntryLogger
import app.aaps.core.interfaces.plugin.ActivePlugin
import app.aaps.core.interfaces.pump.DetailedBolusInfo
import app.aaps.core.interfaces.pump.defs.determineCorrectBolusStepSize
import app.aaps.core.interfaces.queue.Callback
import app.aaps.core.interfaces.queue.CommandQueue
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.utils.DateUtil
import app.aaps.core.interfaces.utils.DecimalFormatter
import app.aaps.core.interfaces.utils.HardLimits
import app.aaps.core.keys.BooleanKey
import app.aaps.core.keys.DoubleKey
import app.aaps.core.keys.IntKey
import app.aaps.core.keys.interfaces.Preferences
import app.aaps.core.objects.constraints.ConstraintObject
import app.aaps.core.ui.compose.preference.PreferenceSubScreenDef
import app.aaps.ui.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.math.abs
import kotlin.math.max

@HiltViewModel
@Stable
class TsunamiDialogViewModel @Inject constructor(
    private val constraintChecker: ConstraintsChecker,
    private val commandQueue: CommandQueue,
    private val activePlugin: ActivePlugin,
    private val automation: Automation,
    private val uel: UserEntryLogger,
    private val persistenceLayer: PersistenceLayer,
    val decimalFormatter: DecimalFormatter,
    val preferences: Preferences,
    val rh: ResourceHelper,
    val dateUtil: DateUtil,
    private val aapsLogger: AAPSLogger,
    private val hardLimits: HardLimits
) : ViewModel() {

    val uiState: StateFlow<TsunamiDialogUiState>
        field = MutableStateFlow(TsunamiDialogUiState())

    sealed class SideEffect {
        data class ShowDeliveryError(val comment: String) : SideEffect()
        data object ShowNoActionDialog : SideEffect()
        //data class NavigateToSettings(val screenDef: PreferenceSubScreenDef) : SideEffect()
    }

    val sideEffect: SharedFlow<SideEffect>
        field = MutableSharedFlow(
            replay = 0,
            extraBufferCapacity = 1,
            onBufferOverflow = BufferOverflow.DROP_OLDEST
        )

    init {
        val now = dateUtil.now()
        val pump = activePlugin.activePump
        val constrainedMax = constraintChecker.getMaxBolusAllowed().value()
        val maxInsulin = if (constrainedMax > 0.0) constrainedMax else hardLimits.maxBolus()
        val bolusStep = pump.pumpDescription.bolusStep

        uiState.update {
            TsunamiDialogUiState(
                insulin = 0.0,
                duration = preferences.get(IntKey.TsuDefaultDuration),
                notes = "",
                eventTime = now,
                eventTimeOriginal = now,
                maxInsulin = maxInsulin,
                bolusStep = bolusStep,
                tsunamiButtonIncrement1 = preferences.get(DoubleKey.TsuButtonIncrement1),
                tsunamiButtonIncrement2 = preferences.get(DoubleKey.TsuButtonIncrement2),
                tsunamiButtonIncrement3 = preferences.get(DoubleKey.TsuButtonIncrement3),
                showNotesFromPreferences = preferences.get(BooleanKey.OverviewShowNotesInDialogs),
                simpleMode = preferences.get(BooleanKey.GeneralSimpleMode)
            )
        }

        viewModelScope.launch {
            val isTsunamiActive = persistenceLayer.getTsunamiActiveAt(dateUtil.now()) != null
            uiState.update { it.copy(isTsunamiActive = isTsunamiActive) }
        }
    }

    fun updateInsulin(value: Double) {
        val clamped = value.coerceIn(0.0, uiState.value.maxInsulin)
        uiState.update { it.copy(insulin = clamped) }
    }

    fun addInsulin(increment: Double) {
        val state = uiState.value
        val newValue = max(0.0, state.insulin + increment).coerceAtMost(state.maxInsulin)
        uiState.update { it.copy(insulin = newValue) }
    }

    fun updateDuration(minutes: Int) {
        val clamped = minutes.coerceIn(0, 300)
        uiState.update { it.copy(duration = clamped) }
    }

    fun updateNotes(value: String) {
        uiState.update { it.copy(notes = value) }
    }

    fun updateEventTime(timeMillis: Long) {
        uiState.update { it.copy(eventTime = timeMillis) }
    }

    fun cancelTsunami() {
        uiState.update { it.copy(duration = 0, insulin = 0.0) }
    }

    private var confirmedState: TsunamiDialogUiState? = null

    fun buildConfirmationSummary(): List<String> {
        val state = uiState.value
        confirmedState = state
        val lines = mutableListOf<String>()
        val pump = activePlugin.activePump
        val pumpDescription = pump.pumpDescription

        val insulin = state.insulin
        val insulinAfterConstraints = constraintChecker.applyBolusConstraints(
            ConstraintObject(insulin, aapsLogger)
        ).value()

        val duration = state.duration

        // Bolus line
        if (insulinAfterConstraints > 0) {
            lines.add(
                rh.gs(app.aaps.core.ui.R.string.bolus) + ": " +
                    decimalFormatter.toPumpSupportedBolus(insulinAfterConstraints, pumpDescription.bolusStep)
            )
            if (abs(insulinAfterConstraints - insulin) > pumpDescription.pumpType.determineCorrectBolusStepSize(insulinAfterConstraints)) {
                lines.add(rh.gs(app.aaps.core.ui.R.string.bolus_constraint_applied_warn, insulin, insulinAfterConstraints))
            }
        }

        // Tsunami duration
        if (duration > 0) {
            lines.add(
                rh.gs(R.string.tsunami_duration) + ": " + rh.gs(app.aaps.core.ui.R.string.format_mins, duration)
            )
        } else if (duration == 0 && state.isTsunamiActive) {
            lines.add(rh.gs(R.string.cancel_tsunami))
        }

        // Time
        if (state.eventTime != state.eventTimeOriginal) {
            lines.add(rh.gs(app.aaps.core.ui.R.string.time) + ": " + dateUtil.dateAndTimeString(state.eventTime))
        }

        // Notes
        if (state.notes.isNotEmpty()) {
            lines.add(rh.gs(app.aaps.core.ui.R.string.notes_label) + ": " + state.notes)
        }

        return lines
    }

    fun hasAction(): Boolean {
        val state = uiState.value
        val insulinAfterConstraints = constraintChecker.applyBolusConstraints(
            ConstraintObject(state.insulin, aapsLogger)
        ).value()
        return insulinAfterConstraints > 0 || state.duration > 0 || state.isTsunamiActive
    }

/*    fun showTsunamiSettings(tsunamiButtonsDef: PreferenceSubScreenDef) {
        viewModelScope.launch {
            sideEffect.emit(SideEffect.NavigateToSettings(tsunamiButtonsDef))
        }
    }

 */

    fun confirmAndSave(/*state: TsunamiDialogUiState*/) {
        //confirmedState = state
        viewModelScope.launch { confirmAndSaveSuspend() }
    }

    private suspend fun confirmAndSaveSuspend() {
        val state = confirmedState ?: return
        val insulin = state.insulin
        val insulinAfterConstraints = constraintChecker.applyBolusConstraints(
            ConstraintObject(insulin, aapsLogger)
        ).value()
        val duration = state.duration
        val time = state.eventTime
        val notes = state.notes
        val isTsunamiActive = state.isTsunamiActive
        val eventTimeChanged = state.eventTime != state.eventTimeOriginal

        if (insulinAfterConstraints > 0 || duration > 0) {
            if (insulinAfterConstraints > 0) {
                val detailedBolusInfo = DetailedBolusInfo().also {
                    it.eventType = TE.Type.CORRECTION_BOLUS
                    it.insulin = insulinAfterConstraints
                    it.context = null
                    it.notes = notes
                    it.timestamp = time
                }

                if (duration == 0) {
                    if (isTsunamiActive) {
                        persistenceLayer.cancelCurrentTsunamiModeIfAny(
                            timestamp = time,
                            action = Action.CANCEL_TSUNAMI_BOLUS,
                            source = Sources.TsunamiDialog,
                            note = notes,
                            listValues = listOf(
                                ValueWithUnit.Insulin(insulinAfterConstraints),
                            )
                        )
                    } else {
                        uel.log(
                            Action.BOLUS, Sources.TsunamiDialog,
                            notes,
                            ValueWithUnit.Insulin(insulinAfterConstraints)
                        )
                    }
                } else {
                    persistenceLayer.insertOrUpdateTsunami(
                        TSU(
                            timestamp = System.currentTimeMillis(),
                            duration = TimeUnit.MINUTES.toMillis(duration.toLong()),
                            tsunamiMode = 2
                        ),
                        action = Action.TSUNAMI_BOLUS,
                        source = Sources.TsunamiDialog,
                        note = notes,
                        listValues = listOf(
                            ValueWithUnit.Insulin(insulinAfterConstraints),
                            ValueWithUnit.Timestamp(time).takeIf { eventTimeChanged },
                            ValueWithUnit.Minute(duration)).filterNotNull()
                    )
                }

                commandQueue.bolus(detailedBolusInfo, object : Callback() {
                    override fun run() {
                        if (!result.success) {
                            sideEffect.tryEmit(SideEffect.ShowDeliveryError(result.comment))
                        } else {
                            automation.removeAutomationEventBolusReminder()
                        }
                    }
                })
            } else {
                persistenceLayer.insertOrUpdateTsunami(
                    TSU(
                        timestamp = System.currentTimeMillis(),
                        duration = TimeUnit.MINUTES.toMillis(duration.toLong()),
                        tsunamiMode = 2
                    ),
                    action = Action.TSUNAMI,
                    source = Sources.TsunamiDialog,
                    note = notes,
                    listValues = listOf(
                        ValueWithUnit.Timestamp(time).takeIf { eventTimeChanged },
                        ValueWithUnit.Minute(duration)).filterNotNull()
                )
            }
        } else if (isTsunamiActive) {
            persistenceLayer.cancelCurrentTsunamiModeIfAny(
                timestamp = time,
                action = Action.CANCEL_TSUNAMI,
                source = Sources.TsunamiDialog,
                note = notes,
                listValues = listOf()
            )
        }
    }
}
