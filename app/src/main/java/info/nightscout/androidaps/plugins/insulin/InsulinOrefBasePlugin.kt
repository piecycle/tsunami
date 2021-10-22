package info.nightscout.androidaps.plugins.insulin

import dagger.android.HasAndroidInjector
import info.nightscout.androidaps.R
import info.nightscout.androidaps.data.Iob
import info.nightscout.androidaps.db.Treatment
import info.nightscout.androidaps.interfaces.*
import info.nightscout.androidaps.logging.AAPSLogger
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import info.nightscout.androidaps.plugins.general.overview.events.EventNewNotification
import info.nightscout.androidaps.plugins.general.overview.notifications.Notification
import info.nightscout.androidaps.utils.resources.ResourceHelper
import info.nightscout.androidaps.utils.sharedPreferences.SP
import javax.inject.Inject

/**
 * Created by adrian on 13.08.2017.
 *
 * parameters are injected from child class
 *
 */
abstract class InsulinOrefBasePlugin(
    injector: HasAndroidInjector,
    resourceHelper: ResourceHelper,
    val profileFunction: ProfileFunction,
    val rxBus: RxBusWrapper, aapsLogger: AAPSLogger
) : PluginBase(PluginDescription()
    .mainType(PluginType.INSULIN)
    .fragmentClass(InsulinFragment::class.java.name)
    .pluginIcon(R.drawable.ic_insulin)
    .shortName(R.string.insulin_shortname)
    .visibleByDefault(false),
    aapsLogger, resourceHelper, injector
), InsulinInterface {

    private var lastWarned: Long = 0
    override val dia
        get(): Double {
            val dia = userDefinedDia
            return if (dia >= MIN_DIA) {
                dia
            } else {
                sendShortDiaNotification(dia)
                MIN_DIA
            }
        }

    open fun sendShortDiaNotification(dia: Double) {
        if (System.currentTimeMillis() - lastWarned > 60 * 1000) {
            lastWarned = System.currentTimeMillis()
            val notification = Notification(Notification.SHORT_DIA, String.format(notificationPattern, dia, MIN_DIA), Notification.URGENT)
            rxBus.send(EventNewNotification(notification))
        }
    }

    private val notificationPattern: String
        get() = resourceHelper.gs(R.string.dia_too_short)

    open val userDefinedDia: Double
        get() {
            val profile = profileFunction.getProfile()
            return profile?.dia ?: MIN_DIA
        }

    //MP Original PK based model for insulin activity / IOB calculations

/*    override fun iobCalcForTreatment(treatment: Treatment, time: Long, dia: Double): Iob {
        val result = Iob()
        val peak = peak
        if (treatment.insulin != 0.0) {
            val bolusTime = treatment.date
            val t = (time - bolusTime) / 1000.0 / 60.0
            val td = dia * 60 //getDIA() always >= MIN_DIA
            val tp = peak.toDouble()
            // force the IOB to 0 if over DIA hours have passed
            if (t < td) {
                val tau = tp * (1 - tp / td) / (1 - 2 * tp / td)
                val a = 2 * tau / td
                val S = 1 / (1 - a + (1 + a) * Math.exp(-td / tau))
                result.activityContrib = treatment.insulin * (S / Math.pow(tau, 2.0)) * t * (1 - t / td) * Math.exp(-t / tau)
                result.iobContrib = treatment.insulin * (1 - S * (1 - a) * ((Math.pow(t, 2.0) / (tau * td * (1 - a)) - t / tau - 1) * Math.exp(-t / tau) + 1))
            }
        }
        return result
    }
*/
    //MP Below: Modified, PD for Lyumjev based model for calculating IOB & insulin activity

    @Inject lateinit var activePlugin: ActivePluginProvider
    //private val insulinInterface = activePlugin.activeInsulin
    //private val insulinID = insulinInterface.id.value

    override fun iobCalcForTreatment(treatment: Treatment, time: Long, dia: Double): Iob {
        val insulinInterface = activePlugin.activeInsulin
        val insulinID = insulinInterface.id.value
        val result = Iob()
        if (treatment.insulin != 0.0) {
            val bolusTime = treatment.date
            val t = (time - bolusTime) / 1000.0 / 60.0
            // force the IOB to 0 if over DIA hours have passed
            if (t < 8 * 60 && (insulinID == 5 || insulinID == 6)) { //MP: Fixed DIA cut-off of 8 h - the model automatically changes its DIA based on the bolus size, thus no user-set DIA is required.
                //MP Model for estimation of PD-based peak time: (A0 + A1*X)/(1+B1*X), where X = bolus size
                val A0 = 61.33
                val A1 = 12.27
                val B1 = 0.05185
                val tp: Double
                if (insulinID == 6) { //MP ID = 6 for Lyumjev U200
                    tp = (A0 + A1 * 2 * treatment.insulin)/(1 + B1 * 2 * treatment.insulin)
                } else {
                    tp = (A0 + A1 * treatment.insulin) / (1 + B1 * treatment.insulin)
                }
                val tp_model = Math.pow(tp, 2.0) * 2 //MP The peak time in the model is defined as half of the square root of this variable - thus the tp entered into the model must be transformed first
                //MP Calculate remaining IOB of this bolus (PD based approach)
                var pct_ins_left = 0.0 //MP insulin equivalents in U that are still "unused"
                for (i in 0..t.toInt()) {
                    pct_ins_left += (2 * treatment.insulin / tp_model) * i * Math.exp((-Math.pow(i.toDouble(), 2.0) / tp_model))
                }
                /**
                 *
                 * MP - UAM Tsunami PD model U100 vs U200
                 *
                 * InsActinvity calculation below: The same formula is used for both, U100 and U200
                 * insulin as the concentration effect is already included in the peak time calculation.
                 * If peak time is kept constant and only the dose is doubled, the general shape of the
                 * curve doesn't change and hence the equation does not need adjusting. Unless a global
                 * U200 mode is introduced where ISF between U100 and U200 has the same value (i.e.: When
                 * ISF doubling and basal halving is done in AAPS' calculations and not by the user), the
                 * equation doesn't need any changing.
                 * The user must keep in mind that the displayed IOB is only half of the actual IOB.
                 *
                 */
                result.activityContrib = (2 * treatment.insulin / tp_model) * t * Math.exp((-Math.pow(t, 2.0) / tp_model))
                result.iobContrib = treatment.insulin * (1 - (pct_ins_left/treatment.insulin))
            } else {
                // MP: If an insulin type other than LYUMJEV is used, use the traditional PK-based insulin model;
                val peak = peak
                val td = dia * 60 //getDIA() always >= MIN_DIA
                val tp = peak.toDouble()
                // force the IOB to 0 if over DIA hours have passed
                if (t < td) {
                    val tau = tp * (1 - tp / td) / (1 - 2 * tp / td)
                    val a = 2 * tau / td
                    val S = 1 / (1 - a + (1 + a) * Math.exp(-td / tau))
                    result.activityContrib = treatment.insulin * (S / Math.pow(tau, 2.0)) * t * (1 - t / td) * Math.exp(-t / tau)
                    result.iobContrib = treatment.insulin * (1 - S * (1 - a) * ((Math.pow(t, 2.0) / (tau * td * (1 - a)) - t / tau - 1) * Math.exp(-t / tau) + 1))
                }
            }
        }
        return result
    }

    override val comment
        get(): String {
            var comment = commentStandardText()
            val userDia = userDefinedDia
            if (userDia < MIN_DIA) {
                comment += "\n" + resourceHelper.gs(R.string.dia_too_short, userDia, MIN_DIA)
            }
            return comment
        }

    abstract val peak: Int
    abstract fun commentStandardText(): String

    companion object {

        const val MIN_DIA = 5.0
    }
}