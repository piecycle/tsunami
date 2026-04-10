package app.aaps.ui.compose.tsunamiDialog

import androidx.compose.runtime.Immutable

@Immutable
data class TsunamiDialogUiState(
    // User input
    val insulin: Double = 0.0,
    val duration: Int = 0,
    val notes: String = "",
    val eventTime: Long = System.currentTimeMillis(),
    val eventTimeOriginal: Long = System.currentTimeMillis(),

    // Config (set once during init)
    val maxInsulin: Double = 0.0,
    val bolusStep: Double = 0.1,
    val tsunamiButtonIncrement1: Double = 0.5,
    val tsunamiButtonIncrement2: Double = 1.0,
    val tsunamiButtonIncrement3: Double = 2.0,
    val showNotesFromPreferences: Boolean = false,
    val simpleMode: Boolean = true,
    val isTsunamiActive: Boolean = false
)

val TsunamiDialogUiState.eventTimeChanged: Boolean
    get() = eventTime != eventTimeOriginal

val TsunamiDialogUiState.confirmEnabled: Boolean
    get() = insulin > 0.0 || duration > 0 || isTsunamiActive
