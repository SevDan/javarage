package mp.rage.api.blip.event

import mp.rage.api.player.Player
import mp.rage.api.player.event.PlayerEvent

data class PlayerCreateWaypointEvent(
        val player : Player,
        val x : Float,
        val y : Float,
        val z : Float
) : BlipEvent()