package mp.rage.api.vehicle.event

import mp.rage.api.player.Player
import mp.rage.api.vehicle.Vehicle

data class VehicleDeathEvent (
        val vehicle : Vehicle,
        val hash : Int,
        val killer : Player
) : VehicleEvent(vehicle)