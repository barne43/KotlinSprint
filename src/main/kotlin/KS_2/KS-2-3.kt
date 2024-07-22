package KS_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457
    val totalMinutes = departureMinute + travelTimeInMinutes
    val arrivalHour = departureHour + totalMinutes / 60
    val arrivalMinute = totalMinutes % 60
    val finalArrivalHour = arrivalHour % 24

    println("Поезд прибудет в $finalArrivalHour:${String.format("%02d", arrivalMinute)}")
}