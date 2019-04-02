package mp.rage.api.colshape.event

import mp.rage.api.colshape.Colshape
import mp.rage.api.player.Player

data class PlayerEnterColshapeEvent(
        val player : Player,
        val colshape : Colshape
) : ColshapeEvent(colshape)