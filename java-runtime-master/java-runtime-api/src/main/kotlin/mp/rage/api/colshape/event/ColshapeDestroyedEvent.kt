package mp.rage.api.colshape.event

import mp.rage.api.colshape.Colshape

data class ColshapeDestroyedEvent (
        val colshape : Colshape
) : ColshapeEvent(colshape)