package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.blip.event.BlipEvent;
import mp.rage.launcher.blip.BlipEvents;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class BlipVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BlipVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends BlipEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }
}
