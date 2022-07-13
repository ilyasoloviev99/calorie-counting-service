package application
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalorieCountingServiceApplication

fun main(args: Array<String>) {
    runApplication<CalorieCountingServiceApplication>(*args)
}
