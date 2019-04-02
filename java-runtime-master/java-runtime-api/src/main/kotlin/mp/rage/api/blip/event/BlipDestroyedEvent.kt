package mp.rage.api.blip.event

import mp.rage.api.blip.Blip

data class BlipDestroyedEvent(
        val blip : Blip
) : BlipEvent()