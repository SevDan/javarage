package mp.rage.api.blip.event

import mp.rage.api.player.Player
import mp.rage.api.player.event.PlayerEvent

data class PlayerReachWaypointEvent(
        val player : Player
) : BlipEvent()