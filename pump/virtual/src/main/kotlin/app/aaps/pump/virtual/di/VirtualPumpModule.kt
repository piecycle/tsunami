package app.aaps.pump.virtual.di

import app.aaps.core.interfaces.pump.VirtualPump
import app.aaps.core.interfaces.ui.compose.ComposeUiFactory
import app.aaps.implementation.ui.ComposeUiModule
import app.aaps.pump.virtual.VirtualPumpFragment
import app.aaps.pump.virtual.VirtualPumpPlugin
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module(
    includes = [
        VirtualPumpModule.Bindings::class
    ],
    subcomponents = [VirtualPumpComposeUiComponent::class]
)
@Suppress("unused")
abstract class VirtualPumpModule {

    @ContributesAndroidInjector abstract fun contributesVirtualPumpFragment(): VirtualPumpFragment

    @Module
    interface Bindings {

        @Binds fun bindVirtualPump(virtualPumpPlugin: VirtualPumpPlugin): VirtualPump

        @Binds
        @IntoMap
        @ComposeUiModule("virtualpump")
        abstract fun bindVirtualPumpComposeUiFactory(factory: VirtualPumpComposeUiComponent.FactoryCompose): ComposeUiFactory
    }

}