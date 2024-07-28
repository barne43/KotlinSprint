fun main(){
    val trainingDay = 5

    val isEven = trainingDay % 2 == 0

    val exercisesForArmsAndAbs = !isEven
    val exercisesForLegs  = isEven
    val exercisesForBack = isEven
    val exercisesForAbs = !isEven

    val message = """
Упражнения для рук: $exercisesForArmsAndAbs
Упражнения для ног: $exercisesForLegs
Упражнения для спины: $exercisesForBack
Упражнения для пресса: $exercisesForAbs
    """
    println(message)
}