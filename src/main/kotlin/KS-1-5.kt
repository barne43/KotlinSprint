package org.example

fun main() {
    val hours = TOTAL_SECONDS / ONE_HOUR
    val minutes = (TOTAL_SECONDS % ONE_HOUR) / ONE_MINUTE
    val seconds = TOTAL_SECONDS % ONE_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}
const val TOTAL_SECONDS = 6480
const val ONE_MINUTE = 60
const val ONE_HOUR = 3600