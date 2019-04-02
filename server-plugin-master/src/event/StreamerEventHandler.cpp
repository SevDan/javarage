#include <iostream>
#include "StreamerEventHandler.hpp"
#include "../jvm/VM.hpp"
#include "../jvm/Converter.hpp"

StreamerEventHandler::StreamerEventHandler(JNIEnv *env) {
    streamerEventClass = JVM::VM::getClass(env, JVM_LAUNCHER_MAIN_PACKAGE_NAME + "streamer/StreamerEvents");
    playerStreamInMethod = JVM::VM::getStaticMethodId(env, streamerEventClass, "onPlayerStreamIn", "(II)V");
    playerStreamOutMethod = JVM::VM::getStaticMethodId(env, streamerEventClass, "onPlayerStreamOut", "(II)V");
}

void StreamerEventHandler::OnPlayerStreamIn(rage::IPlayer *player, rage::IPlayer *forplayer) {
    JNIEnv *env = JVM::VM::attachCurrentThread();
    env->CallStaticVoidMethod(streamerEventClass, playerStreamInMethod,
                                               int(player->GetId()),
                                               int(forplayer->GetId()));
    JVM::VM::checkForException(env);
}

void StreamerEventHandler::OnPlayerStreamOut(rage::IPlayer *player, rage::IPlayer *forplayer) {
    JNIEnv *env = JVM::VM::attachCurrentThread();
    env->CallStaticVoidMethod(streamerEventClass, playerStreamOutMethod,
                                               int(player->GetId()),
                                               int(forplayer->GetId()));

    JVM::VM::checkForException(env);
}
