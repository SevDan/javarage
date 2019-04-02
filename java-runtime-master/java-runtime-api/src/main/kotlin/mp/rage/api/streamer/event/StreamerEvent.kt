package mp.rage.api.streamer.event

import mp.rage.api.event.AbstractEvent
import mp.rage.api.player.Player

abstract class StreamerEvent (
        player : Player,
        forPlayer : Player
) : AbstractEvent()