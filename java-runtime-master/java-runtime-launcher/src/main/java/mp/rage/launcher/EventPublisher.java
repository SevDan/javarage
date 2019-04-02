/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher;

import mp.rage.api.checkpoint.event.CheckpointEventsEnum;
import mp.rage.api.colshape.event.ColshapeEventsEnum;
import mp.rage.api.event.AbstractEvent;
import mp.rage.api.event.EventHandler;
import mp.rage.api.player.event.PlayerEvent;
import mp.rage.api.player.event.PlayerEventsEnum;
import mp.rage.api.player.event.PlayerJoinEvent;
import mp.rage.api.vehicle.event.VehicleEvent;
import mp.rage.api.vehicle.event.VehicleEventsEnum;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.List;

// интерфейс, реализован в runtime
public interface EventPublisher {
    void publishPlayerEvent(
            String address,
            @NotNull PlayerEventsEnum eventType,
            @NotNull List<Object> args
    );

    void publishVehicleEvent(
            String address,
            @NotNull VehicleEventsEnum eventType,
            @NotNull List<Object> args
    );

    void publishCheckpointEvent(
            String address,
            @NotNull CheckpointEventsEnum eventType,
            @NotNull List<Object> args
    );

    void publishColshapeEvent(
            String address,
            @NotNull ColshapeEventsEnum eventType,
            @NotNull List<Object> args
    );
}
