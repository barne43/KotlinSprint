fun main(){
    val trainingDay = 5

    val isArmsAndAbsDay = trainingDay % 2 != 0
    val isLegsAndBackDay = trainingDay % 2 == 0

    val message = """
Упражнения для рук:       $isArmsAndAbsDay
Упражнения для ног:       $isLegsAndBackDay
Упражнения для спины:     $isArmsAndAbsDay
Упражнения для пресса:    $isArmsAndAbsDay
    """

    println(message)
}