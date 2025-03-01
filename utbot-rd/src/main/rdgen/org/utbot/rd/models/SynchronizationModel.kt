@file:Suppress("unused")
package org.utbot.rd.models

import com.jetbrains.rd.generator.nova.*

object SynchronizationRoot: Root()

object SynchronizationModel: Ext(SynchronizationRoot) {
    init {
        call("suspendTimeoutTimer", PredefinedType.bool, PredefinedType.void).async
        signal("synchronizationSignal", PredefinedType.string).async
    }
}