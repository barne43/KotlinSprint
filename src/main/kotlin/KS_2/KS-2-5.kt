package KS_2

fun main(){
    val sum = 70000
    val interestRate = 0.167
    val throughYears = 20

    val finalAmount = sum * Math.pow(1 + interestRate, throughYears.toDouble())

    println("Размер вклада через $throughYears лет: ${String.format("%.3f", finalAmount)}")
}