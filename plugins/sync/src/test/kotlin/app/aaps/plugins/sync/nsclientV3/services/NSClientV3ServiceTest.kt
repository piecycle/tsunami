package app.aaps.plugins.sync.nsclientV3.services

import app.aaps.core.interfaces.nsclient.StoreDataForDb
import app.aaps.core.interfaces.ui.UiInteraction
import app.aaps.core.keys.BooleanKey
import app.aaps.core.keys.StringKey
import app.aaps.plugins.sync.nsShared.NsIncomingDataProcessor
import app.aaps.plugins.sync.nsclient.data.NSDeviceStatusHandler
import app.aaps.plugins.sync.nsclientV3.NSClientV3Plugin
import app.aaps.shared.tests.TestBaseWithProfile
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`

class NSClientV3ServiceTest : TestBaseWithProfile() {

    @Mock lateinit var nsIncomingDataProcessor: NsIncomingDataProcessor
    @Mock lateinit var storeDataForDb: StoreDataForDb
    @Mock lateinit var uiInteraction: UiInteraction
    @Mock lateinit var nsDeviceStatusHandler: NSDeviceStatusHandler
    @Mock lateinit var nsClientV3Plugin: NSClientV3Plugin

    private lateinit var sut: NSClientV3Service

    @BeforeEach
    fun init() {
        sut = NSClientV3Service().also {
            it.aapsLogger = aapsLogger
            it.rxBus = rxBus
            it.rh = rh
            it.preferences = preferences
            it.fabricPrivacy = fabricPrivacy
            it.nsClientV3Plugin = nsClientV3Plugin
            it.config = config
            it.nsIncomingDataProcessor = nsIncomingDataProcessor
            it.storeDataForDb = storeDataForDb
            it.uiInteraction = uiInteraction
            it.nsDeviceStatusHandler = nsDeviceStatusHandler
        }
    }

    @Test
    fun initializeWebSocketsTest() {
        // No url specified
        `when`(preferences.get(StringKey.NsClientUrl)).thenReturn("")
        sut.initializeWebSockets("Test")
        sut.shutdownWebsockets()
        assertThat(sut.storageSocket).isNull()
        // Socket should be created
        `when`(preferences.get(StringKey.NsClientUrl)).thenReturn("http://something")
        `when`(preferences.get(BooleanKey.NsClientNotificationsFromAnnouncements)).thenReturn(true)
        `when`(nsClientV3Plugin.isAllowed).thenReturn(true)
        sut.initializeWebSockets("Test")
        assertThat(sut.storageSocket).isNotNull()
        assertThat(sut.alarmSocket).isNotNull()
        sut.shutdownWebsockets()
    }
}