package mp.rage.api.vehicle.event

import mp.rage.api.vehicle.Vehicle

data class VehicleTrailerAttachedEvent (
        val vehicle : Vehicle,
        val trailer : Vehicle
) : VehicleEvent(vehicle)