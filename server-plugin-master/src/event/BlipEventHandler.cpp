/*
 * Copyright (c) 2017 Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

#include <iostream>
#include "BlipEventHandler.hpp"
#include "../jvm/VM.hpp"
#include "../jvm/Converter.hpp"

BlipEventHandler::BlipEventHandler(JNIEnv *env) {
    blipEventClass = JVM::VM::getClass(env, JVM_LAUNCHER_MAIN_PACKAGE_NAME + "blip/BlipEvents");
    blipCreatedMethodId = JVM::VM::getStaticMethodId(env, blipEventClass, "onBlipCreated", "(I)V");
    blipDestroyedMethodId = JVM::VM::getStaticMethodId(env, blipEventClass, "onBlipDestroyed", "(I)V");
    playerCreateWaypointMethod = JVM::VM::getStaticMethodId(env, blipEventClass, "onPlayerCreateWaypoint", "(IFFF)V");
    playerReachWaypointMethod = JVM::VM::getStaticMethodId(env, blipEventClass, "onPlayerReachWaypoint", "(I)V");
}

void BlipEventHandler::OnPlayerCreateWaypoint(rage::IPlayer *player, const rage::vector3& position) {
    JNIEnv *env = JVM::VM::attachCurrentThread();
    env->CallStaticVoidMethod(blipEventClass, playerCreateWaypointMethod,
                                               int(player->GetId()),
                                               float(position.x),
                                               float(position.y),
                                               float(position.z));
    JVM::VM::checkForException(env);
}

void BlipEventHandler::OnPlayerReachWaypoint(rage::IPlayer *player) {
    JNIEnv *env = JVM::VM::attachCurrentThread();
    env->CallStaticVoidMethod(blipEventClass, playerReachWaypointMethod,
                                               int(player->GetId()));

    JVM::VM::checkForException(env);
}

void BlipEventHandler::OnEntityCreated(rage::IEntity *entity) {
    if(entity->GetType() == rage::entity_t::Blip) {
        JNIEnv *env = JVM::VM::attachCurrentThread();
        env->CallStaticVoidMethod(blipEventClass, blipCreatedMethodId,
                                                   int(entity->GetId()));
        JVM::VM::checkForException(env);
    }
}

void BlipEventHandler::OnEntityDestroyed(rage::IEntity *entity) {
    if(entity->GetType() == rage::entity_t::Blip) {
        JNIEnv *env = JVM::VM::attachCurrentThread();
        env->CallStaticVoidMethod(blipEventClass, blipDestroyedMethodId,
                                                   int(entity->GetId()));
        JVM::VM::checkForException(env);
    }
}
