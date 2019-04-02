package mp.rage.api.tick.event

import mp.rage.api.event.AbstractEvent

data class TickEvent(val machineId : Int) : AbstractEvent()