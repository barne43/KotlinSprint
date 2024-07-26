fun main(){
    print("Есть ли повреждения у корабля? (true/false): ")
    val damageShip = readln().toBoolean()

    print("Введите текущий состав корабля: ")
    val crewSize = readln().toInt()

    print("Введите количество ящиков с провизией: ")
    val provisionCount = readln().toInt()

    print("Благоприятная ли погода? (true/false) ")
    val isFavorableWeather = readln().toBoolean()

    val canSail = ( !damageShip && crewSize in 55..70 && provisionCount < 50 && isFavorableWeather) ||
            (damageShip && crewSize == 70 && provisionCount >= 50 && isFavorableWeather)

    if (canSail){
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}