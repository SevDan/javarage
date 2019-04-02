/*
 * Copyright (c) 2017. Noxaro aka Fabian Jungwirth
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * See the file COPYING included with this distribution for more information.
 */

package mp.rage.runtime

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import mp.rage.api.ResourceManager
import mp.rage.launcher.RuntimeInitializer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("RuntimeInitializer")
class JavaPluginFrameworkApplication : RuntimeInitializer {

    @Autowired lateinit var resourceManager: ResourceManager;

    override fun initialize() {
        // осуществляем инициализацию
        Thread.sleep(1000)
    }
}