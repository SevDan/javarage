#pragma once

#include <jni.h>
#include "../sdk/Entity.hpp"
#include "../sdk/rage.hpp"
#include "../jvm/VM.hpp"

class TickEventHandler : public rage::ITickHandler, public rage::IEventHandler {
public:
    TickEventHandler(JNIEnv *env);

    rage::ITickHandler *GetTickHandler() override {
        return this;
    }

    void Tick() override;

private:
    jclass tickEventClass;
    jmethodID onTickMethod;
};
