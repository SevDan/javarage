package mp.rage.api.vehicle.event

import mp.rage.api.vehicle.Vehicle

data class VehicleModelChangeEvent (
        val vehicle : Vehicle,
        val oldModelHash : Int
) : VehicleEvent(vehicle)