package mp.rage.api.blip.event

import mp.rage.api.blip.Blip

data class BlipCreatedEvent(
        val blip : Blip
) : BlipEvent()