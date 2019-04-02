/*
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

class StreamerEventHandler : public rage::IStreamerHandler, public rage::IEventHandler {
public:
    StreamerEventHandler(JNIEnv *env);

    rage::IStreamerHandler *GetStreamerHandler() override {
        return this;
    }

    void OnPlayerStreamIn(rage::IPlayer *player, rage::IPlayer *forplayer) override;

    void OnPlayerStreamOut(rage::IPlayer *player, rage::IPlayer *forplayer) override;

private:
    jclass streamerEventClass;
    jmethodID playerStreamInMethod;
    jmethodID playerStreamOutMethod;
};
