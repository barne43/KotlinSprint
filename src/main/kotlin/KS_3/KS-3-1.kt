package KS_3

fun main(){
    val userName = "Barne"
    val greeting: String

    val hourOfDay = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)

    if (hourOfDay in 6..17){
        greeting = "Добрый день, $userName"
    } else {
        greeting = "Доброго вечера, $userName"
    }

    println(greeting)
}