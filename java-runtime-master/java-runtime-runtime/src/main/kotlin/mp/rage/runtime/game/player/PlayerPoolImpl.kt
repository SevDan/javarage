/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime.game.player

import mp.rage.api.player.Player
import mp.rage.api.player.PlayerPool
import mp.rage.api.vector.Vector3
import mp.rage.launcher.player.PlayerNative
import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component("PlayerPool")
class PlayerPoolImpl : PlayerPool {
    private val players = ConcurrentHashMap<Int, PlayerImpl>()

    override fun broadcast(message: String) {
        PlayerNative.broadcast(message)
    }

    override fun broadcastInRange(message: String, position: Vector3, range: Float, dimension: Int) {
        PlayerNative.broadcastInRange(message, position.x, position.y, position.z, range, dimension)
    }

    override fun broadcastInDimension(message: String, dimension: Int) {
        PlayerNative.broadcastInDimension(message, dimension)
    }

    override fun contains(id: Int) : Boolean {
        return players.contains(id)
    }

    override fun getAt(id: Int): Player {
        return players.getOrDefault(id, PlayerImpl(id))
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun length(): Int {
        return PlayerNative.length()
    }

    override fun count(): Int {
        return PlayerNative.count()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInRange(position: Vector3, range: Float, dimension: Int): List<Player> {
        val ids : List<Int>  = PlayerNative.getInRange(position.x, position.y, position.z, range, dimension)
        var players : List<Player> = ids.map {
            x -> getAt(x)
        }
        return players

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInDimension(dimension: Int): List<Player> {
        val ids : List<Int> = PlayerNative.getInDimension(dimension)
        var players : List<Player> = ids.map {
            x -> getAt(x)
        }
        return players
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}