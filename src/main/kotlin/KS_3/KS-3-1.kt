package KS_3

fun main(){
    val userName = "Barne"
    val greeting: String

    val hourOfDay = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)

    if (hourOfDay in SIX_HOUR_MORNING..FIVE_HOUR_EVENING){
        greeting = "Добрый день, $userName"
    } else {
        greeting = "Доброго вечера, $userName"
    }

    println(greeting)
}
const val SIX_HOUR_MORNING = 6
const val FIVE_HOUR_EVENING = 17