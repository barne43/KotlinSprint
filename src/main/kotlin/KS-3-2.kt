fun main(){
    val name = "Татьяна"
    val surname = "Сергеевна"
    var familia = "Андреева"
    var age = 20

    var fio = "$familia $name $surname, $age"

    println(fio)

    familia = "Сидорова"
    age = 22
    fio = "$familia $name $surname, $age"

    println(fio)
}