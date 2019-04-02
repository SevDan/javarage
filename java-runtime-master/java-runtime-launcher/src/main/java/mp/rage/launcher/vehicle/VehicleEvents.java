/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.vehicle;

import mp.rage.api.player.event.PlayerEventsEnum;
import mp.rage.api.vehicle.event.VehicleEventsEnum;
import mp.rage.launcher.Launcher;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VehicleEvents {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(VehicleEvents.class);

    private VehicleEvents() {}

    static void onVehicleCreated(int vehicleId) {
        Launcher.publishVehicleEvent("VehicleCreatedEvent",
                VehicleEventsEnum.VehicleCreatedEvent,
                Collections.singletonList(vehicleId));
        log.debug("incoming onVehicleCreated: {}", vehicleId);
    }

    static void onVehicleDestroyed(int vehicleId) {
        Launcher.publishVehicleEvent("VehicleDestroyedEvent",
                VehicleEventsEnum.VehicleDestroyedEvent,
                Collections.singletonList(vehicleId));
        log.debug("incoming onVehicleDestroyed: {}", vehicleId);
    }

    static void onVehicleDeath(int vehicleId, int hash, int killerId) {
        Launcher.publishVehicleEvent("VehicleDeathEvent",
                VehicleEventsEnum.VehicleDeathEvent,
                Arrays.asList(vehicleId, hash, killerId));
        log.debug("incoming onVehicleDeath: {} {} {}", vehicleId, hash, killerId);
    }

    static void onVehicleModelChange(int vehicleId, int oldModelHash) {
        Launcher.publishVehicleEvent("VehicleModelChangeEvent",
                VehicleEventsEnum.VehicleModelChangeEvent,
                Arrays.asList(vehicleId, oldModelHash));
        log.debug("incoming onVehicleModelChange: {} {}", vehicleId, oldModelHash);
    }

    static void onVehicleSirenToggle(int vehicleId, boolean toggle) {
        Launcher.publishVehicleEvent("VehicleSirenToggleEvent",
                VehicleEventsEnum.VehicleSirenToggleEvent,
                Arrays.asList(vehicleId, toggle));
        log.debug("onVehicleSirenToggle: {} {}", vehicleId, toggle);
    }

    static void onVehicleHornToggle(int vehicleId, boolean toggle) {
        Launcher.publishVehicleEvent("VehicleHornToggleEvent",
                VehicleEventsEnum.VehicleHornToggleEvent,
                Arrays.asList(vehicleId, toggle));
        log.debug("onVehicleHornTog gle: {} {}", vehicleId, toggle);
    }

    static void onVehicleTrailerAttached(int vehicleId, int trailerId) {
        Launcher.publishVehicleEvent("VehicleTrailerAttachedEvent",
                VehicleEventsEnum.VehicleTrailerAttachedEvent,
                Arrays.asList(vehicleId, trailerId));
        log.debug("onVehicleTrailerAttached: {} {}", vehicleId, trailerId);
    }

    static void onVehicleDamage(int vehicleId, float bodyHealthLoss, float engineHealthLoss) {
        Launcher.publishVehicleEvent("vv",
                VehicleEventsEnum.VehicleDamageEvent,
                Arrays.asList(vehicleId, bodyHealthLoss, engineHealthLoss));
        log.debug("onVehicleDamage: {} {} {}", vehicleId, bodyHealthLoss, engineHealthLoss);
    }
}
