package application.domain

import org.apache.logging.log4j.util.Strings

data class Information(
    val name: String,
    val description: String?
) {

    fun withName(newName: String): Information {
        return copy(name = newName)
    }

    fun withDescription(newDescription: String): Information {
        return copy(description = newDescription)
    }

    companion object {

        fun of(
            name: String = Strings.EMPTY,
            description: String = Strings.EMPTY
        ): Information {
            return Information(name, description)
        }

    }
}
