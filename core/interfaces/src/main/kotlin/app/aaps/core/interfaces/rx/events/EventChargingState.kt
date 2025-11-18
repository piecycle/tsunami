package app.aaps.core.interfaces.rx.events

class EventChargingState(val isCharging: Boolean, val batteryLevel: Int) : Event()