/*
 * Copyright (c) 2017 Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

#pragma once

#include <jni.h>
#include "../sdk/Entity.hpp"
#include "../sdk/rage.hpp"
#include "../jvm/VM.hpp"

class BlipEventHandler : public rage::IBlipHandler, public rage::IEventHandler, public rage::IEntityHandler {
public:
    BlipEventHandler(JNIEnv *env);

    rage::IBlipHandler *GetBlipHandler() override {
        return this;
    }

    rage::IEntityHandler *GetEntityHandler() override {
        return this;
    }

    void OnPlayerCreateWaypoint(rage::IPlayer *player, const rage::vector3& position) override;

    void OnPlayerReachWaypoint(rage::IPlayer *player) override;

    void OnEntityCreated(rage::IEntity *entity) override;

    void OnEntityDestroyed(rage::IEntity *entity) override;

private:
    jclass blipEventClass;
    jmethodID playerCreateWaypointMethod;
    jmethodID playerReachWaypointMethod;
    jmethodID blipCreatedMethodId;
    jmethodID blipDestroyedMethodId;
};
