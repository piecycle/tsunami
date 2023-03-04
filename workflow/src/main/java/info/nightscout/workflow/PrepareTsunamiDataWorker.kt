package info.nightscout.workflow

import android.content.Context
import android.graphics.Color
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import info.nightscout.core.graph.OverviewData
import info.nightscout.core.utils.receivers.DataWorkerStorage
import info.nightscout.core.utils.worker.LoggingWorker
import info.nightscout.database.ValueWrapper
import info.nightscout.database.impl.AppRepository
import info.nightscout.interfaces.aps.Loop
import info.nightscout.interfaces.profile.ProfileFunction
import info.nightscout.rx.bus.RxBus
import info.nightscout.shared.interfaces.ResourceHelper
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
    @Inject lateinit var repository: AppRepository
    @Inject lateinit var loop: Loop
    @Inject lateinit var rxBus: RxBus
    var ctx: Context
    init {
        ctx = rh.getThemedCtx(context)
    }

    class PrepareTsunamiData(
        val overviewData: OverviewData
    )

    override suspend fun doWorkAndLog(): Result {

        val data = dataWorkerStorage.pickupObject(inputData.getLong(DataWorkerStorage.STORE_KEY, -1)) as PrepareTsunamiData?
            ?: return Result.failure(workDataOf("Error" to "missing input data"))

        //rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, 0, null)) //MP For inclusion of tsunami to graph loading bar
        var toTime = data.overviewData.toTime
        //val fromTime = data.overviewData.fromTime  //MP For inclusion of tsunami to graph loading bar
        val tsunamiArray: MutableList<DataPoint> = ArrayList()
        var lastTsunami = -1.0
        loop.lastRun?.constraintsProcessed?.let { toTime = max(it.latestPredictionsTime, toTime) }
        var time = data.overviewData.fromTime
        //val upperLimit = data.overviewData.maxBgValue//maxOf(data.overviewData.maxBgValue, data.overviewData.maxIAValue, data.overviewData.maxBasalValueFound, data.overviewData.maxCobValueFound)
        val upperLimit = 160.0 // MP for testing only

        while (time < toTime) {
            //val progress = (time - fromTime).toDouble() / (toTime - fromTime) * 100.0 //MP For inclusion of tsunami to graph loading bar
            //rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, progress.toInt(), null)) //MP For inclusion of tsunami to graph loading bar
            val tsuEnabled = repository.getTsunamiModeActiveAt(time).blockingGet()
            val currentTsunami: Double = if (tsuEnabled is ValueWrapper.Existing) {
                upperLimit
            } else {
                0.0
            }
            if (currentTsunami != lastTsunami) {
                if (lastTsunami != -1.0) tsunamiArray.add(DataPoint(time.toDouble()/*/(1000*60*60)*/, lastTsunami))
                tsunamiArray.add(DataPoint(time.toDouble()/*/(1000*60*60)*/, currentTsunami))
            }
            lastTsunami = currentTsunami
            time += 5 * 60 * 1000L
        }
        // final points
        val tsuEnabled = repository.getTsunamiModeActiveAt(System.currentTimeMillis()).blockingGet()
        if (tsuEnabled is ValueWrapper.Existing) {
            tsunamiArray.add(DataPoint((tsuEnabled.value.timestamp + tsuEnabled.value.duration).toDouble(), upperLimit)) //MP upperLimit must not exceed chart height, else background will be invisible!
            tsunamiArray.add(DataPoint((tsuEnabled.value.timestamp + tsuEnabled.value.duration).toDouble(), 0.0))
        }

        // create series
        data.overviewData.tsunamiSeries = LineGraphSeries(Array(tsunamiArray.size) { i -> tsunamiArray[i] }).also {
            it.isDrawBackground = true
            it.backgroundColor = Color.argb(50, 0, 211, 141)
            it.thickness = 0
        }
        //rxBus.send(EventIobCalculationProgress(CalculationWorkflow.ProgressData.PREPARE_TSUNAMI_DATA, 100, null)) //MP For inclusion of tsunami to graph loading bar
        return Result.success()
    }
}