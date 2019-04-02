package mp.rage.api.colshape

import mp.rage.api.entity.Entity
import mp.rage.api.vector.Vector3

interface Colshape : Entity {
    fun isPointWithin(colshapeId: Int, position : Vector3) : Boolean;
    fun getShapeType(colshapeId: Int) : Int;
}