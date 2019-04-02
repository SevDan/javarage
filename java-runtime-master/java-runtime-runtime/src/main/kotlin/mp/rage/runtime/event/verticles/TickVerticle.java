package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.tick.event.TickEvent;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TickVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(TickVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends TickEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }
}
