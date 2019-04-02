package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.checkpoint.event.CheckpointEvent;
import mp.rage.api.colshape.event.ColshapeEvent;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CheckpointVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CheckpointVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends CheckpointEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }

}
