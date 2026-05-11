package app.aaps.ui.compose.tsunamiDialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import app.aaps.core.ui.compose.AapsTopAppBar
import app.aaps.core.ui.compose.DateTimeSection
import app.aaps.core.ui.compose.bottomBarSafeArea
import app.aaps.core.ui.compose.NumberInputRow
import app.aaps.core.ui.compose.clearFocusOnTap
import app.aaps.core.ui.compose.dialogs.OkCancelDialog
import app.aaps.core.ui.compose.navigation.ElementType
import app.aaps.core.ui.compose.navigation.NavigationRequest
import app.aaps.core.ui.compose.navigation.color
import app.aaps.core.ui.compose.navigation.icon
import app.aaps.core.ui.compose.navigation.labelResId
import app.aaps.core.ui.compose.preference.PreferenceSubScreenDef
import app.aaps.ui.compose.EventDatePicker
import app.aaps.ui.compose.EventTimePicker
import app.aaps.ui.compose.components.DialogStatusBar
import app.aaps.ui.compose.overview.graphs.BgInfoUiState
import app.aaps.ui.compose.overview.graphs.CobUiState
import app.aaps.ui.compose.overview.graphs.IobUiState
import kotlinx.coroutines.flow.StateFlow
import java.text.DecimalFormat
import app.aaps.core.keys.R as KeysR
import app.aaps.core.ui.R as CoreUiR
import app.aaps.ui.R

@Composable
fun TsunamiDialogScreen(
    viewModel: TsunamiDialogViewModel = hiltViewModel(),
    tsunamiButtonsDef: PreferenceSubScreenDef,
    bgInfoState: StateFlow<BgInfoUiState>,
    iobUiState: StateFlow<IobUiState>,
    cobUiState: StateFlow<CobUiState>,
    onNavigateBack: () -> Unit,
    onShowDeliveryError: (String) -> Unit
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val bgInfo by bgInfoState.collectAsStateWithLifecycle()
    val iob by iobUiState.collectAsStateWithLifecycle()
    val cob by cobUiState.collectAsStateWithLifecycle()

    // Dialog states
    var showConfirmation by rememberSaveable { mutableStateOf(false) }
    var showNoAction by rememberSaveable { mutableStateOf(false) }

    // Observe side effects
    LaunchedEffect(Unit) {
        viewModel.sideEffect.collect { effect ->
            when (effect) {
                is TsunamiDialogViewModel.SideEffect.ShowDeliveryError -> {
                    onShowDeliveryError(effect.comment)
                }

                is TsunamiDialogViewModel.SideEffect.ShowNoActionDialog -> {
                    showNoAction = true
                }
            }
        }
    }
    var showDatePicker by rememberSaveable { mutableStateOf(false) }
    var showTimePicker by rememberSaveable { mutableStateOf(false) }
    var showButtonSettings by rememberSaveable { mutableStateOf(false) }

    // Confirmation dialog
    if (showConfirmation) {
        if (!viewModel.hasAction()) {
            showConfirmation = false
            showNoAction = true
        } else {
            val summaryLines = viewModel.buildConfirmationSummary()
            OkCancelDialog(
                //title = stringResource(ElementType.TSUNAMI.labelResId()),
                title = stringResource(CoreUiR.string.tsunami),
                message = summaryLines.joinToString("<br/>"),
                icon = ElementType.TSUNAMI.icon(),
                iconTint = ElementType.TSUNAMI.color(),
                onConfirm = {
                    viewModel.confirmAndSave()
                    onNavigateBack()
                },
                onDismiss = { showConfirmation = false }
            )
        }
    }

    // No action dialog
    if (showNoAction) {
        OkCancelDialog(
            title = stringResource(CoreUiR.string.tsunami),
            message = stringResource(CoreUiR.string.no_action_selected),
            icon = ElementType.TSUNAMI.icon(),
            iconTint = ElementType.TSUNAMI.color(),
            onConfirm = { showNoAction = false },
            onDismiss = { showNoAction = false }
        )
    }

    // Date picker
    if (showDatePicker) {
        EventDatePicker(
            eventTimeMillis = uiState.eventTime,
            onEventTimeChanged = { viewModel.updateEventTime(it) },
            onDismiss = { showDatePicker = false }
        )
    }

    // Time picker
    if (showTimePicker) {
        EventTimePicker(
            eventTimeMillis = uiState.eventTime,
            onEventTimeChanged = { viewModel.updateEventTime(it) },
            onDismiss = { showTimePicker = false }
        )
    }

    /*
    if (showButtonSettings) {
        TsunamiButtonSettingsSheet(
            settingsDef = tsunamiButtonsDef,
            onDismiss = {
                showButtonSettings = false
                viewModel.refreshTsunamiButtons()
            }
        )
    }
     */

    TsunamiDialogContent(
        uiState = uiState,
        bgInfo = bgInfo,
        iob = iob,
        cob = cob,
        dateString = viewModel.dateUtil.dateString(uiState.eventTime),
        timeString = viewModel.dateUtil.timeString(uiState.eventTime),
        bolusFormat = viewModel.decimalFormatter.pumpSupportedBolusFormat(uiState.bolusStep),
        formatAmount = { viewModel.decimalFormatter.toPumpSupportedBolus(it, uiState.bolusStep) },
        onInsulinChange = { viewModel.updateInsulin(it) },
        onAddInsulin = viewModel::addInsulin,
        onDurationChange = { viewModel.updateDuration(it.toInt()) },
        onNotesChange = viewModel::updateNotes,
        onDateClick = { showDatePicker = true },
        onTimeClick = { showTimePicker = true },
        onCancelTsunami = viewModel::cancelTsunami,
        onNavigateBack = onNavigateBack,
        onConfirmClick = { showConfirmation = true },
        //onSettingsClick = { viewModel.showTsunamiSettings(tsunamiButtonsDef) }
    )
}

