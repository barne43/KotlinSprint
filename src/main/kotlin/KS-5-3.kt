fun main(){
    print("Вы участвуете в нашей лотереи! Введите 2 число от 0 до 42: ")
    val userNum = readln()
    val numbers = userNum.split(" ")
    var result: Int = 0

    if (numbers[0].toInt() == TEN || numbers[0].toInt() == TWENTY_FIVE){
        result++
    }
    if (numbers[1].toInt() == TEN || numbers[1].toInt() == TWENTY_FIVE){
        result++
    }
    when(result){
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }
}
const val TEN = 10
const val TWENTY_FIVE = 25