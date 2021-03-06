/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class mp_rage_launcher_vehicle_VehicleNative */

#ifndef _Included_mp_rage_launcher_vehicle_VehicleNative
#define _Included_mp_rage_launcher_vehicle_VehicleNative
#ifdef __cplusplus
extern "C" {
#endif
    
#include <stdio.h>
/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getType
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    destroy
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_destroy
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getDimension
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getDimension
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setDimension
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setDimension
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getPosition
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getPosition
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setPosition
 * Signature: (IFFF)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setPosition
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getRotation
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getRotation
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setRotation
 * Signature: (IFFF)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setRotation
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getModel
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getModel
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setModel
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setModel
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getVelocity
 * Signature: (I)Lmp/rage/api/vector/Vector3;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getVelocity
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getAlpha
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getAlpha
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setAlpha
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setAlpha
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isSirenActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isSirenActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setSirenActive
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setSirenActive
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isHornActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isHornActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    areHighbeamsActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_areHighbeamsActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setHighbeamsActive
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setHighbeamsActive
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    areLightsActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_areLightsActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setLightsActive
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setLightsActive
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isEngineActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isEngineActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setEngineActive
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setEngineActive
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    areTaxiLightsActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_areTaxiLightsActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setTaxiLightsActive
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setTaxiLightsActive
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isRocketBoostActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isRocketBoostActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isBrakeActive
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isBrakeActive
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getSteerAngle
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getSteerAngle
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getGasPedalState
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getGasPedalState
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getEngineHealth
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getEngineHealth
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getBodyHealth
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getBodyHealth
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getOccupant
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getOccupant
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getOccupants
 * Signature: (I)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getOccupants
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setOccupant
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setOccupant
        (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isLocked
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isLocked
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    lock
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_lock
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    isDead
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_isDead
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    explode
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_explode
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    spawn
 * Signature: (IFFFF)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_spawn
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getMod
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getMod
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setMod
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setMod
        (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    areNeonsEnabled
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_areNeonsEnabled
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    enableNeons
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_enableNeons
        (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setNeonsColour
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setNeonsColour
        (JNIEnv *, jclass, jint, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getNeonsColour
 * Signature: (I)Lmp/rage/api/color/RGBColor;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getNeonsColour
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    repair
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_repair
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getColourRGB
 * Signature: (II)Lmp/rage/api/color/RGBColor;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getColourRGB
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getColour
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getColour
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getPaint
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getPaint
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setColourRGB
 * Signature: (IIIIIII)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setColourRGB
        (JNIEnv *, jclass, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setColour
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setColour
        (JNIEnv *, jclass, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setPaint
 * Signature: (IIIII)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setPaint
        (JNIEnv *, jclass, jint, jint, jint, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getMaterialType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getMaterialType
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getNumberPlate
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getNumberPlate
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    setNumberPlate
 * Signature: (ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_setNumberPlate
        (JNIEnv *, jclass, jint, jstring);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetLivery
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetLivery
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetLivery
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetLivery
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetWheelColor
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetWheelColor
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetWheelColor
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetWheelColor
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetWheelType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetWheelType
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetWheelType
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetWheelType
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetNumberPlateType
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetNumberPlateType
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetNumberPlateType
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetNumberPlateType
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetPearlescentColor
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetPearlescentColor
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetPearlescentColor
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetPearlescentColor
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetWindowTint
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetWindowTint
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetWindowTint
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetWindowTint
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetDashboardColor
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetDashboardColor
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetDashboardColor
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetDashboardColor
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetTrimColor
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetTrimColor
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetTrimColor
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetTrimColor
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetExtra
 * Signature: (II)Z
 */
JNIEXPORT jboolean JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetExtra
        (JNIEnv *, jclass, jint, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    SetExtra
 * Signature: (IIZ)V
 */
JNIEXPORT void JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_SetExtra
        (JNIEnv *, jclass, jint, jint, jboolean);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    GetMovableState
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_GetMovableState
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    length
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_length
        (JNIEnv *, jclass);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    count
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_count
        (JNIEnv *, jclass);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getInRange
 * Signature: (FFFFI)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getInRange
        (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    getInDimension
 * Signature: (I)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_getInDimension
        (JNIEnv *, jclass, jint);

/*
 * Class:     mp_rage_launcher_vehicle_VehicleNative
 * Method:    create
 * Signature: (IFFFFLjava/lang/String;IZZI)I
 */
JNIEXPORT jint JNICALL Java_mp_rage_launcher_vehicle_VehicleNative_create
        (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat, jfloat, jstring, jint, jboolean, jboolean, jint);

#ifdef __cplusplus
}
#endif
#endif
