package app.aaps.ui.dialogs

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.aaps.core.data.model.TE
import app.aaps.core.data.model.TSU
import app.aaps.core.data.ue.Action
import app.aaps.core.data.ue.Sources
import app.aaps.core.data.ue.ValueWithUnit
import app.aaps.core.interfaces.aps.Loop
import app.aaps.core.interfaces.automation.Automation
import app.aaps.core.interfaces.configuration.Config
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.core.interfaces.db.PersistenceLayer
import app.aaps.core.interfaces.logging.LTag
import app.aaps.core.interfaces.logging.UserEntryLogger
import app.aaps.core.interfaces.plugin.ActivePlugin
import app.aaps.core.interfaces.profile.ProfileFunction
import app.aaps.core.interfaces.profile.ProfileUtil
import app.aaps.core.interfaces.protection.ProtectionCheck
import app.aaps.core.interfaces.pump.DetailedBolusInfo
import app.aaps.core.interfaces.pump.defs.determineCorrectBolusStepSize
import app.aaps.core.interfaces.queue.Callback
import app.aaps.core.interfaces.queue.CommandQueue
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.ui.UiInteraction
import app.aaps.core.interfaces.utils.DecimalFormatter
import app.aaps.core.interfaces.utils.SafeParse
import app.aaps.core.keys.DoubleKey
import app.aaps.core.keys.IntKey
import app.aaps.core.objects.constraints.ConstraintObject
import app.aaps.core.objects.extensions.formatColor
import app.aaps.core.ui.dialogs.OKDialog
import app.aaps.core.ui.toast.ToastUtils
import app.aaps.core.utils.HtmlHelper
import app.aaps.ui.R
import app.aaps.ui.databinding.DialogTsunamiBinding
import app.aaps.ui.extensions.toSignedString
import com.google.common.base.Joiner
import dagger.android.HasAndroidInjector
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.plusAssign
import java.text.DecimalFormat
import java.util.LinkedList
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.math.abs
import kotlin.math.max

class TsunamiDialog : DialogFragmentWithDate() {

    @Inject lateinit var constraintChecker: ConstraintsChecker
    @Inject lateinit var rh: ResourceHelper
    @Inject lateinit var profileFunction: ProfileFunction
    @Inject lateinit var profileUtil: ProfileUtil
    @Inject lateinit var commandQueue: CommandQueue
    @Inject lateinit var activePlugin: ActivePlugin
    @Inject lateinit var ctx: Context
    @Inject lateinit var config: Config
    @Inject lateinit var automation: Automation
    @Inject lateinit var uel: UserEntryLogger
    @Inject lateinit var protectionCheck: ProtectionCheck
    @Inject lateinit var uiInteraction: UiInteraction
    @Inject lateinit var persistenceLayer: PersistenceLayer
    @Inject lateinit var decimalFormatter: DecimalFormatter
    @Inject lateinit var injector: HasAndroidInjector
    @Inject lateinit var loop: Loop

