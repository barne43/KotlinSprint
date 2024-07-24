fun main() {
    val moveString = "D2-D4;0"

    val parts = moveString.split(";")
    val positions = parts[0].split("-")

    val from = positions[0]
    val to = positions[1]
    val moveNumber = parts[1]

    println("""
        Откуда: $from
        Куда: $to
        Номер хода: $moveNumber
    """.trimIndent())
}