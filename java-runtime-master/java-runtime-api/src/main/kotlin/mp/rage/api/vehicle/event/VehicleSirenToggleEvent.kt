package mp.rage.api.vehicle.event

import mp.rage.api.vehicle.Vehicle

data class VehicleSirenToggleEvent (
        val vehicle : Vehicle,
        val toggle : Boolean
) : VehicleEvent(vehicle)