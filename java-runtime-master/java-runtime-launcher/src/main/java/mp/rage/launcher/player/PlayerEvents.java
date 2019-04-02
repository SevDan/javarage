/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.player;

import mp.rage.api.player.PlayerPool;
import mp.rage.api.player.event.*;
import mp.rage.launcher.Launcher;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("unused")
public class PlayerEvents {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PlayerEvents.class);

    private PlayerEvents() {}

    static void onPlayerCreated(int playerId) {
        log.debug("incoming onPlayerCreated: {}", playerId);
        Launcher.publishPlayerEvent("PlayerCreatedEvent",
                PlayerEventsEnum.PlayerCreatedEvent,
                Collections.singletonList(playerId));
    }

    static void onPlayerDestroyed(int playerId) {
        log.debug("incoming onPlayerDestroyed: {}", playerId);
        Launcher.publishPlayerEvent("PlayerDestroyedEvent",
                PlayerEventsEnum.PlayerDestroyedEvent,
                Collections.singletonList(playerId));
    }

    static void onPlayerJoin(int playerId) {
        log.debug("incoming playerJoinEvent: {}", playerId);
        Launcher.publishPlayerEvent("PlayerJoinEvent",
                PlayerEventsEnum.PlayerJoinEvent,
                Collections.singletonList(playerId));
    }

    static void onPlayerCommand(int playerId, String command) {
        log.debug("incoming onPlayerCommandEvent: {} {}", playerId, command);
        Launcher.publishPlayerEvent("PlayerCommandEvent",
                PlayerEventsEnum.PlayerCommandEvent,
                Arrays.asList(playerId, command));
    }

    static void onPlayerQuit(int playerId, int exitType, String reason) {
        log.debug("incoming onPlayerQuit: {} {} {}", playerId, exitType, reason);
        Launcher.publishPlayerEvent("PlayerQuitEvent",
                PlayerEventsEnum.PlayerQuitEvent,
                Arrays.asList(playerId, exitType, reason));
    }

    static void onPlayerSpawn(int playerId) {
        log.debug("incoming onPlayerSpawn: {}", playerId);
        Launcher.publishPlayerEvent("PlayerSpawnEvent",
                PlayerEventsEnum.PlayerSpawnEvent,
                Collections.singletonList(playerId));
    }

    static void onPlayerChat(int playerId, String text) {
        log.debug("incoming onPlayerChat: {} {}", playerId, text);
        Launcher.publishPlayerEvent("PlayerChatEvent",
                PlayerEventsEnum.PlayerChatEvent,
                Arrays.asList(playerId, text));
    }

    static void onPlayerEnterVehicle(int playerId, int vehicleId, int seatId) {
        log.debug("incoming onPlayerEnterVehicle: {} {} {}", playerId, vehicleId, seatId);
        Launcher.publishPlayerEvent("PlayerEnterVehicleEvent",
                PlayerEventsEnum.PlayerEnterVehicleEvent,
                Arrays.asList(playerId, vehicleId, seatId));
    }

    static void onPlayerStartEnterVehicle(int playerId, int vehicleId, int seatId) {
        log.debug("incoming onPlayerStartEnterVehicle: {} {} {}", playerId, vehicleId, seatId);
        Launcher.publishPlayerEvent("PlayerStartEnterVehicleEvent",
                PlayerEventsEnum.PlayerStartEnterVehicleEvent,
                Arrays.asList(playerId, vehicleId, seatId));
    }

    static void onPlayerExitVehicle(int playerId, int vehicleId) {
        log.debug("incoming onPlayerExitVehicle: {} {}", playerId, vehicleId);
        Launcher.publishPlayerEvent("PlayerExitVehicleEvent",
                PlayerEventsEnum.PlayerExitVehicleEvent,
                Arrays.asList(playerId, vehicleId));
    }

    static void onPlayerStartExitVehicle(int playerId, int vehicleId) {
        log.debug("incoming onPlayerStartExitVehicle: {} {}", playerId, vehicleId);
        Launcher.publishPlayerEvent("PlayerStartExitVehicleEvent",
                PlayerEventsEnum.PlayerStartExitVehicleEvent,
                Arrays.asList(playerId, vehicleId));
    }

    static void onPlayerDeath(int playerId, int reason, int killerId) {
        log.debug("incoming onPlayerDeath: {} {} {}", playerId, reason, killerId);
        Launcher.publishPlayerEvent("PlayerDeathEvent",
                PlayerEventsEnum.PlayerDeathEvent,
                Arrays.asList(playerId, reason, killerId));
    }

    static void onPlayerReady(int playerId) {
        log.debug("incoming onPlayerReady: {}", playerId);
        Launcher.publishPlayerEvent("PlayerReadyEvent",
                PlayerEventsEnum.PlayerReadyEvent,
                Collections.singletonList(playerId));
    }

    static void onPlayerDamage(int playerId, float healthLoss, float armorLoss) {
        log.debug("incoming onPlayerDamage: {} {} {}", playerId, healthLoss, armorLoss);
        Launcher.publishPlayerEvent("PlayerDamageEvent",
                PlayerEventsEnum.PlayerDamageEvent,
                Arrays.asList(playerId, healthLoss, armorLoss));
    }

    static void onPlayerWeaponChange(int playerId, int oldWeaponHash, int newWeaponHash) {
        log.debug("incoming onPlayerWeaponChange: {} {} {}", playerId, oldWeaponHash, newWeaponHash);
        Launcher.publishPlayerEvent("PlayerWeaponChangeEvent",
                PlayerEventsEnum.PlayerWeaponChangeEvent,
                Arrays.asList(playerId, oldWeaponHash, newWeaponHash));
    }

    static void onPlayerModelChange(int playerId, int oldHash) {
        log.debug("incoming onEntityModelChange: {} {}", playerId, oldHash);
        Launcher.publishPlayerEvent("PlayerModelChangeEvent",
                PlayerEventsEnum.PlayerModelChangeEvent,
                Arrays.asList(playerId, oldHash));
    }
}
