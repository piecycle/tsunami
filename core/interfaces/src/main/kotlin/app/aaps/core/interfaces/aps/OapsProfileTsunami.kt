package app.aaps.core.interfaces.aps

import kotlinx.serialization.Serializable

@Serializable
data class OapsProfileTsunami(
    var dia: Double, // AMA & Tsunami only
    var min_5m_carbimpact: Double, // AMA only
    var max_iob: Double,
    var max_daily_basal: Double,
    var max_basal: Double,
    var min_bg: Double,
    var max_bg: Double,
    var target_bg: Double,
    var carb_ratio: Double,
    var sens: Double,
    var autosens_adjust_targets: Boolean, // AMA only
    var max_daily_safety_multiplier: Double,
    var current_basal_safety_multiplier: Double,
    var high_temptarget_raises_sensitivity: Boolean,
    var low_temptarget_lowers_sensitivity: Boolean,
    var sensitivity_raises_target: Boolean,
    var resistance_lowers_target: Boolean,
    var adv_target_adjustments: Boolean,
    var exercise_mode: Boolean,
    var half_basal_exercise_target: Int,
    var maxCOB: Int,
    var skip_neutral_temps: Boolean,
    var remainingCarbsCap: Int,
    var enableUAM: Boolean,
    var A52_risk_enable: Boolean,
    var SMBInterval: Int,
    var enableSMB_with_COB: Boolean,
    var enableSMB_with_temptarget: Boolean,
    var allowSMB_with_high_temptarget: Boolean,
    var enableSMB_always: Boolean,
    var enableSMB_after_carbs: Boolean,
    var maxSMBBasalMinutes: Int,
    var maxUAMSMBBasalMinutes: Int,
    var bolus_increment: Double,
    var carbsReqThreshold: Int,
    var current_basal: Double,
    var temptargetSet: Boolean,
    var autosens_max: Double,
    var out_units: String,
    var lgsThreshold: Int?,
    //DynISF only
    var variable_sens: Double,
    var insulinDivisor: Int,
    var TDD: Double,
    //MP Tsunami specific variables
    var tsunamiModeID: Int,
    var peakTime: Double,
    var insulinID: Int,
    //var tsuSMBCap: Double,
    //var tsuInsReqPCT: Int,
    var percentage: Int,
    //var tsunamiActive: Boolean,
    var enableWaveMode: Boolean,
    var waveStart: Double,
    var waveEnd: Double,
    var referenceTimer: Double,
    var waveUseSMBCap: Boolean,
    var SMBcap : Double,
    var insulinReqPCT : Double,
    var activityTarget : Double,
    var deltaReductionPCT : Double,
    //var waveSMBCap: Double,
    //var waveInsReqPCT: Int,
    //var tsuSMBCapScaling: Boolean,
    //var tsuActivityTarget: Int,
    //var waveSMBCapScaling: Boolean,
    //var waveActivityTarget: Int,
    var futureActivity: Double,
    var activityPredTime: Double,
    var sensorLagActivity: Double,
    var historicActivity: Double,
    var currentActivity: Double,
    var deltaScore: Double,
    var lastBolus: Double
)