package mp.rage.runtime.event.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import mp.rage.api.player.event.*;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerVerticle extends AbstractVerticle {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PlayerVerticle.class);

    private final EventBus eventBus = getVertx().eventBus();

    public <T extends PlayerEvent> void publishEvent(String address, T event) {
        eventBus.publish(address, event);
    }
}
