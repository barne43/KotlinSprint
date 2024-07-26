package KS_4

fun main(){
    val tableAvailabilityToday = 13
    val tableAvailabilityTomorrow = 9
    var availabilityOfTablesToday: Boolean
    var availabilityOfTablesTomorrow: Boolean

    if (tableAvailabilityToday >= 13){
        availabilityOfTablesToday = false
        println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    } else {
        availabilityOfTablesToday = true
        println("Доступность столиков на сегодня: $availabilityOfTablesToday")
    }
    if (tableAvailabilityTomorrow >= 13){
        availabilityOfTablesTomorrow = false
        println("Доступность столиков на сегодня: $availabilityOfTablesTomorrow")
    } else {
        availabilityOfTablesTomorrow = true
        println("Доступность столиков на сегодня: $availabilityOfTablesTomorrow")
    }
}