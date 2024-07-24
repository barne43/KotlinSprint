fun main(){
    val name = "Татьяна"
    val surname = "Сергеевна"
    var familia = "Андреева"
    var age = 20

    var FIO = "$familia $name $surname, $age"

    println(FIO)

    familia = "Сидорова"
    age = 22
    FIO = "$familia $name $surname, $age"

    println(FIO)
}