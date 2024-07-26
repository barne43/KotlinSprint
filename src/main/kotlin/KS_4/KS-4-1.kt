package KS_4

fun main(){
    val tableAvailabilityToday = 13
    val tableAvailabilityTomorrow = 9
    var availabilityOfTablesToday: Boolean
    var availabilityOfTablesTomorrow: Boolean

    if (tableAvailabilityToday >= TOTAL_TABLES){
        availabilityOfTablesToday = false
        println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    } else {
        availabilityOfTablesToday = true
        println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    }
    if (tableAvailabilityTomorrow >= TOTAL_TABLES){
        availabilityOfTablesTomorrow = false
        println("Доступность столиков на сегодня: $availabilityOfTablesTomorrow")
    } else {
        availabilityOfTablesTomorrow = true
        println("Доступность столиков на завтра: $availabilityOfTablesTomorrow")
    }
}
const val TOTAL_TABLES = 13