package app.aaps.pump.virtual.composeui

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.ui.compose.ComposeUiProvider
import app.aaps.core.interfaces.ui.compose.DaggerComponentActivity
import app.aaps.core.keys.StringKey
import app.aaps.core.keys.interfaces.Preferences
import app.aaps.pump.virtual.composeui.theme.VirtualPumpTheme
import app.aaps.pump.virtual.di.VirtualPumpComposeUiComponent
import javax.inject.Inject

class TestActivity : DaggerComponentActivity() {

    @Inject lateinit var aapsLogger: AAPSLogger
    @Inject lateinit var preferences: Preferences

    var sectionState: ActionsLandingSection = ActionsLandingSection.TEST_1

    val isDarkTheme: Boolean
        get() = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) ==
            Configuration.UI_MODE_NIGHT_YES


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val composeUiComponent = (application as ComposeUiProvider)
            .getComposeUiModule("virtualpump") as VirtualPumpComposeUiComponent

        composeUiComponent.inject(this)


        enableEdgeToEdge()
        setContent {

            var selectedItem by remember { mutableStateOf(sectionState) }
            val scaffoldState = rememberBottomSheetScaffoldState()

            VirtualPumpTheme(darkTheme = isAAPSDarkTheme(isSystemDarkTheme = isDarkTheme)) {
                Scaffold(
                    content = { innerPadding ->
                        BottomSheetScaffold(
                            scaffoldState = scaffoldState,
                            sheetContent = {
                                Text("Hidden Bottom sheet !")
                            },
                            sheetPeekHeight = 0.dp

                        ) {
                            Box(Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                when (selectedItem) {


                                    ActionsLandingSection.TEST_1 -> {
                                        HelloWorld(
                                            name = "Virtual Pump Compose Demo",
                                            innerPadding = innerPadding,
                                            aapsLogger = aapsLogger
                                        )
                                    }
                                } // when
                            } // box
                        } //
                    }
                ) // scaffold
            } // theme

        }
    }


    override fun onResume() {
        super.onResume()
    }



    override fun onStop() {
        super.onStop()
    }

    fun isAAPSDarkTheme(isSystemDarkTheme: Boolean): Boolean {
        val colorscheme = preferences.get(StringKey.GeneralDarkMode)

        if (colorscheme.equals("dark")) {
            return true
        } else if (colorscheme.equals("light")) {
            return false
        } else {
            return isSystemDarkTheme
        }
    }


}


enum class ActionsLandingSection(val label: String) {
    TEST_1("Test 1")
    ;
}



@Preview(showBackground = true)
@Composable
fun ActionsActivity_Preview() {

    VirtualPumpTheme {
        Surface {
            HelloWorld(
                innerPadding = PaddingValues(0.dp),
                name = "Virtual Pump Preview"
            )
        }
    }

}