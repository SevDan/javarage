package mp.rage.runtime.event;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import mp.rage.api.checkpoint.Checkpoint;
import mp.rage.api.checkpoint.event.*;
import mp.rage.api.colshape.event.ColshapeEvent;
import mp.rage.api.colshape.event.ColshapeEventsEnum;
import mp.rage.api.event.AbstractEvent;
import mp.rage.api.player.Player;
import mp.rage.api.player.event.*;
import mp.rage.api.vehicle.Vehicle;
import mp.rage.api.vehicle.event.*;
import mp.rage.launcher.EventPublisher;
import mp.rage.runtime.event.verticles.*;
import mp.rage.runtime.resource.PoolManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class EventPublisherImpl implements EventPublisher {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(EventPublisherImpl.class);

    @Autowired private PlayerVerticle playerVerticle;
    @Autowired private VehicleVerticle vehicleVerticle;
    @Autowired private BlipVerticle blipVerticle;
    @Autowired private CheckpointVerticle checkpointVerticle;
    @Autowired private ColshapeVerticle colshapeVerticle;
    @Autowired private StreamerVerticle streamerVerticle;
    @Autowired private TickVerticle tickVerticle;

    @Autowired private PoolManager poolManager;

    @PostConstruct
    public void init() {
        Vertx vertx = Vertx.factory.vertx();
        List<AbstractVerticle> deployList = Arrays.asList(
                playerVerticle,
                vehicleVerticle,
                blipVerticle, //
                checkpointVerticle,
                colshapeVerticle, //
                streamerVerticle, //
                tickVerticle //
        );

        deployList.forEach(x -> vertx.deployVerticle(x));
    }

    public void publishPlayerEvent(String address, @NotNull PlayerEventsEnum eventType, @NotNull List<Object> args) {
        try {
            int playerId = (Integer) args.get(0);
            Player player = poolManager.playerPool.getAt(playerId);
            PlayerEvent event = null;
            switch (eventType) {
                case PlayerJoinEvent: {
                    event = new PlayerJoinEvent(player);
                    break;
                }
                case PlayerQuitEvent: {
                    event = new PlayerQuitEvent(player);
                    break;
                }
                case PlayerReadyEvent: {
                    event = new PlayerReadyEvent(player);
                    break;
                }
                case PlayerSpawnEvent: {
                    event = new PlayerSpawnEvent(player);
                    break;
                }
                case PlayerCreatedEvent: {
                    event = new PlayerCreatedEvent(player);
                    break;
                }
                case PlayerCommandEvent: {
                    String command = (String) args.get(1);
                    event = new PlayerCommandEvent(player, command);
                    break;
                }
                case PlayerDeathEvent: {
                    int reason = (Integer) args.get(1);
                    Player killer = poolManager.playerPool.getAt((Integer)args.get(2));
                    event = new PlayerDeathEvent(player, reason, killer);
                    break;
                }
                case PlayerDamageEvent: {
                    float healLost = (Float) args.get(1);
                    float armorLost = (Float) args.get(2);
                    event = new PlayerDamageEvent(player, healLost, armorLost);
                    break;
                }
                case PlayerChatEvent: {
                    String message = (String) args.get(1);
                    event = new PlayerChatEvent(player, message);
                    break;
                }
                case PlayerDestroyedEvent: {
                    event = new PlayerDestroyedEvent(player);
                    break;
                }
                case PlayerEnterVehicleEvent: {
                    Vehicle vehicle = poolManager.vehiclePool.getAt((Integer) args.get(1));
                    int seatId = (Integer) args.get(2);
                    event = new PlayerEnterVehicleEvent(player, vehicle, seatId);
                    break;
                }
                case PlayerExitVehicleEvent: {
                    Vehicle vehicle = poolManager.vehiclePool.getAt((Integer) args.get(1));
                    event = new PlayerExitVehicleEvent(player, vehicle);
                    break;
                }
                case PlayerModelChangeEvent: {
                    int modelId = (Integer) args.get(1);
                    event = new PlayerModelChangeEvent(player, modelId);
                    break;
                }
                case PlayerStartEnterVehicleEvent: {
                    Vehicle vehicle = poolManager.vehiclePool.getAt((Integer) args.get(1));
                    int seatId = (Integer) args.get(2);
                    event = new PlayerStartEnterVehicleEvent(player, vehicle, seatId);
                    break;
                }
                case PlayerStartExitVehicleEvent: {
                    Vehicle vehicle = poolManager.vehiclePool.getAt((Integer) args.get(1));
                    event = new PlayerStartExitVehicleEvent(player, vehicle);
                    break;
                }
                case PlayerWeaponChangeEvent: {
                    String oldWeapon = (String) args.get(1);
                    String newWeapon = (String) args.get(2);
                    event = new PlayerWeaponChangeEvent(player, oldWeapon, newWeapon);
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("unresolved player event");
                }
            }
            if (event == null) throw new IllegalStateException("Null event in EventPublisherImpl"
                    + " on VehicleEvents");
            playerVerticle.publishEvent(address, event);
        } catch (IllegalStateException e) {
            log.error(e.getMessage());
            throw e;
        } catch (Exception e){
            log.error("EventPublisher crashed");
            throw new RuntimeException("EventPublisherImpl crashed on PlayerEvents");
        }
    }

    public void publishVehicleEvent(String address, @NotNull VehicleEventsEnum eventType, @NotNull List<Object> args) {
        try {
            int vehicleId = (Integer)args.get(0);
            Vehicle vehicle = poolManager.vehiclePool.getAt(vehicleId);
            VehicleEvent event = null;
            switch(eventType) {
                case VehicleCreatedEvent: {
                    event = new VehicleCreatedEvent(vehicle);
                    break;
                }
                case VehicleDestroyedEvent: {
                    event = new VehicleDestroyedEvent(vehicle);
                    break;
                }
                case VehicleDeathEvent: {
                    int hash = (Integer) args.get(1);
                    int killerId = (Integer) args.get(2);
                    Player killer = poolManager.playerPool.getAt(killerId);
                    event = new VehicleDeathEvent(vehicle, hash, killer);
                    break;
                }
                case VehicleDamageEvent: {
                    float bodyHealthLoss = (Float) args.get(1);
                    float engineHealthLoss = (Float) args.get(2);
                    event = new VehicleDamageEvent(vehicle, bodyHealthLoss, engineHealthLoss);
                    break;
                }
                case VehicleHornToggleEvent: {
                    boolean toggle = (Boolean) args.get(1);
                    event = new VehicleHornToggleEvent(vehicle, toggle);
                    break;
                }
                case VehicleModelChangeEvent: {
                    int oldModelHash = (Integer) args.get(1);
                    event = new VehicleModelChangeEvent(vehicle, oldModelHash);
                    break;
                }
                case VehicleSirenToggleEvent: {
                    boolean toggle = (Boolean) args.get(1);
                    event = new VehicleSirenToggleEvent(vehicle, toggle);
                    break;
                }
                case VehicleTrailerAttachedEvent: {
                    int trailerId = (Integer) args.get(1);
                    Vehicle trailer = poolManager.vehiclePool.getAt(trailerId);
                    event = new VehicleTrailerAttachedEvent(vehicle, trailer);
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("unresolved player event");
                }
            }
            if (event == null) throw new IllegalStateException("Null event in EventPublisherImpl"
                    + " on VehicleEvents");
            vehicleVerticle.publishEvent(address, event);
        } catch (IllegalStateException e) {
            log.error(e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("EventPublisher crashed");
            throw new RuntimeException("EventPublisherImpl crashed on VehicleEvents");
        }
    }

    public void publishColshapeEvent(String address, @NotNull ColshapeEventsEnum eventType, @NotNull List<Object> args) {

    }

    public void publishCheckpointEvent(String address, @NotNull CheckpointEventsEnum eventType, @NotNull List<Object> args) {
        try {
            CheckpointEvent event = null;
            switch (eventType) {
                case CheckpointCreatedEvent: {
                    int checkpointId = (Integer) args.get(0);
                    Checkpoint checkpoint = poolManager.checkpointPool.getAt(checkpointId);
                    event = new CheckpointCreatedEvent(checkpoint);
                    break;
                }
                case CheckpointDestroyedEvent: {
                    int checkpointId = (Integer) args.get(0);
                    Checkpoint checkpoint = poolManager.checkpointPool.getAt(checkpointId);
                    event = new CheckpointDestroyedEvent(checkpoint);
                    break;
                }
                case PlayerEnterCheckpointEvent: {
                    int playerId = (Integer) args.get(0);
                    int checkpointId = (Integer) args.get(1);
                    Player player = poolManager.playerPool.getAt(playerId);
                    Checkpoint checkpoint = poolManager.checkpointPool.getAt(checkpointId);
                    event = new PlayerEnterCheckpointEvent(player, checkpoint);
                    break;
                }
                case PlayerExitCheckpointEvent: {
                    int playerId = (Integer) args.get(0);
                    int checkpointId = (Integer) args.get(1);
                    Player player = poolManager.playerPool.getAt(playerId);
                    Checkpoint checkpoint = poolManager.checkpointPool.getAt(checkpointId);
                    event = new PlayerExitCheckpointEvent(player, checkpoint);
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("unresolved checkpoint event");
                }
            }
            if (event == null) throw new IllegalStateException("Null event in EventPublisherImpl"
                    + " on CheckpointEvents");
            checkpointVerticle.publishEvent(address, event);
        } catch (IllegalStateException e) {
            log.error(e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("EventPublisherImpl crashed");
            throw new RuntimeException("EventPublisherImpl crashed on CheckpointEvents");
        }
    }
}
