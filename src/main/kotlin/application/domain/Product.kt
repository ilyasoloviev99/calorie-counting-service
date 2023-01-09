package application.domain

import application.util.domain.lang.ContractableCompanion
import kotlin.reflect.KProperty1

class Product
private constructor(
    val information: Information,
    val energyValue: EnergyValue
) {

    companion object : ContractableCompanion<Product>() {

        fun of(
            information: Information,
            energyValue: EnergyValue
        ): Product {
            return Product(
                information,
                energyValue
            )
        }

        override val properties: Array<KProperty1<Product, *>> = arrayOf(
            Product::information,
            Product::energyValue
        )

    }

}