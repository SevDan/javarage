package mp.rage.api.vehicle.event

import mp.rage.api.vehicle.Vehicle

data class VehicleCreatedEvent(
        val vehicle : Vehicle
) : VehicleEvent(vehicle)