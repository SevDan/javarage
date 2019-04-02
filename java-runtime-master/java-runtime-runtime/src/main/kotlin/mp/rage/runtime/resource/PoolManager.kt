/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.resource

import mp.rage.api.checkpoint.CheckpointPool
import mp.rage.api.player.PlayerPool
import mp.rage.api.vehicle.VehiclePool
import mp.rage.runtime.game.checkpoint.CheckpointPoolImpl
import mp.rage.runtime.game.player.PlayerPoolImpl
import mp.rage.runtime.game.vehicle.VehiclePoolImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

// менеджер пулов = скопище пулов
@Component("PoolManager")
class PoolManager {
    @Autowired lateinit var playerPool: PlayerPool
    @Autowired lateinit var checkpointPool: CheckpointPool
    @Autowired lateinit var vehiclePool: VehiclePool
}