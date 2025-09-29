package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.core.data.model.RM
import app.aaps.core.data.time.T
import app.aaps.core.interfaces.aps.Loop
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.objects.constraints.ConstraintObject
import app.aaps.plugins.constraints.R
import app.aaps.plugins.constraints.safety.SafetyPlugin
import dagger.android.HasAndroidInjector
import javax.inject.Inject

@Suppress("SpellCheckingInspection")
class Objective5(injector: HasAndroidInjector) : Objective(injector, "maxiobzero", R.string.objectives_maxiobzero_objective, R.string.objectives_maxiobzero_gate) {

    @Inject lateinit var safetyPlugin: SafetyPlugin
    @Inject lateinit var aapsLogger: AAPSLogger
    @Inject lateinit var loop: Loop

    init {
        tasks.add(MinimumDurationTask(this, T.days(5).msecs()).learned(Learned(R.string.objectives_maxiobzero_learned)))
    }
}