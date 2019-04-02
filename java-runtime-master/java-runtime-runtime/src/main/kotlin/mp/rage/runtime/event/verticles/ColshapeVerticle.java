package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.colshape.Colshape;
import mp.rage.api.colshape.event.ColshapeEvent;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ColshapeVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ColshapeVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends ColshapeEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }

}
