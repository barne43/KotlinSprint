package KS_4

fun main(){
    val tableAvailabilityToday = 13
    val tableAvailabilityTomorrow = 9
    val availabilityOfTablesToday = tableAvailabilityToday >= TOTAL_TABLES
    val availabilityOfTablesTomorrow = tableAvailabilityTomorrow >= TOTAL_TABLES

    println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    println("Доступность столиков на завтра: $availabilityOfTablesTomorrow")
}
const val TOTAL_TABLES = 13