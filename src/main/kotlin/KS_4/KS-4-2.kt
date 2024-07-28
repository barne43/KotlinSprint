package KS_4

fun main(){
    val minWeight = 35
    val maxWeight = 100
    val maxLiter = 100

    val cargo1Weight = 20
    val cargo1Liter = 80

    val cargo2Weight = 50
    val cargo2Liter = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Liter л соответствует категории 'Average': " +
            "${!(cargo1Weight <= minWeight || cargo1Weight > maxWeight || cargo1Liter >= maxLiter)}")

    println("Груз с весом $cargo2Weight кг и объемом $cargo2Liter л соответствует категории 'Average': " +
            "${!(cargo2Weight <= minWeight || cargo2Weight > maxWeight || cargo2Liter >= maxLiter)}")
}