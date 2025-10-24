package app.aaps.plugins.source

import android.content.Context
import android.os.Bundle
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import androidx.work.testing.TestListenableWorkerBuilder
import app.aaps.core.data.time.T
import app.aaps.core.interfaces.receivers.Intents
import app.aaps.core.keys.BooleanKey
import app.aaps.core.utils.receivers.DataWorkerStorage
import app.aaps.shared.tests.BundleMock
import app.aaps.shared.tests.TestBaseWithProfile
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`

class XdripSourcePluginTest : TestBaseWithProfile() {

    private lateinit var xdripSourcePlugin: XdripSourcePlugin
    private lateinit var dataWorkerStorage: DataWorkerStorage

    init {
        addInjector {
            if (it is XdripSourcePlugin.XdripSourceWorker) {
                it.dataWorkerStorage = dataWorkerStorage
                it.dateUtil = dateUtil
                it.preferences = preferences
            }
        }
    }

    @BeforeEach
    fun setup() {
        xdripSourcePlugin = XdripSourcePlugin(rh, aapsLogger)
        dataWorkerStorage = DataWorkerStorage(context)
    }

    private fun prepareWorker(
        sensorStartTime: Long? = dateUtil.now(),
        logNsSensorChange: Boolean = true,
    ): Pair<Bundle, XdripSourcePlugin.XdripSourceWorker> {
        val bundle = BundleMock.mock()
        sensorStartTime?.let { bundle.putLong(Intents.EXTRA_SENSOR_STARTED_AT, sensorStartTime) }
        `when`(preferences.get(BooleanKey.BgSourceCreateSensorChange)).thenReturn(logNsSensorChange)

        lateinit var worker: XdripSourcePlugin.XdripSourceWorker
        TestListenableWorkerBuilder<XdripSourcePlugin.XdripSourceWorker>(context)
            .setWorkerFactory(object : WorkerFactory() {
                override fun createWorker(appContext: Context, workerClassName: String, workerParameters: WorkerParameters): XdripSourcePlugin.XdripSourceWorker {
                    worker = XdripSourcePlugin.XdripSourceWorker(context, workerParameters)
                    return worker
                }
            })
            .setInputData(dataWorkerStorage.storeInputData(bundle, Intents.ACTION_NEW_BG_ESTIMATE)).build()

        return Pair(bundle, worker)
    }

    @Test fun advancedFilteringSupported() {
        assertThat(xdripSourcePlugin.advancedFilteringSupported()).isFalse()
    }

    @Test fun getSensorStartTime_withoutValue_returnsNull() {
        val (bundle, worker) = prepareWorker(sensorStartTime = null)

        val result = worker.getSensorStartTime(bundle)

        assertThat(result).isNull()
    }

    @Test fun getSensorStartTime_withSettingDisabled_returnsNull() {
        val sensorStartTime = dateUtil.now()
        val (bundle, worker) = prepareWorker(sensorStartTime = sensorStartTime, logNsSensorChange = false)

        val result = worker.getSensorStartTime(bundle)

        assertThat(result).isNull()
    }

    @Test fun getSensorStartTime_withRecentValue_returnsStartTime() {
        val sensorStartTime = dateUtil.now()
        val (bundle, worker) = prepareWorker(sensorStartTime = sensorStartTime)

        val result = worker.getSensorStartTime(bundle)

        assertThat(result).isEqualTo(sensorStartTime)
    }

    @Test fun getSensorStartTime_withOldValue_returnsNull() {
        val sensorStartTime = dateUtil.now() - T.months(2).msecs()
        val (bundle, worker) = prepareWorker(sensorStartTime = sensorStartTime)

        val result = worker.getSensorStartTime(bundle)

        assertThat(result).isNull()
    }
}
