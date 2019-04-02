package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.streamer.event.StreamerEvent;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class StreamerVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(StreamerVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends StreamerEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }
}
