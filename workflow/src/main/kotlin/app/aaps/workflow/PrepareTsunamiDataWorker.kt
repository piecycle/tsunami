package app.aaps.workflow

import android.content.Context
import android.graphics.Color
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import app.aaps.core.graph.data.LineGraphSeries
import app.aaps.core.interfaces.aps.Loop
import app.aaps.core.interfaces.db.PersistenceLayer
import app.aaps.core.interfaces.overview.OverviewData
import app.aaps.core.interfaces.profile.ProfileFunction
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.core.interfaces.rx.bus.RxBus
import app.aaps.core.interfaces.rx.events.EventIobCalculationProgress
import app.aaps.core.interfaces.workflow.CalculationWorkflow
import app.aaps.core.objects.workflow.LoggingWorker
import app.aaps.core.utils.receivers.DataWorkerStorage
import com.jjoe64.graphview.series.DataPoint
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.math.max

class PrepareTsunamiDataWorker(
    context: Context,
    params: WorkerParameters
) : LoggingWorker(context, params, Dispatchers.Default) {

    @Inject lateinit var dataWorkerStorage: DataWorkerStorage
    @Inject lateinit var profileFunction: ProfileFunction
    @Inject lateinit var rh: ResourceHelper
    @Inject lateinit var persistenceLayer: PersistenceLayer
    @Inject lateinit var loop: Loop
    @Inject lateinit var rxBus: RxBus
    private var ctx: Context

    init {
        ctx = rh.getThemedCtx(context)
    }

    class PrepareTsunamiData(
        val overviewData: OverviewData
    )

    override suspend fun doWorkAndLog(): Result {

        val data = dataWorkerStorage.pickupObject(inputData.getLong(DataWorkerStorage.STORE_KEY, -1)) as PrepareTsunamiData?
            ?: return Result.failure(workDataOf("Error" to "missing input data"))

        rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, 0, null)) //MP For inclusion of tsunami to graph loading bar
        val tsunamiArray: MutableList<DataPoint> = ArrayList()
        var lastTsunami = -1.0
        var endTime = data.overviewData.endTime
        val fromTime = data.overviewData.fromTime  //MP For inclusion of tsunami to graph loading bar
        loop.lastRun?.constraintsProcessed?.let { endTime = max(it.latestPredictionsTime, endTime) }
        var time = fromTime
        val upperLimit = data.overviewData.maxBgValue//maxOf(data.overviewData.maxBgValue, data.overviewData.maxIAValue, data.overviewData.maxBasalValueFound, data.overviewData.maxCobValueFound)

        while (time < endTime) {
            val progress = (time - fromTime).toDouble() / (endTime - fromTime) * 100.0 //MP For inclusion of tsunami to graph loading bar
            rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, progress.toInt(), null)) //MP For inclusion of tsunami to graph loading bar
            val tsuEnabled = persistenceLayer.getTsunamiActiveAt(time)
            val currentTsunami: Double = if (tsuEnabled != null) {//MP used to be (tsuEnabled is ValueWrapper.Existing)
                upperLimit
            } else {
                0.0
            }
            if (currentTsunami != lastTsunami) {
                if (lastTsunami != -1.0) tsunamiArray.add(DataPoint(time.toDouble()/*/(1000*60*60)*/, lastTsunami))
                tsunamiArray.add(DataPoint(time.toDouble()/*/(1000*60*60)*/, currentTsunami))
            }
            lastTsunami = currentTsunami
            time += /*5 * */ 60 * 1000L //MP: Doing it in steps of 5 minutes might lead to little pyramids at the end of a tsunami mode box, because the final points are drawn with ms precision.
        }



        // final points
        val tsunami = persistenceLayer.getTsunamiActiveAt(System.currentTimeMillis())
        if (tsunami != null) { //MP used to be (tsunami is ValueWrapper.Existing)
            tsunamiArray.add(DataPoint((tsunami.end).toDouble(), upperLimit)) //MP upperLimit must not exceed chart height, else background will be invisible!
            tsunamiArray.add(DataPoint((tsunami.end).toDouble(), 0.0))
        }
        // create series
        data.overviewData.tsunamiSeries = LineGraphSeries(Array(tsunamiArray.size) { i -> tsunamiArray[i] }).also {
            it.isDrawBackground = true
            it.backgroundColor = Color.argb(50, 0, 211, 141)
            //it.backgroundColor = rh.gac(ctx, info.nightscout.core.ui.R.attr.baseBasalColor ) //for testing
            it.thickness = 0
        }
        rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, 100, null)) //MP For inclusion of tsunami to graph loading bar
        return Result.success()
    }
}