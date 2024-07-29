fun main(){
    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidityToday = 20
    val currentSeason = "зима"

    val areTheConditionsFavorable = weatherToday == IS_SUNNY && awningAtTheMoment == AWNING && airHumidityToday == AIR_HUMIDITY && currentSeason != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areTheConditionsFavorable")
}
const val IS_SUNNY = true
const val AWNING = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"