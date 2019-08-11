package org.hyperskill

import java.util.Scanner

fun main(args: Array<String>) {
    println("enter any integer: ")
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val lDigit = lastDigit(n)
    val expr = "the last digit is $lDigit"
    println(expr)
}

fun lastDigit(num: Int): Int {
    return num%10
}