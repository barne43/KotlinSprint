
fun main(){
    val num = 5
    val tabl = buildString {
        for (i in ONE_NUMBER..TEN_NUMBER) {
            append("$num * $i = ${num * i}\n")
        }
    }
    println(tabl)
}
const val ONE_NUMBER = 1
const val TEN_NUMBER = 10