package mp.rage.api.blip

import mp.rage.api.entity.Entity

interface Blip : Entity {
    fun getRadius(blipId: Int): Float

    fun getMode(blipId: Int): Int

    fun getColour(blipId: Int): Int
    fun setColour(blipId: Int, colour: Int)

    fun getScale(blipId: Int): Float
    fun setScale(blipId: Int, scale: Float)

    fun getName(blipId: Int): String
    fun setName(blipId: Int, name: String)
}