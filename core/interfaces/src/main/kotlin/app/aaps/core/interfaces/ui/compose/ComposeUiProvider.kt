package app.aaps.core.interfaces.ui.compose

interface ComposeUiProvider {
    fun getComposeUiModule(moduleName: String): ComposeUi
}