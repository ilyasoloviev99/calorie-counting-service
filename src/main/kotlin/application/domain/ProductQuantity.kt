package application.domain

import application.util.domain.lang.normalRound

data class ProductQuantity(
    val product: Product,
    val weight: Float
) {

    fun finalCalories(): Float {
        return normalRound(product.energyValue.calories * weight)
    }

    fun proteinQuantity(): Float {
        return normalRound(product.energyValue.protein * weight)
    }

    fun carbohydratesQuantity(): Float {
        return normalRound(product.energyValue.carbohydrates * weight)
    }

    fun fatsQuantity(): Float {
        return normalRound(product.energyValue.fats * weight)
    }

}