package app.aaps.plugins.automation.actions

import app.aaps.core.interfaces.queue.Callback
import app.aaps.core.keys.interfaces.BooleanPreferenceKey
import app.aaps.plugins.automation.R
import app.aaps.plugins.automation.elements.InputDropdownOnOffMenu
import app.aaps.plugins.automation.elements.InputProfileName
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.anyBoolean
import org.mockito.ArgumentMatchers.anyLong
import org.mockito.Mockito
import org.mockito.Mockito.anyInt
import org.mockito.Mockito.anyString
import org.mockito.Mockito.`when`
import org.mockito.kotlin.any
import org.mockito.kotlin.verify
import org.skyscreamer.jsonassert.JSONAssert

private const val STRING_JSON = """{"data":{"smbState":true},"type":"ActionSMBChange"}"""

class ActionSMBChangeTest : ActionsTestBase() {

    private lateinit var sut: ActionSMBChange

    @BeforeEach fun setUp() {
        `when`(rh.gs(R.string.changeSmbState)).thenReturn("Enable/disable SMB")
        `when`(rh.gs(R.string.changeSmbTo)).thenReturn("Change SMB to %1\$s")
        `when`(rh.gs(R.string.on)).thenReturn("ON")
        `when`(rh.gs(R.string.off)).thenReturn("OFF")

        sut = ActionSMBChange(injector)
    }

    @Test fun friendlyName() {
        assertThat(sut.friendlyName()).isEqualTo(R.string.changeSmbState)
    }

    @Test fun shortDescriptionTest() {
        assertThat(sut.shortDescription()).isEqualTo("Change SMB to ON")
    }

    @Test fun doAction() {
        sut.smbState = InputDropdownOnOffMenu(rh, true)
        sut.doAction(object : Callback() {
            override fun run() {
                assertThat(result.success).isTrue()
                assertThat(result.comment).isEqualTo("OK")
                verify(preferences, Mockito.times(1)).put(any<BooleanPreferenceKey>(), anyBoolean())
            }
        })
    }

    @Test fun hasDialogTest() {
        assertThat(sut.hasDialog()).isTrue()
    }

    @Test fun toJSONTest() {
        sut.smbState = InputDropdownOnOffMenu(rh, true)
        JSONAssert.assertEquals(STRING_JSON, sut.toJSON(), true)
    }

    @Test fun fromJSONTest() {
        sut.fromJSON("""{"smbState":"false"}""")
        assertThat(sut.smbState.value).isEqualTo(false)
    }

    @Test fun iconTest() {
        assertThat(sut.icon()).isEqualTo(app.aaps.core.ui.R.drawable.ic_running_mode)
    }
}
