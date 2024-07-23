package KS_2

fun main(){
    val cristalOre = 7
    val ironOre = 11

    val bonus = 20 / 100.0

    val bonusCristal = (cristalOre * bonus).toInt()
    val bonusIron = (ironOre * bonus).toInt()

    println("Бонус к криталлической руде: $bonusCristal")
    println("Бонус к железной руде: $bonusIron")
}