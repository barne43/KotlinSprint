package KS_5

fun main(){
    val num1 = 5
    val num2 = 5
    val sum = num1 + num2

    print("Решите этот пример и докажите, что вы не бот: $num1 + $num2 = ")
    val result = readln().toInt()

    if (result == sum){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}