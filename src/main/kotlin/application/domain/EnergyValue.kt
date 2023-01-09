package application.domain

data class EnergyValue(
    val fats: Int,
    val protein: Int,
    val carbohydrates: Int,
    val calories: Int
) {
    companion object {

        fun of(
            fats: Int,
            protein: Int,
            carbohydrates: Int,
            calories: Int,
        ): EnergyValue {
            return EnergyValue(
                fats,
                protein,
                carbohydrates,
                calories
            )
        }

    }
}