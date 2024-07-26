fun main(){
    val sunnyWeather = true
    val awning = true
    val airHumidity = 20
    val season = "не зима"

    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidityToday = 20
    val currentSeason = "зима"

    val areTheConditionsFavorable: Boolean

    if (weatherToday == sunnyWeather && awningAtTheMoment == awning && airHumidityToday == airHumidity && currentSeason == season) {
        areTheConditionsFavorable = true
        println("Благоприятные ли условия сейчас для роста бобовых? $areTheConditionsFavorable")
    } else {
        areTheConditionsFavorable = false
        println("Благоприятные ли условия сейчас для роста бобовых? $areTheConditionsFavorable")
    }
}