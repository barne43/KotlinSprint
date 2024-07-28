package KS_5

fun main(){
    print("Решите этот пример и докажите, что вы не бот: 5 + 5 = ")
    val result = readln().toInt()

    if (result == 10){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен!")
    }
}