fun main(){
    print("Есть ли повреждения у корабля? (true/false): ")
    val damageShip = readln().toBoolean()

    print("Введите текущий состав корабля: ")
    val crewSize = readln().toInt()

    print("Введите количество ящиков с провизией: ")
    val provisionCount = readln().toInt()

    print("Благоприятная ли погода? (true/false) ")
    val isFavorableWeather = readln().toBoolean()

    val canSail = ( !damageShip && crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE && provisionCount < RECOMMENDED_AMOUNT_OF_PROVISION && isFavorableWeather) ||
            (damageShip && crewSize == RECOMMENDED_CREW_SIZE && provisionCount >= RECOMMENDED_AMOUNT_OF_PROVISION && isFavorableWeather)

    if (canSail){
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val RECOMMENDED_AMOUNT_OF_PROVISION = 50
const val RECOMMENDED_CREW_SIZE = 70