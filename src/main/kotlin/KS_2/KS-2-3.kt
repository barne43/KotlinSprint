package KS_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457
    val totalMinutes = departureMinute + travelTimeInMinutes
    val arrivalHour = departureHour + totalMinutes / ONE_HOUR
    val arrivalMinute = totalMinutes % ONE_HOUR
    val finalArrivalHour = arrivalHour % HOURS_IN_DAY

    println("Поезд прибудет в $finalArrivalHour:${String.format("%02d", arrivalMinute)}")
}
const val ONE_HOUR = 60
const val HOURS_IN_DAY = 24