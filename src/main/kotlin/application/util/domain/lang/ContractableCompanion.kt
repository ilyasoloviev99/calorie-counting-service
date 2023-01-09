package application.util.domain.lang

import kotlin.reflect.KProperty1

abstract class ContractableCompanion<T : Any> : Contractable<T> {

    init {
        require(this::class.isCompanion)
    }

    abstract override val properties: Array<KProperty1<T, *>>

}