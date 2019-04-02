#include <iostream>
#include "TickEventHandler.hpp"
#include "../jvm/VM.hpp"
#include "../jvm/Converter.hpp"

TickEventHandler::TickEventHandler(JNIEnv * env) {
	tickEventClass = JVM::VM::getClass(env, JVM_LAUNCHER_MAIN_PACKAGE_NAME + "tick/TickEvents");
	onTickMethod = JVM::VM::getStaticMethodId(env, tickEventClass, "onTick", "()V");
}

void TickEventHandler::Tick() {
	JNIEnv * env = JVM::VM::attachCurrentThread();
	env->CallStaticVoidMethod(tickEventClass, onTickMethod);

	JVM::VM::checkForException(env);
}
