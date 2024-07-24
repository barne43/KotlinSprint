
fun main(){
    val num = 5
    val tabl = buildString {
        for (i in 1..10) {
            append("$num * $i = ${num * i}\n")
        }
    }
    println(tabl)
}