    private var queryingProtection = false
    private val disposable = CompositeDisposable()
    private var _binding: DialogTsunamiBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    private val textWatcher: TextWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable) {
            _binding?.let {
                validateInputs()
            }
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    }

    private fun validateInputs() {
        val maxInsulin = constraintChecker.getMaxBolusAllowed().value()
        //max tsunami duration = 5 h
        if (abs(binding.tsuDuration.value.toInt()) > 5 * 60) {
            binding.tsuDuration.value = 0.0
            ToastUtils.warnToast(context, app.aaps.core.ui.R.string.constraint_applied)
        }
        if (binding.amount.value > maxInsulin) {
            binding.amount.value = 0.0
            ToastUtils.warnToast(context, R.string.bolus_constraint_applied)
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putDouble("tsuDuration", binding.tsuDuration.value)
        savedInstanceState.putDouble("amount", binding.amount.value)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        onCreateViewGeneral()
        _binding = DialogTsunamiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //InsulinDialog.kt has code here handling the 'record only' checkbox - there is no need for it here.
        val maxInsulin = constraintChecker.getMaxBolusAllowed().value()

        //Define time picker & the default tsuDuration set by the user
        binding.tsuDuration.setParams(
            savedInstanceState?.getDouble("tsuDuration")
                ?: preferences.get(IntKey.TsuDefaultDuration).toDouble(), 0.0, 300.0, 30.0,
            DecimalFormat("0"), false, binding.okcancel.ok, textWatcher
        )
        //Define (pre)bolus picker
        binding.amount.setParams(
            savedInstanceState?.getDouble("amount")
                ?: 0.0, 0.0, maxInsulin, activePlugin.activePump.pumpDescription.bolusStep, decimalFormatter.pumpSupportedBolusFormat(activePlugin.activePump.pumpDescription.bolusStep), false, binding.okcancel.ok, textWatcher
        )

        //Definition of (pre)bolus increments
        val plus05Text = preferences.get(DoubleKey.TsuButtonIncrement1).toSignedString(activePlugin.activePump, decimalFormatter)
        binding.plus05.text = plus05Text
        binding.plus05.contentDescription = rh.gs(app.aaps.core.ui.R.string.overview_insulin_label) + " " + plus05Text
        binding.plus05.setOnClickListener {
            binding.amount.value = max(0.0, binding.amount.value + preferences.get(DoubleKey.TsuButtonIncrement1))
            validateInputs()
            binding.amount.announceValue()
        }
        val plus10Text = preferences.get(DoubleKey.TsuButtonIncrement2).toSignedString(activePlugin.activePump, decimalFormatter)
        binding.plus10.text = plus10Text
        binding.plus10.contentDescription = rh.gs(app.aaps.core.ui.R.string.overview_insulin_label) + " " + plus10Text
        binding.plus10.setOnClickListener {
            binding.amount.value = max(0.0, binding.amount.value + preferences.get(DoubleKey.TsuButtonIncrement2))
            validateInputs()
            binding.amount.announceValue()
        }
        val plus20Text = preferences.get(DoubleKey.TsuButtonIncrement3).toSignedString(activePlugin.activePump, decimalFormatter)
        binding.plus20.text = plus20Text
        binding.plus20.contentDescription = rh.gs(app.aaps.core.ui.R.string.overview_insulin_label) + " " + plus20Text
        binding.plus20.setOnClickListener {
            binding.amount.value = max(0.0, binding.amount.value + preferences.get(DoubleKey.TsuButtonIncrement3))
            validateInputs()
            binding.amount.announceValue()
        }

        //InsulinDialog.kt has code here handling the 'record only' checkbox - there is no need for it here.
        //Check in the database if Tsunami mode is active, decide if the 'cancel' button should be displayed and define what to do if the user hits the cancel button.

        if (persistenceLayer.getTsunamiActiveAt(dateUtil.now()) != null)
            binding.tsuCancel.visibility = View.VISIBLE
        else
            binding.tsuCancel.visibility = View.GONE

        binding.tsuCancel.setOnClickListener {
            binding.tsuDuration.value = 0.0
            binding.amount.value = 0.0
            if (submit()) dismiss()
        }
        binding.tsunamiLabel.labelFor = binding.amount.editTextId
    }

    override fun onDestroyView() {
        super.onDestroyView()
        disposable.clear()
        _binding = null
    }

    override fun submit(): Boolean {
        if (_binding == null) return false
        val pumpDescription = activePlugin.activePump.pumpDescription
        val insulin = SafeParse.stringToDouble(binding.amount.text)
        val insulinAfterConstraints = constraintChecker.applyBolusConstraints(ConstraintObject(insulin, aapsLogger)).value()
        val actions: LinkedList<String?> = LinkedList()
        val duration = binding.tsuDuration.value.toInt()
        val isTsunamiActive : Boolean
        if (persistenceLayer.getTsunamiActiveAt(dateUtil.now()) != null) isTsunamiActive = true else isTsunamiActive = false
        //val units = profileFunction.getUnits()
        //InsulinDialog has code here for the recordOnlyCheckbox - not needed here (this includes unitlabel)

        if (insulinAfterConstraints > 0) {
            actions.add(
                rh.gs(app.aaps.core.ui.R.string.bolus) + ": " + decimalFormatter.toPumpSupportedBolus(insulinAfterConstraints, activePlugin.activePump.pumpDescription.bolusStep).formatColor(context, rh, app.aaps.core.ui.R.attr.bolusColor))
        //InsulinDialog has code here for the recordOnlyCheckbox - not needed here
            if (abs(insulinAfterConstraints - insulin) > pumpDescription.pumpType.determineCorrectBolusStepSize(insulinAfterConstraints))
                actions.add(
                    rh.gs(app.aaps.core.ui.R.string.bolus_constraint_applied_warn, insulin, insulinAfterConstraints).formatColor(context, rh, app.aaps.core.ui.R.attr.warningColor))
        }
        //InsulinDialog has code here for the eatingSoon checkbox - only the second half of the code snippet is used here in modified form for tsuDuration
        if (duration > 0) {
            actions.add(
                //line below is a truncated version of the code in insulinDialog (there's no glucose target to be defined here, just the time, thus unitlabel isn't necessary
                rh.gs(R.string.tsunami_duration) + ": " + rh.gs(app.aaps.core.ui.R.string.format_mins, duration)
                    .formatColor(context, rh, app.aaps.core.ui.R.attr.icTsunamiColor)
            )
        } else if (duration == 0 && isTsunamiActive) {
            actions.add(rh.gs(R.string.cancel_tsunami))
        }

        //InsulinDialog.kt has extra code here to insert bolus offsets into the actions list, but there are no bolus offsets in the Tsunami dialog
        //TODO: Check if extra code for the actions list is needed.
        val time = dateUtil.now()

        val notes = binding.notesLayout.notes.text.toString()
        if (notes.isNotEmpty())
            actions.add(rh.gs(app.aaps.core.ui.R.string.notes_label) + ": " + notes)

        //Submit
        if (insulinAfterConstraints > 0 || duration > 0) {
            activity?.let { activity ->
                OKDialog.showConfirmation(
                    activity,
                    rh.gs(R.string.tsunami_label),
                    HtmlHelper.fromHtml(Joiner.on("<br/>").join(actions)),
                    {//MP: String is header string of confirmation window if there is a bolus
                        //InsulinDialog.kt has an extra code block here for the eatingSoon TT that's not needed here. Instead, handle Tsunami duration here.
                        if (insulinAfterConstraints > 0) { //If the user wants to issue a bolus...
                            val detailedBolusInfo = DetailedBolusInfo()
                            detailedBolusInfo.eventType = TE.Type.CORRECTION_BOLUS
                            detailedBolusInfo.insulin = insulinAfterConstraints
                            detailedBolusInfo.context = context
                            detailedBolusInfo.notes = notes
                            detailedBolusInfo.timestamp = time
                            if (duration == 0) { //If duration is 0, handle it like a normal bolus (with slight modifications as there are no offsets) else flag it as a tsunami bolus
                                if (isTsunamiActive) { //MP If issuing bolus with Tsu duration == 0 while Tsunami currently active --> issue bolus an cancel tsunami
                                    disposable += persistenceLayer.cancelCurrentTsunamiModeIfAny(
                                        timestamp = eventTime,
                                        action = Action.CANCEL_TSUNAMI_BOLUS,
                                        source = Sources.TsunamiDialog,
                                        note = notes,
                                        listValues = listOf(
                                            ValueWithUnit.Insulin(insulinAfterConstraints),
                                            )
                                    ).subscribe()
                                } else { //MP Issue bolus through Tsunami Dialog while Tsunami currently not active and duration == 0
                                    uel.log(
                                        Action.BOLUS, Sources.TsunamiDialog,
                                        notes,
                                        ValueWithUnit.Insulin(insulinAfterConstraints)
                                    )
                                }
                            } else { //If there is a Tsunami duration... //TODO: CHECK if this can be removed
                                disposable += persistenceLayer.insertOrUpdateTsunami(
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
                                        ValueWithUnit.Minute(duration))
                                ).subscribe()
                            }
                            commandQueue.bolus(detailedBolusInfo, object : Callback() {
                                override fun run() {
                                    if (!result.success) {
                                        uiInteraction.runAlarm(result.comment, rh.gs(app.aaps.core.ui.R.string.treatmentdeliveryerror), app.aaps.core.ui.R.raw.boluserror)
                                    } else {
                                        automation.removeAutomationEventBolusReminder()
                                    }
                                }
                            })
                        } else { //If the user does not issue a bolus and only wants to switch on tsunami mode (condition bolus == 0 is always true)
                            disposable += persistenceLayer.insertOrUpdateTsunami(
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
                                    ValueWithUnit.Minute(duration))
                            ).subscribe()
                        }
                    })
            }
        } else if (isTsunamiActive) {//MP: No bolus & no tsu duration, but tsu is current active --> cancel tsunami
            activity?.let { activity ->
                OKDialog.showConfirmation(
                    activity,
                    rh.gs(R.string.tsunami_label),
                    HtmlHelper.fromHtml(Joiner.on("<br/>").join(actions)),
                    {//MP: String is header string of confirmation window
                        disposable += persistenceLayer.cancelCurrentTsunamiModeIfAny(
                            timestamp = eventTime,
                            action = Action.CANCEL_TSUNAMI,
                            source = Sources.TsunamiDialog,
                            note = notes,
                            listValues = listOf()
                        ).subscribe()
                    })
            }
        } else //MP: No bolus, no tsu duration and currently no tsunami running --> Do nothing.
            activity?.let { activity ->
                OKDialog.show(activity, rh.gs(R.string.tsunami_label), rh.gs(app.aaps.core.ui.R.string.no_action_selected))
            }
        return true
    }

    override fun onResume() {
        super.onResume()
        if (!queryingProtection) {
            queryingProtection = true
            activity?.let { activity ->
                val cancelFail = {
                    queryingProtection = false
                    aapsLogger.debug(LTag.APS, "Dialog canceled on resume protection: ${this.javaClass.simpleName}")
                    ToastUtils.warnToast(ctx, R.string.dialog_canceled)
                    dismiss()
                }
                protectionCheck.queryProtection(activity, ProtectionCheck.Protection.BOLUS, { queryingProtection = false }, cancelFail, cancelFail)
            }
        }
    }
}