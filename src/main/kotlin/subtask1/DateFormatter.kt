package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class DateFormatter {
    private val formatter = DateTimeFormatter
        .ofPattern("dd MMMM, EEEE")
        .withLocale(Locale.forLanguageTag("Ru"))

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            LocalDate.of(
                year.toInt(),
                month.toInt(),
                day.toInt()
            ).format(formatter)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
