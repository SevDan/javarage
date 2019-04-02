/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.checkpoint;

import mp.rage.api.checkpoint.event.CheckpointEventsEnum;
import mp.rage.launcher.Launcher;
import mp.rage.launcher.player.PlayerNative;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CheckpointEvents {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CheckpointEvents.class);

    private CheckpointEvents() { }

    public static void onPlayerEnterCheckpoint(int playerId, int checkpointId) {
        Launcher.publishCheckpointEvent(
                "PlayerEnterCheckpointEvent",
                CheckpointEventsEnum.PlayerEnterCheckpointEvent,
                Arrays.asList(playerId, checkpointId)
        );
        log.debug("onPlayerEnterCheckpoint; {} {}", playerId, checkpointId);
    }

    public static void onPlayerExitCheckpoint(int playerId, int checkpointId) {
        Launcher.publishCheckpointEvent(
                "PlayerExitCheckpointEvent",
                CheckpointEventsEnum.PlayerExitCheckpointEvent,
                Arrays.asList(playerId, checkpointId)
        );
        log.debug("onPlayerExitCheckpoint; {} {}", playerId, checkpointId);
    }

    public static void onCheckpointCreated(int checkpointId) {
        Launcher.publishCheckpointEvent(
                "CheckpointCreatedEvent",
                CheckpointEventsEnum.CheckpointCreatedEvent,
                Collections.singletonList(checkpointId)
        );
        log.debug("incoming onCheckpointCreated", checkpointId);
    }

    public static void onCheckpointDestroyed(int checkpointId) {
        Launcher.publishCheckpointEvent(
                "CheckpointDestroyedEvent",
                CheckpointEventsEnum.CheckpointDestroyedEvent,
                Collections.singletonList(checkpointId)
        );
        log.debug("incoming onCheckpointDestroyed", checkpointId);
    }
}
