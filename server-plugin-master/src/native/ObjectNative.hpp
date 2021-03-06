/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class mp_rage_launcher_object_ObjectNative */

#ifndef _Included_mp_rage_launcher_object_ObjectNative
#define _Included_mp_rage_launcher_object_ObjectNative
#ifdef __cplusplus
extern "C" {
#endif

#include <stdio.h>
/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_object_ObjectNative_getType
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    destroy
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_destroy
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getDimension
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_object_ObjectNative_getDimension
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    setDimension
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_setDimension
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getPosition
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_object_ObjectNative_getPosition
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    setPosition
 * Signature: (IFFF)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_setPosition
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getRotation
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_object_ObjectNative_getRotation
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    setRotation
 * Signature: (IFFF)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_setRotation
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getModel
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_object_ObjectNative_getModel
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    setModel
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_setModel
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getVelocity
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_object_ObjectNative_getVelocity
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    getAlpha
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_object_ObjectNative_getAlpha
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_object_ObjectNative
 * Method:    setAlpha
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_object_ObjectNative_setAlpha
        (JNIEnv *, jclass, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
