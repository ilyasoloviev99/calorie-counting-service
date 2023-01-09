package application.util.domain.lang

import kotlin.math.round

fun normalRound(number: Float): Float {
    return round(number * 100)
}