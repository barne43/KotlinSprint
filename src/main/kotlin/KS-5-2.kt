fun main(){
    print("Введите дату своего дня рождения: ")
    val userBirthday = readln().toInt()
    val thisYear = 2024

    if(thisYear - userBirthday >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом!")
    } else {
        println("Доступ запрещен! Вернуться на главный экран!")
    }
}
const val AGE_OF_MAJORITY = 18