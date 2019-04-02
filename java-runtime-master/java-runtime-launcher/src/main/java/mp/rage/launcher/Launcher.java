/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.launcher;

//import jdk.vm.ci.meta.ResolvedJavaField;

import io.vertx.core.AbstractVerticle;
import mp.rage.api.checkpoint.event.CheckpointEvent;
import mp.rage.api.checkpoint.event.CheckpointEventsEnum;
import mp.rage.api.event.AbstractEvent;
import mp.rage.api.exception.JNIExecutionException;
import mp.rage.api.player.event.PlayerEvent;
import mp.rage.api.player.event.PlayerEventsEnum;
import mp.rage.api.vehicle.event.VehicleEvent;
import mp.rage.api.vehicle.event.VehicleEventsEnum;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.List;

// лончер - мейн-точка для JNI-запуска.
// отсюда начинает выполнение фреймворк (вызывается из VM.cpp в JNI)
@Component("launcher")
@Scope("singleton")
public class Launcher {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Launcher.class);

    private static final String PLUGIN_NAME = "RageJava";

    private Launcher() {}
    // EventPublisher и RuntimeInitializer в runtime
    @Autowired private EventPublisher eventPublisher;
    @Autowired private RuntimeInitializer runtime;

    private static Launcher exemplar;

    /**
     * @param operatingSystem 0 for linux and 1 for windows
     */

    @SuppressWarnings("unused") // called via jni only
    public static void main(int operatingSystem) throws JNIExecutionException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("mp.rage");
        context.scan("mp.rage.runtime.*");
        context.scan("mp.rage.launcher.*");
        context.scan("mp.rage.api.*");
        context.refresh();

        exemplar.initializeRuntime();
        exemplar.initializeJNI(operatingSystem);
    }

    @PostConstruct
    public void init() {
        Launcher.exemplar = this;
    }

    // производим инициализацию JNI = определяем ОСь, находим плагин RageJava.so(.dll) и открываем его в jni
    // стоит заметить, что это происходит уже после того, как JNI вызовет мейн лончера
    // по сути обратное связывание
    private void initializeJNI(int operatingSystem) throws JNIExecutionException {
        log.info("Initializing RageJava launcher");
        String fileEnding;
        if(operatingSystem == 0) {
            fileEnding = ".so";
            log.info("Using Linux binary");
        } else if (operatingSystem  == 1) {
            fileEnding = ".dll";
            log.info("Using Windows binary");
        } else {
            throw new JNIExecutionException("invalid operating system parameter: " + operatingSystem);
        }
        File binaryPath = new File("plugins" + File.separator + PLUGIN_NAME + fileEnding);
        System.load(binaryPath.getAbsolutePath());
    }

    // инициализируем рантайм
    private void initializeRuntime() {
        log.info("Initialize RageMP Java Runtime");
        exemplar.runtime.initialize();
    }

    // публикуем ивент = делегируем паблишеру
    public static <T extends PlayerEvent> void publishPlayerEvent(String address, PlayerEventsEnum playerEventsEnum, List<Object> args) {
        exemplar.eventPublisher.publishPlayerEvent(address, playerEventsEnum, args);
    }

    public static <T extends VehicleEvent> void publishVehicleEvent(String address, VehicleEventsEnum vehicleEventsEnum, List<Object> args) {
        exemplar.eventPublisher.publishVehicleEvent(address, vehicleEventsEnum, args);
    }

    public static <T extends CheckpointEvent> void publishCheckpointEvent(String address, CheckpointEventsEnum checkpointEventsEnum, List<Object> args) {
        exemplar.eventPublisher.publishCheckpointEvent(address, checkpointEventsEnum, args);
    }
}