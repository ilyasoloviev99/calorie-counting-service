package application.util.domain.lang

import kotlin.reflect.KProperty1

interface Contractable<T : Any> {

    val properties: Array<KProperty1<T, *>>

}