package org.example

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / ONE_HOUR
    val minutes = (totalSeconds % ONE_HOUR) / ONE_MINUTE
    val seconds = totalSeconds % ONE_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}
const val ONE_MINUTE = 60
const val ONE_HOUR = 3600