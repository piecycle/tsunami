package app.aaps.pump.virtual.composeui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.logging.LTag
import app.aaps.pump.virtual.composeui.theme.VirtualPumpTheme

@Composable
fun HelloWorld(name: String = "World",
               aapsLogger: AAPSLogger? = null,
               innerPadding: PaddingValues = PaddingValues()) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Hello $name", fontSize = 30.sp)
    }

    if (aapsLogger!=null) {
        aapsLogger.info(LTag.PUMP, "Started hellow world example for compose.")
    }
}

@Preview(showBackground = true)
@Composable
private fun HelloWorldPreview() {
    VirtualPumpTheme {
        Surface { HelloWorld(name = "Virtual Pump") }
    }
}