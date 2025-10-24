package app.aaps.pump.virtual.di

import app.aaps.core.interfaces.ui.compose.ComposeUiFactory
import app.aaps.core.interfaces.ui.compose.ComposeUi
import app.aaps.pump.virtual.composeui.TestActivity
import dagger.Subcomponent

@Subcomponent
interface VirtualPumpComposeUiComponent : ComposeUi {
    fun inject(activity: TestActivity)

    @Subcomponent.Factory
    interface FactoryCompose : ComposeUiFactory {
        override fun create(): VirtualPumpComposeUiComponent
    }
}