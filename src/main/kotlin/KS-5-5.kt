import kotlin.random.Random

fun main(){
    val num = List(3) {Random.nextInt(0,43)}

    print("Вы участвуете в нашей лотереи! Введите 3 число от 0 до 42: ")
    val userNum = readln()
    val numbers = userNum.split(" ", " ")
    var result = 0

    if (numbers[0].toInt() == num[0] || numbers[0].toInt() == num[1] || numbers[0].toInt() == num[2]){
        result++
    }
    if (numbers[1].toInt() == num[0] || numbers[1].toInt() == num[1] || numbers[1].toInt() == num[2]){
        result++
    }
    if (numbers[2].toInt() == num[0] || numbers[2].toInt() == num[1] || numbers[2].toInt() == num[2]){
        result++
    }
    when(result){
        0 -> println("К сожалению, вы не угадали ни одного числа.")
        1 -> println("Вы угадали одно число. Получаете утешительный приз!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        3 -> println("Поздравляю! Вы угадали все числа и выиграли джекпот!")
    }
    println("Выигрышные числа: ${num}")
}