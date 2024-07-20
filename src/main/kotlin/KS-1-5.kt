package org.example

fun main() {
    val seconds = 6480 / 60
    val minute = seconds % 60
    val hour = seconds / 60

    println("$hour:$minute")
}