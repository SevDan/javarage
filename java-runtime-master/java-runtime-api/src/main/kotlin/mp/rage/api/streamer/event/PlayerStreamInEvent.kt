package mp.rage.api.streamer.event

import mp.rage.api.player.Player

data class PlayerStreamInEvent (
        val player : Player,
        val forPlayer : Player
): StreamerEvent(player, forPlayer)