package mp.rage.launcher.blip;

import org.slf4j.Logger;

public class BlipEvents {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BlipEvents.class);

    private BlipEvents() { }

    static void onBlipCreated(int blipId) {
        log.debug("onBlipCreated (I)V, id = " + blipId);
    }

    static void onBlipDestroyed(int blipId) {
        log.debug("onBlipDestroyed (I)V, id = " + blipId);
    }

    static void onPlayerCreateWaypoint(int playerId, float x, float y, float z) {
        log.debug("onPlayerCreateWaypoint (IFFF)V, playerId = " + playerId + " x:y:z =" +
                x+":"+y+":"+z);
    }

    static void onPlayerReachWaypoint(int playerId) {
        log.debug("onPlayerReachWaypoint (I)V, playerId = " + playerId);
    }
}
