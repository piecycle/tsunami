package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.core.data.model.RM
import app.aaps.core.data.time.T
import app.aaps.core.interfaces.aps.Loop
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.plugins.constraints.R
import dagger.android.HasAndroidInjector
import javax.inject.Inject

@Suppress("SpellCheckingInspection")
class Objective6(injector: HasAndroidInjector) : Objective(injector, "maxiob", R.string.objectives_maxiob_objective, R.string.objectives_maxiob_gate) {

    @Inject lateinit var constraintChecker: ConstraintsChecker
    @Inject lateinit var loop: Loop

    init {
        tasks.add(MinimumDurationTask(this, T.days(1).msecs()))
        tasks.add(
            object : Task(this, R.string.closedmodeenabled) {
                override fun isCompleted(): Boolean = loop.runningMode == RM.Mode.CLOSED_LOOP
            })
        tasks.add(
            object : Task(this, R.string.maxiobset) {

                override fun isCompleted(): Boolean {
                    val maxIOB = constraintChecker.getMaxIOBAllowed().value()
                    return maxIOB > 0
                }
            }.learned(Learned(R.string.objectives_maxiob_learned))
        )
    }
}