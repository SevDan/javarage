/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.api.event

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class SubscribeEvent(val eventPriority: EventPriority = EventPriority.NORMAL)