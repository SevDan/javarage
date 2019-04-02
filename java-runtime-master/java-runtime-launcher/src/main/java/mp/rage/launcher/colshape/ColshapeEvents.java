/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher.colshape;

import org.slf4j.Logger;

public class ColshapeEvents {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ColshapeEvents.class);

    private ColshapeEvents() {}

    public static void onPlayerEnterColshape(int playerId, int colshapeId) {
        log.debug("incoming onPlayerEnterColshape: {} {}", playerId, colshapeId);
    }

    public static void onPlayerExitColshape(int playerId, int colshapeId) {
        log.debug("incoming onPlayerExitColshape: {} {}", playerId, colshapeId);
    }

    public static void onColshapeCreated(int colshapeId) {
        log.debug("incoming onColshapeCreated: {}", colshapeId);
    }

    public static void onColshapeDestroyed(int colshapeId) {
        log.debug("incoming onColshapeDestroyed: {}", colshapeId);
    }
}