@Composable
private fun TsunamiDialogContent(
    uiState: TsunamiDialogUiState,
    bgInfo: BgInfoUiState,
    iob: IobUiState,
    cob: CobUiState,
    dateString: String,
    timeString: String,
    bolusFormat: DecimalFormat,
    formatAmount: (Double) -> String,
    onInsulinChange: (Double) -> Unit,
    onAddInsulin: (Double) -> Unit,
    onDurationChange: (Double) -> Unit,
    onNotesChange: (String) -> Unit,
    onDateClick: () -> Unit,
    onTimeClick: () -> Unit,
    onCancelTsunami: () -> Unit,
    onNavigateBack: () -> Unit,
    onConfirmClick: () -> Unit//,
    //onSettingsClick: () -> Unit
) {
    val focusManager = LocalFocusManager.current

    Scaffold(
        topBar = {
            AapsTopAppBar(
                title = { Text(stringResource(ElementType.TSUNAMI.labelResId())) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = stringResource(CoreUiR.string.close)
                        )
                    }
                },
            )
        },
        /*
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = ElementType.TSUNAMI.icon(),
                    contentDescription = null,
                    tint = ElementType.TSUNAMI.color(),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.padding(start = 8.dp))
                Text(stringResource(ElementType.TSUNAMI.labelResId()))
            }
        },
        navigationIcon = {
            IconButton(onClick = onNavigateBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(CoreUiR.string.back)
                )
            }
        }/*,
        actions = {
            IconButton(onClick = onSettingsClick) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = stringResource(CoreUiR.string.settings)
                )
            }
        }*/
    )
},
         */
        bottomBar = {
            Button(
                onClick = {
                    focusManager.clearFocus()
                    onConfirmClick()
                },
                enabled = uiState.confirmEnabled,
                modifier = Modifier
                    .fillMaxWidth()
                    .bottomBarSafeArea()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                if (uiState.insulin > 0.0) {
                    Text(stringResource(CoreUiR.string.format_insulin_units, uiState.insulin))
                } else {
                    Text(stringResource(CoreUiR.string.ok))
                }
            }
        }
    ) { paddingValues ->
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(horizontal = 16.dp, vertical = 8.dp)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .clearFocusOnTap(focusManager)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // --- Status Bar ---
            DialogStatusBar(bgInfo = bgInfo, iob = iob, cob = cob)

            // --- Card 1: Insulin amount ---
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    NumberInputRow(
                        labelResId = CoreUiR.string.overview_insulin_label,
                        value = uiState.insulin,
                        onValueChange = onInsulinChange,
                        valueRange = 0.0..uiState.maxInsulin,
                        step = uiState.bolusStep,
                        valueFormat = bolusFormat,
                        unitLabel = stringResource(CoreUiR.string.insulin_unit_shortname)
                    )
                    TsunamiQuickAddButtons(
                        increment1 = uiState.tsunamiButtonIncrement1,
                        increment2 = uiState.tsunamiButtonIncrement2,
                        increment3 = uiState.tsunamiButtonIncrement3,
                        formatAmount = formatAmount,
                        onAddInsulin = onAddInsulin
                    )
                }
            }

            // --- Card 2: Duration ---
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    NumberInputRow(
                        labelResId = R.string.tsunami_duration,
                        value = uiState.duration.toDouble(),
                        onValueChange = onDurationChange,
                        valueRange = 0.0..300.0,
                        step = 30.0,
                        unitLabelResId = KeysR.string.units_min
                    )
                    if (uiState.isTsunamiActive) {
                        OutlinedButton(
                            onClick = onCancelTsunami,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(stringResource(R.string.cancel_tsunami))
                        }
                    }
                }
            }

            // --- Card 3: Time Selection ---
            /*Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    DateTimeSection(
                        dateString = dateString,
                        timeString = timeString,
                        eventTimeChanged = uiState.eventTimeChanged,
                        onDateClick = onDateClick,
                        onTimeClick = onTimeClick
                    )
                }
            }*/

            // --- Notes ---
            if (uiState.showNotesFromPreferences) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
                ) {
                    TextField(
                        value = uiState.notes,
                        onValueChange = onNotesChange,
                        label = { Text(stringResource(CoreUiR.string.notes_label)) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        singleLine = false,
                        maxLines = 3
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
private fun TsunamiQuickAddButtons(
    increment1: Double,
    increment2: Double,
    increment3: Double,
    formatAmount: (Double) -> String,
    onAddInsulin: (Double) -> Unit
) {
    val increments = listOf(increment1, increment2, increment3).filter { it != 0.0 }
    if (increments.isEmpty()) return

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        increments.forEach { amount ->
            val formatted = formatAmount(amount)
            val label = if (amount > 0) "+$formatted" else formatted
            FilledTonalButton(onClick = { onAddInsulin(amount) }) {
                Text(label)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TsunamiDialogScreenPreview() {
    MaterialTheme {
        TsunamiDialogContent(
            uiState = TsunamiDialogUiState(
                insulin = 1.0,
                duration = 60,
                maxInsulin = 10.0,
                bolusStep = 0.1,
                tsunamiButtonIncrement1 = 0.5,
                tsunamiButtonIncrement2 = 1.0,
                tsunamiButtonIncrement3 = 2.0,
                showNotesFromPreferences = true,
                isTsunamiActive = true
            ),
            bgInfo = BgInfoUiState(bgInfo = null, timeAgoText = ""),
            iob = IobUiState(),
            cob = CobUiState(),
            dateString = "25/02/2026",
            timeString = "14:30",
            bolusFormat = DecimalFormat("0.0"),
            formatAmount = { DecimalFormat("0.0").format(it) },
            onInsulinChange = {},
            onAddInsulin = {},
            onDurationChange = {},
            onNotesChange = {},
            onDateClick = {},
            onTimeClick = {},
            onCancelTsunami = {},
            onNavigateBack = {},
            onConfirmClick = {}
        )
    }
}
