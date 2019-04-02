package mp.rage.api.vehicle.event

import mp.rage.api.vehicle.Vehicle

data class VehicleDamageEvent (
        val vehicle : Vehicle,
        val bodyHealthLoss : Float,
        val engineHealthLoss : Float
) : VehicleEvent(vehicle)