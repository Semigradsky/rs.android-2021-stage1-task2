package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    private val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                return blockA.fold("") { acc, element ->
                    if (element is String) acc + element else acc
                }
            }
            Int::class ->{
                return blockA.fold(0) { acc, element ->
                    if (element is Int) acc + element else acc
                }
            }
            LocalDate::class -> {
                return blockA.fold(LocalDate.MIN) { acc, element ->
                    if (element is LocalDate && element > acc) element else acc
                }.format(formatter)
            }
        }
        throw IllegalArgumentException()
    }
}
